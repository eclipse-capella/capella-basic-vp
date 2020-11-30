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
package org.polarsys.capella.vp.perfo.perfo.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.capella.common.lib.IdGenerator;
import org.polarsys.capella.vp.perfo.perfo.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PerfoFactoryImpl extends EFactoryImpl implements PerfoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PerfoFactory init() {
		try {
			PerfoFactory thePerfoFactory = (PerfoFactory) EPackage.Registry.INSTANCE.getEFactory(PerfoPackage.eNS_URI);
			if (thePerfoFactory != null) {
				return thePerfoFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PerfoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PerfoPackage.PERFORMANCE_CRITERIA:
			return createPerformanceCriteria();
		case PerfoPackage.PERFORMANCE_CONSUMPTION:
			return createPerformanceConsumption();
		case PerfoPackage.PERFORMANCE_CAPACITY:
			return createPerformanceCapacity();
		case PerfoPackage.TIME_CONSUMPTION:
			return createTimeConsumption();
		case PerfoPackage.TIME_CAPACITY:
			return createTimeCapacity();
		case PerfoPackage.UNITY_ELEMENT:
			return createUnityElement();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case PerfoPackage.MEASUREMENT_UNIT_TYPE:
			return createmeasurementUnit_TypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case PerfoPackage.MEASUREMENT_UNIT_TYPE:
			return convertmeasurementUnit_TypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceCriteria createPerformanceCriteria() {
		PerformanceCriteriaImpl performanceCriteria = new PerformanceCriteriaImpl();
		//begin-capella-code

		performanceCriteria.setId(IdGenerator.createId());

		//end-capella-code
		return performanceCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceConsumption createPerformanceConsumption() {
		PerformanceConsumptionImpl performanceConsumption = new PerformanceConsumptionImpl();
		//begin-capella-code

		performanceConsumption.setId(IdGenerator.createId());

		//end-capella-code
		return performanceConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceCapacity createPerformanceCapacity() {
		PerformanceCapacityImpl performanceCapacity = new PerformanceCapacityImpl();
		//begin-capella-code

		performanceCapacity.setId(IdGenerator.createId());

		//end-capella-code
		return performanceCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeConsumption createTimeConsumption() {
		TimeConsumptionImpl timeConsumption = new TimeConsumptionImpl();
		//begin-capella-code

		timeConsumption.setId(IdGenerator.createId());

		//end-capella-code
		return timeConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeCapacity createTimeCapacity() {
		TimeCapacityImpl timeCapacity = new TimeCapacityImpl();
		//begin-capella-code

		timeCapacity.setId(IdGenerator.createId());

		//end-capella-code
		return timeCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnityElement createUnityElement() {
		UnityElementImpl unityElement = new UnityElementImpl();
		//begin-capella-code

		unityElement.setId(IdGenerator.createId());

		//end-capella-code
		return unityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public measurementUnit_Type createmeasurementUnit_TypeFromString(EDataType eDataType, String initialValue) {
		measurementUnit_Type result = measurementUnit_Type.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertmeasurementUnit_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfoPackage getPerfoPackage() {
		return (PerfoPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PerfoPackage getPackage() {
		return PerfoPackage.eINSTANCE;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public PerformanceCriteria createPerformanceCriteria(String name_p) {
		PerformanceCriteria performanceCriteria = createPerformanceCriteria();
		performanceCriteria.setName(name_p);
		return performanceCriteria;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public PerformanceConsumption createPerformanceConsumption(String name_p) {
		PerformanceConsumption performanceConsumption = createPerformanceConsumption();
		performanceConsumption.setName(name_p);
		return performanceConsumption;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public PerformanceCapacity createPerformanceCapacity(String name_p) {
		PerformanceCapacity performanceCapacity = createPerformanceCapacity();
		performanceCapacity.setName(name_p);
		return performanceCapacity;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public TimeConsumption createTimeConsumption(String name_p) {
		TimeConsumption timeConsumption = createTimeConsumption();
		timeConsumption.setName(name_p);
		return timeConsumption;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public TimeCapacity createTimeCapacity(String name_p) {
		TimeCapacity timeCapacity = createTimeCapacity();
		timeCapacity.setName(name_p);
		return timeCapacity;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public UnityElement createUnityElement(String name_p) {
		UnityElement unityElement = createUnityElement();
		unityElement.setName(name_p);
		return unityElement;
	}

} //PerfoFactoryImpl
