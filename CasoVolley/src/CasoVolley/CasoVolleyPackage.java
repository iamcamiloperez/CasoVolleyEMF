/**
 */
package CasoVolley;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CasoVolley.CasoVolleyFactory
 * @model kind="package"
 * @generated
 */
public interface CasoVolleyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CasoVolley";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/eclipse/example/casoVolley";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.example.casoVolley";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CasoVolleyPackage eINSTANCE = CasoVolley.impl.CasoVolleyPackageImpl.init();

	/**
	 * The meta object id for the '{@link CasoVolley.impl.PersonaImpl <em>Persona</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CasoVolley.impl.PersonaImpl
	 * @see CasoVolley.impl.CasoVolleyPackageImpl#getPersona()
	 * @generated
	 */
	int PERSONA = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Apellido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__APELLIDO = 1;

	/**
	 * The feature id for the '<em><b>Fecha Nacimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__FECHA_NACIMIENTO = 2;

	/**
	 * The feature id for the '<em><b>Sexo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__SEXO = 3;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__TELEFONO = 4;

	/**
	 * The feature id for the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__DIRECCION = 5;

	/**
	 * The number of structural features of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CasoVolley.impl.FacturaImpl <em>Factura</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CasoVolley.impl.FacturaImpl
	 * @see CasoVolley.impl.CasoVolleyPackageImpl#getFactura()
	 * @generated
	 */
	int FACTURA = 1;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTURA__VALOR = 0;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTURA__ESTADO = 1;

	/**
	 * The feature id for the '<em><b>Persona</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTURA__PERSONA = 2;

	/**
	 * The number of structural features of the '<em>Factura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTURA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Factura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTURA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CasoVolley.impl.TarjetaImpl <em>Tarjeta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CasoVolley.impl.TarjetaImpl
	 * @see CasoVolley.impl.CasoVolleyPackageImpl#getTarjeta()
	 * @generated
	 */
	int TARJETA = 2;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARJETA__NUMERO = 0;

	/**
	 * The feature id for the '<em><b>Fecha Inicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARJETA__FECHA_INICIO = 1;

	/**
	 * The feature id for the '<em><b>Persona</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARJETA__PERSONA = 2;

	/**
	 * The number of structural features of the '<em>Tarjeta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARJETA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tarjeta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARJETA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CasoVolley.impl.CartaImpl <em>Carta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CasoVolley.impl.CartaImpl
	 * @see CasoVolley.impl.CasoVolleyPackageImpl#getCarta()
	 * @generated
	 */
	int CARTA = 3;

	/**
	 * The feature id for the '<em><b>Numero Correo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTA__NUMERO_CORREO = 0;

	/**
	 * The feature id for the '<em><b>Fecha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTA__FECHA = 1;

	/**
	 * The feature id for the '<em><b>Contenido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTA__CONTENIDO = 2;

	/**
	 * The feature id for the '<em><b>Persona</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTA__PERSONA = 3;

	/**
	 * The number of structural features of the '<em>Carta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Carta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CasoVolley.impl.LibroMiembrosImpl <em>Libro Miembros</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CasoVolley.impl.LibroMiembrosImpl
	 * @see CasoVolley.impl.CasoVolleyPackageImpl#getLibroMiembros()
	 * @generated
	 */
	int LIBRO_MIEMBROS = 4;

	/**
	 * The feature id for the '<em><b>Personas</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRO_MIEMBROS__PERSONAS = 0;

	/**
	 * The number of structural features of the '<em>Libro Miembros</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRO_MIEMBROS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Libro Miembros</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRO_MIEMBROS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CasoVolley.impl.LibroImpl <em>Libro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CasoVolley.impl.LibroImpl
	 * @see CasoVolley.impl.CasoVolleyPackageImpl#getLibro()
	 * @generated
	 */
	int LIBRO = 5;

	/**
	 * The feature id for the '<em><b>Cartas</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRO__CARTAS = 0;

	/**
	 * The number of structural features of the '<em>Libro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Libro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CasoVolley.Sexo <em>Sexo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CasoVolley.Sexo
	 * @see CasoVolley.impl.CasoVolleyPackageImpl#getSexo()
	 * @generated
	 */
	int SEXO = 6;

	/**
	 * The meta object id for the '{@link CasoVolley.EstadoPago <em>Estado Pago</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CasoVolley.EstadoPago
	 * @see CasoVolley.impl.CasoVolleyPackageImpl#getEstadoPago()
	 * @generated
	 */
	int ESTADO_PAGO = 7;


	/**
	 * Returns the meta object for class '{@link CasoVolley.Persona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persona</em>'.
	 * @see CasoVolley.Persona
	 * @generated
	 */
	EClass getPersona();

	/**
	 * Returns the meta object for the attribute '{@link CasoVolley.Persona#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see CasoVolley.Persona#getNombre()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link CasoVolley.Persona#getApellido <em>Apellido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apellido</em>'.
	 * @see CasoVolley.Persona#getApellido()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Apellido();

	/**
	 * Returns the meta object for the attribute '{@link CasoVolley.Persona#getFechaNacimiento <em>Fecha Nacimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Nacimiento</em>'.
	 * @see CasoVolley.Persona#getFechaNacimiento()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_FechaNacimiento();

	/**
	 * Returns the meta object for the attribute '{@link CasoVolley.Persona#getSexo <em>Sexo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sexo</em>'.
	 * @see CasoVolley.Persona#getSexo()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Sexo();

	/**
	 * Returns the meta object for the attribute '{@link CasoVolley.Persona#getTelefono <em>Telefono</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefono</em>'.
	 * @see CasoVolley.Persona#getTelefono()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Telefono();

	/**
	 * Returns the meta object for the attribute '{@link CasoVolley.Persona#getDireccion <em>Direccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direccion</em>'.
	 * @see CasoVolley.Persona#getDireccion()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Direccion();

	/**
	 * Returns the meta object for class '{@link CasoVolley.Factura <em>Factura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factura</em>'.
	 * @see CasoVolley.Factura
	 * @generated
	 */
	EClass getFactura();

	/**
	 * Returns the meta object for the attribute '{@link CasoVolley.Factura#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see CasoVolley.Factura#getValor()
	 * @see #getFactura()
	 * @generated
	 */
	EAttribute getFactura_Valor();

	/**
	 * Returns the meta object for the attribute '{@link CasoVolley.Factura#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see CasoVolley.Factura#getEstado()
	 * @see #getFactura()
	 * @generated
	 */
	EAttribute getFactura_Estado();

	/**
	 * Returns the meta object for the reference '{@link CasoVolley.Factura#getPersona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Persona</em>'.
	 * @see CasoVolley.Factura#getPersona()
	 * @see #getFactura()
	 * @generated
	 */
	EReference getFactura_Persona();

	/**
	 * Returns the meta object for class '{@link CasoVolley.Tarjeta <em>Tarjeta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tarjeta</em>'.
	 * @see CasoVolley.Tarjeta
	 * @generated
	 */
	EClass getTarjeta();

	/**
	 * Returns the meta object for the attribute '{@link CasoVolley.Tarjeta#getNumero <em>Numero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero</em>'.
	 * @see CasoVolley.Tarjeta#getNumero()
	 * @see #getTarjeta()
	 * @generated
	 */
	EAttribute getTarjeta_Numero();

	/**
	 * Returns the meta object for the attribute '{@link CasoVolley.Tarjeta#getFechaInicio <em>Fecha Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Inicio</em>'.
	 * @see CasoVolley.Tarjeta#getFechaInicio()
	 * @see #getTarjeta()
	 * @generated
	 */
	EAttribute getTarjeta_FechaInicio();

	/**
	 * Returns the meta object for the reference '{@link CasoVolley.Tarjeta#getPersona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Persona</em>'.
	 * @see CasoVolley.Tarjeta#getPersona()
	 * @see #getTarjeta()
	 * @generated
	 */
	EReference getTarjeta_Persona();

	/**
	 * Returns the meta object for class '{@link CasoVolley.Carta <em>Carta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carta</em>'.
	 * @see CasoVolley.Carta
	 * @generated
	 */
	EClass getCarta();

	/**
	 * Returns the meta object for the attribute '{@link CasoVolley.Carta#getNumeroCorreo <em>Numero Correo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Correo</em>'.
	 * @see CasoVolley.Carta#getNumeroCorreo()
	 * @see #getCarta()
	 * @generated
	 */
	EAttribute getCarta_NumeroCorreo();

	/**
	 * Returns the meta object for the attribute '{@link CasoVolley.Carta#getFecha <em>Fecha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha</em>'.
	 * @see CasoVolley.Carta#getFecha()
	 * @see #getCarta()
	 * @generated
	 */
	EAttribute getCarta_Fecha();

	/**
	 * Returns the meta object for the attribute '{@link CasoVolley.Carta#getContenido <em>Contenido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contenido</em>'.
	 * @see CasoVolley.Carta#getContenido()
	 * @see #getCarta()
	 * @generated
	 */
	EAttribute getCarta_Contenido();

	/**
	 * Returns the meta object for the reference '{@link CasoVolley.Carta#getPersona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Persona</em>'.
	 * @see CasoVolley.Carta#getPersona()
	 * @see #getCarta()
	 * @generated
	 */
	EReference getCarta_Persona();

	/**
	 * Returns the meta object for class '{@link CasoVolley.LibroMiembros <em>Libro Miembros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Libro Miembros</em>'.
	 * @see CasoVolley.LibroMiembros
	 * @generated
	 */
	EClass getLibroMiembros();

	/**
	 * Returns the meta object for the reference '{@link CasoVolley.LibroMiembros#getPersonas <em>Personas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Personas</em>'.
	 * @see CasoVolley.LibroMiembros#getPersonas()
	 * @see #getLibroMiembros()
	 * @generated
	 */
	EReference getLibroMiembros_Personas();

	/**
	 * Returns the meta object for class '{@link CasoVolley.Libro <em>Libro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Libro</em>'.
	 * @see CasoVolley.Libro
	 * @generated
	 */
	EClass getLibro();

	/**
	 * Returns the meta object for the reference '{@link CasoVolley.Libro#getCartas <em>Cartas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cartas</em>'.
	 * @see CasoVolley.Libro#getCartas()
	 * @see #getLibro()
	 * @generated
	 */
	EReference getLibro_Cartas();

	/**
	 * Returns the meta object for enum '{@link CasoVolley.Sexo <em>Sexo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sexo</em>'.
	 * @see CasoVolley.Sexo
	 * @generated
	 */
	EEnum getSexo();

	/**
	 * Returns the meta object for enum '{@link CasoVolley.EstadoPago <em>Estado Pago</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Estado Pago</em>'.
	 * @see CasoVolley.EstadoPago
	 * @generated
	 */
	EEnum getEstadoPago();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CasoVolleyFactory getCasoVolleyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CasoVolley.impl.PersonaImpl <em>Persona</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CasoVolley.impl.PersonaImpl
		 * @see CasoVolley.impl.CasoVolleyPackageImpl#getPersona()
		 * @generated
		 */
		EClass PERSONA = eINSTANCE.getPersona();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__NOMBRE = eINSTANCE.getPersona_Nombre();

		/**
		 * The meta object literal for the '<em><b>Apellido</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__APELLIDO = eINSTANCE.getPersona_Apellido();

		/**
		 * The meta object literal for the '<em><b>Fecha Nacimiento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__FECHA_NACIMIENTO = eINSTANCE.getPersona_FechaNacimiento();

		/**
		 * The meta object literal for the '<em><b>Sexo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__SEXO = eINSTANCE.getPersona_Sexo();

		/**
		 * The meta object literal for the '<em><b>Telefono</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__TELEFONO = eINSTANCE.getPersona_Telefono();

		/**
		 * The meta object literal for the '<em><b>Direccion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__DIRECCION = eINSTANCE.getPersona_Direccion();

		/**
		 * The meta object literal for the '{@link CasoVolley.impl.FacturaImpl <em>Factura</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CasoVolley.impl.FacturaImpl
		 * @see CasoVolley.impl.CasoVolleyPackageImpl#getFactura()
		 * @generated
		 */
		EClass FACTURA = eINSTANCE.getFactura();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTURA__VALOR = eINSTANCE.getFactura_Valor();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTURA__ESTADO = eINSTANCE.getFactura_Estado();

		/**
		 * The meta object literal for the '<em><b>Persona</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTURA__PERSONA = eINSTANCE.getFactura_Persona();

		/**
		 * The meta object literal for the '{@link CasoVolley.impl.TarjetaImpl <em>Tarjeta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CasoVolley.impl.TarjetaImpl
		 * @see CasoVolley.impl.CasoVolleyPackageImpl#getTarjeta()
		 * @generated
		 */
		EClass TARJETA = eINSTANCE.getTarjeta();

		/**
		 * The meta object literal for the '<em><b>Numero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARJETA__NUMERO = eINSTANCE.getTarjeta_Numero();

		/**
		 * The meta object literal for the '<em><b>Fecha Inicio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARJETA__FECHA_INICIO = eINSTANCE.getTarjeta_FechaInicio();

		/**
		 * The meta object literal for the '<em><b>Persona</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARJETA__PERSONA = eINSTANCE.getTarjeta_Persona();

		/**
		 * The meta object literal for the '{@link CasoVolley.impl.CartaImpl <em>Carta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CasoVolley.impl.CartaImpl
		 * @see CasoVolley.impl.CasoVolleyPackageImpl#getCarta()
		 * @generated
		 */
		EClass CARTA = eINSTANCE.getCarta();

		/**
		 * The meta object literal for the '<em><b>Numero Correo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTA__NUMERO_CORREO = eINSTANCE.getCarta_NumeroCorreo();

		/**
		 * The meta object literal for the '<em><b>Fecha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTA__FECHA = eINSTANCE.getCarta_Fecha();

		/**
		 * The meta object literal for the '<em><b>Contenido</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTA__CONTENIDO = eINSTANCE.getCarta_Contenido();

		/**
		 * The meta object literal for the '<em><b>Persona</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTA__PERSONA = eINSTANCE.getCarta_Persona();

		/**
		 * The meta object literal for the '{@link CasoVolley.impl.LibroMiembrosImpl <em>Libro Miembros</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CasoVolley.impl.LibroMiembrosImpl
		 * @see CasoVolley.impl.CasoVolleyPackageImpl#getLibroMiembros()
		 * @generated
		 */
		EClass LIBRO_MIEMBROS = eINSTANCE.getLibroMiembros();

		/**
		 * The meta object literal for the '<em><b>Personas</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRO_MIEMBROS__PERSONAS = eINSTANCE.getLibroMiembros_Personas();

		/**
		 * The meta object literal for the '{@link CasoVolley.impl.LibroImpl <em>Libro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CasoVolley.impl.LibroImpl
		 * @see CasoVolley.impl.CasoVolleyPackageImpl#getLibro()
		 * @generated
		 */
		EClass LIBRO = eINSTANCE.getLibro();

		/**
		 * The meta object literal for the '<em><b>Cartas</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRO__CARTAS = eINSTANCE.getLibro_Cartas();

		/**
		 * The meta object literal for the '{@link CasoVolley.Sexo <em>Sexo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CasoVolley.Sexo
		 * @see CasoVolley.impl.CasoVolleyPackageImpl#getSexo()
		 * @generated
		 */
		EEnum SEXO = eINSTANCE.getSexo();

		/**
		 * The meta object literal for the '{@link CasoVolley.EstadoPago <em>Estado Pago</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CasoVolley.EstadoPago
		 * @see CasoVolley.impl.CasoVolleyPackageImpl#getEstadoPago()
		 * @generated
		 */
		EEnum ESTADO_PAGO = eINSTANCE.getEstadoPago();

	}

} //CasoVolleyPackage
