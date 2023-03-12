/**
 */
package uk.ac.kcl.inf.coursework.networks.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.coursework.networks.Device;
import uk.ac.kcl.inf.coursework.networks.Internet;
import uk.ac.kcl.inf.coursework.networks.Network;
import uk.ac.kcl.inf.coursework.networks.NetworksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.coursework.networks.impl.NetworkImpl#getNetworkAddress <em>Network Address</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.coursework.networks.impl.NetworkImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.coursework.networks.impl.NetworkImpl#getInternet <em>Internet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkImpl extends MinimalEObjectImpl.Container implements Network {
	/**
	 * The default value of the '{@link #getNetworkAddress() <em>Network Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkAddress() <em>Network Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkAddress()
	 * @generated
	 * @ordered
	 */
	protected String networkAddress = NETWORK_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> devices;

	/**
	 * The cached value of the '{@link #getInternet() <em>Internet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternet()
	 * @generated
	 * @ordered
	 */
	protected Internet internet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworksPackage.Literals.NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetworkAddress() {
		return networkAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkAddress(String newNetworkAddress) {
		String oldNetworkAddress = networkAddress;
		networkAddress = newNetworkAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworksPackage.NETWORK__NETWORK_ADDRESS,
					oldNetworkAddress, networkAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDevices() {
		if (devices == null) {
			devices = new EObjectContainmentEList<Device>(Device.class, this, NetworksPackage.NETWORK__DEVICES);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Internet getInternet() {
		return internet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternet(Internet newInternet, NotificationChain msgs) {
		Internet oldInternet = internet;
		internet = newInternet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					NetworksPackage.NETWORK__INTERNET, oldInternet, newInternet);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternet(Internet newInternet) {
		if (newInternet != internet) {
			NotificationChain msgs = null;
			if (internet != null)
				msgs = ((InternalEObject) internet).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - NetworksPackage.NETWORK__INTERNET, null, msgs);
			if (newInternet != null)
				msgs = ((InternalEObject) newInternet).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - NetworksPackage.NETWORK__INTERNET, null, msgs);
			msgs = basicSetInternet(newInternet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworksPackage.NETWORK__INTERNET, newInternet,
					newInternet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NetworksPackage.NETWORK__DEVICES:
			return ((InternalEList<?>) getDevices()).basicRemove(otherEnd, msgs);
		case NetworksPackage.NETWORK__INTERNET:
			return basicSetInternet(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NetworksPackage.NETWORK__NETWORK_ADDRESS:
			return getNetworkAddress();
		case NetworksPackage.NETWORK__DEVICES:
			return getDevices();
		case NetworksPackage.NETWORK__INTERNET:
			return getInternet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NetworksPackage.NETWORK__NETWORK_ADDRESS:
			setNetworkAddress((String) newValue);
			return;
		case NetworksPackage.NETWORK__DEVICES:
			getDevices().clear();
			getDevices().addAll((Collection<? extends Device>) newValue);
			return;
		case NetworksPackage.NETWORK__INTERNET:
			setInternet((Internet) newValue);
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
		case NetworksPackage.NETWORK__NETWORK_ADDRESS:
			setNetworkAddress(NETWORK_ADDRESS_EDEFAULT);
			return;
		case NetworksPackage.NETWORK__DEVICES:
			getDevices().clear();
			return;
		case NetworksPackage.NETWORK__INTERNET:
			setInternet((Internet) null);
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
		case NetworksPackage.NETWORK__NETWORK_ADDRESS:
			return NETWORK_ADDRESS_EDEFAULT == null ? networkAddress != null
					: !NETWORK_ADDRESS_EDEFAULT.equals(networkAddress);
		case NetworksPackage.NETWORK__DEVICES:
			return devices != null && !devices.isEmpty();
		case NetworksPackage.NETWORK__INTERNET:
			return internet != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (networkAddress: ");
		result.append(networkAddress);
		result.append(')');
		return result.toString();
	}

} //NetworkImpl
