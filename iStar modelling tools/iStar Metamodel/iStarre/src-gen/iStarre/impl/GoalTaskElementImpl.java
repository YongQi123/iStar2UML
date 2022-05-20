/**
 */
package iStarre.impl;

import iStarre.Constraint;
import iStarre.GoalTaskElement;
import iStarre.IStarrePackage;
import iStarre.Refinement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Task Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iStarre.impl.GoalTaskElementImpl#getRefines <em>Refines</em>}</li>
 *   <li>{@link iStarre.impl.GoalTaskElementImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GoalTaskElementImpl extends IntentionalelementImpl implements GoalTaskElement {
	/**
	 * The cached value of the '{@link #getRefines() <em>Refines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	protected Refinement refines;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalTaskElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IStarrePackage.Literals.GOAL_TASK_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refinement getRefines() {
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefines(Refinement newRefines, NotificationChain msgs) {
		Refinement oldRefines = refines;
		refines = newRefines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					IStarrePackage.GOAL_TASK_ELEMENT__REFINES, oldRefines, newRefines);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefines(Refinement newRefines) {
		if (newRefines != refines) {
			NotificationChain msgs = null;
			if (refines != null)
				msgs = ((InternalEObject) refines).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - IStarrePackage.GOAL_TASK_ELEMENT__REFINES, null, msgs);
			if (newRefines != null)
				msgs = ((InternalEObject) newRefines).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - IStarrePackage.GOAL_TASK_ELEMENT__REFINES, null, msgs);
			msgs = basicSetRefines(newRefines, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IStarrePackage.GOAL_TASK_ELEMENT__REFINES, newRefines,
					newRefines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectResolvingEList<Constraint>(Constraint.class, this,
					IStarrePackage.GOAL_TASK_ELEMENT__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case IStarrePackage.GOAL_TASK_ELEMENT__REFINES:
			return basicSetRefines(null, msgs);
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
		case IStarrePackage.GOAL_TASK_ELEMENT__REFINES:
			return getRefines();
		case IStarrePackage.GOAL_TASK_ELEMENT__CONSTRAINT:
			return getConstraint();
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
		case IStarrePackage.GOAL_TASK_ELEMENT__REFINES:
			setRefines((Refinement) newValue);
			return;
		case IStarrePackage.GOAL_TASK_ELEMENT__CONSTRAINT:
			getConstraint().clear();
			getConstraint().addAll((Collection<? extends Constraint>) newValue);
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
		case IStarrePackage.GOAL_TASK_ELEMENT__REFINES:
			setRefines((Refinement) null);
			return;
		case IStarrePackage.GOAL_TASK_ELEMENT__CONSTRAINT:
			getConstraint().clear();
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
		case IStarrePackage.GOAL_TASK_ELEMENT__REFINES:
			return refines != null;
		case IStarrePackage.GOAL_TASK_ELEMENT__CONSTRAINT:
			return constraint != null && !constraint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GoalTaskElementImpl
