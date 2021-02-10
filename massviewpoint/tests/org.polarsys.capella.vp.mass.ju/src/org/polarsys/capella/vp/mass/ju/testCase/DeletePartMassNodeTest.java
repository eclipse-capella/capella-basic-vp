/*******************************************************************************
 * Copyright (c) 2020 Obeo
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * 
 *   Contributors:
 *      OBEO - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.vp.mass.ju.testCase;

import org.polarsys.capella.core.data.cs.impl.PartImpl;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.vp.mass.mass.impl.PartMassImpl;

/**
 * This test case checks if when deleting a partMass of a node PC the mass of
 * its parents is re-calculated
 */
public class DeletePartMassNodeTest extends MassTest {

	private PartMassImpl pc1PartMass;
	private PartMassImpl pc11PartMass;

	@Override
	public void test() throws Exception {
		PhysicalComponent pc1 = physicalSystem.getOwnedPhysicalComponents().get(0);
		pc1PartMass = (PartMassImpl) ((PartImpl) pc1.getAbstractTypedElements().get(0)).getOwnedExtensions().get(0);
		PhysicalComponent pc11 = pc1.getOwnedPhysicalComponents().get(0);
		pc11PartMass = (PartMassImpl) ((PartImpl) pc11.getAbstractTypedElements().get(0)).getOwnedExtensions().get(0);

		// remove pc1.2 and check if the mass of pc1 is re-calculated
		deleteElement(pc11PartMass);
		assertEquals("The mass of PC1 was not changed after the deletion of the part mass of PC 1.1",
				pc1PartMass.getCurrentMass(), 35);
	}
}
