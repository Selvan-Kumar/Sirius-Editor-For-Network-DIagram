/**
 */
package uk.ac.kcl.inf.coursework.networks;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.coursework.networks.Computer#getComputerSwitch <em>Computer Switch</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.coursework.networks.NetworksPackage#getComputer()
 * @model
 * @generated
 */
public interface Computer extends Device {
	/**
	 * Returns the value of the '<em><b>Computer Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computer Switch</em>' reference.
	 * @see #setComputerSwitch(Switch)
	 * @see uk.ac.kcl.inf.coursework.networks.NetworksPackage#getComputer_ComputerSwitch()
	 * @model derived="true"
	 * @generated
	 */
	Switch getComputerSwitch();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.coursework.networks.Computer#getComputerSwitch <em>Computer Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computer Switch</em>' reference.
	 * @see #getComputerSwitch()
	 * @generated
	 */
	void setComputerSwitch(Switch value);

} // Computer
