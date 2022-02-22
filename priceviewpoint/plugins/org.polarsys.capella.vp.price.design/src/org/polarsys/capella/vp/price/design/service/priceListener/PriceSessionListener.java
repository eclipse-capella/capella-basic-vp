/*******************************************************************************
 * Copyright (c) 2021, 2022 Obeo
 *   This program and the accompanying materials are made available under the
 *   terms of the Eclipse Public License 2.0 which is available at
 *   http://www.eclipse.org/legal/epl-2.0
 *   
 *   SPDX-License-Identifier: EPL-2.0
 * 
 *   Contributors:
 *      Obeo - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.vp.price.design.service.priceListener;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.data.pa.PhysicalComponentPkg;
import org.polarsys.capella.core.model.handler.command.CapellaResourceHelper;
import org.polarsys.capella.vp.price.design.service.priceSwitch.TopDownComputePricePaSwitch;

/**
 * This session manager listener is used to install/remove a Price Change
 * PreCommit Listener to every new session and to start the price computation of
 * the elements of this session
 * Directly inspired from org.polarsys.capella.vp.mass.design.service.massListener.MassSessionListener
 *
 */
public class PriceSessionListener implements SessionManagerListener {

	Map<Session, PriceChangePreCommitListener> sessionsPricePreCommitListener = new HashMap<>();

	@Override
	public void notifyAddSession(Session newSession) {
		// check if viewpoint is selected to add listener
		Collection<Viewpoint> viewpoints = newSession.getSelectedViewpoints(false);
		boolean viewpointSelected = false;
		for (Viewpoint viewpoint : viewpoints) {
			if (viewpoint.getName().equals("Price_ID"))
				viewpointSelected = true;
		}
		if (!viewpointSelected) {
			return;
		}
		
		PriceChangePreCommitListener priceListener = new PriceChangePreCommitListener();
		newSession.getTransactionalEditingDomain().addResourceSetListener(priceListener);
		registerPreCommitListener(newSession, priceListener);

		computePrice(newSession);
	}

	@Override
	public void notifyRemoveSession(Session removedSession) {
	}

	@Override
	public void viewpointSelected(Viewpoint selectedSirius) {
		
		if (!selectedSirius.getName().equals("Price_ID")) return;
		
		// for each session already opened, a pre-commit listener is installed so the
		// price of the elements of the model can be calculated after specific events
		Collection<Session> sessions = SessionManager.INSTANCE.getSessions();
		for (Session session : sessions) {
			PriceChangePreCommitListener priceListener = new PriceChangePreCommitListener();
			TransactionalEditingDomain transDomain = session.getTransactionalEditingDomain();
			if (transDomain != null) {
				transDomain.addResourceSetListener(priceListener);
				// the listener and the session its attached to are saved in order to unregister
				// him when the viewpoint is deselected
				registerPreCommitListener(session, priceListener);
				computePrice(session);
			}
		}
	}

	@Override
	public void viewpointDeselected(Viewpoint deselectedSirius) {
		
		if (!deselectedSirius.getName().equals("Price_ID")) return;

		// for each session opened, remove the pre-commit listener
		Set<Entry<Session, PriceChangePreCommitListener>> setSessionsPricePreCommitListener = sessionsPricePreCommitListener
				.entrySet();
		Iterator<Entry<Session, PriceChangePreCommitListener>> it = setSessionsPricePreCommitListener.iterator();
		while (it.hasNext()) {
			Entry<Session, PriceChangePreCommitListener> e = it.next();
			TransactionalEditingDomain transDomain = e.getKey().getTransactionalEditingDomain();
			if(transDomain != null) {
				transDomain.removeResourceSetListener(e.getValue());
			}
		}
	}

	@Override
	public void notify(Session updated, int notification) {
	}

	/**
	 * Saves a session and its price listener
	 * 
	 * @param session
	 * @param preCommit
	 */
	public void registerPreCommitListener(Session session, PriceChangePreCommitListener preCommit) {
		sessionsPricePreCommitListener.put(session, preCommit);
	}

	/**
	 * Compute the price of the elements of a session
	 * 
	 * @param the session
	 */
	public void computePrice(Session session) {
		TransactionalEditingDomain domain = session.getTransactionalEditingDomain();
		domain.getCommandStack().execute(new RecordingCommand(domain) {

			@Override
			protected void doExecute() {
				TopDownComputePricePaSwitch topDownSwitch = new TopDownComputePricePaSwitch();

				List<PhysicalComponentPkg> physicalComponentPkgs = retrievesPhysicalComponentPkgFromSession(session);
				
				for(PhysicalComponentPkg physicalComponentPkg : physicalComponentPkgs) {
					topDownSwitch.doSwitch(physicalComponentPkg);
				}
			}

		});

	}

	/**
	 * Retrieves the root PhysicalComponentPkg of the Physical Architecture part of a capella model from its session
	 * @param session
	 * @return the PhysicalComponentPkg containing the components of the physical architecture of a capella model
	 */
	private List<PhysicalComponentPkg> retrievesPhysicalComponentPkgFromSession(Session session) {
		Collection<Resource> resources = session.getSemanticResources();
		List<PhysicalComponentPkg> physicalComponentPkg = new ArrayList<>();

		resources.stream()
			.filter(CapellaResourceHelper::isCapellaResource)
			.forEach((resource) -> {
				resource.getContents().stream()
					.filter(Project.class::isInstance)
					.forEach((content) -> {
						((Project) content).getOwnedModelRoots().stream()
							.filter(SystemEngineering.class::isInstance)
							.forEach((modelRoot) -> {
								((SystemEngineering) modelRoot).getOwnedArchitectures().stream()
								.filter(PhysicalArchitecture.class::isInstance)
								.forEach((physicalArchitecture) -> {
									physicalComponentPkg.add(((PhysicalArchitecture) physicalArchitecture)
										.getOwnedPhysicalComponentPkg()) ;
									});
							;
						});
				;
			});
			;
		});
		return physicalComponentPkg;
	}

}

