/**
 */
package CasoVolley;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Libro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CasoVolley.Libro#getCartas <em>Cartas</em>}</li>
 * </ul>
 *
 * @see CasoVolley.CasoVolleyPackage#getLibro()
 * @model
 * @generated
 */
public interface Libro extends EObject {
	/**
	 * Returns the value of the '<em><b>Cartas</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cartas</em>' reference.
	 * @see #setCartas(Carta)
	 * @see CasoVolley.CasoVolleyPackage#getLibro_Cartas()
	 * @model
	 * @generated
	 */
	Carta getCartas();

	/**
	 * Sets the value of the '{@link CasoVolley.Libro#getCartas <em>Cartas</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartas</em>' reference.
	 * @see #getCartas()
	 * @generated
	 */
	void setCartas(Carta value);

} // Libro
