/**
 */
package CasoVolley;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Estado Pago</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CasoVolley.CasoVolleyPackage#getEstadoPago()
 * @model
 * @generated
 */
public enum EstadoPago implements Enumerator {
	/**
	 * The '<em><b>Pagado</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGADO_VALUE
	 * @generated
	 * @ordered
	 */
	PAGADO(1, "Pagado", "Pagado"),

	/**
	 * The '<em><b>Pendiente</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENDIENTE_VALUE
	 * @generated
	 * @ordered
	 */
	PENDIENTE(0, "Pendiente", "Pendiente");

	/**
	 * The '<em><b>Pagado</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGADO
	 * @model name="Pagado"
	 * @generated
	 * @ordered
	 */
	public static final int PAGADO_VALUE = 1;

	/**
	 * The '<em><b>Pendiente</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENDIENTE
	 * @model name="Pendiente"
	 * @generated
	 * @ordered
	 */
	public static final int PENDIENTE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Estado Pago</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EstadoPago[] VALUES_ARRAY =
		new EstadoPago[] {
			PAGADO,
			PENDIENTE,
		};

	/**
	 * A public read-only list of all the '<em><b>Estado Pago</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EstadoPago> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Estado Pago</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EstadoPago get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EstadoPago result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Estado Pago</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EstadoPago getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EstadoPago result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Estado Pago</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EstadoPago get(int value) {
		switch (value) {
			case PAGADO_VALUE: return PAGADO;
			case PENDIENTE_VALUE: return PENDIENTE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EstadoPago(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EstadoPago
