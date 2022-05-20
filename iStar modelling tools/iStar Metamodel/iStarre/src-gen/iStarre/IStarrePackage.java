/**
 */
package iStarre;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see iStarre.IStarreFactory
 * @model kind="package"
 * @generated
 */
public interface IStarrePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iStarre";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/iStarre";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iStarre";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IStarrePackage eINSTANCE = iStarre.impl.IStarrePackageImpl.init();

	/**
	 * The meta object id for the '{@link iStarre.impl.iStarImpl <em>iStar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iStarre.impl.iStarImpl
	 * @see iStarre.impl.IStarrePackageImpl#getiStar()
	 * @generated
	 */
	int ISTAR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR__ACTOR = 1;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR__DEPENDENCY = 2;

	/**
	 * The number of structural features of the '<em>iStar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>iStar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iStarre.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iStarre.impl.ActorImpl
	 * @see iStarre.impl.IStarrePackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Intentionalelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__INTENTIONALELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Is A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IS_A = 2;

	/**
	 * The feature id for the '<em><b>Prticipates In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PRTICIPATES_IN = 3;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iStarre.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iStarre.impl.AgentImpl
	 * @see iStarre.impl.IStarrePackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Intentionalelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__INTENTIONALELEMENT = ACTOR__INTENTIONALELEMENT;

	/**
	 * The feature id for the '<em><b>Is A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__IS_A = ACTOR__IS_A;

	/**
	 * The feature id for the '<em><b>Prticipates In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__PRTICIPATES_IN = ACTOR__PRTICIPATES_IN;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iStarre.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iStarre.impl.RoleImpl
	 * @see iStarre.impl.IStarrePackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Intentionalelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__INTENTIONALELEMENT = ACTOR__INTENTIONALELEMENT;

	/**
	 * The feature id for the '<em><b>Is A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__IS_A = ACTOR__IS_A;

	/**
	 * The feature id for the '<em><b>Prticipates In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PRTICIPATES_IN = ACTOR__PRTICIPATES_IN;

	/**
	 * The feature id for the '<em><b>Is Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__IS_ENTITY = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iStarre.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iStarre.impl.DependencyImpl
	 * @see iStarre.impl.IStarrePackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 4;

	/**
	 * The feature id for the '<em><b>Dependum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DEPENDUM = 0;

	/**
	 * The feature id for the '<em><b>Depender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DEPENDER = 1;

	/**
	 * The feature id for the '<em><b>Dependee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DEPENDEE = 2;

	/**
	 * The feature id for the '<em><b>Dependee Elmt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DEPENDEE_ELMT = 3;

	/**
	 * The feature id for the '<em><b>Depender Elmt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DEPENDER_ELMT = 4;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iStarre.impl.IntentionalelementImpl <em>Intentionalelement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iStarre.impl.IntentionalelementImpl
	 * @see iStarre.impl.IStarrePackageImpl#getIntentionalelement()
	 * @generated
	 */
	int INTENTIONALELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONALELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contributtion To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONALELEMENT__CONTRIBUTTION_TO = 1;

	/**
	 * The number of structural features of the '<em>Intentionalelement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONALELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Intentionalelement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONALELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iStarre.impl.RefinementImpl <em>Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iStarre.impl.RefinementImpl
	 * @see iStarre.impl.IStarrePackageImpl#getRefinement()
	 * @generated
	 */
	int REFINEMENT = 6;

	/**
	 * The number of structural features of the '<em>Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iStarre.impl.GoalTaskElementImpl <em>Goal Task Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iStarre.impl.GoalTaskElementImpl
	 * @see iStarre.impl.IStarrePackageImpl#getGoalTaskElement()
	 * @generated
	 */
	int GOAL_TASK_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_TASK_ELEMENT__NAME = INTENTIONALELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contributtion To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_TASK_ELEMENT__CONTRIBUTTION_TO = INTENTIONALELEMENT__CONTRIBUTTION_TO;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_TASK_ELEMENT__REFINES = INTENTIONALELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_TASK_ELEMENT__CONSTRAINT = INTENTIONALELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Goal Task Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_TASK_ELEMENT_FEATURE_COUNT = INTENTIONALELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Goal Task Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_TASK_ELEMENT_OPERATION_COUNT = INTENTIONALELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iStarre.impl.ContributtionToImpl <em>Contributtion To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iStarre.impl.ContributtionToImpl
	 * @see iStarre.impl.IStarrePackageImpl#getContributtionTo()
	 * @generated
	 */
	int CONTRIBUTTION_TO = 8;

	/**
	 * The feature id for the '<em><b>Cobtribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTTION_TO__COBTRIBUTION = 0;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTTION_TO__CONTRIBUTES_TO = 1;

	/**
	 * The number of structural features of the '<em>Contributtion To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTTION_TO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Contributtion To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTTION_TO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iStarre.impl.ANDrefinementImpl <em>AN Drefinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iStarre.impl.ANDrefinementImpl
	 * @see iStarre.impl.IStarrePackageImpl#getANDrefinement()
	 * @generated
	 */
	int AN_DREFINEMENT = 9;

	/**
	 * The feature id for the '<em><b>To2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_DREFINEMENT__TO2 = REFINEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AN Drefinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_DREFINEMENT_FEATURE_COUNT = REFINEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>AN Drefinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_DREFINEMENT_OPERATION_COUNT = REFINEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iStarre.impl.ORrefinementImpl <em>ORrefinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iStarre.impl.ORrefinementImpl
	 * @see iStarre.impl.IStarrePackageImpl#getORrefinement()
	 * @generated
	 */
	int ORREFINEMENT = 10;

	/**
	 * The feature id for the '<em><b>To1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORREFINEMENT__TO1 = REFINEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ORrefinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORREFINEMENT_FEATURE_COUNT = REFINEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ORrefinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORREFINEMENT_OPERATION_COUNT = REFINEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iStarre.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iStarre.impl.GoalImpl
	 * @see iStarre.impl.IStarrePackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = GOAL_TASK_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contributtion To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONTRIBUTTION_TO = GOAL_TASK_ELEMENT__CONTRIBUTTION_TO;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__REFINES = GOAL_TASK_ELEMENT__REFINES;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONSTRAINT = GOAL_TASK_ELEMENT__CONSTRAINT;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = GOAL_TASK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = GOAL_TASK_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iStarre.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iStarre.impl.TaskImpl
	 * @see iStarre.impl.IStarrePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = GOAL_TASK_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contributtion To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CONTRIBUTTION_TO = GOAL_TASK_ELEMENT__CONTRIBUTTION_TO;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__REFINES = GOAL_TASK_ELEMENT__REFINES;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CONSTRAINT = GOAL_TASK_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Is Combined Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IS_COMBINED_FRAGMENT = GOAL_TASK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Loop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IS_LOOP = GOAL_TASK_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Prior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IS_PRIOR = GOAL_TASK_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Previous Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PREVIOUS_TASK = GOAL_TASK_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = GOAL_TASK_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = GOAL_TASK_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iStarre.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iStarre.impl.ConstraintImpl
	 * @see iStarre.impl.IStarrePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = INTENTIONALELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contributtion To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONTRIBUTTION_TO = INTENTIONALELEMENT__CONTRIBUTTION_TO;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = INTENTIONALELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = INTENTIONALELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iStarre.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iStarre.impl.ResourceImpl
	 * @see iStarre.impl.IStarrePackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = INTENTIONALELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contributtion To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTRIBUTTION_TO = INTENTIONALELEMENT__CONTRIBUTTION_TO;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ASSOCIATION = INTENTIONALELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Needed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NEEDED_BY = INTENTIONALELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__IS_ENTITY = INTENTIONALELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = INTENTIONALELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = INTENTIONALELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iStarre.impl.QualityImpl <em>Quality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iStarre.impl.QualityImpl
	 * @see iStarre.impl.IStarrePackageImpl#getQuality()
	 * @generated
	 */
	int QUALITY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY__NAME = INTENTIONALELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contributtion To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY__CONTRIBUTTION_TO = INTENTIONALELEMENT__CONTRIBUTTION_TO;

	/**
	 * The feature id for the '<em><b>Qualifies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY__QUALIFIES = INTENTIONALELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifies2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY__QUALIFIES2 = INTENTIONALELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_FEATURE_COUNT = INTENTIONALELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Quality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OPERATION_COUNT = INTENTIONALELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iStarre.ContrbutionType <em>Contrbution Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iStarre.ContrbutionType
	 * @see iStarre.impl.IStarrePackageImpl#getContrbutionType()
	 * @generated
	 */
	int CONTRBUTION_TYPE = 16;

	/**
	 * Returns the meta object for class '{@link iStarre.iStar <em>iStar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>iStar</em>'.
	 * @see iStarre.iStar
	 * @generated
	 */
	EClass getiStar();

	/**
	 * Returns the meta object for the attribute '{@link iStarre.iStar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iStarre.iStar#getName()
	 * @see #getiStar()
	 * @generated
	 */
	EAttribute getiStar_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link iStarre.iStar#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor</em>'.
	 * @see iStarre.iStar#getActor()
	 * @see #getiStar()
	 * @generated
	 */
	EReference getiStar_Actor();

	/**
	 * Returns the meta object for the containment reference list '{@link iStarre.iStar#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency</em>'.
	 * @see iStarre.iStar#getDependency()
	 * @see #getiStar()
	 * @generated
	 */
	EReference getiStar_Dependency();

	/**
	 * Returns the meta object for class '{@link iStarre.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see iStarre.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link iStarre.Actor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iStarre.Actor#getName()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link iStarre.Actor#getIntentionalelement <em>Intentionalelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intentionalelement</em>'.
	 * @see iStarre.Actor#getIntentionalelement()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Intentionalelement();

	/**
	 * Returns the meta object for the reference '{@link iStarre.Actor#getIsA <em>Is A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is A</em>'.
	 * @see iStarre.Actor#getIsA()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_IsA();

	/**
	 * Returns the meta object for the reference '{@link iStarre.Actor#getPrticipatesIn <em>Prticipates In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prticipates In</em>'.
	 * @see iStarre.Actor#getPrticipatesIn()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_PrticipatesIn();

	/**
	 * Returns the meta object for class '{@link iStarre.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see iStarre.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for class '{@link iStarre.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see iStarre.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link iStarre.Role#isIsEntity <em>Is Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Entity</em>'.
	 * @see iStarre.Role#isIsEntity()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_IsEntity();

	/**
	 * Returns the meta object for class '{@link iStarre.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see iStarre.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the containment reference '{@link iStarre.Dependency#getDependum <em>Dependum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependum</em>'.
	 * @see iStarre.Dependency#getDependum()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Dependum();

	/**
	 * Returns the meta object for the reference '{@link iStarre.Dependency#getDepender <em>Depender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Depender</em>'.
	 * @see iStarre.Dependency#getDepender()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Depender();

	/**
	 * Returns the meta object for the reference '{@link iStarre.Dependency#getDependee <em>Dependee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependee</em>'.
	 * @see iStarre.Dependency#getDependee()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Dependee();

	/**
	 * Returns the meta object for the reference '{@link iStarre.Dependency#getDependeeElmt <em>Dependee Elmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependee Elmt</em>'.
	 * @see iStarre.Dependency#getDependeeElmt()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_DependeeElmt();

	/**
	 * Returns the meta object for the reference '{@link iStarre.Dependency#getDependerElmt <em>Depender Elmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Depender Elmt</em>'.
	 * @see iStarre.Dependency#getDependerElmt()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_DependerElmt();

	/**
	 * Returns the meta object for class '{@link iStarre.Intentionalelement <em>Intentionalelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intentionalelement</em>'.
	 * @see iStarre.Intentionalelement
	 * @generated
	 */
	EClass getIntentionalelement();

	/**
	 * Returns the meta object for the attribute '{@link iStarre.Intentionalelement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iStarre.Intentionalelement#getName()
	 * @see #getIntentionalelement()
	 * @generated
	 */
	EAttribute getIntentionalelement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link iStarre.Intentionalelement#getContributtionTo <em>Contributtion To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contributtion To</em>'.
	 * @see iStarre.Intentionalelement#getContributtionTo()
	 * @see #getIntentionalelement()
	 * @generated
	 */
	EReference getIntentionalelement_ContributtionTo();

	/**
	 * Returns the meta object for class '{@link iStarre.Refinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refinement</em>'.
	 * @see iStarre.Refinement
	 * @generated
	 */
	EClass getRefinement();

	/**
	 * Returns the meta object for class '{@link iStarre.GoalTaskElement <em>Goal Task Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal Task Element</em>'.
	 * @see iStarre.GoalTaskElement
	 * @generated
	 */
	EClass getGoalTaskElement();

	/**
	 * Returns the meta object for the containment reference '{@link iStarre.GoalTaskElement#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refines</em>'.
	 * @see iStarre.GoalTaskElement#getRefines()
	 * @see #getGoalTaskElement()
	 * @generated
	 */
	EReference getGoalTaskElement_Refines();

	/**
	 * Returns the meta object for the reference list '{@link iStarre.GoalTaskElement#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraint</em>'.
	 * @see iStarre.GoalTaskElement#getConstraint()
	 * @see #getGoalTaskElement()
	 * @generated
	 */
	EReference getGoalTaskElement_Constraint();

	/**
	 * Returns the meta object for class '{@link iStarre.ContributtionTo <em>Contributtion To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contributtion To</em>'.
	 * @see iStarre.ContributtionTo
	 * @generated
	 */
	EClass getContributtionTo();

	/**
	 * Returns the meta object for the attribute '{@link iStarre.ContributtionTo#getCobtribution <em>Cobtribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cobtribution</em>'.
	 * @see iStarre.ContributtionTo#getCobtribution()
	 * @see #getContributtionTo()
	 * @generated
	 */
	EAttribute getContributtionTo_Cobtribution();

	/**
	 * Returns the meta object for the reference '{@link iStarre.ContributtionTo#getContributesTo <em>Contributes To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contributes To</em>'.
	 * @see iStarre.ContributtionTo#getContributesTo()
	 * @see #getContributtionTo()
	 * @generated
	 */
	EReference getContributtionTo_ContributesTo();

	/**
	 * Returns the meta object for class '{@link iStarre.ANDrefinement <em>AN Drefinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AN Drefinement</em>'.
	 * @see iStarre.ANDrefinement
	 * @generated
	 */
	EClass getANDrefinement();

	/**
	 * Returns the meta object for the reference list '{@link iStarre.ANDrefinement#getTo2 <em>To2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To2</em>'.
	 * @see iStarre.ANDrefinement#getTo2()
	 * @see #getANDrefinement()
	 * @generated
	 */
	EReference getANDrefinement_To2();

	/**
	 * Returns the meta object for class '{@link iStarre.ORrefinement <em>ORrefinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ORrefinement</em>'.
	 * @see iStarre.ORrefinement
	 * @generated
	 */
	EClass getORrefinement();

	/**
	 * Returns the meta object for the reference list '{@link iStarre.ORrefinement#getTo1 <em>To1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To1</em>'.
	 * @see iStarre.ORrefinement#getTo1()
	 * @see #getORrefinement()
	 * @generated
	 */
	EReference getORrefinement_To1();

	/**
	 * Returns the meta object for class '{@link iStarre.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see iStarre.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for class '{@link iStarre.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see iStarre.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link iStarre.Task#isIsCombinedFragment <em>Is Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Combined Fragment</em>'.
	 * @see iStarre.Task#isIsCombinedFragment()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_IsCombinedFragment();

	/**
	 * Returns the meta object for the attribute '{@link iStarre.Task#isIsLoop <em>Is Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Loop</em>'.
	 * @see iStarre.Task#isIsLoop()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_IsLoop();

	/**
	 * Returns the meta object for the attribute '{@link iStarre.Task#isIsPrior <em>Is Prior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Prior</em>'.
	 * @see iStarre.Task#isIsPrior()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_IsPrior();

	/**
	 * Returns the meta object for the reference '{@link iStarre.Task#getPreviousTask <em>Previous Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous Task</em>'.
	 * @see iStarre.Task#getPreviousTask()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_PreviousTask();

	/**
	 * Returns the meta object for class '{@link iStarre.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see iStarre.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link iStarre.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see iStarre.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link iStarre.Resource#isIsEntity <em>Is Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Entity</em>'.
	 * @see iStarre.Resource#isIsEntity()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_IsEntity();

	/**
	 * Returns the meta object for the reference list '{@link iStarre.Resource#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association</em>'.
	 * @see iStarre.Resource#getAssociation()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Association();

	/**
	 * Returns the meta object for the reference list '{@link iStarre.Resource#getNeededBy <em>Needed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Needed By</em>'.
	 * @see iStarre.Resource#getNeededBy()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_NeededBy();

	/**
	 * Returns the meta object for class '{@link iStarre.Quality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality</em>'.
	 * @see iStarre.Quality
	 * @generated
	 */
	EClass getQuality();

	/**
	 * Returns the meta object for the reference list '{@link iStarre.Quality#getQualifies <em>Qualifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Qualifies</em>'.
	 * @see iStarre.Quality#getQualifies()
	 * @see #getQuality()
	 * @generated
	 */
	EReference getQuality_Qualifies();

	/**
	 * Returns the meta object for the reference list '{@link iStarre.Quality#getQualifies2 <em>Qualifies2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Qualifies2</em>'.
	 * @see iStarre.Quality#getQualifies2()
	 * @see #getQuality()
	 * @generated
	 */
	EReference getQuality_Qualifies2();

	/**
	 * Returns the meta object for enum '{@link iStarre.ContrbutionType <em>Contrbution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contrbution Type</em>'.
	 * @see iStarre.ContrbutionType
	 * @generated
	 */
	EEnum getContrbutionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IStarreFactory getIStarreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link iStarre.impl.iStarImpl <em>iStar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iStarre.impl.iStarImpl
		 * @see iStarre.impl.IStarrePackageImpl#getiStar()
		 * @generated
		 */
		EClass ISTAR = eINSTANCE.getiStar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISTAR__NAME = eINSTANCE.getiStar_Name();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTAR__ACTOR = eINSTANCE.getiStar_Actor();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTAR__DEPENDENCY = eINSTANCE.getiStar_Dependency();

		/**
		 * The meta object literal for the '{@link iStarre.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iStarre.impl.ActorImpl
		 * @see iStarre.impl.IStarrePackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

		/**
		 * The meta object literal for the '<em><b>Intentionalelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__INTENTIONALELEMENT = eINSTANCE.getActor_Intentionalelement();

		/**
		 * The meta object literal for the '<em><b>Is A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__IS_A = eINSTANCE.getActor_IsA();

		/**
		 * The meta object literal for the '<em><b>Prticipates In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__PRTICIPATES_IN = eINSTANCE.getActor_PrticipatesIn();

		/**
		 * The meta object literal for the '{@link iStarre.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iStarre.impl.AgentImpl
		 * @see iStarre.impl.IStarrePackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '{@link iStarre.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iStarre.impl.RoleImpl
		 * @see iStarre.impl.IStarrePackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Is Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__IS_ENTITY = eINSTANCE.getRole_IsEntity();

		/**
		 * The meta object literal for the '{@link iStarre.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iStarre.impl.DependencyImpl
		 * @see iStarre.impl.IStarrePackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Dependum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__DEPENDUM = eINSTANCE.getDependency_Dependum();

		/**
		 * The meta object literal for the '<em><b>Depender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__DEPENDER = eINSTANCE.getDependency_Depender();

		/**
		 * The meta object literal for the '<em><b>Dependee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__DEPENDEE = eINSTANCE.getDependency_Dependee();

		/**
		 * The meta object literal for the '<em><b>Dependee Elmt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__DEPENDEE_ELMT = eINSTANCE.getDependency_DependeeElmt();

		/**
		 * The meta object literal for the '<em><b>Depender Elmt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__DEPENDER_ELMT = eINSTANCE.getDependency_DependerElmt();

		/**
		 * The meta object literal for the '{@link iStarre.impl.IntentionalelementImpl <em>Intentionalelement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iStarre.impl.IntentionalelementImpl
		 * @see iStarre.impl.IStarrePackageImpl#getIntentionalelement()
		 * @generated
		 */
		EClass INTENTIONALELEMENT = eINSTANCE.getIntentionalelement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENTIONALELEMENT__NAME = eINSTANCE.getIntentionalelement_Name();

		/**
		 * The meta object literal for the '<em><b>Contributtion To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENTIONALELEMENT__CONTRIBUTTION_TO = eINSTANCE.getIntentionalelement_ContributtionTo();

		/**
		 * The meta object literal for the '{@link iStarre.impl.RefinementImpl <em>Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iStarre.impl.RefinementImpl
		 * @see iStarre.impl.IStarrePackageImpl#getRefinement()
		 * @generated
		 */
		EClass REFINEMENT = eINSTANCE.getRefinement();

		/**
		 * The meta object literal for the '{@link iStarre.impl.GoalTaskElementImpl <em>Goal Task Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iStarre.impl.GoalTaskElementImpl
		 * @see iStarre.impl.IStarrePackageImpl#getGoalTaskElement()
		 * @generated
		 */
		EClass GOAL_TASK_ELEMENT = eINSTANCE.getGoalTaskElement();

		/**
		 * The meta object literal for the '<em><b>Refines</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_TASK_ELEMENT__REFINES = eINSTANCE.getGoalTaskElement_Refines();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_TASK_ELEMENT__CONSTRAINT = eINSTANCE.getGoalTaskElement_Constraint();

		/**
		 * The meta object literal for the '{@link iStarre.impl.ContributtionToImpl <em>Contributtion To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iStarre.impl.ContributtionToImpl
		 * @see iStarre.impl.IStarrePackageImpl#getContributtionTo()
		 * @generated
		 */
		EClass CONTRIBUTTION_TO = eINSTANCE.getContributtionTo();

		/**
		 * The meta object literal for the '<em><b>Cobtribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTTION_TO__COBTRIBUTION = eINSTANCE.getContributtionTo_Cobtribution();

		/**
		 * The meta object literal for the '<em><b>Contributes To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTTION_TO__CONTRIBUTES_TO = eINSTANCE.getContributtionTo_ContributesTo();

		/**
		 * The meta object literal for the '{@link iStarre.impl.ANDrefinementImpl <em>AN Drefinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iStarre.impl.ANDrefinementImpl
		 * @see iStarre.impl.IStarrePackageImpl#getANDrefinement()
		 * @generated
		 */
		EClass AN_DREFINEMENT = eINSTANCE.getANDrefinement();

		/**
		 * The meta object literal for the '<em><b>To2</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AN_DREFINEMENT__TO2 = eINSTANCE.getANDrefinement_To2();

		/**
		 * The meta object literal for the '{@link iStarre.impl.ORrefinementImpl <em>ORrefinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iStarre.impl.ORrefinementImpl
		 * @see iStarre.impl.IStarrePackageImpl#getORrefinement()
		 * @generated
		 */
		EClass ORREFINEMENT = eINSTANCE.getORrefinement();

		/**
		 * The meta object literal for the '<em><b>To1</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORREFINEMENT__TO1 = eINSTANCE.getORrefinement_To1();

		/**
		 * The meta object literal for the '{@link iStarre.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iStarre.impl.GoalImpl
		 * @see iStarre.impl.IStarrePackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '{@link iStarre.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iStarre.impl.TaskImpl
		 * @see iStarre.impl.IStarrePackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Is Combined Fragment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__IS_COMBINED_FRAGMENT = eINSTANCE.getTask_IsCombinedFragment();

		/**
		 * The meta object literal for the '<em><b>Is Loop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__IS_LOOP = eINSTANCE.getTask_IsLoop();

		/**
		 * The meta object literal for the '<em><b>Is Prior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__IS_PRIOR = eINSTANCE.getTask_IsPrior();

		/**
		 * The meta object literal for the '<em><b>Previous Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PREVIOUS_TASK = eINSTANCE.getTask_PreviousTask();

		/**
		 * The meta object literal for the '{@link iStarre.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iStarre.impl.ConstraintImpl
		 * @see iStarre.impl.IStarrePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link iStarre.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iStarre.impl.ResourceImpl
		 * @see iStarre.impl.IStarrePackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Is Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__IS_ENTITY = eINSTANCE.getResource_IsEntity();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__ASSOCIATION = eINSTANCE.getResource_Association();

		/**
		 * The meta object literal for the '<em><b>Needed By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__NEEDED_BY = eINSTANCE.getResource_NeededBy();

		/**
		 * The meta object literal for the '{@link iStarre.impl.QualityImpl <em>Quality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iStarre.impl.QualityImpl
		 * @see iStarre.impl.IStarrePackageImpl#getQuality()
		 * @generated
		 */
		EClass QUALITY = eINSTANCE.getQuality();

		/**
		 * The meta object literal for the '<em><b>Qualifies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY__QUALIFIES = eINSTANCE.getQuality_Qualifies();

		/**
		 * The meta object literal for the '<em><b>Qualifies2</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY__QUALIFIES2 = eINSTANCE.getQuality_Qualifies2();

		/**
		 * The meta object literal for the '{@link iStarre.ContrbutionType <em>Contrbution Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iStarre.ContrbutionType
		 * @see iStarre.impl.IStarrePackageImpl#getContrbutionType()
		 * @generated
		 */
		EEnum CONTRBUTION_TYPE = eINSTANCE.getContrbutionType();

	}

} //IStarrePackage
