/**
 */
package bowling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tournament Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see bowling.BowlingPackage#getTournamentType()
 * @model
 * @generated
 */
public final class TournamentType extends AbstractEnumerator {
	/**
	 * The '<em><b>Amateur</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMATEUR_LITERAL
	 * @model name="Amateur"
	 * @generated
	 * @ordered
	 */
	public static final int AMATEUR = 1;

	/**
	 * The '<em><b>Pro</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRO_LITERAL
	 * @model name="Pro"
	 * @generated
	 * @ordered
	 */
	public static final int PRO = 2;

	/**
	 * The '<em><b>Amateur</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMATEUR
	 * @generated
	 * @ordered
	 */
	public static final TournamentType AMATEUR_LITERAL = new TournamentType(AMATEUR, "Amateur", "Amateur");

	/**
	 * The '<em><b>Pro</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRO
	 * @generated
	 * @ordered
	 */
	public static final TournamentType PRO_LITERAL = new TournamentType(PRO, "Pro", "Pro");

	/**
	 * An array of all the '<em><b>Tournament Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TournamentType[] VALUES_ARRAY =
		new TournamentType[] {
			AMATEUR_LITERAL,
			PRO_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Tournament Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tournament Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TournamentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TournamentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tournament Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TournamentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TournamentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tournament Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TournamentType get(int value) {
		switch (value) {
			case AMATEUR: return AMATEUR_LITERAL;
			case PRO: return PRO_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TournamentType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TournamentType
