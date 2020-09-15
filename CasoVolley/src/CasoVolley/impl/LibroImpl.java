/**
 */
package CasoVolley.impl;

import CasoVolley.Carta;
import CasoVolley.CasoVolleyPackage;
import CasoVolley.Libro;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Libro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CasoVolley.impl.LibroImpl#getCartas <em>Cartas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibroImpl extends MinimalEObjectImpl.Container implements Libro {
	/**
	 * The cached value of the '{@link #getCartas() <em>Cartas</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartas()
	 * @generated
	 * @ordered
	 */
	protected Carta cartas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibroImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CasoVolleyPackage.Literals.LIBRO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carta getCartas() {
		if (cartas != null && cartas.eIsProxy()) {
			InternalEObject oldCartas = (InternalEObject)cartas;
			cartas = (Carta)eResolveProxy(oldCartas);
			if (cartas != oldCartas) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CasoVolleyPackage.LIBRO__CARTAS, oldCartas, cartas));
			}
		}
		return cartas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carta basicGetCartas() {
		return cartas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCartas(Carta newCartas) {
		Carta oldCartas = cartas;
		cartas = newCartas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasoVolleyPackage.LIBRO__CARTAS, oldCartas, cartas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CasoVolleyPackage.LIBRO__CARTAS:
				if (resolve) return getCartas();
				return basicGetCartas();
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
			case CasoVolleyPackage.LIBRO__CARTAS:
				setCartas((Carta)newValue);
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
			case CasoVolleyPackage.LIBRO__CARTAS:
				setCartas((Carta)null);
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
			case CasoVolleyPackage.LIBRO__CARTAS:
				return cartas != null;
		}
		return super.eIsSet(featureID);
	}

} //LibroImpl
