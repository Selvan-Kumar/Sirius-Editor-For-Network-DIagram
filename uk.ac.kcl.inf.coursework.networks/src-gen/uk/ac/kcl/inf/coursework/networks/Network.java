/**
 */
package uk.ac.kcl.inf.coursework.networks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.coursework.networks.Network#getNetworkAddress <em>Network Address</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.coursework.networks.Network#getDevices <em>Devices</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.coursework.networks.Network#getInternet <em>Internet</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.coursework.networks.NetworksPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends EObject {
	/**
	 * Returns the value of the '<em><b>Network Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Address</em>' attribute.
	 * @see #setNetworkAddress(String)
	 * @see uk.ac.kcl.inf.coursework.networks.NetworksPackage#getNetwork_NetworkAddress()
	 * @model
	 * @generated
	 */
	String getNetworkAddress();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.coursework.networks.Network#getNetworkAddress <em>Network Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Address</em>' attribute.
	 * @see #getNetworkAddress()
	 * @generated
	 */
	void setNetworkAddress(String value);

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.coursework.networks.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference list.
	 * @see uk.ac.kcl.inf.coursework.networks.NetworksPackage#getNetwork_Devices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Device> getDevices();

	/**
	 * Returns the value of the '<em><b>Internet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internet</em>' containment reference.
	 * @see #setInternet(Internet)
	 * @see uk.ac.kcl.inf.coursework.networks.NetworksPackage#getNetwork_Internet()
	 * @model containment="true"
	 * @generated
	 */
	Internet getInternet();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.coursework.networks.Network#getInternet <em>Internet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internet</em>' containment reference.
	 * @see #getInternet()
	 * @generated
	 */
	void setInternet(Internet value);

} // Network
