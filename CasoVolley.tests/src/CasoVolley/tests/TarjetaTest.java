/**
 */
package CasoVolley.tests;

import CasoVolley.CasoVolleyFactory;
import CasoVolley.Tarjeta;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tarjeta</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TarjetaTest extends TestCase {

	/**
	 * The fixture for this Tarjeta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tarjeta fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TarjetaTest.class);
	}

	/**
	 * Constructs a new Tarjeta test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TarjetaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Tarjeta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Tarjeta fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Tarjeta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tarjeta getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CasoVolleyFactory.eINSTANCE.createTarjeta());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TarjetaTest
