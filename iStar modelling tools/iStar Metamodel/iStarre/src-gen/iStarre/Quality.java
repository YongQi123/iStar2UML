/**
 */
package iStarre;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iStarre.Quality#getQualifies <em>Qualifies</em>}</li>
 *   <li>{@link iStarre.Quality#getQualifies2 <em>Qualifies2</em>}</li>
 * </ul>
 *
 * @see iStarre.IStarrePackage#getQuality()
 * @model
 * @generated
 */
public interface Quality extends Intentionalelement {
	/**
	 * Returns the value of the '<em><b>Qualifies</b></em>' reference list.
	 * The list contents are of type {@link iStarre.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifies</em>' reference list.
	 * @see iStarre.IStarrePackage#getQuality_Qualifies()
	 * @model
	 * @generated
	 */
	EList<Resource> getQualifies();

	/**
	 * Returns the value of the '<em><b>Qualifies2</b></em>' reference list.
	 * The list contents are of type {@link iStarre.GoalTaskElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifies2</em>' reference list.
	 * @see iStarre.IStarrePackage#getQuality_Qualifies2()
	 * @model
	 * @generated
	 */
	EList<GoalTaskElement> getQualifies2();

} // Quality
