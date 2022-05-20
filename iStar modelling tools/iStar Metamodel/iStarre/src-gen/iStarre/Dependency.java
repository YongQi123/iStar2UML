/**
 */
package iStarre;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iStarre.Dependency#getDependum <em>Dependum</em>}</li>
 *   <li>{@link iStarre.Dependency#getDepender <em>Depender</em>}</li>
 *   <li>{@link iStarre.Dependency#getDependee <em>Dependee</em>}</li>
 *   <li>{@link iStarre.Dependency#getDependeeElmt <em>Dependee Elmt</em>}</li>
 *   <li>{@link iStarre.Dependency#getDependerElmt <em>Depender Elmt</em>}</li>
 * </ul>
 *
 * @see iStarre.IStarrePackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Dependum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependum</em>' containment reference.
	 * @see #setDependum(Intentionalelement)
	 * @see iStarre.IStarrePackage#getDependency_Dependum()
	 * @model containment="true"
	 * @generated
	 */
	Intentionalelement getDependum();

	/**
	 * Sets the value of the '{@link iStarre.Dependency#getDependum <em>Dependum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependum</em>' containment reference.
	 * @see #getDependum()
	 * @generated
	 */
	void setDependum(Intentionalelement value);

	/**
	 * Returns the value of the '<em><b>Depender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depender</em>' reference.
	 * @see #setDepender(Actor)
	 * @see iStarre.IStarrePackage#getDependency_Depender()
	 * @model
	 * @generated
	 */
	Actor getDepender();

	/**
	 * Sets the value of the '{@link iStarre.Dependency#getDepender <em>Depender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depender</em>' reference.
	 * @see #getDepender()
	 * @generated
	 */
	void setDepender(Actor value);

	/**
	 * Returns the value of the '<em><b>Dependee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependee</em>' reference.
	 * @see #setDependee(Actor)
	 * @see iStarre.IStarrePackage#getDependency_Dependee()
	 * @model
	 * @generated
	 */
	Actor getDependee();

	/**
	 * Sets the value of the '{@link iStarre.Dependency#getDependee <em>Dependee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependee</em>' reference.
	 * @see #getDependee()
	 * @generated
	 */
	void setDependee(Actor value);

	/**
	 * Returns the value of the '<em><b>Dependee Elmt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependee Elmt</em>' reference.
	 * @see #setDependeeElmt(Intentionalelement)
	 * @see iStarre.IStarrePackage#getDependency_DependeeElmt()
	 * @model
	 * @generated
	 */
	Intentionalelement getDependeeElmt();

	/**
	 * Sets the value of the '{@link iStarre.Dependency#getDependeeElmt <em>Dependee Elmt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependee Elmt</em>' reference.
	 * @see #getDependeeElmt()
	 * @generated
	 */
	void setDependeeElmt(Intentionalelement value);

	/**
	 * Returns the value of the '<em><b>Depender Elmt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depender Elmt</em>' reference.
	 * @see #setDependerElmt(Intentionalelement)
	 * @see iStarre.IStarrePackage#getDependency_DependerElmt()
	 * @model
	 * @generated
	 */
	Intentionalelement getDependerElmt();

	/**
	 * Sets the value of the '{@link iStarre.Dependency#getDependerElmt <em>Depender Elmt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depender Elmt</em>' reference.
	 * @see #getDependerElmt()
	 * @generated
	 */
	void setDependerElmt(Intentionalelement value);

} // Dependency
