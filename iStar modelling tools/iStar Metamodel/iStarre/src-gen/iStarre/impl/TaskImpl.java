/**
 */
package iStarre.impl;

import iStarre.IStarrePackage;
import iStarre.Task;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iStarre.impl.TaskImpl#isIsCombinedFragment <em>Is Combined Fragment</em>}</li>
 *   <li>{@link iStarre.impl.TaskImpl#isIsLoop <em>Is Loop</em>}</li>
 *   <li>{@link iStarre.impl.TaskImpl#isIsPrior <em>Is Prior</em>}</li>
 *   <li>{@link iStarre.impl.TaskImpl#getPreviousTask <em>Previous Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends GoalTaskElementImpl implements Task {
	/**
	 * The default value of the '{@link #isIsCombinedFragment() <em>Is Combined Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCombinedFragment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMBINED_FRAGMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCombinedFragment() <em>Is Combined Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCombinedFragment()
	 * @generated
	 * @ordered
	 */
	protected boolean isCombinedFragment = IS_COMBINED_FRAGMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsLoop() <em>Is Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLoop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOOP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLoop() <em>Is Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLoop()
	 * @generated
	 * @ordered
	 */
	protected boolean isLoop = IS_LOOP_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPrior() <em>Is Prior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrior()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PRIOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPrior() <em>Is Prior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrior()
	 * @generated
	 * @ordered
	 */
	protected boolean isPrior = IS_PRIOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPreviousTask() <em>Previous Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousTask()
	 * @generated
	 * @ordered
	 */
	protected Task previousTask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IStarrePackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCombinedFragment() {
		return isCombinedFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCombinedFragment(boolean newIsCombinedFragment) {
		boolean oldIsCombinedFragment = isCombinedFragment;
		isCombinedFragment = newIsCombinedFragment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IStarrePackage.TASK__IS_COMBINED_FRAGMENT,
					oldIsCombinedFragment, isCombinedFragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLoop() {
		return isLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLoop(boolean newIsLoop) {
		boolean oldIsLoop = isLoop;
		isLoop = newIsLoop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IStarrePackage.TASK__IS_LOOP, oldIsLoop, isLoop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPrior() {
		return isPrior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPrior(boolean newIsPrior) {
		boolean oldIsPrior = isPrior;
		isPrior = newIsPrior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IStarrePackage.TASK__IS_PRIOR, oldIsPrior, isPrior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getPreviousTask() {
		if (previousTask != null && previousTask.eIsProxy()) {
			InternalEObject oldPreviousTask = (InternalEObject) previousTask;
			previousTask = (Task) eResolveProxy(oldPreviousTask);
			if (previousTask != oldPreviousTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IStarrePackage.TASK__PREVIOUS_TASK,
							oldPreviousTask, previousTask));
			}
		}
		return previousTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetPreviousTask() {
		return previousTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousTask(Task newPreviousTask) {
		Task oldPreviousTask = previousTask;
		previousTask = newPreviousTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IStarrePackage.TASK__PREVIOUS_TASK, oldPreviousTask,
					previousTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IStarrePackage.TASK__IS_COMBINED_FRAGMENT:
			return isIsCombinedFragment();
		case IStarrePackage.TASK__IS_LOOP:
			return isIsLoop();
		case IStarrePackage.TASK__IS_PRIOR:
			return isIsPrior();
		case IStarrePackage.TASK__PREVIOUS_TASK:
			if (resolve)
				return getPreviousTask();
			return basicGetPreviousTask();
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
		case IStarrePackage.TASK__IS_COMBINED_FRAGMENT:
			setIsCombinedFragment((Boolean) newValue);
			return;
		case IStarrePackage.TASK__IS_LOOP:
			setIsLoop((Boolean) newValue);
			return;
		case IStarrePackage.TASK__IS_PRIOR:
			setIsPrior((Boolean) newValue);
			return;
		case IStarrePackage.TASK__PREVIOUS_TASK:
			setPreviousTask((Task) newValue);
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
		case IStarrePackage.TASK__IS_COMBINED_FRAGMENT:
			setIsCombinedFragment(IS_COMBINED_FRAGMENT_EDEFAULT);
			return;
		case IStarrePackage.TASK__IS_LOOP:
			setIsLoop(IS_LOOP_EDEFAULT);
			return;
		case IStarrePackage.TASK__IS_PRIOR:
			setIsPrior(IS_PRIOR_EDEFAULT);
			return;
		case IStarrePackage.TASK__PREVIOUS_TASK:
			setPreviousTask((Task) null);
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
		case IStarrePackage.TASK__IS_COMBINED_FRAGMENT:
			return isCombinedFragment != IS_COMBINED_FRAGMENT_EDEFAULT;
		case IStarrePackage.TASK__IS_LOOP:
			return isLoop != IS_LOOP_EDEFAULT;
		case IStarrePackage.TASK__IS_PRIOR:
			return isPrior != IS_PRIOR_EDEFAULT;
		case IStarrePackage.TASK__PREVIOUS_TASK:
			return previousTask != null;
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
		result.append(" (isCombinedFragment: ");
		result.append(isCombinedFragment);
		result.append(", isLoop: ");
		result.append(isLoop);
		result.append(", isPrior: ");
		result.append(isPrior);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
