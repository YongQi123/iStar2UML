/**
 */
package iStarre.impl;

import iStarre.GoalTaskElement;
import iStarre.IStarrePackage;
import iStarre.ORrefinement;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ORrefinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iStarre.impl.ORrefinementImpl#getTo1 <em>To1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ORrefinementImpl extends RefinementImpl implements ORrefinement {
	/**
	 * The cached value of the '{@link #getTo1() <em>To1</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo1()
	 * @generated
	 * @ordered
	 */
	protected EList<GoalTaskElement> to1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ORrefinementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IStarrePackage.Literals.ORREFINEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GoalTaskElement> getTo1() {
		if (to1 == null) {
			to1 = new EObjectResolvingEList<GoalTaskElement>(GoalTaskElement.class, this,
					IStarrePackage.ORREFINEMENT__TO1);
		}
		return to1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IStarrePackage.ORREFINEMENT__TO1:
			return getTo1();
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
		case IStarrePackage.ORREFINEMENT__TO1:
			getTo1().clear();
			getTo1().addAll((Collection<? extends GoalTaskElement>) newValue);
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
		case IStarrePackage.ORREFINEMENT__TO1:
			getTo1().clear();
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
		case IStarrePackage.ORREFINEMENT__TO1:
			return to1 != null && !to1.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ORrefinementImpl
