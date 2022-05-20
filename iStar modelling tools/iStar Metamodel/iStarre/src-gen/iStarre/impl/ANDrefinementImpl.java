/**
 */
package iStarre.impl;

import iStarre.ANDrefinement;
import iStarre.GoalTaskElement;
import iStarre.IStarrePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AN Drefinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iStarre.impl.ANDrefinementImpl#getTo2 <em>To2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ANDrefinementImpl extends RefinementImpl implements ANDrefinement {
	/**
	 * The cached value of the '{@link #getTo2() <em>To2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo2()
	 * @generated
	 * @ordered
	 */
	protected EList<GoalTaskElement> to2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ANDrefinementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IStarrePackage.Literals.AN_DREFINEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GoalTaskElement> getTo2() {
		if (to2 == null) {
			to2 = new EObjectResolvingEList<GoalTaskElement>(GoalTaskElement.class, this,
					IStarrePackage.AN_DREFINEMENT__TO2);
		}
		return to2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IStarrePackage.AN_DREFINEMENT__TO2:
			return getTo2();
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
		case IStarrePackage.AN_DREFINEMENT__TO2:
			getTo2().clear();
			getTo2().addAll((Collection<? extends GoalTaskElement>) newValue);
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
		case IStarrePackage.AN_DREFINEMENT__TO2:
			getTo2().clear();
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
		case IStarrePackage.AN_DREFINEMENT__TO2:
			return to2 != null && !to2.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ANDrefinementImpl
