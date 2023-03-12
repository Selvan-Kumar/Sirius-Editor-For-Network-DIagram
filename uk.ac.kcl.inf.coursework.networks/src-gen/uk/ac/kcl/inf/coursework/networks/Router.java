/**
 */
package uk.ac.kcl.inf.coursework.networks;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Router</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.coursework.networks.Router#getRouterInternet <em>Router Internet</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.coursework.networks.NetworksPackage#getRouter()
 * @model
 * @generated
 */
public interface Router extends Device {
	/**
	 * Returns the value of the '<em><b>Router Internet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Router Internet</em>' reference.
	 * @see #setRouterInternet(Internet)
	 * @see uk.ac.kcl.inf.coursework.networks.NetworksPackage#getRouter_RouterInternet()
	 * @model derived="true"
	 * @generated
	 */
	Internet getRouterInternet();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.coursework.networks.Router#getRouterInternet <em>Router Internet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Router Internet</em>' reference.
	 * @see #getRouterInternet()
	 * @generated
	 */
	void setRouterInternet(Internet value);

} // Router
