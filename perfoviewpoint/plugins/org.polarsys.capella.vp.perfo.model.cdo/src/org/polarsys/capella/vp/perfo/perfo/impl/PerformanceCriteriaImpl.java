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
package org.polarsys.capella.vp.perfo.perfo.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.vp.perfo.perfo.PerfoPackage;
import org.polarsys.capella.vp.perfo.perfo.PerformanceCriteria;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.perfo.perfo.impl.PerformanceCriteriaImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.perfo.perfo.impl.PerformanceCriteriaImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.perfo.perfo.impl.PerformanceCriteriaImpl#getMinValue <em>Min Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformanceCriteriaImpl extends NamedElementImpl implements PerformanceCriteria {

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final int VALUE_EDEFAULT = 0;

  /**
   * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxValue()
   * @generated
   * @ordered
   */
  protected static final int MAX_VALUE_EDEFAULT = 0;

  /**
   * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinValue()
   * @generated
   * @ordered
   */
  protected static final int MIN_VALUE_EDEFAULT = 0;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PerformanceCriteriaImpl() {

    super();

  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return PerfoPackage.Literals.PERFORMANCE_CRITERIA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */

  @Override
  public int getValue() {

    return (Integer) eDynamicGet(PerfoPackage.PERFORMANCE_CRITERIA__VALUE,
        PerfoPackage.Literals.PERFORMANCE_CRITERIA__VALUE, true, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */

  @Override
  public void setValue(int newValue) {

    eDynamicSet(PerfoPackage.PERFORMANCE_CRITERIA__VALUE, PerfoPackage.Literals.PERFORMANCE_CRITERIA__VALUE, newValue);

  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */

  @Override
  public int getMaxValue() {

    return (Integer) eDynamicGet(PerfoPackage.PERFORMANCE_CRITERIA__MAX_VALUE,
        PerfoPackage.Literals.PERFORMANCE_CRITERIA__MAX_VALUE, true, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */

  @Override
  public void setMaxValue(int newMaxValue) {

    eDynamicSet(PerfoPackage.PERFORMANCE_CRITERIA__MAX_VALUE, PerfoPackage.Literals.PERFORMANCE_CRITERIA__MAX_VALUE,
        newMaxValue);

  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */

  @Override
  public int getMinValue() {

    return (Integer) eDynamicGet(PerfoPackage.PERFORMANCE_CRITERIA__MIN_VALUE,
        PerfoPackage.Literals.PERFORMANCE_CRITERIA__MIN_VALUE, true, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */

  @Override
  public void setMinValue(int newMinValue) {

    eDynamicSet(PerfoPackage.PERFORMANCE_CRITERIA__MIN_VALUE, PerfoPackage.Literals.PERFORMANCE_CRITERIA__MIN_VALUE,
        newMinValue);

  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
    case PerfoPackage.PERFORMANCE_CRITERIA__VALUE:
      return getValue();
    case PerfoPackage.PERFORMANCE_CRITERIA__MAX_VALUE:
      return getMaxValue();
    case PerfoPackage.PERFORMANCE_CRITERIA__MIN_VALUE:
      return getMinValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
    case PerfoPackage.PERFORMANCE_CRITERIA__VALUE:
      setValue((Integer) newValue);
      return;
    case PerfoPackage.PERFORMANCE_CRITERIA__MAX_VALUE:
      setMaxValue((Integer) newValue);
      return;
    case PerfoPackage.PERFORMANCE_CRITERIA__MIN_VALUE:
      setMinValue((Integer) newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
    case PerfoPackage.PERFORMANCE_CRITERIA__VALUE:
      setValue(VALUE_EDEFAULT);
      return;
    case PerfoPackage.PERFORMANCE_CRITERIA__MAX_VALUE:
      setMaxValue(MAX_VALUE_EDEFAULT);
      return;
    case PerfoPackage.PERFORMANCE_CRITERIA__MIN_VALUE:
      setMinValue(MIN_VALUE_EDEFAULT);
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
    case PerfoPackage.PERFORMANCE_CRITERIA__VALUE:
      return getValue() != VALUE_EDEFAULT;
    case PerfoPackage.PERFORMANCE_CRITERIA__MAX_VALUE:
      return getMaxValue() != MAX_VALUE_EDEFAULT;
    case PerfoPackage.PERFORMANCE_CRITERIA__MIN_VALUE:
      return getMinValue() != MIN_VALUE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

} //PerformanceCriteriaImpl