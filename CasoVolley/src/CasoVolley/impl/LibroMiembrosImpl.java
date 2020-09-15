/**
 */
package CasoVolley.impl;

import CasoVolley.CasoVolleyPackage;
import CasoVolley.LibroMiembros;
import CasoVolley.Persona;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Libro Miembros</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CasoVolley.impl.LibroMiembrosImpl#getPersonas <em>Personas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibroMiembrosImpl extends MinimalEObjectImpl.Container implements LibroMiembros {
	/**
	 * The cached value of the '{@link #getPersonas() <em>Personas</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonas()
	 * @generated
	 * @ordered
	 */
	protected Persona personas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibroMiembrosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CasoVolleyPackage.Literals.LIBRO_MIEMBROS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persona getPersonas() {
		if (personas != null && personas.eIsProxy()) {
			InternalEObject oldPersonas = (InternalEObject)personas;
			personas = (Persona)eResolveProxy(oldPersonas);
			if (personas != oldPersonas) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CasoVolleyPackage.LIBRO_MIEMBROS__PERSONAS, oldPersonas, personas));
			}
		}
		return personas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persona basicGetPersonas() {
		return personas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonas(Persona newPersonas) {
		Persona oldPersonas = personas;
		personas = newPersonas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasoVolleyPackage.LIBRO_MIEMBROS__PERSONAS, oldPersonas, personas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CasoVolleyPackage.LIBRO_MIEMBROS__PERSONAS:
				if (resolve) return getPersonas();
				return basicGetPersonas();
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
			case CasoVolleyPackage.LIBRO_MIEMBROS__PERSONAS:
				setPersonas((Persona)newValue);
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
			case CasoVolleyPackage.LIBRO_MIEMBROS__PERSONAS:
				setPersonas((Persona)null);
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
			case CasoVolleyPackage.LIBRO_MIEMBROS__PERSONAS:
				return personas != null;
		}
		return super.eIsSet(featureID);
	}

} //LibroMiembrosImpl
