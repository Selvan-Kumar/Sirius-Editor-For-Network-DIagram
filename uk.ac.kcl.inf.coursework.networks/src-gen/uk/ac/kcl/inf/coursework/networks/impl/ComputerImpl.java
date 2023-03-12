/**
 */
package uk.ac.kcl.inf.coursework.networks.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.coursework.networks.Computer;
import uk.ac.kcl.inf.coursework.networks.NetworksPackage;
import uk.ac.kcl.inf.coursework.networks.Switch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.coursework.networks.impl.ComputerImpl#getComputerSwitch <em>Computer Switch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputerImpl extends DeviceImpl implements Computer {
	/**
	 * The cached value of the '{@link #getComputerSwitch() <em>Computer Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputerSwitch()
	 * @generated
	 * @ordered
	 */
	protected Switch computerSwitch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworksPackage.Literals.COMPUTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch getComputerSwitch() {
		if (computerSwitch != null && computerSwitch.eIsProxy()) {
			InternalEObject oldComputerSwitch = (InternalEObject) computerSwitch;
			computerSwitch = (Switch) eResolveProxy(oldComputerSwitch);
			if (computerSwitch != oldComputerSwitch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworksPackage.COMPUTER__COMPUTER_SWITCH,
							oldComputerSwitch, computerSwitch));
			}
		}
		return computerSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch basicGetComputerSwitch() {
		return computerSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputerSwitch(Switch newComputerSwitch) {
		Switch oldComputerSwitch = computerSwitch;
		computerSwitch = newComputerSwitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworksPackage.COMPUTER__COMPUTER_SWITCH,
					oldComputerSwitch, computerSwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NetworksPackage.COMPUTER__COMPUTER_SWITCH:
			if (resolve)
				return getComputerSwitch();
			return basicGetComputerSwitch();
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
		case NetworksPackage.COMPUTER__COMPUTER_SWITCH:
			setComputerSwitch((Switch) newValue);
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
		case NetworksPackage.COMPUTER__COMPUTER_SWITCH:
			setComputerSwitch((Switch) null);
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
		case NetworksPackage.COMPUTER__COMPUTER_SWITCH:
			return computerSwitch != null;
		}
		return super.eIsSet(featureID);
	}

} //ComputerImpl
