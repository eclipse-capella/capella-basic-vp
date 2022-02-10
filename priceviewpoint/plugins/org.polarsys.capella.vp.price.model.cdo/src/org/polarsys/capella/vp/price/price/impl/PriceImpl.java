
package org.polarsys.capella.vp.price.price.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.vp.price.price.Price;
import org.polarsys.capella.vp.price.price.PricePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Price</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.price.price.impl.PriceImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.price.price.impl.PriceImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.price.price.impl.PriceImpl#getMinValue <em>Min Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PriceImpl extends NamedElementImpl implements Price {

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
	protected PriceImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PricePackage.Literals.PRICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getValue() {

		return (Integer) eDynamicGet(PricePackage.PRICE__VALUE, PricePackage.Literals.PRICE__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setValue(int newValue) {

		eDynamicSet(PricePackage.PRICE__VALUE, PricePackage.Literals.PRICE__VALUE, newValue);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getMaxValue() {

		return (Integer) eDynamicGet(PricePackage.PRICE__MAX_VALUE, PricePackage.Literals.PRICE__MAX_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setMaxValue(int newMaxValue) {

		eDynamicSet(PricePackage.PRICE__MAX_VALUE, PricePackage.Literals.PRICE__MAX_VALUE, newMaxValue);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getMinValue() {

		return (Integer) eDynamicGet(PricePackage.PRICE__MIN_VALUE, PricePackage.Literals.PRICE__MIN_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setMinValue(int newMinValue) {

		eDynamicSet(PricePackage.PRICE__MIN_VALUE, PricePackage.Literals.PRICE__MIN_VALUE, newMinValue);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PricePackage.PRICE__VALUE:
			return getValue();
		case PricePackage.PRICE__MAX_VALUE:
			return getMaxValue();
		case PricePackage.PRICE__MIN_VALUE:
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
		case PricePackage.PRICE__VALUE:
			setValue((Integer) newValue);
			return;
		case PricePackage.PRICE__MAX_VALUE:
			setMaxValue((Integer) newValue);
			return;
		case PricePackage.PRICE__MIN_VALUE:
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
		case PricePackage.PRICE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case PricePackage.PRICE__MAX_VALUE:
			setMaxValue(MAX_VALUE_EDEFAULT);
			return;
		case PricePackage.PRICE__MIN_VALUE:
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
		case PricePackage.PRICE__VALUE:
			return getValue() != VALUE_EDEFAULT;
		case PricePackage.PRICE__MAX_VALUE:
			return getMaxValue() != MAX_VALUE_EDEFAULT;
		case PricePackage.PRICE__MIN_VALUE:
			return getMinValue() != MIN_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //PriceImpl