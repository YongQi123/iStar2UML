/**
 */
package iStarre;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AN Drefinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iStarre.ANDrefinement#getTo2 <em>To2</em>}</li>
 * </ul>
 *
 * @see iStarre.IStarrePackage#getANDrefinement()
 * @model
 * @generated
 */
public interface ANDrefinement extends Refinement {
	/**
	 * Returns the value of the '<em><b>To2</b></em>' reference list.
	 * The list contents are of type {@link iStarre.GoalTaskElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To2</em>' reference list.
	 * @see iStarre.IStarrePackage#getANDrefinement_To2()
	 * @model lower="2"
	 * @generated
	 */
	EList<GoalTaskElement> getTo2();

} // ANDrefinement
