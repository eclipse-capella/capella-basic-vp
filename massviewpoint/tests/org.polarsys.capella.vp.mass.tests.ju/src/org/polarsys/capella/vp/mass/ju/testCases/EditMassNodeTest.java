/*******************************************************************************
 * Copyright (c) 2006, 2020 Obeo
 *   This program and the accompanying materials are made available under the
 *   terms of the Eclipse Public License 2.0 which is available at
 *   http://www.eclipse.org/legal/epl-2.0
 *   
 *   SPDX-License-Identifier: EPL-2.0
 * 
 *   Contributors:
 *      Obeo - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.vp.mass.ju.testCases;

import org.polarsys.capella.core.data.cs.impl.PartImpl;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.vp.mass.mass.impl.PartMassImpl;

/**
 * This test case checks if when editing the mass of a node the mass of its
 * parents is re-calculated.
 * Used to check if the listener responds to the notification SET
 */
public class EditMassNodeTest extends MassTest {
	PartMassImpl pc1PartMass;
	PartMassImpl pc11PartMass;

	@Override
	public void test() throws Exception {
		PhysicalComponent pc1 = physicalSystem.getOwnedPhysicalComponents().get(0);
		pc1PartMass = (PartMassImpl) ((PartImpl) pc1.getAbstractTypedElements().get(0)).getOwnedExtensions().get(0);
		PhysicalComponent pc11 = pc1.getOwnedPhysicalComponents().get(0);
		pc11PartMass = (PartMassImpl) ((PartImpl) pc11.getAbstractTypedElements().get(0)).getOwnedExtensions().get(0);

		// change the mass of pc1.1 (a node) and check if the mass of pc1 is
		// re-calculated
		editMassPhysicalComponent(pc11, 40);
		assertEquals("The mass of PC1.1 was not changed after its modification", pc11PartMass.getCurrentMass(), 40);
		assertEquals("The mass of PC1 was not changed after the modification of pc1.1", pc1PartMass.getCurrentMass(),
				75);

	}

}
