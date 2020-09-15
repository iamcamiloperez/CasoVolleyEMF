/**
 */
package CasoVolley;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tarjeta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CasoVolley.Tarjeta#getNumero <em>Numero</em>}</li>
 *   <li>{@link CasoVolley.Tarjeta#getFechaInicio <em>Fecha Inicio</em>}</li>
 *   <li>{@link CasoVolley.Tarjeta#getPersona <em>Persona</em>}</li>
 * </ul>
 *
 * @see CasoVolley.CasoVolleyPackage#getTarjeta()
 * @model
 * @generated
 */
public interface Tarjeta extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero</em>' attribute.
	 * @see #setNumero(int)
	 * @see CasoVolley.CasoVolleyPackage#getTarjeta_Numero()
	 * @model
	 * @generated
	 */
	int getNumero();

	/**
	 * Sets the value of the '{@link CasoVolley.Tarjeta#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' attribute.
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(int value);

	/**
	 * Returns the value of the '<em><b>Fecha Inicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Inicio</em>' attribute.
	 * @see #setFechaInicio(Date)
	 * @see CasoVolley.CasoVolleyPackage#getTarjeta_FechaInicio()
	 * @model
	 * @generated
	 */
	Date getFechaInicio();

	/**
	 * Sets the value of the '{@link CasoVolley.Tarjeta#getFechaInicio <em>Fecha Inicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Inicio</em>' attribute.
	 * @see #getFechaInicio()
	 * @generated
	 */
	void setFechaInicio(Date value);

	/**
	 * Returns the value of the '<em><b>Persona</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persona</em>' reference.
	 * @see #setPersona(Persona)
	 * @see CasoVolley.CasoVolleyPackage#getTarjeta_Persona()
	 * @model
	 * @generated
	 */
	Persona getPersona();

	/**
	 * Sets the value of the '{@link CasoVolley.Tarjeta#getPersona <em>Persona</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persona</em>' reference.
	 * @see #getPersona()
	 * @generated
	 */
	void setPersona(Persona value);

} // Tarjeta
