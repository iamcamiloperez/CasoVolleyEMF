/**
 */
package CasoVolley;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CasoVolley.CasoVolleyPackage
 * @generated
 */
public interface CasoVolleyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CasoVolleyFactory eINSTANCE = CasoVolley.impl.CasoVolleyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Persona</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persona</em>'.
	 * @generated
	 */
	Persona createPersona();

	/**
	 * Returns a new object of class '<em>Factura</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Factura</em>'.
	 * @generated
	 */
	Factura createFactura();

	/**
	 * Returns a new object of class '<em>Tarjeta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tarjeta</em>'.
	 * @generated
	 */
	Tarjeta createTarjeta();

	/**
	 * Returns a new object of class '<em>Carta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carta</em>'.
	 * @generated
	 */
	Carta createCarta();

	/**
	 * Returns a new object of class '<em>Libro Miembros</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Libro Miembros</em>'.
	 * @generated
	 */
	LibroMiembros createLibroMiembros();

	/**
	 * Returns a new object of class '<em>Libro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Libro</em>'.
	 * @generated
	 */
	Libro createLibro();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CasoVolleyPackage getCasoVolleyPackage();

} //CasoVolleyFactory
