/**
 */
package iStarre.impl;

import iStarre.Actor;
import iStarre.IStarrePackage;
import iStarre.Intentionalelement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iStarre.impl.ActorImpl#getName <em>Name</em>}</li>
 *   <li>{@link iStarre.impl.ActorImpl#getIntentionalelement <em>Intentionalelement</em>}</li>
 *   <li>{@link iStarre.impl.ActorImpl#getIsA <em>Is A</em>}</li>
 *   <li>{@link iStarre.impl.ActorImpl#getPrticipatesIn <em>Prticipates In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends MinimalEObjectImpl.Container implements Actor {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIntentionalelement() <em>Intentionalelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntentionalelement()
	 * @generated
	 * @ordered
	 */
	protected EList<Intentionalelement> intentionalelement;

	/**
	 * The cached value of the '{@link #getIsA() <em>Is A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsA()
	 * @generated
	 * @ordered
	 */
	protected Actor isA;

	/**
	 * The cached value of the '{@link #getPrticipatesIn() <em>Prticipates In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrticipatesIn()
	 * @generated
	 * @ordered
	 */
	protected Actor prticipatesIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IStarrePackage.Literals.ACTOR;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IStarrePackage.ACTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Intentionalelement> getIntentionalelement() {
		if (intentionalelement == null) {
			intentionalelement = new EObjectContainmentEList<Intentionalelement>(Intentionalelement.class, this,
					IStarrePackage.ACTOR__INTENTIONALELEMENT);
		}
		return intentionalelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getIsA() {
		if (isA != null && isA.eIsProxy()) {
			InternalEObject oldIsA = (InternalEObject) isA;
			isA = (Actor) eResolveProxy(oldIsA);
			if (isA != oldIsA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IStarrePackage.ACTOR__IS_A, oldIsA, isA));
			}
		}
		return isA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetIsA() {
		return isA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsA(Actor newIsA) {
		Actor oldIsA = isA;
		isA = newIsA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IStarrePackage.ACTOR__IS_A, oldIsA, isA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getPrticipatesIn() {
		if (prticipatesIn != null && prticipatesIn.eIsProxy()) {
			InternalEObject oldPrticipatesIn = (InternalEObject) prticipatesIn;
			prticipatesIn = (Actor) eResolveProxy(oldPrticipatesIn);
			if (prticipatesIn != oldPrticipatesIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IStarrePackage.ACTOR__PRTICIPATES_IN,
							oldPrticipatesIn, prticipatesIn));
			}
		}
		return prticipatesIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetPrticipatesIn() {
		return prticipatesIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrticipatesIn(Actor newPrticipatesIn) {
		Actor oldPrticipatesIn = prticipatesIn;
		prticipatesIn = newPrticipatesIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IStarrePackage.ACTOR__PRTICIPATES_IN,
					oldPrticipatesIn, prticipatesIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case IStarrePackage.ACTOR__INTENTIONALELEMENT:
			return ((InternalEList<?>) getIntentionalelement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IStarrePackage.ACTOR__NAME:
			return getName();
		case IStarrePackage.ACTOR__INTENTIONALELEMENT:
			return getIntentionalelement();
		case IStarrePackage.ACTOR__IS_A:
			if (resolve)
				return getIsA();
			return basicGetIsA();
		case IStarrePackage.ACTOR__PRTICIPATES_IN:
			if (resolve)
				return getPrticipatesIn();
			return basicGetPrticipatesIn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case IStarrePackage.ACTOR__NAME:
			setName((String) newValue);
			return;
		case IStarrePackage.ACTOR__INTENTIONALELEMENT:
			getIntentionalelement().clear();
			getIntentionalelement().addAll((Collection<? extends Intentionalelement>) newValue);
			return;
		case IStarrePackage.ACTOR__IS_A:
			setIsA((Actor) newValue);
			return;
		case IStarrePackage.ACTOR__PRTICIPATES_IN:
			setPrticipatesIn((Actor) newValue);
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
		case IStarrePackage.ACTOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case IStarrePackage.ACTOR__INTENTIONALELEMENT:
			getIntentionalelement().clear();
			return;
		case IStarrePackage.ACTOR__IS_A:
			setIsA((Actor) null);
			return;
		case IStarrePackage.ACTOR__PRTICIPATES_IN:
			setPrticipatesIn((Actor) null);
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
		case IStarrePackage.ACTOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case IStarrePackage.ACTOR__INTENTIONALELEMENT:
			return intentionalelement != null && !intentionalelement.isEmpty();
		case IStarrePackage.ACTOR__IS_A:
			return isA != null;
		case IStarrePackage.ACTOR__PRTICIPATES_IN:
			return prticipatesIn != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ActorImpl
