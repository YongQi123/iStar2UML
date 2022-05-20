/**
 */
package iStarre.impl;

import iStarre.GoalTaskElement;
import iStarre.IStarrePackage;
import iStarre.Quality;
import iStarre.Resource;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iStarre.impl.QualityImpl#getQualifies <em>Qualifies</em>}</li>
 *   <li>{@link iStarre.impl.QualityImpl#getQualifies2 <em>Qualifies2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityImpl extends IntentionalelementImpl implements Quality {
	/**
	 * The cached value of the '{@link #getQualifies() <em>Qualifies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifies()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> qualifies;

	/**
	 * The cached value of the '{@link #getQualifies2() <em>Qualifies2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifies2()
	 * @generated
	 * @ordered
	 */
	protected EList<GoalTaskElement> qualifies2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IStarrePackage.Literals.QUALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getQualifies() {
		if (qualifies == null) {
			qualifies = new EObjectResolvingEList<Resource>(Resource.class, this, IStarrePackage.QUALITY__QUALIFIES);
		}
		return qualifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GoalTaskElement> getQualifies2() {
		if (qualifies2 == null) {
			qualifies2 = new EObjectResolvingEList<GoalTaskElement>(GoalTaskElement.class, this,
					IStarrePackage.QUALITY__QUALIFIES2);
		}
		return qualifies2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IStarrePackage.QUALITY__QUALIFIES:
			return getQualifies();
		case IStarrePackage.QUALITY__QUALIFIES2:
			return getQualifies2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case IStarrePackage.QUALITY__QUALIFIES:
			getQualifies().clear();
			getQualifies().addAll((Collection<? extends Resource>) newValue);
			return;
		case IStarrePackage.QUALITY__QUALIFIES2:
			getQualifies2().clear();
			getQualifies2().addAll((Collection<? extends GoalTaskElement>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case IStarrePackage.QUALITY__QUALIFIES:
			getQualifies().clear();
			return;
		case IStarrePackage.QUALITY__QUALIFIES2:
			getQualifies2().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case IStarrePackage.QUALITY__QUALIFIES:
			return qualifies != null && !qualifies.isEmpty();
		case IStarrePackage.QUALITY__QUALIFIES2:
			return qualifies2 != null && !qualifies2.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QualityImpl
