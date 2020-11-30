/*******************************************************************************
 * Copyright (c) 2006, 2015 Thales Global Services
 *   This program and the accompanying materials are made available under the
 *   terms of the Eclipse Public License 2.0 which is available at
 *   http://www.eclipse.org/legal/epl-2.0
 *   
 *   SPDX-License-Identifier: EPL-2.0
 * 
 *   Contributors:
 *      Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.vp.mass.generic;

import org.eclipse.emf.ecore.EObject;

public interface IMassService {
	
	/**
	 * Execute the business algorithm 
	 * @return
	 */
	public int compute(EObject eObject, IMassVisitor iMassVisitor);
	
}
