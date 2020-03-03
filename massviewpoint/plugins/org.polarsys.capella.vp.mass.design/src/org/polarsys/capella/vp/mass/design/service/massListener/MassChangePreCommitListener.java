/*******************************************************************************
 * Copyright (c) 2020 OBEO
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * 
 *   Contributors:
 *      OBEO - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.vp.mass.design.service.massListener;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.polarsys.capella.common.data.modellingcore.AbstractType;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.cs.impl.PartImpl;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.data.pa.PhysicalComponentNature;
import org.polarsys.capella.vp.mass.design.service.massSwitch.BottomUpComputeMassPaSwitch;
import org.polarsys.capella.vp.mass.design.service.massSwitch.TopDownComputeMassPaSwitch;
import org.polarsys.capella.vp.mass.mass.PartMass;
import org.polarsys.capella.vp.mass.mass.impl.PartMassImpl;

/**
 * This listener is used to trigger the mass computation of the components
 * before a change in the model is committed
 */
public class MassChangePreCommitListener implements ResourceSetListener {

	@Override
	public NotificationFilter getFilter() {

		// the only notifications that should trigger a mass computation are:
		// - add or remove a component of the model
		// - change the mass of one of the elements of the model
		return new NotificationFilter.Custom() {
			@Override
			public boolean matches(Notification notification) {
				int eventType = notification.getEventType();
				Object notifier = notification.getNotifier();
				if (!notification.isTouch() && (eventType == Notification.REMOVE || eventType == Notification.ADD)) {
					Object feature = notification.getFeature();
					if (feature instanceof EReference) {
						return ((EReference) feature).isContainment();
					}
				} else if (!notification.isTouch() && eventType == Notification.SET && notifier instanceof PartMass) {
					return true;
				}
				return false;
			}
		};
	}

	@Override
	public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
		TransactionalEditingDomain domain = event.getEditingDomain();
		List<Command> commands = new ArrayList<Command>();
		Iterator<?> iter = event.getNotifications().iterator();

		while (iter.hasNext()) {
			Notification next = (Notification) iter.next();
			switch (next.getEventType()) {

			// if the mass of an element of the model changes, calculate the mass of its
			// parents
			case Notification.SET:
				commands.add(new RecordingCommand(domain) {

					@Override
					protected void doExecute() {
						PartMassImpl notifier = (PartMassImpl) next.getNotifier();
						AbstractType physicalComponent = ((Part) notifier.eContainer()).getAbstractType();
						BottomUpComputeMassPaSwitch bottomUpSwitch = new BottomUpComputeMassPaSwitch();
						bottomUpSwitch.doSwitch(physicalComponent);
					}
				});
				break;

			// if an element is added or removed, calculate the mass of its parents
			case Notification.ADD:
			case Notification.REMOVE:
				commands.add(new RecordingCommand(domain) {

					@Override
					protected void doExecute() {

						EObject notifier = (EObject) next.getNotifier();

						// When a behavior PC is removed, we cannot access the component it was deployed
						// in. Hence why we need to re-calculate the whole model
						Object oldValue = next.getOldValue();
						if ((oldValue instanceof PhysicalComponent)
								&& (((PhysicalComponent) oldValue)).getNature() == PhysicalComponentNature.BEHAVIOR) {
							TopDownComputeMassPaSwitch topDownSwitch = new TopDownComputeMassPaSwitch();
							topDownSwitch.doSwitch(notifier);
							// If a partMass is deleted, we can access the component it was attached to
							// through its abstract type
						} else if (oldValue instanceof PartMassImpl) {
							BottomUpComputeMassPaSwitch bottomUpSwitch = new BottomUpComputeMassPaSwitch();
							bottomUpSwitch.doSwitch(((PartImpl) notifier).getAbstractType());
						} else {
							BottomUpComputeMassPaSwitch bottomUpSwitch = new BottomUpComputeMassPaSwitch();
							bottomUpSwitch.doSwitch(notifier);
						}
					}
				});
				break;

			default:
				break;
			}

		}
		return commands.isEmpty() ? null : new CompoundCommand(commands);
	}

	@Override
	public boolean isPrecommitOnly() {
		return true;
	}

	@Override
	public void resourceSetChanged(ResourceSetChangeEvent event) {
	}

	@Override
	public boolean isAggregatePrecommitListener() {
		return false;
	}

	@Override
	public boolean isPostcommitOnly() {
		return false;
	}

}
