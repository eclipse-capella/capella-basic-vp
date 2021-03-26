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
package org.polarsys.capella.vp.mass.design.service.massSwitch;

import org.eclipse.emf.common.util.EList;
import org.polarsys.capella.common.data.modellingcore.AbstractTypedElement;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.data.pa.PhysicalComponentPkg;

/**
 * This switch is used to trigger the mass computation of all the children of a
 * component
 */
public class TopDownComputeMassPaSwitch extends ComputeMassSwitch {

	@Override
	public Void casePhysicalComponent(PhysicalComponent physicalComponent) {
		computeMass(physicalComponent);
		for (PhysicalComponent child : physicalComponent.getOwnedPhysicalComponents()) {
			this.doSwitch(child);
		}
		return null;
	}

	@Override
	public Void casePhysicalComponentPkg(PhysicalComponentPkg physicalComponentPkg) {
		for (PhysicalComponent physicalComponent : physicalComponentPkg.getOwnedPhysicalComponents()) {
			this.doSwitch(physicalComponent);
		}
		return null;
	}
}
