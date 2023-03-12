/**
 */
package uk.ac.kcl.inf.coursework.networks;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.coursework.networks.Switch#getSwitchRouter <em>Switch Router</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.coursework.networks.NetworksPackage#getSwitch()
 * @model
 * @generated
 */
public interface Switch extends Device {
	/**
	 * Returns the value of the '<em><b>Switch Router</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch Router</em>' reference.
	 * @see #setSwitchRouter(Router)
	 * @see uk.ac.kcl.inf.coursework.networks.NetworksPackage#getSwitch_SwitchRouter()
	 * @model derived="true"
	 * @generated
	 */
	Router getSwitchRouter();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.coursework.networks.Switch#getSwitchRouter <em>Switch Router</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch Router</em>' reference.
	 * @see #getSwitchRouter()
	 * @generated
	 */
	void setSwitchRouter(Router value);

} // Switch
