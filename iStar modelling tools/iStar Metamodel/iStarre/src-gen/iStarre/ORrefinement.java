/**
 */
package iStarre;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ORrefinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iStarre.ORrefinement#getTo1 <em>To1</em>}</li>
 * </ul>
 *
 * @see iStarre.IStarrePackage#getORrefinement()
 * @model
 * @generated
 */
public interface ORrefinement extends Refinement {
	/**
	 * Returns the value of the '<em><b>To1</b></em>' reference list.
	 * The list contents are of type {@link iStarre.GoalTaskElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To1</em>' reference list.
	 * @see iStarre.IStarrePackage#getORrefinement_To1()
	 * @model required="true"
	 * @generated
	 */
	EList<GoalTaskElement> getTo1();

} // ORrefinement
