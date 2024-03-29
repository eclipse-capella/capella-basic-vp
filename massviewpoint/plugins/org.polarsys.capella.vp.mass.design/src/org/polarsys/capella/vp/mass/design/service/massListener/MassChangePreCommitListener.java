/*******************************************************************************
 * Copyright (c) 2020 Obeo
 *   This program and the accompanying materials are made available under the
 *   terms of the Eclipse Public License 2.0 which is available at
 *   http://www.eclipse.org/legal/epl-2.0
 *   
 *   SPDX-License-Identifier: EPL-2.0
 * 
 *   Contributors:
 *      Obeo - initial API and implementation
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
import org.polarsys.capella.core.data.pa.deployment.PartDeploymentLink;
import org.polarsys.capella.vp.mass.design.service.massSwitch.BottomUpComputeMassPaSwitch;
import org.polarsys.capella.vp.mass.mass.PartMass;

/**
 * This listener is used to trigger the mass computation of the components
 * before a change in the model is committed
 */
public class MassChangePreCommitListener implements ResourceSetListener {

	BottomUpComputeMassPaSwitch bottomUpSwitch = new BottomUpComputeMassPaSwitch();

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
				if (!notification.isTouch() && (eventType == Notification.REMOVE || eventType == Notification.ADD
						|| eventType == Notification.ADD_MANY || eventType == Notification.REMOVE_MANY)) {
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
			EObject notifier = (EObject) next.getNotifier();

			switch (next.getEventType()) {

			// if the mass of an element of the model changes, calculate the mass of its
			// parents
			case Notification.SET:
				commands.add(new RecordingCommand(domain) {

					@Override
					protected void doExecute() {
						if (notifier instanceof PartMass) {
							AbstractType physicalComponent = ((Part) notifier.eContainer()).getAbstractType();
							bottomUpSwitch.doSwitch(physicalComponent);
						}
					}
				});
				break;

			// if an element is added calculate the mass of its parents
			case Notification.ADD:
				commands.add(new RecordingCommand(domain) {

					@Override
					protected void doExecute() {
						Object newValue = next.getNewValue();
						triggerComputation(newValue, notifier);
					}
				});
				break;
			
			//This notification is sent when several elements are added to the same element
			case Notification.ADD_MANY:
				commands.add(new RecordingCommand(domain) {

					@Override
					protected void doExecute() {
						List<?> newValues = (List<?>) next.getNewValue();

						newValues.stream().forEach((newValue) -> {
							triggerComputation(newValue, notifier);
						});
					}
				});
				break;
				
			// if an element is removed calculate the mass of its parents	
			case Notification.REMOVE:
				commands.add(new RecordingCommand(domain) {

					@Override
					protected void doExecute() {

						Object oldValue = next.getOldValue();
						triggerComputation(oldValue, notifier);

					}
				});
				break;
				
			//This notification is sent when several elements are removed from the same element	
			case Notification.REMOVE_MANY:
				commands.add(new RecordingCommand(domain) {

					@Override
					protected void doExecute() {

						List<?> oldValues = (List<?>) next.getOldValue();

						oldValues.stream().forEach((oldValue) -> {
							triggerComputation(oldValue, notifier);
						});
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

	/**
	 * Trigger the mass computation of the components affected by the addition or
	 * removal of an element
	 * 
	 * @param objectAffected the component being added/removed from the model
	 * @param notifier
	 */
	public void triggerComputation(Object objectAffected, EObject notifier) {
		// a partDeploymentLink is added/removed when a behavior is deployed/removed
		if (objectAffected instanceof PartDeploymentLink) {
			// computes the mass of the physical component the behavior is deployed on
			bottomUpSwitch.doSwitch(((Part) ((PartDeploymentLink) objectAffected).getLocation()).getAbstractType());
		//if a partMass is added/deleted, computes the mass of the physical component it is attached to
		} else if (objectAffected instanceof PartMass) {
			bottomUpSwitch.doSwitch(((Part) notifier).getAbstractType());
		} else {
			bottomUpSwitch.doSwitch(notifier);
		}
	}
}
