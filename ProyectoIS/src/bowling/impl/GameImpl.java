/**
 */
package bowling.impl;

import bowling.BowlingPackage;
import bowling.Game;

import bowling.Matchup;
import bowling.Player;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bowling.impl.GameImpl#getFrames <em>Frames</em>}</li>
 *   <li>{@link bowling.impl.GameImpl#getMatchup <em>Matchup</em>}</li>
 *   <li>{@link bowling.impl.GameImpl#getPlayer <em>Player</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
	/**
	 * The default value of the '{@link #getFrames() <em>Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrames()
	 * @generated
	 * @ordered
	 */
	protected static final int FRAMES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFrames() <em>Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrames()
	 * @generated
	 * @ordered
	 */
	protected int frames = FRAMES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatchup() <em>Matchup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchup()
	 * @generated
	 * @ordered
	 */
	protected Matchup matchup;

	/**
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected Player player;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return BowlingPackage.Literals.GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFrames() {
		return frames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrames(int newFrames) {
		int oldFrames = frames;
		frames = newFrames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BowlingPackage.GAME__FRAMES, oldFrames, frames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matchup getMatchup() {
		if (matchup != null && matchup.eIsProxy()) {
			InternalEObject oldMatchup = (InternalEObject)matchup;
			matchup = (Matchup)eResolveProxy(oldMatchup);
			if (matchup != oldMatchup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BowlingPackage.GAME__MATCHUP, oldMatchup, matchup));
			}
		}
		return matchup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matchup basicGetMatchup() {
		return matchup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatchup(Matchup newMatchup, NotificationChain msgs) {
		Matchup oldMatchup = matchup;
		matchup = newMatchup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BowlingPackage.GAME__MATCHUP, oldMatchup, newMatchup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchup(Matchup newMatchup) {
		if (newMatchup != matchup) {
			NotificationChain msgs = null;
			if (matchup != null)
				msgs = ((InternalEObject)matchup).eInverseRemove(this, BowlingPackage.MATCHUP__GAMES, Matchup.class, msgs);
			if (newMatchup != null)
				msgs = ((InternalEObject)newMatchup).eInverseAdd(this, BowlingPackage.MATCHUP__GAMES, Matchup.class, msgs);
			msgs = basicSetMatchup(newMatchup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BowlingPackage.GAME__MATCHUP, newMatchup, newMatchup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player getPlayer() {
		if (player != null && player.eIsProxy()) {
			InternalEObject oldPlayer = (InternalEObject)player;
			player = (Player)eResolveProxy(oldPlayer);
			if (player != oldPlayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BowlingPackage.GAME__PLAYER, oldPlayer, player));
			}
		}
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetPlayer() {
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayer(Player newPlayer) {
		Player oldPlayer = player;
		player = newPlayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BowlingPackage.GAME__PLAYER, oldPlayer, player));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BowlingPackage.GAME__MATCHUP:
				if (matchup != null)
					msgs = ((InternalEObject)matchup).eInverseRemove(this, BowlingPackage.MATCHUP__GAMES, Matchup.class, msgs);
				return basicSetMatchup((Matchup)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BowlingPackage.GAME__MATCHUP:
				return basicSetMatchup(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BowlingPackage.GAME__FRAMES:
				return new Integer(getFrames());
			case BowlingPackage.GAME__MATCHUP:
				if (resolve) return getMatchup();
				return basicGetMatchup();
			case BowlingPackage.GAME__PLAYER:
				if (resolve) return getPlayer();
				return basicGetPlayer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BowlingPackage.GAME__FRAMES:
				setFrames(((Integer)newValue).intValue());
				return;
			case BowlingPackage.GAME__MATCHUP:
				setMatchup((Matchup)newValue);
				return;
			case BowlingPackage.GAME__PLAYER:
				setPlayer((Player)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case BowlingPackage.GAME__FRAMES:
				setFrames(FRAMES_EDEFAULT);
				return;
			case BowlingPackage.GAME__MATCHUP:
				setMatchup((Matchup)null);
				return;
			case BowlingPackage.GAME__PLAYER:
				setPlayer((Player)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BowlingPackage.GAME__FRAMES:
				return frames != FRAMES_EDEFAULT;
			case BowlingPackage.GAME__MATCHUP:
				return matchup != null;
			case BowlingPackage.GAME__PLAYER:
				return player != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (frames: ");
		result.append(frames);
		result.append(')');
		return result.toString();
	}

} //GameImpl
