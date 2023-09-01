/*******************************************************************************
 * Copyright (c) 2006, 2020 Thales Global Services
 *   This program and the accompanying materials are made available under the
 *   terms of the Eclipse Public License 2.0 which is available at
 *   http://www.eclipse.org/legal/epl-2.0
 *   
 *   SPDX-License-Identifier: EPL-2.0
 * 
 *   Contributors:
 *      Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.vp.price.price;

import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Price</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.price.price.Price#getValue <em>Value</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.price.price.Price#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.price.price.Price#getMinValue <em>Min Value</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.vp.price.price.PricePackage#getPrice()
 * @model
 * @generated
 */

public interface Price extends NamedElement {

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
  
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see org.polarsys.capella.vp.price.price.PricePackage#getPrice_Value()
   * @model
   * @generated
   */

  int getValue();

  /**
   * Sets the value of the '{@link org.polarsys.capella.vp.price.price.Price#getValue <em>Value</em>}' attribute.
  
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */

  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Max Value</b></em>' attribute.
  
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Value</em>' attribute.
   * @see #setMaxValue(int)
   * @see org.polarsys.capella.vp.price.price.PricePackage#getPrice_MaxValue()
   * @model
   * @generated
   */

  int getMaxValue();

  /**
   * Sets the value of the '{@link org.polarsys.capella.vp.price.price.Price#getMaxValue <em>Max Value</em>}' attribute.
  
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Value</em>' attribute.
   * @see #getMaxValue()
   * @generated
   */

  void setMaxValue(int value);

  /**
   * Returns the value of the '<em><b>Min Value</b></em>' attribute.
  
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Value</em>' attribute.
   * @see #setMinValue(int)
   * @see org.polarsys.capella.vp.price.price.PricePackage#getPrice_MinValue()
   * @model
   * @generated
   */

  int getMinValue();

  /**
   * Sets the value of the '{@link org.polarsys.capella.vp.price.price.Price#getMinValue <em>Min Value</em>}' attribute.
  
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Value</em>' attribute.
   * @see #getMinValue()
   * @generated
   */

  void setMinValue(int value);

} // Price
