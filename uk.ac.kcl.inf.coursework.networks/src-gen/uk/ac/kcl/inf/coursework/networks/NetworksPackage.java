/**
 */
package uk.ac.kcl.inf.coursework.networks;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.coursework.networks.NetworksFactory
 * @model kind="package"
 * @generated
 */
public interface NetworksPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "networks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/networks";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "networks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetworksPackage eINSTANCE = uk.ac.kcl.inf.coursework.networks.impl.NetworksPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.coursework.networks.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.coursework.networks.impl.NetworkImpl
	 * @see uk.ac.kcl.inf.coursework.networks.impl.NetworksPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Network Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NETWORK_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__DEVICES = 1;

	/**
	 * The feature id for the '<em><b>Internet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__INTERNET = 2;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.coursework.networks.impl.InternetImpl <em>Internet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.coursework.networks.impl.InternetImpl
	 * @see uk.ac.kcl.inf.coursework.networks.impl.NetworksPackageImpl#getInternet()
	 * @generated
	 */
	int INTERNET = 1;

	/**
	 * The number of structural features of the '<em>Internet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNET_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Internet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.coursework.networks.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.coursework.networks.impl.DeviceImpl
	 * @see uk.ac.kcl.inf.coursework.networks.impl.NetworksPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ADDRESS = 1;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.coursework.networks.impl.ComputerImpl <em>Computer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.coursework.networks.impl.ComputerImpl
	 * @see uk.ac.kcl.inf.coursework.networks.impl.NetworksPackageImpl#getComputer()
	 * @generated
	 */
	int COMPUTER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__ADDRESS = DEVICE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Computer Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__COMPUTER_SWITCH = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.coursework.networks.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.coursework.networks.impl.SwitchImpl
	 * @see uk.ac.kcl.inf.coursework.networks.impl.NetworksPackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__ADDRESS = DEVICE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Switch Router</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__SWITCH_ROUTER = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.coursework.networks.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.coursework.networks.impl.ServerImpl
	 * @see uk.ac.kcl.inf.coursework.networks.impl.NetworksPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__ADDRESS = DEVICE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Server Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SERVER_SWITCH = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.coursework.networks.impl.RouterImpl <em>Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.coursework.networks.impl.RouterImpl
	 * @see uk.ac.kcl.inf.coursework.networks.impl.NetworksPackageImpl#getRouter()
	 * @generated
	 */
	int ROUTER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__ADDRESS = DEVICE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Router Internet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__ROUTER_INTERNET = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.coursework.networks.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see uk.ac.kcl.inf.coursework.networks.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.coursework.networks.Network#getNetworkAddress <em>Network Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Address</em>'.
	 * @see uk.ac.kcl.inf.coursework.networks.Network#getNetworkAddress()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_NetworkAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.coursework.networks.Network#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Devices</em>'.
	 * @see uk.ac.kcl.inf.coursework.networks.Network#getDevices()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Devices();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.coursework.networks.Network#getInternet <em>Internet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Internet</em>'.
	 * @see uk.ac.kcl.inf.coursework.networks.Network#getInternet()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Internet();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.coursework.networks.Internet <em>Internet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internet</em>'.
	 * @see uk.ac.kcl.inf.coursework.networks.Internet
	 * @generated
	 */
	EClass getInternet();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.coursework.networks.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see uk.ac.kcl.inf.coursework.networks.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.coursework.networks.Device#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.kcl.inf.coursework.networks.Device#getName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.coursework.networks.Device#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see uk.ac.kcl.inf.coursework.networks.Device#getAddress()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Address();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.coursework.networks.Computer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computer</em>'.
	 * @see uk.ac.kcl.inf.coursework.networks.Computer
	 * @generated
	 */
	EClass getComputer();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.coursework.networks.Computer#getComputerSwitch <em>Computer Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Computer Switch</em>'.
	 * @see uk.ac.kcl.inf.coursework.networks.Computer#getComputerSwitch()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_ComputerSwitch();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.coursework.networks.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see uk.ac.kcl.inf.coursework.networks.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.coursework.networks.Switch#getSwitchRouter <em>Switch Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Switch Router</em>'.
	 * @see uk.ac.kcl.inf.coursework.networks.Switch#getSwitchRouter()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_SwitchRouter();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.coursework.networks.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see uk.ac.kcl.inf.coursework.networks.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.coursework.networks.Server#getServerSwitch <em>Server Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server Switch</em>'.
	 * @see uk.ac.kcl.inf.coursework.networks.Server#getServerSwitch()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_ServerSwitch();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.coursework.networks.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router</em>'.
	 * @see uk.ac.kcl.inf.coursework.networks.Router
	 * @generated
	 */
	EClass getRouter();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.coursework.networks.Router#getRouterInternet <em>Router Internet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Router Internet</em>'.
	 * @see uk.ac.kcl.inf.coursework.networks.Router#getRouterInternet()
	 * @see #getRouter()
	 * @generated
	 */
	EReference getRouter_RouterInternet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NetworksFactory getNetworksFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.coursework.networks.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.coursework.networks.impl.NetworkImpl
		 * @see uk.ac.kcl.inf.coursework.networks.impl.NetworksPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Network Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__NETWORK_ADDRESS = eINSTANCE.getNetwork_NetworkAddress();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__DEVICES = eINSTANCE.getNetwork_Devices();

		/**
		 * The meta object literal for the '<em><b>Internet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__INTERNET = eINSTANCE.getNetwork_Internet();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.coursework.networks.impl.InternetImpl <em>Internet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.coursework.networks.impl.InternetImpl
		 * @see uk.ac.kcl.inf.coursework.networks.impl.NetworksPackageImpl#getInternet()
		 * @generated
		 */
		EClass INTERNET = eINSTANCE.getInternet();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.coursework.networks.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.coursework.networks.impl.DeviceImpl
		 * @see uk.ac.kcl.inf.coursework.networks.impl.NetworksPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__ADDRESS = eINSTANCE.getDevice_Address();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.coursework.networks.impl.ComputerImpl <em>Computer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.coursework.networks.impl.ComputerImpl
		 * @see uk.ac.kcl.inf.coursework.networks.impl.NetworksPackageImpl#getComputer()
		 * @generated
		 */
		EClass COMPUTER = eINSTANCE.getComputer();

		/**
		 * The meta object literal for the '<em><b>Computer Switch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER__COMPUTER_SWITCH = eINSTANCE.getComputer_ComputerSwitch();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.coursework.networks.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.coursework.networks.impl.SwitchImpl
		 * @see uk.ac.kcl.inf.coursework.networks.impl.NetworksPackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '<em><b>Switch Router</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__SWITCH_ROUTER = eINSTANCE.getSwitch_SwitchRouter();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.coursework.networks.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.coursework.networks.impl.ServerImpl
		 * @see uk.ac.kcl.inf.coursework.networks.impl.NetworksPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Server Switch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__SERVER_SWITCH = eINSTANCE.getServer_ServerSwitch();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.coursework.networks.impl.RouterImpl <em>Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.coursework.networks.impl.RouterImpl
		 * @see uk.ac.kcl.inf.coursework.networks.impl.NetworksPackageImpl#getRouter()
		 * @generated
		 */
		EClass ROUTER = eINSTANCE.getRouter();

		/**
		 * The meta object literal for the '<em><b>Router Internet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTER__ROUTER_INTERNET = eINSTANCE.getRouter_RouterInternet();

	}

} //NetworksPackage
