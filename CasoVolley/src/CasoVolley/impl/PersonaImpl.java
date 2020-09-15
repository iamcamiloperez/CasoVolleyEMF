/**
 */
package CasoVolley.impl;

import CasoVolley.CasoVolleyPackage;
import CasoVolley.Persona;
import CasoVolley.Sexo;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CasoVolley.impl.PersonaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link CasoVolley.impl.PersonaImpl#getApellido <em>Apellido</em>}</li>
 *   <li>{@link CasoVolley.impl.PersonaImpl#getFechaNacimiento <em>Fecha Nacimiento</em>}</li>
 *   <li>{@link CasoVolley.impl.PersonaImpl#getSexo <em>Sexo</em>}</li>
 *   <li>{@link CasoVolley.impl.PersonaImpl#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link CasoVolley.impl.PersonaImpl#getDireccion <em>Direccion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonaImpl extends MinimalEObjectImpl.Container implements Persona {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getApellido() <em>Apellido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApellido()
	 * @generated
	 * @ordered
	 */
	protected static final String APELLIDO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApellido() <em>Apellido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApellido()
	 * @generated
	 * @ordered
	 */
	protected String apellido = APELLIDO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaNacimiento() <em>Fecha Nacimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaNacimiento()
	 * @generated
	 * @ordered
	 */
	protected static final Date FECHA_NACIMIENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaNacimiento() <em>Fecha Nacimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaNacimiento()
	 * @generated
	 * @ordered
	 */
	protected Date fechaNacimiento = FECHA_NACIMIENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSexo() <em>Sexo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSexo()
	 * @generated
	 * @ordered
	 */
	protected static final Sexo SEXO_EDEFAULT = Sexo.MASCULINO;

	/**
	 * The cached value of the '{@link #getSexo() <em>Sexo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSexo()
	 * @generated
	 * @ordered
	 */
	protected Sexo sexo = SEXO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEFONO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected String telefono = TELEFONO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDireccion() <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDireccion()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDireccion() <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDireccion()
	 * @generated
	 * @ordered
	 */
	protected String direccion = DIRECCION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CasoVolleyPackage.Literals.PERSONA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasoVolleyPackage.PERSONA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApellido(String newApellido) {
		String oldApellido = apellido;
		apellido = newApellido;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasoVolleyPackage.PERSONA__APELLIDO, oldApellido, apellido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaNacimiento(Date newFechaNacimiento) {
		Date oldFechaNacimiento = fechaNacimiento;
		fechaNacimiento = newFechaNacimiento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasoVolleyPackage.PERSONA__FECHA_NACIMIENTO, oldFechaNacimiento, fechaNacimiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sexo getSexo() {
		return sexo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSexo(Sexo newSexo) {
		Sexo oldSexo = sexo;
		sexo = newSexo == null ? SEXO_EDEFAULT : newSexo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasoVolleyPackage.PERSONA__SEXO, oldSexo, sexo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelefono(String newTelefono) {
		String oldTelefono = telefono;
		telefono = newTelefono;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasoVolleyPackage.PERSONA__TELEFONO, oldTelefono, telefono));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDireccion(String newDireccion) {
		String oldDireccion = direccion;
		direccion = newDireccion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasoVolleyPackage.PERSONA__DIRECCION, oldDireccion, direccion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CasoVolleyPackage.PERSONA__NOMBRE:
				return getNombre();
			case CasoVolleyPackage.PERSONA__APELLIDO:
				return getApellido();
			case CasoVolleyPackage.PERSONA__FECHA_NACIMIENTO:
				return getFechaNacimiento();
			case CasoVolleyPackage.PERSONA__SEXO:
				return getSexo();
			case CasoVolleyPackage.PERSONA__TELEFONO:
				return getTelefono();
			case CasoVolleyPackage.PERSONA__DIRECCION:
				return getDireccion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CasoVolleyPackage.PERSONA__NOMBRE:
				setNombre((String)newValue);
				return;
			case CasoVolleyPackage.PERSONA__APELLIDO:
				setApellido((String)newValue);
				return;
			case CasoVolleyPackage.PERSONA__FECHA_NACIMIENTO:
				setFechaNacimiento((Date)newValue);
				return;
			case CasoVolleyPackage.PERSONA__SEXO:
				setSexo((Sexo)newValue);
				return;
			case CasoVolleyPackage.PERSONA__TELEFONO:
				setTelefono((String)newValue);
				return;
			case CasoVolleyPackage.PERSONA__DIRECCION:
				setDireccion((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CasoVolleyPackage.PERSONA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case CasoVolleyPackage.PERSONA__APELLIDO:
				setApellido(APELLIDO_EDEFAULT);
				return;
			case CasoVolleyPackage.PERSONA__FECHA_NACIMIENTO:
				setFechaNacimiento(FECHA_NACIMIENTO_EDEFAULT);
				return;
			case CasoVolleyPackage.PERSONA__SEXO:
				setSexo(SEXO_EDEFAULT);
				return;
			case CasoVolleyPackage.PERSONA__TELEFONO:
				setTelefono(TELEFONO_EDEFAULT);
				return;
			case CasoVolleyPackage.PERSONA__DIRECCION:
				setDireccion(DIRECCION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CasoVolleyPackage.PERSONA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case CasoVolleyPackage.PERSONA__APELLIDO:
				return APELLIDO_EDEFAULT == null ? apellido != null : !APELLIDO_EDEFAULT.equals(apellido);
			case CasoVolleyPackage.PERSONA__FECHA_NACIMIENTO:
				return FECHA_NACIMIENTO_EDEFAULT == null ? fechaNacimiento != null : !FECHA_NACIMIENTO_EDEFAULT.equals(fechaNacimiento);
			case CasoVolleyPackage.PERSONA__SEXO:
				return sexo != SEXO_EDEFAULT;
			case CasoVolleyPackage.PERSONA__TELEFONO:
				return TELEFONO_EDEFAULT == null ? telefono != null : !TELEFONO_EDEFAULT.equals(telefono);
			case CasoVolleyPackage.PERSONA__DIRECCION:
				return DIRECCION_EDEFAULT == null ? direccion != null : !DIRECCION_EDEFAULT.equals(direccion);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", apellido: ");
		result.append(apellido);
		result.append(", fechaNacimiento: ");
		result.append(fechaNacimiento);
		result.append(", Sexo: ");
		result.append(sexo);
		result.append(", telefono: ");
		result.append(telefono);
		result.append(", direccion: ");
		result.append(direccion);
		result.append(')');
		return result.toString();
	}

} //PersonaImpl
