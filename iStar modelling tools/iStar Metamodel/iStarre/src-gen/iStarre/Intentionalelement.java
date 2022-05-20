/**
 */
package iStarre;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intentionalelement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iStarre.Intentionalelement#getName <em>Name</em>}</li>
 *   <li>{@link iStarre.Intentionalelement#getContributtionTo <em>Contributtion To</em>}</li>
 * </ul>
 *
 * @see iStarre.IStarrePackage#getIntentionalelement()
 * @model abstract="true"
 * @generated
 */
public interface Intentionalelement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iStarre.IStarrePackage#getIntentionalelement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iStarre.Intentionalelement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contributtion To</b></em>' containment reference list.
	 * The list contents are of type {@link iStarre.ContributtionTo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributtion To</em>' containment reference list.
	 * @see iStarre.IStarrePackage#getIntentionalelement_ContributtionTo()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContributtionTo> getContributtionTo();

} // Intentionalelement
