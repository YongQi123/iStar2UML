/**
 */
package iStarre;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iStarre.Role#isIsEntity <em>Is Entity</em>}</li>
 * </ul>
 *
 * @see iStarre.IStarrePackage#getRole()
 * @model
 * @generated
 */
public interface Role extends Actor {
	/**
	 * Returns the value of the '<em><b>Is Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Entity</em>' attribute.
	 * @see #setIsEntity(boolean)
	 * @see iStarre.IStarrePackage#getRole_IsEntity()
	 * @model
	 * @generated
	 */
	boolean isIsEntity();

	/**
	 * Sets the value of the '{@link iStarre.Role#isIsEntity <em>Is Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Entity</em>' attribute.
	 * @see #isIsEntity()
	 * @generated
	 */
	void setIsEntity(boolean value);

} // Role
