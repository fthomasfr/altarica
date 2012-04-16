/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica.impl;

import fr.onair.dsl.safety.altarica.altarica.AbstractBooleanExpression;
import fr.onair.dsl.safety.altarica.altarica.AbstractDeclaration;
import fr.onair.dsl.safety.altarica.altarica.AbstractDefinitionConstant;
import fr.onair.dsl.safety.altarica.altarica.AbstractDomain;
import fr.onair.dsl.safety.altarica.altarica.AbstractExpression;
import fr.onair.dsl.safety.altarica.altarica.AbstractSpecification;
import fr.onair.dsl.safety.altarica.altarica.AbstractTypeRef;
import fr.onair.dsl.safety.altarica.altarica.Addition;
import fr.onair.dsl.safety.altarica.altarica.Affectation;
import fr.onair.dsl.safety.altarica.altarica.AltaricaFactory;
import fr.onair.dsl.safety.altarica.altarica.AltaricaPackage;
import fr.onair.dsl.safety.altarica.altarica.And;
import fr.onair.dsl.safety.altarica.altarica.Assert;
import fr.onair.dsl.safety.altarica.altarica.AssertSpecification;
import fr.onair.dsl.safety.altarica.altarica.Cardinality;
import fr.onair.dsl.safety.altarica.altarica.CaseExpression;
import fr.onair.dsl.safety.altarica.altarica.Constant;
import fr.onair.dsl.safety.altarica.altarica.ConstantDefinition;
import fr.onair.dsl.safety.altarica.altarica.Division;
import fr.onair.dsl.safety.altarica.altarica.Domain;
import fr.onair.dsl.safety.altarica.altarica.DomainConstant;
import fr.onair.dsl.safety.altarica.altarica.DomainRef;
import fr.onair.dsl.safety.altarica.altarica.EBoolean;
import fr.onair.dsl.safety.altarica.altarica.EInteger;
import fr.onair.dsl.safety.altarica.altarica.EString;
import fr.onair.dsl.safety.altarica.altarica.Enumeration;
import fr.onair.dsl.safety.altarica.altarica.Equal;
import fr.onair.dsl.safety.altarica.altarica.Event;
import fr.onair.dsl.safety.altarica.altarica.EventDeclaration;
import fr.onair.dsl.safety.altarica.altarica.EventRef;
import fr.onair.dsl.safety.altarica.altarica.EventSpecification;
import fr.onair.dsl.safety.altarica.altarica.Expression;
import fr.onair.dsl.safety.altarica.altarica.ExpressionConstant;
import fr.onair.dsl.safety.altarica.altarica.ExternalDirective;
import fr.onair.dsl.safety.altarica.altarica.ExternalSpecification;
import fr.onair.dsl.safety.altarica.altarica.Flow;
import fr.onair.dsl.safety.altarica.altarica.FlowDeclaration;
import fr.onair.dsl.safety.altarica.altarica.FlowKind;
import fr.onair.dsl.safety.altarica.altarica.FlowSpecification;
import fr.onair.dsl.safety.altarica.altarica.IfThenElse;
import fr.onair.dsl.safety.altarica.altarica.Imply;
import fr.onair.dsl.safety.altarica.altarica.InitSpecification;
import fr.onair.dsl.safety.altarica.altarica.InitStatement;
import fr.onair.dsl.safety.altarica.altarica.Literal;
import fr.onair.dsl.safety.altarica.altarica.Lower;
import fr.onair.dsl.safety.altarica.altarica.Minus;
import fr.onair.dsl.safety.altarica.altarica.Multiplication;
import fr.onair.dsl.safety.altarica.altarica.NavigableVariable;
import fr.onair.dsl.safety.altarica.altarica.NestedQualifiedEventRef;
import fr.onair.dsl.safety.altarica.altarica.NestedQualifiedVariableRef;
import fr.onair.dsl.safety.altarica.altarica.Node;
import fr.onair.dsl.safety.altarica.altarica.NodeInstance;
import fr.onair.dsl.safety.altarica.altarica.NodeInstanceDeclaration;
import fr.onair.dsl.safety.altarica.altarica.NodeInstanceSpecification;
import fr.onair.dsl.safety.altarica.altarica.NonNavigableVariable;
import fr.onair.dsl.safety.altarica.altarica.NotEqual;
import fr.onair.dsl.safety.altarica.altarica.Or;
import fr.onair.dsl.safety.altarica.altarica.PrimitiveType;
import fr.onair.dsl.safety.altarica.altarica.PrimitiveTypeKind;
import fr.onair.dsl.safety.altarica.altarica.Priority;
import fr.onair.dsl.safety.altarica.altarica.Range;
import fr.onair.dsl.safety.altarica.altarica.State;
import fr.onair.dsl.safety.altarica.altarica.StateDeclaration;
import fr.onair.dsl.safety.altarica.altarica.StateSpecification;
import fr.onair.dsl.safety.altarica.altarica.StrictLower;
import fr.onair.dsl.safety.altarica.altarica.StrictUpper;
import fr.onair.dsl.safety.altarica.altarica.Switch;
import fr.onair.dsl.safety.altarica.altarica.Transition;
import fr.onair.dsl.safety.altarica.altarica.TransitionSpecification;
import fr.onair.dsl.safety.altarica.altarica.Upper;
import fr.onair.dsl.safety.altarica.altarica.VariableAttribute;
import fr.onair.dsl.safety.altarica.altarica.VariableRef;
import fr.onair.dsl.safety.altarica.altarica.Vector;
import fr.onair.dsl.safety.altarica.altarica.VectorParameter;
import fr.onair.dsl.safety.altarica.altarica.VectorSpecification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AltaricaFactoryImpl extends EFactoryImpl implements AltaricaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AltaricaFactory init()
  {
    try
    {
      AltaricaFactory theAltaricaFactory = (AltaricaFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.onair.fr/dsl/safety/Altarica"); 
      if (theAltaricaFactory != null)
      {
        return theAltaricaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AltaricaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AltaricaFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AltaricaPackage.SYSTEM: return createSystem();
      case AltaricaPackage.ABSTRACT_DECLARATION: return createAbstractDeclaration();
      case AltaricaPackage.CONSTANT_DEFINITION: return createConstantDefinition();
      case AltaricaPackage.CONSTANT: return createConstant();
      case AltaricaPackage.ABSTRACT_DEFINITION_CONSTANT: return createAbstractDefinitionConstant();
      case AltaricaPackage.EXPRESSION_CONSTANT: return createExpressionConstant();
      case AltaricaPackage.DOMAIN_CONSTANT: return createDomainConstant();
      case AltaricaPackage.DOMAIN: return createDomain();
      case AltaricaPackage.ABSTRACT_DOMAIN: return createAbstractDomain();
      case AltaricaPackage.RANGE: return createRange();
      case AltaricaPackage.ENUMERATION: return createEnumeration();
      case AltaricaPackage.PRIMITIVE_TYPE: return createPrimitiveType();
      case AltaricaPackage.LITERAL: return createLiteral();
      case AltaricaPackage.NODE: return createNode();
      case AltaricaPackage.ABSTRACT_SPECIFICATION: return createAbstractSpecification();
      case AltaricaPackage.VARIABLE_ATTRIBUTE: return createVariableAttribute();
      case AltaricaPackage.INIT_SPECIFICATION: return createInitSpecification();
      case AltaricaPackage.INIT_STATEMENT: return createInitStatement();
      case AltaricaPackage.EXTERNAL_SPECIFICATION: return createExternalSpecification();
      case AltaricaPackage.EXTERNAL_DIRECTIVE: return createExternalDirective();
      case AltaricaPackage.FLOW_SPECIFICATION: return createFlowSpecification();
      case AltaricaPackage.FLOW_DECLARATION: return createFlowDeclaration();
      case AltaricaPackage.FLOW: return createFlow();
      case AltaricaPackage.EVENT_SPECIFICATION: return createEventSpecification();
      case AltaricaPackage.EVENT_DECLARATION: return createEventDeclaration();
      case AltaricaPackage.EVENT: return createEvent();
      case AltaricaPackage.PRIORITY: return createPriority();
      case AltaricaPackage.STATE_SPECIFICATION: return createStateSpecification();
      case AltaricaPackage.STATE_DECLARATION: return createStateDeclaration();
      case AltaricaPackage.STATE: return createState();
      case AltaricaPackage.ABSTRACT_TYPE_REF: return createAbstractTypeRef();
      case AltaricaPackage.DOMAIN_REF: return createDomainRef();
      case AltaricaPackage.NODE_INSTANCE_SPECIFICATION: return createNodeInstanceSpecification();
      case AltaricaPackage.NODE_INSTANCE_DECLARATION: return createNodeInstanceDeclaration();
      case AltaricaPackage.NODE_INSTANCE: return createNodeInstance();
      case AltaricaPackage.ASSERT_SPECIFICATION: return createAssertSpecification();
      case AltaricaPackage.ASSERT: return createAssert();
      case AltaricaPackage.VECTOR_SPECIFICATION: return createVectorSpecification();
      case AltaricaPackage.VECTOR: return createVector();
      case AltaricaPackage.VECTOR_PARAMETER: return createVectorParameter();
      case AltaricaPackage.CARDINALITY: return createCardinality();
      case AltaricaPackage.TRANSITION_SPECIFICATION: return createTransitionSpecification();
      case AltaricaPackage.TRANSITION: return createTransition();
      case AltaricaPackage.AFFECTATION: return createAffectation();
      case AltaricaPackage.ABSTRACT_EXPRESSION: return createAbstractExpression();
      case AltaricaPackage.ABSTRACT_BOOLEAN_EXPRESSION: return createAbstractBooleanExpression();
      case AltaricaPackage.SWITCH: return createSwitch();
      case AltaricaPackage.CASE_EXPRESSION: return createCaseExpression();
      case AltaricaPackage.IF_THEN_ELSE: return createIfThenElse();
      case AltaricaPackage.EXPRESSION: return createExpression();
      case AltaricaPackage.EVENT_REF: return createEventRef();
      case AltaricaPackage.VARIABLE_REF: return createVariableRef();
      case AltaricaPackage.NAVIGABLE_VARIABLE: return createNavigableVariable();
      case AltaricaPackage.NON_NAVIGABLE_VARIABLE: return createNonNavigableVariable();
      case AltaricaPackage.EBOOLEAN: return createEBoolean();
      case AltaricaPackage.ESTRING: return createEString();
      case AltaricaPackage.EINTEGER: return createEInteger();
      case AltaricaPackage.ADDITION: return createAddition();
      case AltaricaPackage.MINUS: return createMinus();
      case AltaricaPackage.MULTIPLICATION: return createMultiplication();
      case AltaricaPackage.DIVISION: return createDivision();
      case AltaricaPackage.AND: return createAnd();
      case AltaricaPackage.OR: return createOr();
      case AltaricaPackage.EQUAL: return createEqual();
      case AltaricaPackage.NOT_EQUAL: return createNotEqual();
      case AltaricaPackage.STRICT_LOWER: return createStrictLower();
      case AltaricaPackage.LOWER: return createLower();
      case AltaricaPackage.STRICT_UPPER: return createStrictUpper();
      case AltaricaPackage.UPPER: return createUpper();
      case AltaricaPackage.IMPLY: return createImply();
      case AltaricaPackage.NESTED_QUALIFIED_EVENT_REF: return createNestedQualifiedEventRef();
      case AltaricaPackage.NESTED_QUALIFIED_VARIABLE_REF: return createNestedQualifiedVariableRef();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AltaricaPackage.PRIMITIVE_TYPE_KIND:
        return createPrimitiveTypeKindFromString(eDataType, initialValue);
      case AltaricaPackage.FLOW_KIND:
        return createFlowKindFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AltaricaPackage.PRIMITIVE_TYPE_KIND:
        return convertPrimitiveTypeKindToString(eDataType, instanceValue);
      case AltaricaPackage.FLOW_KIND:
        return convertFlowKindToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fr.onair.dsl.safety.altarica.altarica.System createSystem()
  {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDeclaration createAbstractDeclaration()
  {
    AbstractDeclarationImpl abstractDeclaration = new AbstractDeclarationImpl();
    return abstractDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDefinition createConstantDefinition()
  {
    ConstantDefinitionImpl constantDefinition = new ConstantDefinitionImpl();
    return constantDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDefinitionConstant createAbstractDefinitionConstant()
  {
    AbstractDefinitionConstantImpl abstractDefinitionConstant = new AbstractDefinitionConstantImpl();
    return abstractDefinitionConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionConstant createExpressionConstant()
  {
    ExpressionConstantImpl expressionConstant = new ExpressionConstantImpl();
    return expressionConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainConstant createDomainConstant()
  {
    DomainConstantImpl domainConstant = new DomainConstantImpl();
    return domainConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domain createDomain()
  {
    DomainImpl domain = new DomainImpl();
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDomain createAbstractDomain()
  {
    AbstractDomainImpl abstractDomain = new AbstractDomainImpl();
    return abstractDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Range createRange()
  {
    RangeImpl range = new RangeImpl();
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumeration createEnumeration()
  {
    EnumerationImpl enumeration = new EnumerationImpl();
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveType createPrimitiveType()
  {
    PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
    return primitiveType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractSpecification createAbstractSpecification()
  {
    AbstractSpecificationImpl abstractSpecification = new AbstractSpecificationImpl();
    return abstractSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableAttribute createVariableAttribute()
  {
    VariableAttributeImpl variableAttribute = new VariableAttributeImpl();
    return variableAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitSpecification createInitSpecification()
  {
    InitSpecificationImpl initSpecification = new InitSpecificationImpl();
    return initSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitStatement createInitStatement()
  {
    InitStatementImpl initStatement = new InitStatementImpl();
    return initStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalSpecification createExternalSpecification()
  {
    ExternalSpecificationImpl externalSpecification = new ExternalSpecificationImpl();
    return externalSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalDirective createExternalDirective()
  {
    ExternalDirectiveImpl externalDirective = new ExternalDirectiveImpl();
    return externalDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowSpecification createFlowSpecification()
  {
    FlowSpecificationImpl flowSpecification = new FlowSpecificationImpl();
    return flowSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowDeclaration createFlowDeclaration()
  {
    FlowDeclarationImpl flowDeclaration = new FlowDeclarationImpl();
    return flowDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Flow createFlow()
  {
    FlowImpl flow = new FlowImpl();
    return flow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventSpecification createEventSpecification()
  {
    EventSpecificationImpl eventSpecification = new EventSpecificationImpl();
    return eventSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventDeclaration createEventDeclaration()
  {
    EventDeclarationImpl eventDeclaration = new EventDeclarationImpl();
    return eventDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Priority createPriority()
  {
    PriorityImpl priority = new PriorityImpl();
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateSpecification createStateSpecification()
  {
    StateSpecificationImpl stateSpecification = new StateSpecificationImpl();
    return stateSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateDeclaration createStateDeclaration()
  {
    StateDeclarationImpl stateDeclaration = new StateDeclarationImpl();
    return stateDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractTypeRef createAbstractTypeRef()
  {
    AbstractTypeRefImpl abstractTypeRef = new AbstractTypeRefImpl();
    return abstractTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainRef createDomainRef()
  {
    DomainRefImpl domainRef = new DomainRefImpl();
    return domainRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeInstanceSpecification createNodeInstanceSpecification()
  {
    NodeInstanceSpecificationImpl nodeInstanceSpecification = new NodeInstanceSpecificationImpl();
    return nodeInstanceSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeInstanceDeclaration createNodeInstanceDeclaration()
  {
    NodeInstanceDeclarationImpl nodeInstanceDeclaration = new NodeInstanceDeclarationImpl();
    return nodeInstanceDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeInstance createNodeInstance()
  {
    NodeInstanceImpl nodeInstance = new NodeInstanceImpl();
    return nodeInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertSpecification createAssertSpecification()
  {
    AssertSpecificationImpl assertSpecification = new AssertSpecificationImpl();
    return assertSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assert createAssert()
  {
    AssertImpl assert_ = new AssertImpl();
    return assert_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VectorSpecification createVectorSpecification()
  {
    VectorSpecificationImpl vectorSpecification = new VectorSpecificationImpl();
    return vectorSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vector createVector()
  {
    VectorImpl vector = new VectorImpl();
    return vector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VectorParameter createVectorParameter()
  {
    VectorParameterImpl vectorParameter = new VectorParameterImpl();
    return vectorParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cardinality createCardinality()
  {
    CardinalityImpl cardinality = new CardinalityImpl();
    return cardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionSpecification createTransitionSpecification()
  {
    TransitionSpecificationImpl transitionSpecification = new TransitionSpecificationImpl();
    return transitionSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Affectation createAffectation()
  {
    AffectationImpl affectation = new AffectationImpl();
    return affectation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractExpression createAbstractExpression()
  {
    AbstractExpressionImpl abstractExpression = new AbstractExpressionImpl();
    return abstractExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractBooleanExpression createAbstractBooleanExpression()
  {
    AbstractBooleanExpressionImpl abstractBooleanExpression = new AbstractBooleanExpressionImpl();
    return abstractBooleanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Switch createSwitch()
  {
    SwitchImpl switch_ = new SwitchImpl();
    return switch_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaseExpression createCaseExpression()
  {
    CaseExpressionImpl caseExpression = new CaseExpressionImpl();
    return caseExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfThenElse createIfThenElse()
  {
    IfThenElseImpl ifThenElse = new IfThenElseImpl();
    return ifThenElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventRef createEventRef()
  {
    EventRefImpl eventRef = new EventRefImpl();
    return eventRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableRef createVariableRef()
  {
    VariableRefImpl variableRef = new VariableRefImpl();
    return variableRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NavigableVariable createNavigableVariable()
  {
    NavigableVariableImpl navigableVariable = new NavigableVariableImpl();
    return navigableVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonNavigableVariable createNonNavigableVariable()
  {
    NonNavigableVariableImpl nonNavigableVariable = new NonNavigableVariableImpl();
    return nonNavigableVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EBoolean createEBoolean()
  {
    EBooleanImpl eBoolean = new EBooleanImpl();
    return eBoolean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EString createEString()
  {
    EStringImpl eString = new EStringImpl();
    return eString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EInteger createEInteger()
  {
    EIntegerImpl eInteger = new EIntegerImpl();
    return eInteger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Addition createAddition()
  {
    AdditionImpl addition = new AdditionImpl();
    return addition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplication createMultiplication()
  {
    MultiplicationImpl multiplication = new MultiplicationImpl();
    return multiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Division createDivision()
  {
    DivisionImpl division = new DivisionImpl();
    return division;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equal createEqual()
  {
    EqualImpl equal = new EqualImpl();
    return equal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotEqual createNotEqual()
  {
    NotEqualImpl notEqual = new NotEqualImpl();
    return notEqual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StrictLower createStrictLower()
  {
    StrictLowerImpl strictLower = new StrictLowerImpl();
    return strictLower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Lower createLower()
  {
    LowerImpl lower = new LowerImpl();
    return lower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StrictUpper createStrictUpper()
  {
    StrictUpperImpl strictUpper = new StrictUpperImpl();
    return strictUpper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Upper createUpper()
  {
    UpperImpl upper = new UpperImpl();
    return upper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Imply createImply()
  {
    ImplyImpl imply = new ImplyImpl();
    return imply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedQualifiedEventRef createNestedQualifiedEventRef()
  {
    NestedQualifiedEventRefImpl nestedQualifiedEventRef = new NestedQualifiedEventRefImpl();
    return nestedQualifiedEventRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedQualifiedVariableRef createNestedQualifiedVariableRef()
  {
    NestedQualifiedVariableRefImpl nestedQualifiedVariableRef = new NestedQualifiedVariableRefImpl();
    return nestedQualifiedVariableRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveTypeKind createPrimitiveTypeKindFromString(EDataType eDataType, String initialValue)
  {
    PrimitiveTypeKind result = PrimitiveTypeKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPrimitiveTypeKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowKind createFlowKindFromString(EDataType eDataType, String initialValue)
  {
    FlowKind result = FlowKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFlowKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AltaricaPackage getAltaricaPackage()
  {
    return (AltaricaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AltaricaPackage getPackage()
  {
    return AltaricaPackage.eINSTANCE;
  }

} //AltaricaFactoryImpl
