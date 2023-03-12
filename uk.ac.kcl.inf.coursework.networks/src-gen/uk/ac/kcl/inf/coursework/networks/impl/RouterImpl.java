/**
 */
package uk.ac.kcl.inf.coursework.networks.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.coursework.networks.Internet;
import uk.ac.kcl.inf.coursework.networks.NetworksPackage;
import uk.ac.kcl.inf.coursework.networks.Router;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Router</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.coursework.networks.impl.RouterImpl#getRouterInternet <em>Router Internet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouterImpl extends DeviceImpl implements Router {
	/**
	 * The cached value of the '{@link #getRouterInternet() <em>Router Internet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouterInternet()
	 * @generated
	 * @ordered
	 */
	protected Internet routerInternet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworksPackage.Literals.ROUTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Internet getRouterInternet() {
		if (routerInternet != null && routerInternet.eIsProxy()) {
			InternalEObject oldRouterInternet = (InternalEObject) routerInternet;
			routerInternet = (Internet) eResolveProxy(oldRouterInternet);
			if (routerInternet != oldRouterInternet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworksPackage.ROUTER__ROUTER_INTERNET,
							oldRouterInternet, routerInternet));
			}
		}
		return routerInternet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Internet basicGetRouterInternet() {
		return routerInternet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouterInternet(Internet newRouterInternet) {
		Internet oldRouterInternet = routerInternet;
		routerInternet = newRouterInternet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworksPackage.ROUTER__ROUTER_INTERNET,
					oldRouterInternet, routerInternet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NetworksPackage.ROUTER__ROUTER_INTERNET:
			if (resolve)
				return getRouterInternet();
			return basicGetRouterInternet();
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
		case NetworksPackage.ROUTER__ROUTER_INTERNET:
			setRouterInternet((Internet) newValue);
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
		case NetworksPackage.ROUTER__ROUTER_INTERNET:
			setRouterInternet((Internet) null);
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
		case NetworksPackage.ROUTER__ROUTER_INTERNET:
			return routerInternet != null;
		}
		return super.eIsSet(featureID);
	}

} //RouterImpl
