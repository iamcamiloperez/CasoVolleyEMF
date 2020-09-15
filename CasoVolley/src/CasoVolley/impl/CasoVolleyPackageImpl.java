/**
 */
package CasoVolley.impl;

import CasoVolley.Carta;
import CasoVolley.CasoVolleyFactory;
import CasoVolley.CasoVolleyPackage;
import CasoVolley.EstadoPago;
import CasoVolley.Factura;
import CasoVolley.Libro;
import CasoVolley.LibroMiembros;
import CasoVolley.Persona;
import CasoVolley.Sexo;
import CasoVolley.Tarjeta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CasoVolleyPackageImpl extends EPackageImpl implements CasoVolleyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facturaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tarjetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libroMiembrosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sexoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum estadoPagoEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see CasoVolley.CasoVolleyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CasoVolleyPackageImpl() {
		super(eNS_URI, CasoVolleyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CasoVolleyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CasoVolleyPackage init() {
		if (isInited) return (CasoVolleyPackage)EPackage.Registry.INSTANCE.getEPackage(CasoVolleyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCasoVolleyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CasoVolleyPackageImpl theCasoVolleyPackage = registeredCasoVolleyPackage instanceof CasoVolleyPackageImpl ? (CasoVolleyPackageImpl)registeredCasoVolleyPackage : new CasoVolleyPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCasoVolleyPackage.createPackageContents();

		// Initialize created meta-data
		theCasoVolleyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCasoVolleyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CasoVolleyPackage.eNS_URI, theCasoVolleyPackage);
		return theCasoVolleyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersona() {
		return personaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersona_Nombre() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersona_Apellido() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersona_FechaNacimiento() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersona_Sexo() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersona_Telefono() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersona_Direccion() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactura() {
		return facturaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactura_Valor() {
		return (EAttribute)facturaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactura_Estado() {
		return (EAttribute)facturaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactura_Persona() {
		return (EReference)facturaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTarjeta() {
		return tarjetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarjeta_Numero() {
		return (EAttribute)tarjetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarjeta_FechaInicio() {
		return (EAttribute)tarjetaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarjeta_Persona() {
		return (EReference)tarjetaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarta() {
		return cartaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarta_NumeroCorreo() {
		return (EAttribute)cartaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarta_Fecha() {
		return (EAttribute)cartaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarta_Contenido() {
		return (EAttribute)cartaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarta_Persona() {
		return (EReference)cartaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibroMiembros() {
		return libroMiembrosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibroMiembros_Personas() {
		return (EReference)libroMiembrosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibro() {
		return libroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibro_Cartas() {
		return (EReference)libroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSexo() {
		return sexoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEstadoPago() {
		return estadoPagoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasoVolleyFactory getCasoVolleyFactory() {
		return (CasoVolleyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		personaEClass = createEClass(PERSONA);
		createEAttribute(personaEClass, PERSONA__NOMBRE);
		createEAttribute(personaEClass, PERSONA__APELLIDO);
		createEAttribute(personaEClass, PERSONA__FECHA_NACIMIENTO);
		createEAttribute(personaEClass, PERSONA__SEXO);
		createEAttribute(personaEClass, PERSONA__TELEFONO);
		createEAttribute(personaEClass, PERSONA__DIRECCION);

		facturaEClass = createEClass(FACTURA);
		createEAttribute(facturaEClass, FACTURA__VALOR);
		createEAttribute(facturaEClass, FACTURA__ESTADO);
		createEReference(facturaEClass, FACTURA__PERSONA);

		tarjetaEClass = createEClass(TARJETA);
		createEAttribute(tarjetaEClass, TARJETA__NUMERO);
		createEAttribute(tarjetaEClass, TARJETA__FECHA_INICIO);
		createEReference(tarjetaEClass, TARJETA__PERSONA);

		cartaEClass = createEClass(CARTA);
		createEAttribute(cartaEClass, CARTA__NUMERO_CORREO);
		createEAttribute(cartaEClass, CARTA__FECHA);
		createEAttribute(cartaEClass, CARTA__CONTENIDO);
		createEReference(cartaEClass, CARTA__PERSONA);

		libroMiembrosEClass = createEClass(LIBRO_MIEMBROS);
		createEReference(libroMiembrosEClass, LIBRO_MIEMBROS__PERSONAS);

		libroEClass = createEClass(LIBRO);
		createEReference(libroEClass, LIBRO__CARTAS);

		// Create enums
		sexoEEnum = createEEnum(SEXO);
		estadoPagoEEnum = createEEnum(ESTADO_PAGO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(personaEClass, Persona.class, "Persona", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersona_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_Apellido(), ecorePackage.getEString(), "apellido", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_FechaNacimiento(), ecorePackage.getEDate(), "fechaNacimiento", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_Sexo(), this.getSexo(), "Sexo", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_Telefono(), ecorePackage.getEString(), "telefono", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_Direccion(), ecorePackage.getEString(), "direccion", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(facturaEClass, Factura.class, "Factura", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFactura_Valor(), ecorePackage.getEInt(), "valor", null, 0, 1, Factura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactura_Estado(), this.getEstadoPago(), "estado", null, 0, 1, Factura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactura_Persona(), this.getPersona(), null, "persona", null, 0, 1, Factura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tarjetaEClass, Tarjeta.class, "Tarjeta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTarjeta_Numero(), ecorePackage.getEInt(), "numero", null, 0, 1, Tarjeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarjeta_FechaInicio(), ecorePackage.getEDate(), "fechaInicio", null, 0, 1, Tarjeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarjeta_Persona(), this.getPersona(), null, "persona", null, 0, 1, Tarjeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartaEClass, Carta.class, "Carta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCarta_NumeroCorreo(), ecorePackage.getEInt(), "numeroCorreo", null, 0, 1, Carta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarta_Fecha(), ecorePackage.getEDate(), "fecha", null, 0, 1, Carta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarta_Contenido(), ecorePackage.getEString(), "contenido", null, 0, 1, Carta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarta_Persona(), this.getPersona(), null, "persona", null, 0, 1, Carta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libroMiembrosEClass, LibroMiembros.class, "LibroMiembros", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibroMiembros_Personas(), this.getPersona(), null, "personas", null, 0, 1, LibroMiembros.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libroEClass, Libro.class, "Libro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibro_Cartas(), this.getCarta(), null, "cartas", null, 0, 1, Libro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(sexoEEnum, Sexo.class, "Sexo");
		addEEnumLiteral(sexoEEnum, Sexo.MASCULINO);
		addEEnumLiteral(sexoEEnum, Sexo.FEMENINO);

		initEEnum(estadoPagoEEnum, EstadoPago.class, "EstadoPago");
		addEEnumLiteral(estadoPagoEEnum, EstadoPago.PAGADO);
		addEEnumLiteral(estadoPagoEEnum, EstadoPago.PENDIENTE);

		// Create resource
		createResource(eNS_URI);
	}

} //CasoVolleyPackageImpl
