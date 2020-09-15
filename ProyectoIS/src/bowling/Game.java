/**
 */
package bowling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bowling.Game#getFrames <em>Frames</em>}</li>
 *   <li>{@link bowling.Game#getMatchup <em>Matchup</em>}</li>
 *   <li>{@link bowling.Game#getPlayer <em>Player</em>}</li>
 * </ul>
 *
 * @see bowling.BowlingPackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frames</em>' attribute.
	 * @see #setFrames(int)
	 * @see bowling.BowlingPackage#getGame_Frames()
	 * @model
	 * @generated
	 */
	int getFrames();

	/**
	 * Sets the value of the '{@link bowling.Game#getFrames <em>Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frames</em>' attribute.
	 * @see #getFrames()
	 * @generated
	 */
	void setFrames(int value);

	/**
	 * Returns the value of the '<em><b>Matchup</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bowling.Matchup#getGames <em>Games</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchup</em>' reference.
	 * @see #setMatchup(Matchup)
	 * @see bowling.BowlingPackage#getGame_Matchup()
	 * @see bowling.Matchup#getGames
	 * @model opposite="games"
	 * @generated
	 */
	Matchup getMatchup();

	/**
	 * Sets the value of the '{@link bowling.Game#getMatchup <em>Matchup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matchup</em>' reference.
	 * @see #getMatchup()
	 * @generated
	 */
	void setMatchup(Matchup value);

	/**
	 * Returns the value of the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' reference.
	 * @see #setPlayer(Player)
	 * @see bowling.BowlingPackage#getGame_Player()
	 * @model
	 * @generated
	 */
	Player getPlayer();

	/**
	 * Sets the value of the '{@link bowling.Game#getPlayer <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(Player value);

} // Game
