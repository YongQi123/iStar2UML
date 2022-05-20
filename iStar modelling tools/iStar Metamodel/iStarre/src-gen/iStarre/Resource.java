/**
 */
package iStarre;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iStarre.Resource#getAssociation <em>Association</em>}</li>
 *   <li>{@link iStarre.Resource#getNeededBy <em>Needed By</em>}</li>
 *   <li>{@link iStarre.Resource#isIsEntity <em>Is Entity</em>}</li>
 * </ul>
 *
 * @see iStarre.IStarrePackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends Intentionalelement {
	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference list.
	 * The list contents are of type {@link iStarre.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' reference list.
	 * @see iStarre.IStarrePackage#getResource_Association()
	 * @model
	 * @generated
	 */
	EList<Resource> getAssociation();

	/**
	 * Returns the value of the '<em><b>Needed By</b></em>' reference list.
	 * The list contents are of type {@link iStarre.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needed By</em>' reference list.
	 * @see iStarre.IStarrePackage#getResource_NeededBy()
	 * @model
	 * @generated
	 */
	EList<Task> getNeededBy();

	/**
	 * Returns the value of the '<em><b>Is Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Entity</em>' attribute.
	 * @see #setIsEntity(boolean)
	 * @see iStarre.IStarrePackage#getResource_IsEntity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isIsEntity();

	/**
	 * Sets the value of the '{@link iStarre.Resource#isIsEntity <em>Is Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Entity</em>' attribute.
	 * @see #isIsEntity()
	 * @generated
	 */
	void setIsEntity(boolean value);

} // Resource
