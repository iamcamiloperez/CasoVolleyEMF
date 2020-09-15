/**
 */
package CasoVolley.impl;

import CasoVolley.CasoVolleyPackage;
import CasoVolley.EstadoPago;
import CasoVolley.Factura;
import CasoVolley.Persona;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factura</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CasoVolley.impl.FacturaImpl#getValor <em>Valor</em>}</li>
 *   <li>{@link CasoVolley.impl.FacturaImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link CasoVolley.impl.FacturaImpl#getPersona <em>Persona</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacturaImpl extends MinimalEObjectImpl.Container implements Factura {
	/**
	 * The default value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected static final int VALOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected int valor = VALOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected static final EstadoPago ESTADO_EDEFAULT = EstadoPago.PAGADO;

	/**
	 * The cached value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected EstadoPago estado = ESTADO_EDEFAULT;

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
	protected FacturaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CasoVolleyPackage.Literals.FACTURA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValor(int newValor) {
		int oldValor = valor;
		valor = newValor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasoVolleyPackage.FACTURA__VALOR, oldValor, valor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstadoPago getEstado() {
		return estado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstado(EstadoPago newEstado) {
		EstadoPago oldEstado = estado;
		estado = newEstado == null ? ESTADO_EDEFAULT : newEstado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CasoVolleyPackage.FACTURA__ESTADO, oldEstado, estado));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CasoVolleyPackage.FACTURA__PERSONA, oldPersona, persona));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CasoVolleyPackage.FACTURA__PERSONA, oldPersona, persona));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CasoVolleyPackage.FACTURA__VALOR:
				return getValor();
			case CasoVolleyPackage.FACTURA__ESTADO:
				return getEstado();
			case CasoVolleyPackage.FACTURA__PERSONA:
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
			case CasoVolleyPackage.FACTURA__VALOR:
				setValor((Integer)newValue);
				return;
			case CasoVolleyPackage.FACTURA__ESTADO:
				setEstado((EstadoPago)newValue);
				return;
			case CasoVolleyPackage.FACTURA__PERSONA:
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
			case CasoVolleyPackage.FACTURA__VALOR:
				setValor(VALOR_EDEFAULT);
				return;
			case CasoVolleyPackage.FACTURA__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case CasoVolleyPackage.FACTURA__PERSONA:
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
			case CasoVolleyPackage.FACTURA__VALOR:
				return valor != VALOR_EDEFAULT;
			case CasoVolleyPackage.FACTURA__ESTADO:
				return estado != ESTADO_EDEFAULT;
			case CasoVolleyPackage.FACTURA__PERSONA:
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
		result.append(" (valor: ");
		result.append(valor);
		result.append(", estado: ");
		result.append(estado);
		result.append(')');
		return result.toString();
	}

} //FacturaImpl
