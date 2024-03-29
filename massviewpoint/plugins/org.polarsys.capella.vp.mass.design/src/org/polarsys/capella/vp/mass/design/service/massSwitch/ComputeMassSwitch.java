/*******************************************************************************
 * Copyright (c) 2020, 2022 Obeo
 *   This program and the accompanying materials are made available under the
 *   terms of the Eclipse Public License 2.0 which is available at
 *   http://www.eclipse.org/legal/epl-2.0
 *   
 *   SPDX-License-Identifier: EPL-2.0
 * 
 *   Contributors:
 *      Obeo - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.vp.mass.design.service.massSwitch;

import org.eclipse.emf.common.util.EList;
import org.polarsys.capella.common.data.modellingcore.AbstractTypedElement;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.data.pa.util.PaSwitch;
import org.polarsys.capella.vp.mass.mass.PartMass;
import org.polarsys.capella.vp.mass.services.MassCapellaService;
import org.polarsys.kitalpha.emde.model.ElementExtension;

public class ComputeMassSwitch extends PaSwitch<Void> {

	/**
	 * Check if a physical component has a mass. If he does, compute its mass.
	 * 
	 * @param physicalComponent
	 */
	public void computeMass(PhysicalComponent physicalComponent) {
		EList<AbstractTypedElement> abstractTypedElements = physicalComponent.getAbstractTypedElements();

		for (AbstractTypedElement part : abstractTypedElements) {
			EList<ElementExtension> ownedExtensions = part.getOwnedExtensions();

			for (ElementExtension extension : ownedExtensions) {

				if (extension instanceof PartMass) {
					MassCapellaService maMassService = new MassCapellaService();
					maMassService.computeMass(part);
				}
			}
		}
	}
}
