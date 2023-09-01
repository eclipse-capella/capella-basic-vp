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

import org.polarsys.capella.vp.perfo.perfo.PerfoPackage;
import org.polarsys.capella.vp.perfo.perfo.TimeCapacity;
import org.polarsys.capella.vp.perfo.perfo.UnityElement;
import org.polarsys.capella.vp.perfo.perfo.measurementUnit_Type;

import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Capacity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.perfo.perfo.impl.TimeCapacityImpl#getMeasurementUnit <em>Measurement Unit</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.perfo.perfo.impl.TimeCapacityImpl#getCurrentExecutionTime <em>Current Execution Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeCapacityImpl extends PerformanceCapacityImpl implements TimeCapacity {

  /**
   * The default value of the '{@link #getMeasurementUnit() <em>Measurement Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasurementUnit()
   * @generated
   * @ordered
   */
  protected static final measurementUnit_Type MEASUREMENT_UNIT_EDEFAULT = measurementUnit_Type.MILLISECOND;

  /**
   * The default value of the '{@link #getCurrentExecutionTime() <em>Current Execution Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrentExecutionTime()
   * @generated
   * @ordered
   */
  protected static final int CURRENT_EXECUTION_TIME_EDEFAULT = 0;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimeCapacityImpl() {

    super();

  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return PerfoPackage.Literals.TIME_CAPACITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */

  @Override
  public measurementUnit_Type getMeasurementUnit() {

    return (measurementUnit_Type) eDynamicGet(PerfoPackage.TIME_CAPACITY__MEASUREMENT_UNIT,
        PerfoPackage.Literals.UNITY_ELEMENT__MEASUREMENT_UNIT, true, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */

  @Override
  public void setMeasurementUnit(measurementUnit_Type newMeasurementUnit) {

    eDynamicSet(PerfoPackage.TIME_CAPACITY__MEASUREMENT_UNIT, PerfoPackage.Literals.UNITY_ELEMENT__MEASUREMENT_UNIT,
        newMeasurementUnit);

  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */

  @Override
  public int getCurrentExecutionTime() {

    return (Integer) eDynamicGet(PerfoPackage.TIME_CAPACITY__CURRENT_EXECUTION_TIME,
        PerfoPackage.Literals.TIME_CAPACITY__CURRENT_EXECUTION_TIME, true, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */

  @Override
  public void setCurrentExecutionTime(int newCurrentExecutionTime) {

    eDynamicSet(PerfoPackage.TIME_CAPACITY__CURRENT_EXECUTION_TIME,
        PerfoPackage.Literals.TIME_CAPACITY__CURRENT_EXECUTION_TIME, newCurrentExecutionTime);

  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
    case PerfoPackage.TIME_CAPACITY__MEASUREMENT_UNIT:
      return getMeasurementUnit();
    case PerfoPackage.TIME_CAPACITY__CURRENT_EXECUTION_TIME:
      return getCurrentExecutionTime();
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
    case PerfoPackage.TIME_CAPACITY__MEASUREMENT_UNIT:
      setMeasurementUnit((measurementUnit_Type) newValue);
      return;
    case PerfoPackage.TIME_CAPACITY__CURRENT_EXECUTION_TIME:
      setCurrentExecutionTime((Integer) newValue);
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
    case PerfoPackage.TIME_CAPACITY__MEASUREMENT_UNIT:
      setMeasurementUnit(MEASUREMENT_UNIT_EDEFAULT);
      return;
    case PerfoPackage.TIME_CAPACITY__CURRENT_EXECUTION_TIME:
      setCurrentExecutionTime(CURRENT_EXECUTION_TIME_EDEFAULT);
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
    case PerfoPackage.TIME_CAPACITY__MEASUREMENT_UNIT:
      return getMeasurementUnit() != MEASUREMENT_UNIT_EDEFAULT;
    case PerfoPackage.TIME_CAPACITY__CURRENT_EXECUTION_TIME:
      return getCurrentExecutionTime() != CURRENT_EXECUTION_TIME_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == UnityElement.class) {
      switch (derivedFeatureID) {
      case PerfoPackage.TIME_CAPACITY__MEASUREMENT_UNIT:
        return PerfoPackage.UNITY_ELEMENT__MEASUREMENT_UNIT;
      default:
        return -1;
      }
    }
    if (baseClass == ElementExtension.class) {
      switch (derivedFeatureID) {
      default:
        return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
    if (baseClass == UnityElement.class) {
      switch (baseFeatureID) {
      case PerfoPackage.UNITY_ELEMENT__MEASUREMENT_UNIT:
        return PerfoPackage.TIME_CAPACITY__MEASUREMENT_UNIT;
      default:
        return -1;
      }
    }
    if (baseClass == ElementExtension.class) {
      switch (baseFeatureID) {
      default:
        return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //TimeCapacityImpl