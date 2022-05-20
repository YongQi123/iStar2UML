/**
 */
package iStarre;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contributtion To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iStarre.ContributtionTo#getCobtribution <em>Cobtribution</em>}</li>
 *   <li>{@link iStarre.ContributtionTo#getContributesTo <em>Contributes To</em>}</li>
 * </ul>
 *
 * @see iStarre.IStarrePackage#getContributtionTo()
 * @model
 * @generated
 */
public interface ContributtionTo extends EObject {
	/**
	 * Returns the value of the '<em><b>Cobtribution</b></em>' attribute.
	 * The literals are from the enumeration {@link iStarre.ContrbutionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cobtribution</em>' attribute.
	 * @see iStarre.ContrbutionType
	 * @see #setCobtribution(ContrbutionType)
	 * @see iStarre.IStarrePackage#getContributtionTo_Cobtribution()
	 * @model
	 * @generated
	 */
	ContrbutionType getCobtribution();

	/**
	 * Sets the value of the '{@link iStarre.ContributtionTo#getCobtribution <em>Cobtribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cobtribution</em>' attribute.
	 * @see iStarre.ContrbutionType
	 * @see #getCobtribution()
	 * @generated
	 */
	void setCobtribution(ContrbutionType value);

	/**
	 * Returns the value of the '<em><b>Contributes To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributes To</em>' reference.
	 * @see #setContributesTo(Quality)
	 * @see iStarre.IStarrePackage#getContributtionTo_ContributesTo()
	 * @model
	 * @generated
	 */
	Quality getContributesTo();

	/**
	 * Sets the value of the '{@link iStarre.ContributtionTo#getContributesTo <em>Contributes To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributes To</em>' reference.
	 * @see #getContributesTo()
	 * @generated
	 */
	void setContributesTo(Quality value);

} // ContributtionTo
