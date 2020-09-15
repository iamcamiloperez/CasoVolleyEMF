/**
 */
package CasoVolley;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CasoVolley.Carta#getNumeroCorreo <em>Numero Correo</em>}</li>
 *   <li>{@link CasoVolley.Carta#getFecha <em>Fecha</em>}</li>
 *   <li>{@link CasoVolley.Carta#getContenido <em>Contenido</em>}</li>
 *   <li>{@link CasoVolley.Carta#getPersona <em>Persona</em>}</li>
 * </ul>
 *
 * @see CasoVolley.CasoVolleyPackage#getCarta()
 * @model
 * @generated
 */
public interface Carta extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero Correo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Correo</em>' attribute.
	 * @see #setNumeroCorreo(int)
	 * @see CasoVolley.CasoVolleyPackage#getCarta_NumeroCorreo()
	 * @model
	 * @generated
	 */
	int getNumeroCorreo();

	/**
	 * Sets the value of the '{@link CasoVolley.Carta#getNumeroCorreo <em>Numero Correo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Correo</em>' attribute.
	 * @see #getNumeroCorreo()
	 * @generated
	 */
	void setNumeroCorreo(int value);

	/**
	 * Returns the value of the '<em><b>Fecha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha</em>' attribute.
	 * @see #setFecha(Date)
	 * @see CasoVolley.CasoVolleyPackage#getCarta_Fecha()
	 * @model
	 * @generated
	 */
	Date getFecha();

	/**
	 * Sets the value of the '{@link CasoVolley.Carta#getFecha <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha</em>' attribute.
	 * @see #getFecha()
	 * @generated
	 */
	void setFecha(Date value);

	/**
	 * Returns the value of the '<em><b>Contenido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenido</em>' attribute.
	 * @see #setContenido(String)
	 * @see CasoVolley.CasoVolleyPackage#getCarta_Contenido()
	 * @model
	 * @generated
	 */
	String getContenido();

	/**
	 * Sets the value of the '{@link CasoVolley.Carta#getContenido <em>Contenido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenido</em>' attribute.
	 * @see #getContenido()
	 * @generated
	 */
	void setContenido(String value);

	/**
	 * Returns the value of the '<em><b>Persona</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persona</em>' reference.
	 * @see #setPersona(Persona)
	 * @see CasoVolley.CasoVolleyPackage#getCarta_Persona()
	 * @model
	 * @generated
	 */
	Persona getPersona();

	/**
	 * Sets the value of the '{@link CasoVolley.Carta#getPersona <em>Persona</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persona</em>' reference.
	 * @see #getPersona()
	 * @generated
	 */
	void setPersona(Persona value);

} // Carta
