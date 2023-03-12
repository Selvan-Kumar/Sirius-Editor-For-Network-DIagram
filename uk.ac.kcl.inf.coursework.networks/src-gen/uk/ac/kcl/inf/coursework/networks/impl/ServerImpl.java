/**
 */
package uk.ac.kcl.inf.coursework.networks.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.coursework.networks.NetworksPackage;
import uk.ac.kcl.inf.coursework.networks.Server;
import uk.ac.kcl.inf.coursework.networks.Switch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.coursework.networks.impl.ServerImpl#getServerSwitch <em>Server Switch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerImpl extends DeviceImpl implements Server {
	/**
	 * The cached value of the '{@link #getServerSwitch() <em>Server Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerSwitch()
	 * @generated
	 * @ordered
	 */
	protected Switch serverSwitch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworksPackage.Literals.SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch getServerSwitch() {
		if (serverSwitch != null && serverSwitch.eIsProxy()) {
			InternalEObject oldServerSwitch = (InternalEObject) serverSwitch;
			serverSwitch = (Switch) eResolveProxy(oldServerSwitch);
			if (serverSwitch != oldServerSwitch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworksPackage.SERVER__SERVER_SWITCH,
							oldServerSwitch, serverSwitch));
			}
		}
		return serverSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch basicGetServerSwitch() {
		return serverSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerSwitch(Switch newServerSwitch) {
		Switch oldServerSwitch = serverSwitch;
		serverSwitch = newServerSwitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworksPackage.SERVER__SERVER_SWITCH,
					oldServerSwitch, serverSwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NetworksPackage.SERVER__SERVER_SWITCH:
			if (resolve)
				return getServerSwitch();
			return basicGetServerSwitch();
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
		case NetworksPackage.SERVER__SERVER_SWITCH:
			setServerSwitch((Switch) newValue);
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
		case NetworksPackage.SERVER__SERVER_SWITCH:
			setServerSwitch((Switch) null);
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
		case NetworksPackage.SERVER__SERVER_SWITCH:
			return serverSwitch != null;
		}
		return super.eIsSet(featureID);
	}

} //ServerImpl
