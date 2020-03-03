/*******************************************************************************
 * Copyright (c) 2020 Thales Global Services
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * 
 *   Contributors:
 *      OBEO - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.vp.mass.design.service.massSwitch;

import org.eclipse.emf.common.util.EList;
import org.polarsys.capella.common.data.modellingcore.AbstractTypedElement;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.data.pa.PhysicalComponentNature;
import org.polarsys.capella.core.data.pa.PhysicalComponentPkg;

/**
 * This switch is used to trigger the mass computation of a parent after one of
 * its children's mass changed
 */
public class BottomUpComputeMassPaSwitch extends ComputeMassSwitch {

	@Override
	public Void casePhysicalComponent(PhysicalComponent physicalComponent) {
		computeMass(physicalComponent);
		
		// The parent of a behavior component is not his container. The link is made
		// through its deployingParts
		if (physicalComponent.getNature() == PhysicalComponentNature.BEHAVIOR) {
			EList<AbstractTypedElement> abstractTypedElements = physicalComponent.getAbstractTypedElements();

			for (AbstractTypedElement part : abstractTypedElements) {
				EList<Part> deployingParts = ((Part) part).getDeployingParts();
				for (Part deployingPart : deployingParts) {
					this.doSwitch(deployingPart.getAbstractType());
				}
			}
		} else {
			this.doSwitch(physicalComponent.eContainer());
		}
		return null;
	}

	@Override
	public Void casePhysicalComponentPkg(PhysicalComponentPkg physicalComponentPkg) {
		this.doSwitch(physicalComponentPkg.eContainer());
		return null;
	}
}
