/**
 */
package CasoVolley.impl;

import CasoVolley.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CasoVolleyFactoryImpl extends EFactoryImpl implements CasoVolleyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CasoVolleyFactory init() {
		try {
			CasoVolleyFactory theCasoVolleyFactory = (CasoVolleyFactory)EPackage.Registry.INSTANCE.getEFactory(CasoVolleyPackage.eNS_URI);
			if (theCasoVolleyFactory != null) {
				return theCasoVolleyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CasoVolleyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasoVolleyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CasoVolleyPackage.PERSONA: return createPersona();
			case CasoVolleyPackage.FACTURA: return createFactura();
			case CasoVolleyPackage.TARJETA: return createTarjeta();
			case CasoVolleyPackage.CARTA: return createCarta();
			case CasoVolleyPackage.LIBRO_MIEMBROS: return createLibroMiembros();
			case CasoVolleyPackage.LIBRO: return createLibro();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CasoVolleyPackage.SEXO:
				return createSexoFromString(eDataType, initialValue);
			case CasoVolleyPackage.ESTADO_PAGO:
				return createEstadoPagoFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CasoVolleyPackage.SEXO:
				return convertSexoToString(eDataType, instanceValue);
			case CasoVolleyPackage.ESTADO_PAGO:
				return convertEstadoPagoToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persona createPersona() {
		PersonaImpl persona = new PersonaImpl();
		return persona;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factura createFactura() {
		FacturaImpl factura = new FacturaImpl();
		return factura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tarjeta createTarjeta() {
		TarjetaImpl tarjeta = new TarjetaImpl();
		return tarjeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carta createCarta() {
		CartaImpl carta = new CartaImpl();
		return carta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibroMiembros createLibroMiembros() {
		LibroMiembrosImpl libroMiembros = new LibroMiembrosImpl();
		return libroMiembros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Libro createLibro() {
		LibroImpl libro = new LibroImpl();
		return libro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sexo createSexoFromString(EDataType eDataType, String initialValue) {
		Sexo result = Sexo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSexoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstadoPago createEstadoPagoFromString(EDataType eDataType, String initialValue) {
		EstadoPago result = EstadoPago.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEstadoPagoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasoVolleyPackage getCasoVolleyPackage() {
		return (CasoVolleyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CasoVolleyPackage getPackage() {
		return CasoVolleyPackage.eINSTANCE;
	}

} //CasoVolleyFactoryImpl
