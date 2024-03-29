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
package org.polarsys.capella.vp.perfo.ju.testSuites;

import java.util.ArrayList;
import java.util.List;

import org.polarsys.capella.test.framework.api.BasicTestArtefact;
import org.polarsys.capella.test.framework.api.BasicTestSuite;

import junit.framework.Test;

/**
 * This test suite starts tests that check whether the performance listeners are
 * correctly installed, and if the performance of the elements is correctly calculated
 * after certain events
 */
public class PerfoSessionListenersTestSuite extends BasicTestSuite {

	/**
	 * Returns the suite. This is required to unary launch this test.
	 */
	public static Test suite() {
		return new PerfoSessionListenersTestSuite();
	}

	@Override
	protected List<BasicTestArtefact> getTests() {
		List<BasicTestArtefact> tests = new ArrayList<BasicTestArtefact>();
		tests.add(new PABPerfoSessionListenerTestSuite());
		tests.add(new LABPerfoSessionListenerTestSuite());
		return tests;
	}

}
