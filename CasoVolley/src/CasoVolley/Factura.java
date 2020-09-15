/**
 */
package CasoVolley;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factura</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CasoVolley.Factura#getValor <em>Valor</em>}</li>
 *   <li>{@link CasoVolley.Factura#getEstado <em>Estado</em>}</li>
 *   <li>{@link CasoVolley.Factura#getPersona <em>Persona</em>}</li>
 * </ul>
 *
 * @see CasoVolley.CasoVolleyPackage#getFactura()
 * @model
 * @generated
 */
public interface Factura extends EObject {
	/**
	 * Returns the value of the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' attribute.
	 * @see #setValor(int)
	 * @see CasoVolley.CasoVolleyPackage#getFactura_Valor()
	 * @model
	 * @generated
	 */
	int getValor();

	/**
	 * Sets the value of the '{@link CasoVolley.Factura#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(int value);

	/**
	 * Returns the value of the '<em><b>Estado</b></em>' attribute.
	 * The literals are from the enumeration {@link CasoVolley.EstadoPago}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado</em>' attribute.
	 * @see CasoVolley.EstadoPago
	 * @see #setEstado(EstadoPago)
	 * @see CasoVolley.CasoVolleyPackage#getFactura_Estado()
	 * @model
	 * @generated
	 */
	EstadoPago getEstado();

	/**
	 * Sets the value of the '{@link CasoVolley.Factura#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see CasoVolley.EstadoPago
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(EstadoPago value);

	/**
	 * Returns the value of the '<em><b>Persona</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persona</em>' reference.
	 * @see #setPersona(Persona)
	 * @see CasoVolley.CasoVolleyPackage#getFactura_Persona()
	 * @model
	 * @generated
	 */
	Persona getPersona();

	/**
	 * Sets the value of the '{@link CasoVolley.Factura#getPersona <em>Persona</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persona</em>' reference.
	 * @see #getPersona()
	 * @generated
	 */
	void setPersona(Persona value);

} // Factura
