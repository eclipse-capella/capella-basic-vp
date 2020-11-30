/******************************************************************************
* Copyright (c) 2006, 2016 Thales Global Services 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0 
 * 
 * Contributors: 
 *    Thales - initial API and implementation
*****************************************************************************/
// Generated on 20.08.2015 at 11:04:12 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.mass.design.service.nodes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the DoReMi JavaExtension '<em><b>[org.polarsys.capella.vp.mass.design.service.nodes.PAB_Global_Mass_Service]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated NOT
 */

public class PAB_Global_Mass_Service {
	private MassLevelHelper massLevelHelper = new MassLevelHelper();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eObject : the current semantic object
	 * @generated NOT
	 */
	public int computeMass(EObject eObject) {
		return massLevelHelper.computeMass(eObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eObject : the current semantic object
	 * @param view : the current view
	 * @param container : the semantic container of the current object
	 * @generated NOT
	 */
	public boolean isMassSaturated(EObject eObject, EObject view, EObject container) {
		return massLevelHelper.isMassSaturated(eObject, view, container);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eObject : the current semantic object
	 * @param view : the current view
	 * @param container : the semantic container of the current object
	 * @generated NOT
	 */
	public boolean isMassOverhead(EObject eObject, EObject view, EObject container) {
		return massLevelHelper.isMassOverhead(eObject, view, container);
	}
}