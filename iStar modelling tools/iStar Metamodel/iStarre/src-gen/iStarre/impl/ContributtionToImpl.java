/**
 */
package iStarre.impl;

import iStarre.ContrbutionType;
import iStarre.ContributtionTo;
import iStarre.IStarrePackage;
import iStarre.Quality;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contributtion To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iStarre.impl.ContributtionToImpl#getCobtribution <em>Cobtribution</em>}</li>
 *   <li>{@link iStarre.impl.ContributtionToImpl#getContributesTo <em>Contributes To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContributtionToImpl extends MinimalEObjectImpl.Container implements ContributtionTo {
	/**
	 * The default value of the '{@link #getCobtribution() <em>Cobtribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCobtribution()
	 * @generated
	 * @ordered
	 */
	protected static final ContrbutionType COBTRIBUTION_EDEFAULT = ContrbutionType.MAKE;

	/**
	 * The cached value of the '{@link #getCobtribution() <em>Cobtribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCobtribution()
	 * @generated
	 * @ordered
	 */
	protected ContrbutionType cobtribution = COBTRIBUTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContributesTo() <em>Contributes To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributesTo()
	 * @generated
	 * @ordered
	 */
	protected Quality contributesTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContributtionToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IStarrePackage.Literals.CONTRIBUTTION_TO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrbutionType getCobtribution() {
		return cobtribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCobtribution(ContrbutionType newCobtribution) {
		ContrbutionType oldCobtribution = cobtribution;
		cobtribution = newCobtribution == null ? COBTRIBUTION_EDEFAULT : newCobtribution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IStarrePackage.CONTRIBUTTION_TO__COBTRIBUTION,
					oldCobtribution, cobtribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quality getContributesTo() {
		if (contributesTo != null && contributesTo.eIsProxy()) {
			InternalEObject oldContributesTo = (InternalEObject) contributesTo;
			contributesTo = (Quality) eResolveProxy(oldContributesTo);
			if (contributesTo != oldContributesTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							IStarrePackage.CONTRIBUTTION_TO__CONTRIBUTES_TO, oldContributesTo, contributesTo));
			}
		}
		return contributesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quality basicGetContributesTo() {
		return contributesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContributesTo(Quality newContributesTo) {
		Quality oldContributesTo = contributesTo;
		contributesTo = newContributesTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IStarrePackage.CONTRIBUTTION_TO__CONTRIBUTES_TO,
					oldContributesTo, contributesTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IStarrePackage.CONTRIBUTTION_TO__COBTRIBUTION:
			return getCobtribution();
		case IStarrePackage.CONTRIBUTTION_TO__CONTRIBUTES_TO:
			if (resolve)
				return getContributesTo();
			return basicGetContributesTo();
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
		case IStarrePackage.CONTRIBUTTION_TO__COBTRIBUTION:
			setCobtribution((ContrbutionType) newValue);
			return;
		case IStarrePackage.CONTRIBUTTION_TO__CONTRIBUTES_TO:
			setContributesTo((Quality) newValue);
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
		case IStarrePackage.CONTRIBUTTION_TO__COBTRIBUTION:
			setCobtribution(COBTRIBUTION_EDEFAULT);
			return;
		case IStarrePackage.CONTRIBUTTION_TO__CONTRIBUTES_TO:
			setContributesTo((Quality) null);
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
		case IStarrePackage.CONTRIBUTTION_TO__COBTRIBUTION:
			return cobtribution != COBTRIBUTION_EDEFAULT;
		case IStarrePackage.CONTRIBUTTION_TO__CONTRIBUTES_TO:
			return contributesTo != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Cobtribution: ");
		result.append(cobtribution);
		result.append(')');
		return result.toString();
	}

} //ContributtionToImpl
