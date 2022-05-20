/**
 */
package iStarre;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iStarre.Task#isIsCombinedFragment <em>Is Combined Fragment</em>}</li>
 *   <li>{@link iStarre.Task#isIsLoop <em>Is Loop</em>}</li>
 *   <li>{@link iStarre.Task#isIsPrior <em>Is Prior</em>}</li>
 *   <li>{@link iStarre.Task#getPreviousTask <em>Previous Task</em>}</li>
 * </ul>
 *
 * @see iStarre.IStarrePackage#getTask()
 * @model
 * @generated
 */
public interface Task extends GoalTaskElement {
	/**
	 * Returns the value of the '<em><b>Is Combined Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Combined Fragment</em>' attribute.
	 * @see #setIsCombinedFragment(boolean)
	 * @see iStarre.IStarrePackage#getTask_IsCombinedFragment()
	 * @model
	 * @generated
	 */
	boolean isIsCombinedFragment();

	/**
	 * Sets the value of the '{@link iStarre.Task#isIsCombinedFragment <em>Is Combined Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Combined Fragment</em>' attribute.
	 * @see #isIsCombinedFragment()
	 * @generated
	 */
	void setIsCombinedFragment(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Loop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Loop</em>' attribute.
	 * @see #setIsLoop(boolean)
	 * @see iStarre.IStarrePackage#getTask_IsLoop()
	 * @model
	 * @generated
	 */
	boolean isIsLoop();

	/**
	 * Sets the value of the '{@link iStarre.Task#isIsLoop <em>Is Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Loop</em>' attribute.
	 * @see #isIsLoop()
	 * @generated
	 */
	void setIsLoop(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Prior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Prior</em>' attribute.
	 * @see #setIsPrior(boolean)
	 * @see iStarre.IStarrePackage#getTask_IsPrior()
	 * @model
	 * @generated
	 */
	boolean isIsPrior();

	/**
	 * Sets the value of the '{@link iStarre.Task#isIsPrior <em>Is Prior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Prior</em>' attribute.
	 * @see #isIsPrior()
	 * @generated
	 */
	void setIsPrior(boolean value);

	/**
	 * Returns the value of the '<em><b>Previous Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Task</em>' reference.
	 * @see #setPreviousTask(Task)
	 * @see iStarre.IStarrePackage#getTask_PreviousTask()
	 * @model
	 * @generated
	 */
	Task getPreviousTask();

	/**
	 * Sets the value of the '{@link iStarre.Task#getPreviousTask <em>Previous Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Task</em>' reference.
	 * @see #getPreviousTask()
	 * @generated
	 */
	void setPreviousTask(Task value);

} // Task
