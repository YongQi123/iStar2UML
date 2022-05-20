/**
 */
package iStarre;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iStarre.Actor#getName <em>Name</em>}</li>
 *   <li>{@link iStarre.Actor#getIntentionalelement <em>Intentionalelement</em>}</li>
 *   <li>{@link iStarre.Actor#getIsA <em>Is A</em>}</li>
 *   <li>{@link iStarre.Actor#getPrticipatesIn <em>Prticipates In</em>}</li>
 * </ul>
 *
 * @see iStarre.IStarrePackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iStarre.IStarrePackage#getActor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iStarre.Actor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Intentionalelement</b></em>' containment reference list.
	 * The list contents are of type {@link iStarre.Intentionalelement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intentionalelement</em>' containment reference list.
	 * @see iStarre.IStarrePackage#getActor_Intentionalelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Intentionalelement> getIntentionalelement();

	/**
	 * Returns the value of the '<em><b>Is A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is A</em>' reference.
	 * @see #setIsA(Actor)
	 * @see iStarre.IStarrePackage#getActor_IsA()
	 * @model
	 * @generated
	 */
	Actor getIsA();

	/**
	 * Sets the value of the '{@link iStarre.Actor#getIsA <em>Is A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is A</em>' reference.
	 * @see #getIsA()
	 * @generated
	 */
	void setIsA(Actor value);

	/**
	 * Returns the value of the '<em><b>Prticipates In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prticipates In</em>' reference.
	 * @see #setPrticipatesIn(Actor)
	 * @see iStarre.IStarrePackage#getActor_PrticipatesIn()
	 * @model
	 * @generated
	 */
	Actor getPrticipatesIn();

	/**
	 * Sets the value of the '{@link iStarre.Actor#getPrticipatesIn <em>Prticipates In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prticipates In</em>' reference.
	 * @see #getPrticipatesIn()
	 * @generated
	 */
	void setPrticipatesIn(Actor value);

} // Actor
