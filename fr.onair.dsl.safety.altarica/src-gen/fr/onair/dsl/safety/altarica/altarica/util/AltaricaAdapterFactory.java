/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica.util;

import fr.onair.dsl.safety.altarica.altarica.AbstractBooleanExpression;
import fr.onair.dsl.safety.altarica.altarica.AbstractDeclaration;
import fr.onair.dsl.safety.altarica.altarica.AbstractDefinitionConstant;
import fr.onair.dsl.safety.altarica.altarica.AbstractDomain;
import fr.onair.dsl.safety.altarica.altarica.AbstractExpression;
import fr.onair.dsl.safety.altarica.altarica.AbstractSpecification;
import fr.onair.dsl.safety.altarica.altarica.AbstractTypeRef;
import fr.onair.dsl.safety.altarica.altarica.Addition;
import fr.onair.dsl.safety.altarica.altarica.Affectation;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage
 * @generated
 */
public class AltaricaAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AltaricaPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AltaricaAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AltaricaPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AltaricaSwitch<Adapter> modelSwitch =
    new AltaricaSwitch<Adapter>()
    {
      @Override
      public Adapter caseSystem(fr.onair.dsl.safety.altarica.altarica.System object)
      {
        return createSystemAdapter();
      }
      @Override
      public Adapter caseAbstractDeclaration(AbstractDeclaration object)
      {
        return createAbstractDeclarationAdapter();
      }
      @Override
      public Adapter caseConstantDefinition(ConstantDefinition object)
      {
        return createConstantDefinitionAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseAbstractDefinitionConstant(AbstractDefinitionConstant object)
      {
        return createAbstractDefinitionConstantAdapter();
      }
      @Override
      public Adapter caseExpressionConstant(ExpressionConstant object)
      {
        return createExpressionConstantAdapter();
      }
      @Override
      public Adapter caseDomainConstant(DomainConstant object)
      {
        return createDomainConstantAdapter();
      }
      @Override
      public Adapter caseDomain(Domain object)
      {
        return createDomainAdapter();
      }
      @Override
      public Adapter caseAbstractDomain(AbstractDomain object)
      {
        return createAbstractDomainAdapter();
      }
      @Override
      public Adapter caseRange(Range object)
      {
        return createRangeAdapter();
      }
      @Override
      public Adapter caseEnumeration(Enumeration object)
      {
        return createEnumerationAdapter();
      }
      @Override
      public Adapter casePrimitiveType(PrimitiveType object)
      {
        return createPrimitiveTypeAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseNode(Node object)
      {
        return createNodeAdapter();
      }
      @Override
      public Adapter caseAbstractSpecification(AbstractSpecification object)
      {
        return createAbstractSpecificationAdapter();
      }
      @Override
      public Adapter caseVariableAttribute(VariableAttribute object)
      {
        return createVariableAttributeAdapter();
      }
      @Override
      public Adapter caseInitSpecification(InitSpecification object)
      {
        return createInitSpecificationAdapter();
      }
      @Override
      public Adapter caseInitStatement(InitStatement object)
      {
        return createInitStatementAdapter();
      }
      @Override
      public Adapter caseExternalSpecification(ExternalSpecification object)
      {
        return createExternalSpecificationAdapter();
      }
      @Override
      public Adapter caseExternalDirective(ExternalDirective object)
      {
        return createExternalDirectiveAdapter();
      }
      @Override
      public Adapter caseFlowSpecification(FlowSpecification object)
      {
        return createFlowSpecificationAdapter();
      }
      @Override
      public Adapter caseFlowDeclaration(FlowDeclaration object)
      {
        return createFlowDeclarationAdapter();
      }
      @Override
      public Adapter caseFlow(Flow object)
      {
        return createFlowAdapter();
      }
      @Override
      public Adapter caseEventSpecification(EventSpecification object)
      {
        return createEventSpecificationAdapter();
      }
      @Override
      public Adapter caseEventDeclaration(EventDeclaration object)
      {
        return createEventDeclarationAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter casePriority(Priority object)
      {
        return createPriorityAdapter();
      }
      @Override
      public Adapter caseStateSpecification(StateSpecification object)
      {
        return createStateSpecificationAdapter();
      }
      @Override
      public Adapter caseStateDeclaration(StateDeclaration object)
      {
        return createStateDeclarationAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseAbstractTypeRef(AbstractTypeRef object)
      {
        return createAbstractTypeRefAdapter();
      }
      @Override
      public Adapter caseDomainRef(DomainRef object)
      {
        return createDomainRefAdapter();
      }
      @Override
      public Adapter caseNodeInstanceSpecification(NodeInstanceSpecification object)
      {
        return createNodeInstanceSpecificationAdapter();
      }
      @Override
      public Adapter caseNodeInstanceDeclaration(NodeInstanceDeclaration object)
      {
        return createNodeInstanceDeclarationAdapter();
      }
      @Override
      public Adapter caseNodeInstance(NodeInstance object)
      {
        return createNodeInstanceAdapter();
      }
      @Override
      public Adapter caseAssertSpecification(AssertSpecification object)
      {
        return createAssertSpecificationAdapter();
      }
      @Override
      public Adapter caseAssert(Assert object)
      {
        return createAssertAdapter();
      }
      @Override
      public Adapter caseVectorSpecification(VectorSpecification object)
      {
        return createVectorSpecificationAdapter();
      }
      @Override
      public Adapter caseVector(Vector object)
      {
        return createVectorAdapter();
      }
      @Override
      public Adapter caseVectorParameter(VectorParameter object)
      {
        return createVectorParameterAdapter();
      }
      @Override
      public Adapter caseCardinality(Cardinality object)
      {
        return createCardinalityAdapter();
      }
      @Override
      public Adapter caseTransitionSpecification(TransitionSpecification object)
      {
        return createTransitionSpecificationAdapter();
      }
      @Override
      public Adapter caseTransition(Transition object)
      {
        return createTransitionAdapter();
      }
      @Override
      public Adapter caseAffectation(Affectation object)
      {
        return createAffectationAdapter();
      }
      @Override
      public Adapter caseAbstractExpression(AbstractExpression object)
      {
        return createAbstractExpressionAdapter();
      }
      @Override
      public Adapter caseAbstractBooleanExpression(AbstractBooleanExpression object)
      {
        return createAbstractBooleanExpressionAdapter();
      }
      @Override
      public Adapter caseSwitch(Switch object)
      {
        return createSwitchAdapter();
      }
      @Override
      public Adapter caseCaseExpression(CaseExpression object)
      {
        return createCaseExpressionAdapter();
      }
      @Override
      public Adapter caseIfThenElse(IfThenElse object)
      {
        return createIfThenElseAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseEventRef(EventRef object)
      {
        return createEventRefAdapter();
      }
      @Override
      public Adapter caseVariableRef(VariableRef object)
      {
        return createVariableRefAdapter();
      }
      @Override
      public Adapter caseNavigableVariable(NavigableVariable object)
      {
        return createNavigableVariableAdapter();
      }
      @Override
      public Adapter caseNonNavigableVariable(NonNavigableVariable object)
      {
        return createNonNavigableVariableAdapter();
      }
      @Override
      public Adapter caseEBoolean(EBoolean object)
      {
        return createEBooleanAdapter();
      }
      @Override
      public Adapter caseEString(EString object)
      {
        return createEStringAdapter();
      }
      @Override
      public Adapter caseEInteger(EInteger object)
      {
        return createEIntegerAdapter();
      }
      @Override
      public Adapter caseAddition(Addition object)
      {
        return createAdditionAdapter();
      }
      @Override
      public Adapter caseMinus(Minus object)
      {
        return createMinusAdapter();
      }
      @Override
      public Adapter caseMultiplication(Multiplication object)
      {
        return createMultiplicationAdapter();
      }
      @Override
      public Adapter caseDivision(Division object)
      {
        return createDivisionAdapter();
      }
      @Override
      public Adapter caseAnd(And object)
      {
        return createAndAdapter();
      }
      @Override
      public Adapter caseOr(Or object)
      {
        return createOrAdapter();
      }
      @Override
      public Adapter caseEqual(Equal object)
      {
        return createEqualAdapter();
      }
      @Override
      public Adapter caseNotEqual(NotEqual object)
      {
        return createNotEqualAdapter();
      }
      @Override
      public Adapter caseStrictLower(StrictLower object)
      {
        return createStrictLowerAdapter();
      }
      @Override
      public Adapter caseLower(Lower object)
      {
        return createLowerAdapter();
      }
      @Override
      public Adapter caseStrictUpper(StrictUpper object)
      {
        return createStrictUpperAdapter();
      }
      @Override
      public Adapter caseUpper(Upper object)
      {
        return createUpperAdapter();
      }
      @Override
      public Adapter caseImply(Imply object)
      {
        return createImplyAdapter();
      }
      @Override
      public Adapter caseNestedQualifiedEventRef(NestedQualifiedEventRef object)
      {
        return createNestedQualifiedEventRefAdapter();
      }
      @Override
      public Adapter caseNestedQualifiedVariableRef(NestedQualifiedVariableRef object)
      {
        return createNestedQualifiedVariableRefAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.System
   * @generated
   */
  public Adapter createSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.AbstractDeclaration <em>Abstract Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.AbstractDeclaration
   * @generated
   */
  public Adapter createAbstractDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.ConstantDefinition <em>Constant Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.ConstantDefinition
   * @generated
   */
  public Adapter createConstantDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.AbstractDefinitionConstant <em>Abstract Definition Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.AbstractDefinitionConstant
   * @generated
   */
  public Adapter createAbstractDefinitionConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.ExpressionConstant <em>Expression Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.ExpressionConstant
   * @generated
   */
  public Adapter createExpressionConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.DomainConstant <em>Domain Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.DomainConstant
   * @generated
   */
  public Adapter createDomainConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Domain
   * @generated
   */
  public Adapter createDomainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.AbstractDomain <em>Abstract Domain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.AbstractDomain
   * @generated
   */
  public Adapter createAbstractDomainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Range <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Range
   * @generated
   */
  public Adapter createRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Enumeration
   * @generated
   */
  public Adapter createEnumerationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.PrimitiveType
   * @generated
   */
  public Adapter createPrimitiveTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Node
   * @generated
   */
  public Adapter createNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.AbstractSpecification <em>Abstract Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.AbstractSpecification
   * @generated
   */
  public Adapter createAbstractSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.VariableAttribute <em>Variable Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.VariableAttribute
   * @generated
   */
  public Adapter createVariableAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.InitSpecification <em>Init Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.InitSpecification
   * @generated
   */
  public Adapter createInitSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.InitStatement <em>Init Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.InitStatement
   * @generated
   */
  public Adapter createInitStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.ExternalSpecification <em>External Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.ExternalSpecification
   * @generated
   */
  public Adapter createExternalSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.ExternalDirective <em>External Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.ExternalDirective
   * @generated
   */
  public Adapter createExternalDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.FlowSpecification <em>Flow Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.FlowSpecification
   * @generated
   */
  public Adapter createFlowSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.FlowDeclaration <em>Flow Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.FlowDeclaration
   * @generated
   */
  public Adapter createFlowDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Flow <em>Flow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Flow
   * @generated
   */
  public Adapter createFlowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.EventSpecification <em>Event Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.EventSpecification
   * @generated
   */
  public Adapter createEventSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.EventDeclaration <em>Event Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.EventDeclaration
   * @generated
   */
  public Adapter createEventDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Priority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Priority
   * @generated
   */
  public Adapter createPriorityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.StateSpecification <em>State Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.StateSpecification
   * @generated
   */
  public Adapter createStateSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.StateDeclaration <em>State Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.StateDeclaration
   * @generated
   */
  public Adapter createStateDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.AbstractTypeRef <em>Abstract Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.AbstractTypeRef
   * @generated
   */
  public Adapter createAbstractTypeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.DomainRef <em>Domain Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.DomainRef
   * @generated
   */
  public Adapter createDomainRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.NodeInstanceSpecification <em>Node Instance Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.NodeInstanceSpecification
   * @generated
   */
  public Adapter createNodeInstanceSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.NodeInstanceDeclaration <em>Node Instance Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.NodeInstanceDeclaration
   * @generated
   */
  public Adapter createNodeInstanceDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.NodeInstance <em>Node Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.NodeInstance
   * @generated
   */
  public Adapter createNodeInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.AssertSpecification <em>Assert Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.AssertSpecification
   * @generated
   */
  public Adapter createAssertSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Assert <em>Assert</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Assert
   * @generated
   */
  public Adapter createAssertAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.VectorSpecification <em>Vector Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.VectorSpecification
   * @generated
   */
  public Adapter createVectorSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Vector <em>Vector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Vector
   * @generated
   */
  public Adapter createVectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.VectorParameter <em>Vector Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.VectorParameter
   * @generated
   */
  public Adapter createVectorParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Cardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Cardinality
   * @generated
   */
  public Adapter createCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.TransitionSpecification <em>Transition Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.TransitionSpecification
   * @generated
   */
  public Adapter createTransitionSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Transition
   * @generated
   */
  public Adapter createTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Affectation <em>Affectation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Affectation
   * @generated
   */
  public Adapter createAffectationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.AbstractExpression <em>Abstract Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.AbstractExpression
   * @generated
   */
  public Adapter createAbstractExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.AbstractBooleanExpression <em>Abstract Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.AbstractBooleanExpression
   * @generated
   */
  public Adapter createAbstractBooleanExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Switch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Switch
   * @generated
   */
  public Adapter createSwitchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.CaseExpression <em>Case Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.CaseExpression
   * @generated
   */
  public Adapter createCaseExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.IfThenElse <em>If Then Else</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.IfThenElse
   * @generated
   */
  public Adapter createIfThenElseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.EventRef <em>Event Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.EventRef
   * @generated
   */
  public Adapter createEventRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.VariableRef <em>Variable Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.VariableRef
   * @generated
   */
  public Adapter createVariableRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.NavigableVariable <em>Navigable Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.NavigableVariable
   * @generated
   */
  public Adapter createNavigableVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.NonNavigableVariable <em>Non Navigable Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.NonNavigableVariable
   * @generated
   */
  public Adapter createNonNavigableVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.EBoolean <em>EBoolean</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.EBoolean
   * @generated
   */
  public Adapter createEBooleanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.EString <em>EString</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.EString
   * @generated
   */
  public Adapter createEStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.EInteger <em>EInteger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.EInteger
   * @generated
   */
  public Adapter createEIntegerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Addition <em>Addition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Addition
   * @generated
   */
  public Adapter createAdditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Minus
   * @generated
   */
  public Adapter createMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Multiplication
   * @generated
   */
  public Adapter createMultiplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Division <em>Division</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Division
   * @generated
   */
  public Adapter createDivisionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.And
   * @generated
   */
  public Adapter createAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Or
   * @generated
   */
  public Adapter createOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Equal <em>Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Equal
   * @generated
   */
  public Adapter createEqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.NotEqual <em>Not Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.NotEqual
   * @generated
   */
  public Adapter createNotEqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.StrictLower <em>Strict Lower</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.StrictLower
   * @generated
   */
  public Adapter createStrictLowerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Lower <em>Lower</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Lower
   * @generated
   */
  public Adapter createLowerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.StrictUpper <em>Strict Upper</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.StrictUpper
   * @generated
   */
  public Adapter createStrictUpperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Upper <em>Upper</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Upper
   * @generated
   */
  public Adapter createUpperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.Imply <em>Imply</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.Imply
   * @generated
   */
  public Adapter createImplyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.NestedQualifiedEventRef <em>Nested Qualified Event Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.NestedQualifiedEventRef
   * @generated
   */
  public Adapter createNestedQualifiedEventRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.onair.dsl.safety.altarica.altarica.NestedQualifiedVariableRef <em>Nested Qualified Variable Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.onair.dsl.safety.altarica.altarica.NestedQualifiedVariableRef
   * @generated
   */
  public Adapter createNestedQualifiedVariableRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AltaricaAdapterFactory
