/**
 */
package CasoVolley.impl;

import CasoVolley.Carta;
import CasoVolley.CasoVolleyPackage;
import CasoVolley.Persona;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CasoVolley.impl.CartaImpl#getNumeroCorreo <em>Numero Correo</em>}</li>
 *   <li>{@link CasoVolley.impl.CartaImpl#getFecha <em>Fecha</em>}</li>
 *   <li>{@link CasoVolley.impl.CartaImpl#getContenido <em>Contenido</em>}</li>
 *   <li>{@link CasoVolley.impl.CartaImpl#getPersona <em>Persona</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CartaImpl extends MinimalEObjectImpl.Container implements Carta {
	/**
	 * The default value of the '{@link #getNumeroCorreo() <em>Numero Correo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroCorreo()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERO_CORREO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumeroCorreo() <em>Numero Correo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroCorreo()
	 * @generated
	 * @ordered
	 */
	protected int numeroCorreo = NUMERO_CORREO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFecha() <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFecha()
	 * @generated
	 * @ordered
	 */
	protected static final Date FECHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFecha() <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFecha()
	 * @generated
	 * @ordered
	 */
	protected Date fecha = FECHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getContenido() <em>Contenido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenido()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENIDO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContenido() <em>Contenido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenido()
	 * @generated
	 * @ordered
	 */
	protected String contenido = CONTENIDO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPersona() <em>Persona</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersona()
	 * @generated
	 * @ordered
	 */
	protected Persona persona;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CasoVolleyPackage.Literals.CARTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumeroCorreo() {
		return numeroCorreo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroCorreo(int newNumeroCorreo) {
		int oldNumeroCorreo = numeroCorreo;
		numeroCorreo = newNumeroCorreo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasoVolleyPackage.CARTA__NUMERO_CORREO, oldNumeroCorreo, numeroCorreo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFecha(Date newFecha) {
		Date oldFecha = fecha;
		fecha = newFecha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasoVolleyPackage.CARTA__FECHA, oldFecha, fecha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenido(String newContenido) {
		String oldContenido = contenido;
		contenido = newContenido;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasoVolleyPackage.CARTA__CONTENIDO, oldContenido, contenido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persona getPersona() {
		if (persona != null && persona.eIsProxy()) {
			InternalEObject oldPersona = (InternalEObject)persona;
			persona = (Persona)eResolveProxy(oldPersona);
			if (persona != oldPersona) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CasoVolleyPackage.CARTA__PERSONA, oldPersona, persona));
			}
		}
		return persona;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persona basicGetPersona() {
		return persona;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersona(Persona newPersona) {
		Persona oldPersona = persona;
		persona = newPersona;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasoVolleyPackage.CARTA__PERSONA, oldPersona, persona));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CasoVolleyPackage.CARTA__NUMERO_CORREO:
				return getNumeroCorreo();
			case CasoVolleyPackage.CARTA__FECHA:
				return getFecha();
			case CasoVolleyPackage.CARTA__CONTENIDO:
				return getContenido();
			case CasoVolleyPackage.CARTA__PERSONA:
				if (resolve) return getPersona();
				return basicGetPersona();
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
			case CasoVolleyPackage.CARTA__NUMERO_CORREO:
				setNumeroCorreo((Integer)newValue);
				return;
			case CasoVolleyPackage.CARTA__FECHA:
				setFecha((Date)newValue);
				return;
			case CasoVolleyPackage.CARTA__CONTENIDO:
				setContenido((String)newValue);
				return;
			case CasoVolleyPackage.CARTA__PERSONA:
				setPersona((Persona)newValue);
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
			case CasoVolleyPackage.CARTA__NUMERO_CORREO:
				setNumeroCorreo(NUMERO_CORREO_EDEFAULT);
				return;
			case CasoVolleyPackage.CARTA__FECHA:
				setFecha(FECHA_EDEFAULT);
				return;
			case CasoVolleyPackage.CARTA__CONTENIDO:
				setContenido(CONTENIDO_EDEFAULT);
				return;
			case CasoVolleyPackage.CARTA__PERSONA:
				setPersona((Persona)null);
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
			case CasoVolleyPackage.CARTA__NUMERO_CORREO:
				return numeroCorreo != NUMERO_CORREO_EDEFAULT;
			case CasoVolleyPackage.CARTA__FECHA:
				return FECHA_EDEFAULT == null ? fecha != null : !FECHA_EDEFAULT.equals(fecha);
			case CasoVolleyPackage.CARTA__CONTENIDO:
				return CONTENIDO_EDEFAULT == null ? contenido != null : !CONTENIDO_EDEFAULT.equals(contenido);
			case CasoVolleyPackage.CARTA__PERSONA:
				return persona != null;
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
		result.append(" (numeroCorreo: ");
		result.append(numeroCorreo);
		result.append(", fecha: ");
		result.append(fecha);
		result.append(", contenido: ");
		result.append(contenido);
		result.append(')');
		return result.toString();
	}

} //CartaImpl
