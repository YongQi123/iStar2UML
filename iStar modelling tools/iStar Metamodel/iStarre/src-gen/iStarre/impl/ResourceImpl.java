/**
 */
package iStarre.impl;

import iStarre.IStarrePackage;
import iStarre.Resource;
import iStarre.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iStarre.impl.ResourceImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link iStarre.impl.ResourceImpl#getNeededBy <em>Needed By</em>}</li>
 *   <li>{@link iStarre.impl.ResourceImpl#isIsEntity <em>Is Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends IntentionalelementImpl implements Resource {
	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> association;

	/**
	 * The cached value of the '{@link #getNeededBy() <em>Needed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeededBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> neededBy;

	/**
	 * The default value of the '{@link #isIsEntity() <em>Is Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEntity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENTITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEntity() <em>Is Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEntity()
	 * @generated
	 * @ordered
	 */
	protected boolean isEntity = IS_ENTITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IStarrePackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getAssociation() {
		if (association == null) {
			association = new EObjectResolvingEList<Resource>(Resource.class, this,
					IStarrePackage.RESOURCE__ASSOCIATION);
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getNeededBy() {
		if (neededBy == null) {
			neededBy = new EObjectResolvingEList<Task>(Task.class, this, IStarrePackage.RESOURCE__NEEDED_BY);
		}
		return neededBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEntity() {
		return isEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEntity(boolean newIsEntity) {
		boolean oldIsEntity = isEntity;
		isEntity = newIsEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IStarrePackage.RESOURCE__IS_ENTITY, oldIsEntity,
					isEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IStarrePackage.RESOURCE__ASSOCIATION:
			return getAssociation();
		case IStarrePackage.RESOURCE__NEEDED_BY:
			return getNeededBy();
		case IStarrePackage.RESOURCE__IS_ENTITY:
			return isIsEntity();
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
		case IStarrePackage.RESOURCE__ASSOCIATION:
			getAssociation().clear();
			getAssociation().addAll((Collection<? extends Resource>) newValue);
			return;
		case IStarrePackage.RESOURCE__NEEDED_BY:
			getNeededBy().clear();
			getNeededBy().addAll((Collection<? extends Task>) newValue);
			return;
		case IStarrePackage.RESOURCE__IS_ENTITY:
			setIsEntity((Boolean) newValue);
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
		case IStarrePackage.RESOURCE__ASSOCIATION:
			getAssociation().clear();
			return;
		case IStarrePackage.RESOURCE__NEEDED_BY:
			getNeededBy().clear();
			return;
		case IStarrePackage.RESOURCE__IS_ENTITY:
			setIsEntity(IS_ENTITY_EDEFAULT);
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
		case IStarrePackage.RESOURCE__ASSOCIATION:
			return association != null && !association.isEmpty();
		case IStarrePackage.RESOURCE__NEEDED_BY:
			return neededBy != null && !neededBy.isEmpty();
		case IStarrePackage.RESOURCE__IS_ENTITY:
			return isEntity != IS_ENTITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isEntity: ");
		result.append(isEntity);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
