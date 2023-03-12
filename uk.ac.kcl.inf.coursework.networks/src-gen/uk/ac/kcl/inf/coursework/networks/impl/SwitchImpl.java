/**
 */
package uk.ac.kcl.inf.coursework.networks.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.coursework.networks.NetworksPackage;
import uk.ac.kcl.inf.coursework.networks.Router;
import uk.ac.kcl.inf.coursework.networks.Switch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.coursework.networks.impl.SwitchImpl#getSwitchRouter <em>Switch Router</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchImpl extends DeviceImpl implements Switch {
	/**
	 * The cached value of the '{@link #getSwitchRouter() <em>Switch Router</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchRouter()
	 * @generated
	 * @ordered
	 */
	protected Router switchRouter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworksPackage.Literals.SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Router getSwitchRouter() {
		if (switchRouter != null && switchRouter.eIsProxy()) {
			InternalEObject oldSwitchRouter = (InternalEObject) switchRouter;
			switchRouter = (Router) eResolveProxy(oldSwitchRouter);
			if (switchRouter != oldSwitchRouter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworksPackage.SWITCH__SWITCH_ROUTER,
							oldSwitchRouter, switchRouter));
			}
		}
		return switchRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Router basicGetSwitchRouter() {
		return switchRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchRouter(Router newSwitchRouter) {
		Router oldSwitchRouter = switchRouter;
		switchRouter = newSwitchRouter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworksPackage.SWITCH__SWITCH_ROUTER,
					oldSwitchRouter, switchRouter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NetworksPackage.SWITCH__SWITCH_ROUTER:
			if (resolve)
				return getSwitchRouter();
			return basicGetSwitchRouter();
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
		case NetworksPackage.SWITCH__SWITCH_ROUTER:
			setSwitchRouter((Router) newValue);
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
		case NetworksPackage.SWITCH__SWITCH_ROUTER:
			setSwitchRouter((Router) null);
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
		case NetworksPackage.SWITCH__SWITCH_ROUTER:
			return switchRouter != null;
		}
		return super.eIsSet(featureID);
	}

} //SwitchImpl
