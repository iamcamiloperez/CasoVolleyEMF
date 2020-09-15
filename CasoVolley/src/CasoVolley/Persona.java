/**
 */
package CasoVolley;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CasoVolley.Persona#getNombre <em>Nombre</em>}</li>
 *   <li>{@link CasoVolley.Persona#getApellido <em>Apellido</em>}</li>
 *   <li>{@link CasoVolley.Persona#getFechaNacimiento <em>Fecha Nacimiento</em>}</li>
 *   <li>{@link CasoVolley.Persona#getSexo <em>Sexo</em>}</li>
 *   <li>{@link CasoVolley.Persona#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link CasoVolley.Persona#getDireccion <em>Direccion</em>}</li>
 * </ul>
 *
 * @see CasoVolley.CasoVolleyPackage#getPersona()
 * @model
 * @generated
 */
public interface Persona extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see CasoVolley.CasoVolleyPackage#getPersona_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link CasoVolley.Persona#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Apellido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apellido</em>' attribute.
	 * @see #setApellido(String)
	 * @see CasoVolley.CasoVolleyPackage#getPersona_Apellido()
	 * @model
	 * @generated
	 */
	String getApellido();

	/**
	 * Sets the value of the '{@link CasoVolley.Persona#getApellido <em>Apellido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apellido</em>' attribute.
	 * @see #getApellido()
	 * @generated
	 */
	void setApellido(String value);

	/**
	 * Returns the value of the '<em><b>Fecha Nacimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Nacimiento</em>' attribute.
	 * @see #setFechaNacimiento(Date)
	 * @see CasoVolley.CasoVolleyPackage#getPersona_FechaNacimiento()
	 * @model
	 * @generated
	 */
	Date getFechaNacimiento();

	/**
	 * Sets the value of the '{@link CasoVolley.Persona#getFechaNacimiento <em>Fecha Nacimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Nacimiento</em>' attribute.
	 * @see #getFechaNacimiento()
	 * @generated
	 */
	void setFechaNacimiento(Date value);

	/**
	 * Returns the value of the '<em><b>Sexo</b></em>' attribute.
	 * The literals are from the enumeration {@link CasoVolley.Sexo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sexo</em>' attribute.
	 * @see CasoVolley.Sexo
	 * @see #setSexo(Sexo)
	 * @see CasoVolley.CasoVolleyPackage#getPersona_Sexo()
	 * @model
	 * @generated
	 */
	Sexo getSexo();

	/**
	 * Sets the value of the '{@link CasoVolley.Persona#getSexo <em>Sexo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sexo</em>' attribute.
	 * @see CasoVolley.Sexo
	 * @see #getSexo()
	 * @generated
	 */
	void setSexo(Sexo value);

	/**
	 * Returns the value of the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telefono</em>' attribute.
	 * @see #setTelefono(String)
	 * @see CasoVolley.CasoVolleyPackage#getPersona_Telefono()
	 * @model
	 * @generated
	 */
	String getTelefono();

	/**
	 * Sets the value of the '{@link CasoVolley.Persona#getTelefono <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefono</em>' attribute.
	 * @see #getTelefono()
	 * @generated
	 */
	void setTelefono(String value);

	/**
	 * Returns the value of the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direccion</em>' attribute.
	 * @see #setDireccion(String)
	 * @see CasoVolley.CasoVolleyPackage#getPersona_Direccion()
	 * @model
	 * @generated
	 */
	String getDireccion();

	/**
	 * Sets the value of the '{@link CasoVolley.Persona#getDireccion <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direccion</em>' attribute.
	 * @see #getDireccion()
	 * @generated
	 */
	void setDireccion(String value);

} // Persona
