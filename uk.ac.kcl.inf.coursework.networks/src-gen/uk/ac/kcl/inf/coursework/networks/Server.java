/**
 */
package uk.ac.kcl.inf.coursework.networks;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.coursework.networks.Server#getServerSwitch <em>Server Switch</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.coursework.networks.NetworksPackage#getServer()
 * @model
 * @generated
 */
public interface Server extends Device {
	/**
	 * Returns the value of the '<em><b>Server Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Switch</em>' reference.
	 * @see #setServerSwitch(Switch)
	 * @see uk.ac.kcl.inf.coursework.networks.NetworksPackage#getServer_ServerSwitch()
	 * @model derived="true"
	 * @generated
	 */
	Switch getServerSwitch();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.coursework.networks.Server#getServerSwitch <em>Server Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Switch</em>' reference.
	 * @see #getServerSwitch()
	 * @generated
	 */
	void setServerSwitch(Switch value);

} // Server
