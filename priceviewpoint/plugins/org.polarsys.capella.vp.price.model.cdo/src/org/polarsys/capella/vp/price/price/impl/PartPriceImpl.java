
package org.polarsys.capella.vp.price.price.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.vp.price.price.PartPrice;
import org.polarsys.capella.vp.price.price.PricePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Price</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.price.price.impl.PartPriceImpl#getCurrentPrice <em>Current Price</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartPriceImpl extends PriceImpl implements PartPrice {

	/**
	 * The default value of the '{@link #getCurrentPrice() <em>Current Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_PRICE_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartPriceImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PricePackage.Literals.PART_PRICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getCurrentPrice() {

		return (Integer) eDynamicGet(PricePackage.PART_PRICE__CURRENT_PRICE,
				PricePackage.Literals.PART_PRICE__CURRENT_PRICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setCurrentPrice(int newCurrentPrice) {

		eDynamicSet(PricePackage.PART_PRICE__CURRENT_PRICE, PricePackage.Literals.PART_PRICE__CURRENT_PRICE,
				newCurrentPrice);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PricePackage.PART_PRICE__CURRENT_PRICE:
			return getCurrentPrice();
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
		case PricePackage.PART_PRICE__CURRENT_PRICE:
			setCurrentPrice((Integer) newValue);
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
		case PricePackage.PART_PRICE__CURRENT_PRICE:
			setCurrentPrice(CURRENT_PRICE_EDEFAULT);
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
		case PricePackage.PART_PRICE__CURRENT_PRICE:
			return getCurrentPrice() != CURRENT_PRICE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //PartPriceImpl