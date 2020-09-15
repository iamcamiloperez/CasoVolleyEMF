/**
 */
package CasoVolley;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Libro Miembros</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CasoVolley.LibroMiembros#getPersonas <em>Personas</em>}</li>
 * </ul>
 *
 * @see CasoVolley.CasoVolleyPackage#getLibroMiembros()
 * @model
 * @generated
 */
public interface LibroMiembros extends EObject {
	/**
	 * Returns the value of the '<em><b>Personas</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personas</em>' reference.
	 * @see #setPersonas(Persona)
	 * @see CasoVolley.CasoVolleyPackage#getLibroMiembros_Personas()
	 * @model
	 * @generated
	 */
	Persona getPersonas();

	/**
	 * Sets the value of the '{@link CasoVolley.LibroMiembros#getPersonas <em>Personas</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personas</em>' reference.
	 * @see #getPersonas()
	 * @generated
	 */
	void setPersonas(Persona value);

} // LibroMiembros
