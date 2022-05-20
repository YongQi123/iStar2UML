/**
 */
package iStarre;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Task Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iStarre.GoalTaskElement#getRefines <em>Refines</em>}</li>
 *   <li>{@link iStarre.GoalTaskElement#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see iStarre.IStarrePackage#getGoalTaskElement()
 * @model abstract="true"
 * @generated
 */
public interface GoalTaskElement extends Intentionalelement {
	/**
	 * Returns the value of the '<em><b>Refines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refines</em>' containment reference.
	 * @see #setRefines(Refinement)
	 * @see iStarre.IStarrePackage#getGoalTaskElement_Refines()
	 * @model containment="true"
	 * @generated
	 */
	Refinement getRefines();

	/**
	 * Sets the value of the '{@link iStarre.GoalTaskElement#getRefines <em>Refines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refines</em>' containment reference.
	 * @see #getRefines()
	 * @generated
	 */
	void setRefines(Refinement value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' reference list.
	 * The list contents are of type {@link iStarre.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' reference list.
	 * @see iStarre.IStarrePackage#getGoalTaskElement_Constraint()
	 * @model
	 * @generated
	 */
	EList<Constraint> getConstraint();

} // GoalTaskElement
