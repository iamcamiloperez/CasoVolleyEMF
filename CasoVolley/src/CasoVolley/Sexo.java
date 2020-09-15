/**
 */
package CasoVolley;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sexo</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CasoVolley.CasoVolleyPackage#getSexo()
 * @model
 * @generated
 */
public enum Sexo implements Enumerator {
	/**
	 * The '<em><b>Masculino</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASCULINO_VALUE
	 * @generated
	 * @ordered
	 */
	MASCULINO(1, "Masculino", "Masculino"),

	/**
	 * The '<em><b>Femenino</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEMENINO_VALUE
	 * @generated
	 * @ordered
	 */
	FEMENINO(0, "Femenino", "Femenino");

	/**
	 * The '<em><b>Masculino</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASCULINO
	 * @model name="Masculino"
	 * @generated
	 * @ordered
	 */
	public static final int MASCULINO_VALUE = 1;

	/**
	 * The '<em><b>Femenino</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEMENINO
	 * @model name="Femenino"
	 * @generated
	 * @ordered
	 */
	public static final int FEMENINO_VALUE = 0;

	/**
	 * An array of all the '<em><b>Sexo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Sexo[] VALUES_ARRAY =
		new Sexo[] {
			MASCULINO,
			FEMENINO,
		};

	/**
	 * A public read-only list of all the '<em><b>Sexo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Sexo> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sexo</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Sexo get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Sexo result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sexo</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Sexo getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Sexo result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sexo</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Sexo get(int value) {
		switch (value) {
			case MASCULINO_VALUE: return MASCULINO;
			case FEMENINO_VALUE: return FEMENINO;
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
	private Sexo(int value, String name, String literal) {
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
	
} //Sexo
