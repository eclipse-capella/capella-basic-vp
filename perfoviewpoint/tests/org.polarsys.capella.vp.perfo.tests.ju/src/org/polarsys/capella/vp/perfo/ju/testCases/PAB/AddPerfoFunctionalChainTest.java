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

import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.vp.perfo.perfo.impl.TimeCapacityImpl;

/**
 * This test case checks if when adding a perfo to a FunctionalChain it is
 * correctly computed
 * Used to check if the listener responds to the notification ADD
 */
public class AddPerfoFunctionalChainTest extends PABPerfoTest {

	@Override
	public void test() throws Exception {
		FunctionalChain functionalChain2 = rootAbstractFunction.getOwnedFunctionalChains().get(1);
		
		addTimeCapacity(functionalChain2);
		assertEquals("The perfo of FC2 was not computed after the addition of a perfo to it",
				((TimeCapacityImpl) functionalChain2.getOwnedExtensions().get(0)).getCurrentExecutionTime(), 130);

	}

}
