/**
 */
package uk.ac.kcl.inf.coursework.networks;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.coursework.networks.Device#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.coursework.networks.Device#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.coursework.networks.NetworksPackage#getDevice()
 * @model abstract="true"
 * @generated
 */
public interface Device extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.kcl.inf.coursework.networks.NetworksPackage#getDevice_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.coursework.networks.Device#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see uk.ac.kcl.inf.coursework.networks.NetworksPackage#getDevice_Address()
	 * @model id="true"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.coursework.networks.Device#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

} // Device
