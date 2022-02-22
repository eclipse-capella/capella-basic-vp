/*******************************************************************************
 * Copyright (c) 2021 Obeo
 *   This program and the accompanying materials are made available under the
 *   terms of the Eclipse Public License 2.0 which is available at
 *   http://www.eclipse.org/legal/epl-2.0
 *   
 *   SPDX-License-Identifier: EPL-2.0
 * 
 *   Contributors:
 *      Obeo - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.vp.perfo.ju.testCases.PAB;

import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.vp.perfo.perfo.impl.TimeCapacityImpl;

/**
 * This test case checks if when adding a perfo to a PhysicalFunction the perfo of the
 * FunctionalChains it is a part of are re-calculated.
 * Used to check if the listener responds to the notification ADD
 */
public class AddPerfoPhysicalFunctionTest extends PABPerfoTest {

	@Override
	public void test() throws Exception {
		AbstractFunction physicalFunction1 = rootAbstractFunction.getOwnedFunctions().get(0);
		FunctionalChain functionalChain = physicalFunction1.getInvolvingFunctionalChains().get(0);
		
		addTimeConsumption(physicalFunction1, 40);
		assertEquals("The perfo of FC1 was not changed after the addition of a perfo to PF1",
				((TimeCapacityImpl) functionalChain.getOwnedExtensions().get(0)).getCurrentExecutionTime(), 150);
		
	}

}
