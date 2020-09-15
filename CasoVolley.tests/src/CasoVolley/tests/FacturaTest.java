/**
 */
package CasoVolley.tests;

import CasoVolley.CasoVolleyFactory;
import CasoVolley.Factura;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Factura</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FacturaTest extends TestCase {

	/**
	 * The fixture for this Factura test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Factura fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FacturaTest.class);
	}

	/**
	 * Constructs a new Factura test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacturaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Factura test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Factura fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Factura test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Factura getFixture() {
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
		setFixture(CasoVolleyFactory.eINSTANCE.createFactura());
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

} //FacturaTest
