/******************************************************************************
* Copyright (c) 2006, 2020 Thales Global Services 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0 
 * 
 * Contributors: 
 *    Thales - initial API and implementation
*****************************************************************************/
package org.polarsys.capella.vp.price.price;

import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Price</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.price.price.PartPrice#getCurrentPrice <em>Current Price</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.vp.price.price.PricePackage#getPartPrice()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.polarsys.org/capella/core/cs/6.0.0#//Part'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/plugin/org.polarsys.capella.core.data.gen/model/CompositeStructure.ecore#//Part'"
 * @generated
 */

public interface PartPrice extends Price, ElementExtension {

	/**
	 * Returns the value of the '<em><b>Current Price</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Price</em>' attribute.
	 * @see #setCurrentPrice(int)
	 * @see org.polarsys.capella.vp.price.price.PricePackage#getPartPrice_CurrentPrice()
	 * @model
	 * @generated
	 */

	int getCurrentPrice();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.vp.price.price.PartPrice#getCurrentPrice <em>Current Price</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Price</em>' attribute.
	 * @see #getCurrentPrice()
	 * @generated
	 */

	void setCurrentPrice(int value);

} // PartPrice
