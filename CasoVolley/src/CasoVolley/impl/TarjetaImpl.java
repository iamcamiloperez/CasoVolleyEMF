/**
 */
package CasoVolley.impl;

import CasoVolley.CasoVolleyPackage;
import CasoVolley.Persona;
import CasoVolley.Tarjeta;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tarjeta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CasoVolley.impl.TarjetaImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link CasoVolley.impl.TarjetaImpl#getFechaInicio <em>Fecha Inicio</em>}</li>
 *   <li>{@link CasoVolley.impl.TarjetaImpl#getPersona <em>Persona</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TarjetaImpl extends MinimalEObjectImpl.Container implements Tarjeta {
	/**
	 * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected int numero = NUMERO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaInicio() <em>Fecha Inicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaInicio()
	 * @generated
	 * @ordered
	 */
	protected static final Date FECHA_INICIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaInicio() <em>Fecha Inicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaInicio()
	 * @generated
	 * @ordered
	 */
	protected Date fechaInicio = FECHA_INICIO_EDEFAULT;

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
	protected TarjetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CasoVolleyPackage.Literals.TARJETA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumero(int newNumero) {
		int oldNumero = numero;
		numero = newNumero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasoVolleyPackage.TARJETA__NUMERO, oldNumero, numero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaInicio(Date newFechaInicio) {
		Date oldFechaInicio = fechaInicio;
		fechaInicio = newFechaInicio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasoVolleyPackage.TARJETA__FECHA_INICIO, oldFechaInicio, fechaInicio));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CasoVolleyPackage.TARJETA__PERSONA, oldPersona, persona));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CasoVolleyPackage.TARJETA__PERSONA, oldPersona, persona));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CasoVolleyPackage.TARJETA__NUMERO:
				return getNumero();
			case CasoVolleyPackage.TARJETA__FECHA_INICIO:
				return getFechaInicio();
			case CasoVolleyPackage.TARJETA__PERSONA:
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
			case CasoVolleyPackage.TARJETA__NUMERO:
				setNumero((Integer)newValue);
				return;
			case CasoVolleyPackage.TARJETA__FECHA_INICIO:
				setFechaInicio((Date)newValue);
				return;
			case CasoVolleyPackage.TARJETA__PERSONA:
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
			case CasoVolleyPackage.TARJETA__NUMERO:
				setNumero(NUMERO_EDEFAULT);
				return;
			case CasoVolleyPackage.TARJETA__FECHA_INICIO:
				setFechaInicio(FECHA_INICIO_EDEFAULT);
				return;
			case CasoVolleyPackage.TARJETA__PERSONA:
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
			case CasoVolleyPackage.TARJETA__NUMERO:
				return numero != NUMERO_EDEFAULT;
			case CasoVolleyPackage.TARJETA__FECHA_INICIO:
				return FECHA_INICIO_EDEFAULT == null ? fechaInicio != null : !FECHA_INICIO_EDEFAULT.equals(fechaInicio);
			case CasoVolleyPackage.TARJETA__PERSONA:
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
		result.append(" (numero: ");
		result.append(numero);
		result.append(", fechaInicio: ");
		result.append(fechaInicio);
		result.append(')');
		return result.toString();
	}

} //TarjetaImpl
