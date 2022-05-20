/**
 */
package iStarre.impl;

import iStarre.Actor;
import iStarre.Dependency;
import iStarre.IStarrePackage;
import iStarre.Intentionalelement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iStarre.impl.DependencyImpl#getDependum <em>Dependum</em>}</li>
 *   <li>{@link iStarre.impl.DependencyImpl#getDepender <em>Depender</em>}</li>
 *   <li>{@link iStarre.impl.DependencyImpl#getDependee <em>Dependee</em>}</li>
 *   <li>{@link iStarre.impl.DependencyImpl#getDependeeElmt <em>Dependee Elmt</em>}</li>
 *   <li>{@link iStarre.impl.DependencyImpl#getDependerElmt <em>Depender Elmt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyImpl extends MinimalEObjectImpl.Container implements Dependency {
	/**
	 * The cached value of the '{@link #getDependum() <em>Dependum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependum()
	 * @generated
	 * @ordered
	 */
	protected Intentionalelement dependum;

	/**
	 * The cached value of the '{@link #getDepender() <em>Depender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepender()
	 * @generated
	 * @ordered
	 */
	protected Actor depender;

	/**
	 * The cached value of the '{@link #getDependee() <em>Dependee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependee()
	 * @generated
	 * @ordered
	 */
	protected Actor dependee;

	/**
	 * The cached value of the '{@link #getDependeeElmt() <em>Dependee Elmt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependeeElmt()
	 * @generated
	 * @ordered
	 */
	protected Intentionalelement dependeeElmt;

	/**
	 * The cached value of the '{@link #getDependerElmt() <em>Depender Elmt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependerElmt()
	 * @generated
	 * @ordered
	 */
	protected Intentionalelement dependerElmt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IStarrePackage.Literals.DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intentionalelement getDependum() {
		return dependum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependum(Intentionalelement newDependum, NotificationChain msgs) {
		Intentionalelement oldDependum = dependum;
		dependum = newDependum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					IStarrePackage.DEPENDENCY__DEPENDUM, oldDependum, newDependum);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependum(Intentionalelement newDependum) {
		if (newDependum != dependum) {
			NotificationChain msgs = null;
			if (dependum != null)
				msgs = ((InternalEObject) dependum).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - IStarrePackage.DEPENDENCY__DEPENDUM, null, msgs);
			if (newDependum != null)
				msgs = ((InternalEObject) newDependum).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - IStarrePackage.DEPENDENCY__DEPENDUM, null, msgs);
			msgs = basicSetDependum(newDependum, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IStarrePackage.DEPENDENCY__DEPENDUM, newDependum,
					newDependum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getDepender() {
		if (depender != null && depender.eIsProxy()) {
			InternalEObject oldDepender = (InternalEObject) depender;
			depender = (Actor) eResolveProxy(oldDepender);
			if (depender != oldDepender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IStarrePackage.DEPENDENCY__DEPENDER,
							oldDepender, depender));
			}
		}
		return depender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetDepender() {
		return depender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepender(Actor newDepender) {
		Actor oldDepender = depender;
		depender = newDepender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IStarrePackage.DEPENDENCY__DEPENDER, oldDepender,
					depender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getDependee() {
		if (dependee != null && dependee.eIsProxy()) {
			InternalEObject oldDependee = (InternalEObject) dependee;
			dependee = (Actor) eResolveProxy(oldDependee);
			if (dependee != oldDependee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IStarrePackage.DEPENDENCY__DEPENDEE,
							oldDependee, dependee));
			}
		}
		return dependee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetDependee() {
		return dependee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependee(Actor newDependee) {
		Actor oldDependee = dependee;
		dependee = newDependee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IStarrePackage.DEPENDENCY__DEPENDEE, oldDependee,
					dependee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intentionalelement getDependeeElmt() {
		if (dependeeElmt != null && dependeeElmt.eIsProxy()) {
			InternalEObject oldDependeeElmt = (InternalEObject) dependeeElmt;
			dependeeElmt = (Intentionalelement) eResolveProxy(oldDependeeElmt);
			if (dependeeElmt != oldDependeeElmt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IStarrePackage.DEPENDENCY__DEPENDEE_ELMT,
							oldDependeeElmt, dependeeElmt));
			}
		}
		return dependeeElmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intentionalelement basicGetDependeeElmt() {
		return dependeeElmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependeeElmt(Intentionalelement newDependeeElmt) {
		Intentionalelement oldDependeeElmt = dependeeElmt;
		dependeeElmt = newDependeeElmt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IStarrePackage.DEPENDENCY__DEPENDEE_ELMT,
					oldDependeeElmt, dependeeElmt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intentionalelement getDependerElmt() {
		if (dependerElmt != null && dependerElmt.eIsProxy()) {
			InternalEObject oldDependerElmt = (InternalEObject) dependerElmt;
			dependerElmt = (Intentionalelement) eResolveProxy(oldDependerElmt);
			if (dependerElmt != oldDependerElmt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IStarrePackage.DEPENDENCY__DEPENDER_ELMT,
							oldDependerElmt, dependerElmt));
			}
		}
		return dependerElmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intentionalelement basicGetDependerElmt() {
		return dependerElmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependerElmt(Intentionalelement newDependerElmt) {
		Intentionalelement oldDependerElmt = dependerElmt;
		dependerElmt = newDependerElmt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IStarrePackage.DEPENDENCY__DEPENDER_ELMT,
					oldDependerElmt, dependerElmt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case IStarrePackage.DEPENDENCY__DEPENDUM:
			return basicSetDependum(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IStarrePackage.DEPENDENCY__DEPENDUM:
			return getDependum();
		case IStarrePackage.DEPENDENCY__DEPENDER:
			if (resolve)
				return getDepender();
			return basicGetDepender();
		case IStarrePackage.DEPENDENCY__DEPENDEE:
			if (resolve)
				return getDependee();
			return basicGetDependee();
		case IStarrePackage.DEPENDENCY__DEPENDEE_ELMT:
			if (resolve)
				return getDependeeElmt();
			return basicGetDependeeElmt();
		case IStarrePackage.DEPENDENCY__DEPENDER_ELMT:
			if (resolve)
				return getDependerElmt();
			return basicGetDependerElmt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case IStarrePackage.DEPENDENCY__DEPENDUM:
			setDependum((Intentionalelement) newValue);
			return;
		case IStarrePackage.DEPENDENCY__DEPENDER:
			setDepender((Actor) newValue);
			return;
		case IStarrePackage.DEPENDENCY__DEPENDEE:
			setDependee((Actor) newValue);
			return;
		case IStarrePackage.DEPENDENCY__DEPENDEE_ELMT:
			setDependeeElmt((Intentionalelement) newValue);
			return;
		case IStarrePackage.DEPENDENCY__DEPENDER_ELMT:
			setDependerElmt((Intentionalelement) newValue);
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
		case IStarrePackage.DEPENDENCY__DEPENDUM:
			setDependum((Intentionalelement) null);
			return;
		case IStarrePackage.DEPENDENCY__DEPENDER:
			setDepender((Actor) null);
			return;
		case IStarrePackage.DEPENDENCY__DEPENDEE:
			setDependee((Actor) null);
			return;
		case IStarrePackage.DEPENDENCY__DEPENDEE_ELMT:
			setDependeeElmt((Intentionalelement) null);
			return;
		case IStarrePackage.DEPENDENCY__DEPENDER_ELMT:
			setDependerElmt((Intentionalelement) null);
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
		case IStarrePackage.DEPENDENCY__DEPENDUM:
			return dependum != null;
		case IStarrePackage.DEPENDENCY__DEPENDER:
			return depender != null;
		case IStarrePackage.DEPENDENCY__DEPENDEE:
			return dependee != null;
		case IStarrePackage.DEPENDENCY__DEPENDEE_ELMT:
			return dependeeElmt != null;
		case IStarrePackage.DEPENDENCY__DEPENDER_ELMT:
			return dependerElmt != null;
		}
		return super.eIsSet(featureID);
	}

} //DependencyImpl
