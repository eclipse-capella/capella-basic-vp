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
package org.polarsys.capella.vp.mass.design.service.massSwitch;

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
