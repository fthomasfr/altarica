/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.onair.dsl.safety.altarica.altarica.AltaricaFactory
 * @model kind="package"
 * @generated
 */
public interface AltaricaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "altarica";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.onair.fr/dsl/safety/Altarica";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "altarica";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AltaricaPackage eINSTANCE = fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.SystemImpl <em>System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.SystemImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getSystem()
   * @generated
   */
  int SYSTEM = 0;

  /**
   * The feature id for the '<em><b>Owned Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__OWNED_DECLARATIONS = 0;

  /**
   * The number of structural features of the '<em>System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AbstractDeclarationImpl <em>Abstract Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AbstractDeclarationImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAbstractDeclaration()
   * @generated
   */
  int ABSTRACT_DECLARATION = 1;

  /**
   * The number of structural features of the '<em>Abstract Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.ConstantDefinitionImpl <em>Constant Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.ConstantDefinitionImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getConstantDefinition()
   * @generated
   */
  int CONSTANT_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION__CONSTANT = ABSTRACT_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION__EXPRESSION = ABSTRACT_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Constant Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION_FEATURE_COUNT = ABSTRACT_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.NavigableVariableImpl <em>Navigable Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.NavigableVariableImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getNavigableVariable()
   * @generated
   */
  int NAVIGABLE_VARIABLE = 52;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGABLE_VARIABLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Navigable Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGABLE_VARIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.NonNavigableVariableImpl <em>Non Navigable Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.NonNavigableVariableImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getNonNavigableVariable()
   * @generated
   */
  int NON_NAVIGABLE_VARIABLE = 53;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_NAVIGABLE_VARIABLE__NAME = NAVIGABLE_VARIABLE__NAME;

  /**
   * The number of structural features of the '<em>Non Navigable Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_NAVIGABLE_VARIABLE_FEATURE_COUNT = NAVIGABLE_VARIABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.ConstantImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NAME = NON_NAVIGABLE_VARIABLE__NAME;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = NON_NAVIGABLE_VARIABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AbstractDefinitionConstantImpl <em>Abstract Definition Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AbstractDefinitionConstantImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAbstractDefinitionConstant()
   * @generated
   */
  int ABSTRACT_DEFINITION_CONSTANT = 4;

  /**
   * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DEFINITION_CONSTANT__OWNED_EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Abstract Definition Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DEFINITION_CONSTANT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.ExpressionConstantImpl <em>Expression Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.ExpressionConstantImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getExpressionConstant()
   * @generated
   */
  int EXPRESSION_CONSTANT = 5;

  /**
   * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CONSTANT__OWNED_EXPRESSION = ABSTRACT_DEFINITION_CONSTANT__OWNED_EXPRESSION;

  /**
   * The number of structural features of the '<em>Expression Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CONSTANT_FEATURE_COUNT = ABSTRACT_DEFINITION_CONSTANT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.DomainConstantImpl <em>Domain Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.DomainConstantImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getDomainConstant()
   * @generated
   */
  int DOMAIN_CONSTANT = 6;

  /**
   * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_CONSTANT__OWNED_EXPRESSION = ABSTRACT_DEFINITION_CONSTANT__OWNED_EXPRESSION;

  /**
   * The feature id for the '<em><b>Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_CONSTANT__DOMAIN = ABSTRACT_DEFINITION_CONSTANT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Domain Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_CONSTANT_FEATURE_COUNT = ABSTRACT_DEFINITION_CONSTANT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.DomainImpl <em>Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.DomainImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getDomain()
   * @generated
   */
  int DOMAIN = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__NAME = ABSTRACT_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__DOMAIN = ABSTRACT_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_FEATURE_COUNT = ABSTRACT_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AbstractTypeRefImpl <em>Abstract Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AbstractTypeRefImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAbstractTypeRef()
   * @generated
   */
  int ABSTRACT_TYPE_REF = 30;

  /**
   * The number of structural features of the '<em>Abstract Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_TYPE_REF_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AbstractDomainImpl <em>Abstract Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AbstractDomainImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAbstractDomain()
   * @generated
   */
  int ABSTRACT_DOMAIN = 8;

  /**
   * The number of structural features of the '<em>Abstract Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DOMAIN_FEATURE_COUNT = ABSTRACT_TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.RangeImpl <em>Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.RangeImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getRange()
   * @generated
   */
  int RANGE = 9;

  /**
   * The feature id for the '<em><b>Lower</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__LOWER = ABSTRACT_DOMAIN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Upper</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__UPPER = ABSTRACT_DOMAIN_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FEATURE_COUNT = ABSTRACT_DOMAIN_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.EnumerationImpl <em>Enumeration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.EnumerationImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getEnumeration()
   * @generated
   */
  int ENUMERATION = 10;

  /**
   * The feature id for the '<em><b>Owned Literals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__OWNED_LITERALS = ABSTRACT_DOMAIN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enumeration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_FEATURE_COUNT = ABSTRACT_DOMAIN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.PrimitiveTypeImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getPrimitiveType()
   * @generated
   */
  int PRIMITIVE_TYPE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE__NAME = ABSTRACT_DOMAIN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Primitive Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_FEATURE_COUNT = ABSTRACT_DOMAIN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.LiteralImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__NAME = NON_NAVIGABLE_VARIABLE__NAME;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = NON_NAVIGABLE_VARIABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.NodeImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getNode()
   * @generated
   */
  int NODE = 13;

  /**
   * The feature id for the '<em><b>Is Main</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__IS_MAIN = ABSTRACT_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = ABSTRACT_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Owned Specifications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__OWNED_SPECIFICATIONS = ABSTRACT_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = ABSTRACT_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AbstractSpecificationImpl <em>Abstract Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AbstractSpecificationImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAbstractSpecification()
   * @generated
   */
  int ABSTRACT_SPECIFICATION = 14;

  /**
   * The number of structural features of the '<em>Abstract Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_SPECIFICATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.VariableAttributeImpl <em>Variable Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.VariableAttributeImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getVariableAttribute()
   * @generated
   */
  int VARIABLE_ATTRIBUTE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ATTRIBUTE__NAME = 0;

  /**
   * The number of structural features of the '<em>Variable Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.InitSpecificationImpl <em>Init Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.InitSpecificationImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getInitSpecification()
   * @generated
   */
  int INIT_SPECIFICATION = 16;

  /**
   * The feature id for the '<em><b>Owned Init Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_SPECIFICATION__OWNED_INIT_STATEMENTS = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Init Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_SPECIFICATION_FEATURE_COUNT = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.InitStatementImpl <em>Init Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.InitStatementImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getInitStatement()
   * @generated
   */
  int INIT_STATEMENT = 17;

  /**
   * The feature id for the '<em><b>Affectation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_STATEMENT__AFFECTATION = 0;

  /**
   * The number of structural features of the '<em>Init Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.ExternalSpecificationImpl <em>External Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.ExternalSpecificationImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getExternalSpecification()
   * @generated
   */
  int EXTERNAL_SPECIFICATION = 18;

  /**
   * The feature id for the '<em><b>Owned Directives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_SPECIFICATION__OWNED_DIRECTIVES = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>External Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_SPECIFICATION_FEATURE_COUNT = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.ExternalDirectiveImpl <em>External Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.ExternalDirectiveImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getExternalDirective()
   * @generated
   */
  int EXTERNAL_DIRECTIVE = 19;

  /**
   * The feature id for the '<em><b>Directive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DIRECTIVE__DIRECTIVE = 0;

  /**
   * The number of structural features of the '<em>External Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DIRECTIVE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.FlowSpecificationImpl <em>Flow Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.FlowSpecificationImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getFlowSpecification()
   * @generated
   */
  int FLOW_SPECIFICATION = 20;

  /**
   * The feature id for the '<em><b>Owned Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_SPECIFICATION__OWNED_DECLARATIONS = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Flow Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_SPECIFICATION_FEATURE_COUNT = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.FlowDeclarationImpl <em>Flow Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.FlowDeclarationImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getFlowDeclaration()
   * @generated
   */
  int FLOW_DECLARATION = 21;

  /**
   * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_DECLARATION__OWNED_FLOWS = 0;

  /**
   * The feature id for the '<em><b>Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_DECLARATION__DOMAIN = 1;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_DECLARATION__KIND = 2;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_DECLARATION__ATTRIBUTE = 3;

  /**
   * The number of structural features of the '<em>Flow Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_DECLARATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.FlowImpl <em>Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.FlowImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getFlow()
   * @generated
   */
  int FLOW = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__NAME = NON_NAVIGABLE_VARIABLE__NAME;

  /**
   * The number of structural features of the '<em>Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_FEATURE_COUNT = NON_NAVIGABLE_VARIABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.EventSpecificationImpl <em>Event Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.EventSpecificationImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getEventSpecification()
   * @generated
   */
  int EVENT_SPECIFICATION = 23;

  /**
   * The feature id for the '<em><b>Owned Event Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SPECIFICATION__OWNED_EVENT_DECLARATIONS = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Event Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SPECIFICATION_FEATURE_COUNT = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.EventDeclarationImpl <em>Event Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.EventDeclarationImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getEventDeclaration()
   * @generated
   */
  int EVENT_DECLARATION = 24;

  /**
   * The feature id for the '<em><b>Owned Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DECLARATION__OWNED_EVENTS = 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DECLARATION__ATTRIBUTE = 1;

  /**
   * The number of structural features of the '<em>Event Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.EventImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = NAVIGABLE_VARIABLE__NAME;

  /**
   * The feature id for the '<em><b>Owned Priority</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__OWNED_PRIORITY = NAVIGABLE_VARIABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = NAVIGABLE_VARIABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.PriorityImpl <em>Priority</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.PriorityImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getPriority()
   * @generated
   */
  int PRIORITY = 26;

  /**
   * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIORITY__OWNED_EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Priority</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIORITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.StateSpecificationImpl <em>State Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.StateSpecificationImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getStateSpecification()
   * @generated
   */
  int STATE_SPECIFICATION = 27;

  /**
   * The feature id for the '<em><b>Owned State Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_SPECIFICATION__OWNED_STATE_DECLARATIONS = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>State Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_SPECIFICATION_FEATURE_COUNT = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.StateDeclarationImpl <em>State Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.StateDeclarationImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getStateDeclaration()
   * @generated
   */
  int STATE_DECLARATION = 28;

  /**
   * The feature id for the '<em><b>Owned States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_DECLARATION__OWNED_STATES = 0;

  /**
   * The feature id for the '<em><b>Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_DECLARATION__DOMAIN = 1;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_DECLARATION__ATTRIBUTE = 2;

  /**
   * The number of structural features of the '<em>State Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.StateImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getState()
   * @generated
   */
  int STATE = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = NON_NAVIGABLE_VARIABLE__NAME;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = NON_NAVIGABLE_VARIABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.DomainRefImpl <em>Domain Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.DomainRefImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getDomainRef()
   * @generated
   */
  int DOMAIN_REF = 31;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_REF__REFERENCE = ABSTRACT_TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Domain Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_REF_FEATURE_COUNT = ABSTRACT_TYPE_REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.NodeInstanceSpecificationImpl <em>Node Instance Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.NodeInstanceSpecificationImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getNodeInstanceSpecification()
   * @generated
   */
  int NODE_INSTANCE_SPECIFICATION = 32;

  /**
   * The feature id for the '<em><b>Owned Node Instance Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_INSTANCE_SPECIFICATION__OWNED_NODE_INSTANCE_DECLARATIONS = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Node Instance Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_INSTANCE_SPECIFICATION_FEATURE_COUNT = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.NodeInstanceDeclarationImpl <em>Node Instance Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.NodeInstanceDeclarationImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getNodeInstanceDeclaration()
   * @generated
   */
  int NODE_INSTANCE_DECLARATION = 33;

  /**
   * The feature id for the '<em><b>Owned Node Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_INSTANCE_DECLARATION__OWNED_NODE_INSTANCES = 0;

  /**
   * The feature id for the '<em><b>Node Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_INSTANCE_DECLARATION__NODE_TYPE = 1;

  /**
   * The number of structural features of the '<em>Node Instance Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_INSTANCE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.NodeInstanceImpl <em>Node Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.NodeInstanceImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getNodeInstance()
   * @generated
   */
  int NODE_INSTANCE = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_INSTANCE__NAME = NAVIGABLE_VARIABLE__NAME;

  /**
   * The number of structural features of the '<em>Node Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_INSTANCE_FEATURE_COUNT = NAVIGABLE_VARIABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AssertSpecificationImpl <em>Assert Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AssertSpecificationImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAssertSpecification()
   * @generated
   */
  int ASSERT_SPECIFICATION = 35;

  /**
   * The feature id for the '<em><b>Owned Asserts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_SPECIFICATION__OWNED_ASSERTS = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Assert Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_SPECIFICATION_FEATURE_COUNT = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AssertImpl <em>Assert</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AssertImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAssert()
   * @generated
   */
  int ASSERT = 36;

  /**
   * The feature id for the '<em><b>Owned Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT__OWNED_EXPRESSIONS = 0;

  /**
   * The number of structural features of the '<em>Assert</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.VectorSpecificationImpl <em>Vector Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.VectorSpecificationImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getVectorSpecification()
   * @generated
   */
  int VECTOR_SPECIFICATION = 37;

  /**
   * The feature id for the '<em><b>Owned Vectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_SPECIFICATION__OWNED_VECTORS = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Vector Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_SPECIFICATION_FEATURE_COUNT = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.VectorImpl <em>Vector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.VectorImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getVector()
   * @generated
   */
  int VECTOR = 38;

  /**
   * The feature id for the '<em><b>Owned Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR__OWNED_PARAMETERS = 0;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR__CARDINALITY = 1;

  /**
   * The number of structural features of the '<em>Vector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.VectorParameterImpl <em>Vector Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.VectorParameterImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getVectorParameter()
   * @generated
   */
  int VECTOR_PARAMETER = 39;

  /**
   * The feature id for the '<em><b>Event Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_PARAMETER__EVENT_PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Is Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_PARAMETER__IS_REQUIRED = 1;

  /**
   * The number of structural features of the '<em>Vector Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.CardinalityImpl <em>Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.CardinalityImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getCardinality()
   * @generated
   */
  int CARDINALITY = 40;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Cardinality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.TransitionSpecificationImpl <em>Transition Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.TransitionSpecificationImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getTransitionSpecification()
   * @generated
   */
  int TRANSITION_SPECIFICATION = 41;

  /**
   * The feature id for the '<em><b>Owned Transition Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_SPECIFICATION__OWNED_TRANSITION_TRANSITIONS = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Transition Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_SPECIFICATION_FEATURE_COUNT = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.TransitionImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 42;

  /**
   * The feature id for the '<em><b>Owned Expresion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__OWNED_EXPRESION = 0;

  /**
   * The feature id for the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EVENT = 1;

  /**
   * The feature id for the '<em><b>Owned Affectations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__OWNED_AFFECTATIONS = 2;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AffectationImpl <em>Affectation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AffectationImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAffectation()
   * @generated
   */
  int AFFECTATION = 43;

  /**
   * The feature id for the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFFECTATION__STATE = 0;

  /**
   * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFFECTATION__OWNED_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Affectation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFFECTATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AbstractExpressionImpl <em>Abstract Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AbstractExpressionImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAbstractExpression()
   * @generated
   */
  int ABSTRACT_EXPRESSION = 44;

  /**
   * The number of structural features of the '<em>Abstract Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AbstractBooleanExpressionImpl <em>Abstract Boolean Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AbstractBooleanExpressionImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAbstractBooleanExpression()
   * @generated
   */
  int ABSTRACT_BOOLEAN_EXPRESSION = 45;

  /**
   * The number of structural features of the '<em>Abstract Boolean Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_BOOLEAN_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.SwitchImpl <em>Switch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.SwitchImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getSwitch()
   * @generated
   */
  int SWITCH = 46;

  /**
   * The feature id for the '<em><b>Owned Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__OWNED_CASES = ABSTRACT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__DEFAULT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_FEATURE_COUNT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.CaseExpressionImpl <em>Case Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.CaseExpressionImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getCaseExpression()
   * @generated
   */
  int CASE_EXPRESSION = 47;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION__BODY = 1;

  /**
   * The number of structural features of the '<em>Case Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.IfThenElseImpl <em>If Then Else</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.IfThenElseImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getIfThenElse()
   * @generated
   */
  int IF_THEN_ELSE = 48;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__CONDITION = ABSTRACT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__THEN = ABSTRACT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__ELSE = ABSTRACT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Then Else</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_FEATURE_COUNT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.ExpressionImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 49;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OPERAND = ABSTRACT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.EventRefImpl <em>Event Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.EventRefImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getEventRef()
   * @generated
   */
  int EVENT_REF = 50;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_REF__VARIABLE = 0;

  /**
   * The number of structural features of the '<em>Event Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.VariableRefImpl <em>Variable Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.VariableRefImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getVariableRef()
   * @generated
   */
  int VARIABLE_REF = 51;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REF__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REF__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.EBooleanImpl <em>EBoolean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.EBooleanImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getEBoolean()
   * @generated
   */
  int EBOOLEAN = 54;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EBOOLEAN__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EBOOLEAN__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>EBoolean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EBOOLEAN_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.EStringImpl <em>EString</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.EStringImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getEString()
   * @generated
   */
  int ESTRING = 55;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRING__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRING__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>EString</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRING_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.EIntegerImpl <em>EInteger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.EIntegerImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getEInteger()
   * @generated
   */
  int EINTEGER = 56;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EINTEGER__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EINTEGER__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>EInteger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EINTEGER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AdditionImpl <em>Addition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AdditionImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAddition()
   * @generated
   */
  int ADDITION = 57;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Addition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.MinusImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 58;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.MultiplicationImpl <em>Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.MultiplicationImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getMultiplication()
   * @generated
   */
  int MULTIPLICATION = 59;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.DivisionImpl <em>Division</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.DivisionImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getDivision()
   * @generated
   */
  int DIVISION = 60;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Division</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AndImpl <em>And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AndImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAnd()
   * @generated
   */
  int AND = 61;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.OrImpl <em>Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.OrImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getOr()
   * @generated
   */
  int OR = 62;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.EqualImpl <em>Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.EqualImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getEqual()
   * @generated
   */
  int EQUAL = 63;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.NotEqualImpl <em>Not Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.NotEqualImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getNotEqual()
   * @generated
   */
  int NOT_EQUAL = 64;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUAL__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUAL__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUAL__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Not Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.StrictLowerImpl <em>Strict Lower</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.StrictLowerImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getStrictLower()
   * @generated
   */
  int STRICT_LOWER = 65;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRICT_LOWER__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRICT_LOWER__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRICT_LOWER__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Strict Lower</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRICT_LOWER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.LowerImpl <em>Lower</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.LowerImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getLower()
   * @generated
   */
  int LOWER = 66;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOWER__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOWER__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOWER__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Lower</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOWER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.StrictUpperImpl <em>Strict Upper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.StrictUpperImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getStrictUpper()
   * @generated
   */
  int STRICT_UPPER = 67;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRICT_UPPER__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRICT_UPPER__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRICT_UPPER__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Strict Upper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRICT_UPPER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.UpperImpl <em>Upper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.UpperImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getUpper()
   * @generated
   */
  int UPPER = 68;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPPER__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPPER__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPPER__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Upper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPPER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.ImplyImpl <em>Imply</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.ImplyImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getImply()
   * @generated
   */
  int IMPLY = 69;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLY__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLY__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLY__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Imply</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.NestedQualifiedEventRefImpl <em>Nested Qualified Event Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.NestedQualifiedEventRefImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getNestedQualifiedEventRef()
   * @generated
   */
  int NESTED_QUALIFIED_EVENT_REF = 70;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_QUALIFIED_EVENT_REF__VARIABLE = EVENT_REF__VARIABLE;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_QUALIFIED_EVENT_REF__TARGET = EVENT_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Nested Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_QUALIFIED_EVENT_REF__NESTED_VARIABLE = EVENT_REF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Nested Qualified Event Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_QUALIFIED_EVENT_REF_FEATURE_COUNT = EVENT_REF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.NestedQualifiedVariableRefImpl <em>Nested Qualified Variable Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.impl.NestedQualifiedVariableRefImpl
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getNestedQualifiedVariableRef()
   * @generated
   */
  int NESTED_QUALIFIED_VARIABLE_REF = 71;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_QUALIFIED_VARIABLE_REF__OPERAND = VARIABLE_REF__OPERAND;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_QUALIFIED_VARIABLE_REF__VARIABLE = VARIABLE_REF__VARIABLE;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_QUALIFIED_VARIABLE_REF__TARGET = VARIABLE_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Nested Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_QUALIFIED_VARIABLE_REF__NESTED_VARIABLE = VARIABLE_REF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Nested Qualified Variable Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_QUALIFIED_VARIABLE_REF_FEATURE_COUNT = VARIABLE_REF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.PrimitiveTypeKind <em>Primitive Type Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.PrimitiveTypeKind
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getPrimitiveTypeKind()
   * @generated
   */
  int PRIMITIVE_TYPE_KIND = 72;

  /**
   * The meta object id for the '{@link fr.onair.dsl.safety.altarica.altarica.FlowKind <em>Flow Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.onair.dsl.safety.altarica.altarica.FlowKind
   * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getFlowKind()
   * @generated
   */
  int FLOW_KIND = 73;


  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.System
   * @generated
   */
  EClass getSystem();

  /**
   * Returns the meta object for the containment reference list '{@link fr.onair.dsl.safety.altarica.altarica.System#getOwnedDeclarations <em>Owned Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Declarations</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.System#getOwnedDeclarations()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_OwnedDeclarations();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.AbstractDeclaration <em>Abstract Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Declaration</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.AbstractDeclaration
   * @generated
   */
  EClass getAbstractDeclaration();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.ConstantDefinition <em>Constant Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Definition</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.ConstantDefinition
   * @generated
   */
  EClass getConstantDefinition();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.ConstantDefinition#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constant</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.ConstantDefinition#getConstant()
   * @see #getConstantDefinition()
   * @generated
   */
  EReference getConstantDefinition_Constant();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.ConstantDefinition#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.ConstantDefinition#getExpression()
   * @see #getConstantDefinition()
   * @generated
   */
  EReference getConstantDefinition_Expression();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.AbstractDefinitionConstant <em>Abstract Definition Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Definition Constant</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.AbstractDefinitionConstant
   * @generated
   */
  EClass getAbstractDefinitionConstant();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.AbstractDefinitionConstant#getOwnedExpression <em>Owned Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owned Expression</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.AbstractDefinitionConstant#getOwnedExpression()
   * @see #getAbstractDefinitionConstant()
   * @generated
   */
  EReference getAbstractDefinitionConstant_OwnedExpression();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.ExpressionConstant <em>Expression Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Constant</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.ExpressionConstant
   * @generated
   */
  EClass getExpressionConstant();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.DomainConstant <em>Domain Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Constant</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.DomainConstant
   * @generated
   */
  EClass getDomainConstant();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.DomainConstant#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.DomainConstant#getDomain()
   * @see #getDomainConstant()
   * @generated
   */
  EReference getDomainConstant_Domain();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Domain
   * @generated
   */
  EClass getDomain();

  /**
   * Returns the meta object for the attribute '{@link fr.onair.dsl.safety.altarica.altarica.Domain#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Domain#getName()
   * @see #getDomain()
   * @generated
   */
  EAttribute getDomain_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Domain#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Domain#getDomain()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_Domain();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.AbstractDomain <em>Abstract Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Domain</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.AbstractDomain
   * @generated
   */
  EClass getAbstractDomain();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Range <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Range
   * @generated
   */
  EClass getRange();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Range#getLower <em>Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lower</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Range#getLower()
   * @see #getRange()
   * @generated
   */
  EReference getRange_Lower();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Range#getUpper <em>Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Upper</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Range#getUpper()
   * @see #getRange()
   * @generated
   */
  EReference getRange_Upper();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Enumeration
   * @generated
   */
  EClass getEnumeration();

  /**
   * Returns the meta object for the containment reference list '{@link fr.onair.dsl.safety.altarica.altarica.Enumeration#getOwnedLiterals <em>Owned Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Literals</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Enumeration#getOwnedLiterals()
   * @see #getEnumeration()
   * @generated
   */
  EReference getEnumeration_OwnedLiterals();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Type</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.PrimitiveType
   * @generated
   */
  EClass getPrimitiveType();

  /**
   * Returns the meta object for the attribute '{@link fr.onair.dsl.safety.altarica.altarica.PrimitiveType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.PrimitiveType#getName()
   * @see #getPrimitiveType()
   * @generated
   */
  EAttribute getPrimitiveType_Name();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the attribute '{@link fr.onair.dsl.safety.altarica.altarica.Node#isIsMain <em>Is Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Main</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Node#isIsMain()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_IsMain();

  /**
   * Returns the meta object for the attribute '{@link fr.onair.dsl.safety.altarica.altarica.Node#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Node#getName()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.onair.dsl.safety.altarica.altarica.Node#getOwnedSpecifications <em>Owned Specifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Specifications</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Node#getOwnedSpecifications()
   * @see #getNode()
   * @generated
   */
  EReference getNode_OwnedSpecifications();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.AbstractSpecification <em>Abstract Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Specification</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.AbstractSpecification
   * @generated
   */
  EClass getAbstractSpecification();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.VariableAttribute <em>Variable Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Attribute</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.VariableAttribute
   * @generated
   */
  EClass getVariableAttribute();

  /**
   * Returns the meta object for the attribute '{@link fr.onair.dsl.safety.altarica.altarica.VariableAttribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.VariableAttribute#getName()
   * @see #getVariableAttribute()
   * @generated
   */
  EAttribute getVariableAttribute_Name();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.InitSpecification <em>Init Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init Specification</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.InitSpecification
   * @generated
   */
  EClass getInitSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link fr.onair.dsl.safety.altarica.altarica.InitSpecification#getOwnedInitStatements <em>Owned Init Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Init Statements</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.InitSpecification#getOwnedInitStatements()
   * @see #getInitSpecification()
   * @generated
   */
  EReference getInitSpecification_OwnedInitStatements();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.InitStatement <em>Init Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init Statement</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.InitStatement
   * @generated
   */
  EClass getInitStatement();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.InitStatement#getAffectation <em>Affectation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Affectation</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.InitStatement#getAffectation()
   * @see #getInitStatement()
   * @generated
   */
  EReference getInitStatement_Affectation();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.ExternalSpecification <em>External Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Specification</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.ExternalSpecification
   * @generated
   */
  EClass getExternalSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link fr.onair.dsl.safety.altarica.altarica.ExternalSpecification#getOwnedDirectives <em>Owned Directives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Directives</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.ExternalSpecification#getOwnedDirectives()
   * @see #getExternalSpecification()
   * @generated
   */
  EReference getExternalSpecification_OwnedDirectives();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.ExternalDirective <em>External Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Directive</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.ExternalDirective
   * @generated
   */
  EClass getExternalDirective();

  /**
   * Returns the meta object for the attribute '{@link fr.onair.dsl.safety.altarica.altarica.ExternalDirective#getDirective <em>Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Directive</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.ExternalDirective#getDirective()
   * @see #getExternalDirective()
   * @generated
   */
  EAttribute getExternalDirective_Directive();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.FlowSpecification <em>Flow Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow Specification</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.FlowSpecification
   * @generated
   */
  EClass getFlowSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link fr.onair.dsl.safety.altarica.altarica.FlowSpecification#getOwnedDeclarations <em>Owned Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Declarations</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.FlowSpecification#getOwnedDeclarations()
   * @see #getFlowSpecification()
   * @generated
   */
  EReference getFlowSpecification_OwnedDeclarations();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.FlowDeclaration <em>Flow Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow Declaration</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.FlowDeclaration
   * @generated
   */
  EClass getFlowDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link fr.onair.dsl.safety.altarica.altarica.FlowDeclaration#getOwnedFlows <em>Owned Flows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Flows</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.FlowDeclaration#getOwnedFlows()
   * @see #getFlowDeclaration()
   * @generated
   */
  EReference getFlowDeclaration_OwnedFlows();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.FlowDeclaration#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.FlowDeclaration#getDomain()
   * @see #getFlowDeclaration()
   * @generated
   */
  EReference getFlowDeclaration_Domain();

  /**
   * Returns the meta object for the attribute '{@link fr.onair.dsl.safety.altarica.altarica.FlowDeclaration#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.FlowDeclaration#getKind()
   * @see #getFlowDeclaration()
   * @generated
   */
  EAttribute getFlowDeclaration_Kind();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.FlowDeclaration#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.FlowDeclaration#getAttribute()
   * @see #getFlowDeclaration()
   * @generated
   */
  EReference getFlowDeclaration_Attribute();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Flow <em>Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Flow
   * @generated
   */
  EClass getFlow();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.EventSpecification <em>Event Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Specification</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.EventSpecification
   * @generated
   */
  EClass getEventSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link fr.onair.dsl.safety.altarica.altarica.EventSpecification#getOwnedEventDeclarations <em>Owned Event Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Event Declarations</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.EventSpecification#getOwnedEventDeclarations()
   * @see #getEventSpecification()
   * @generated
   */
  EReference getEventSpecification_OwnedEventDeclarations();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.EventDeclaration <em>Event Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Declaration</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.EventDeclaration
   * @generated
   */
  EClass getEventDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link fr.onair.dsl.safety.altarica.altarica.EventDeclaration#getOwnedEvents <em>Owned Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Events</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.EventDeclaration#getOwnedEvents()
   * @see #getEventDeclaration()
   * @generated
   */
  EReference getEventDeclaration_OwnedEvents();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.EventDeclaration#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.EventDeclaration#getAttribute()
   * @see #getEventDeclaration()
   * @generated
   */
  EReference getEventDeclaration_Attribute();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Event#getOwnedPriority <em>Owned Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owned Priority</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Event#getOwnedPriority()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_OwnedPriority();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Priority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Priority</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Priority
   * @generated
   */
  EClass getPriority();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Priority#getOwnedExpression <em>Owned Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owned Expression</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Priority#getOwnedExpression()
   * @see #getPriority()
   * @generated
   */
  EReference getPriority_OwnedExpression();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.StateSpecification <em>State Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Specification</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.StateSpecification
   * @generated
   */
  EClass getStateSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link fr.onair.dsl.safety.altarica.altarica.StateSpecification#getOwnedStateDeclarations <em>Owned State Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned State Declarations</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.StateSpecification#getOwnedStateDeclarations()
   * @see #getStateSpecification()
   * @generated
   */
  EReference getStateSpecification_OwnedStateDeclarations();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.StateDeclaration <em>State Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Declaration</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.StateDeclaration
   * @generated
   */
  EClass getStateDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link fr.onair.dsl.safety.altarica.altarica.StateDeclaration#getOwnedStates <em>Owned States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned States</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.StateDeclaration#getOwnedStates()
   * @see #getStateDeclaration()
   * @generated
   */
  EReference getStateDeclaration_OwnedStates();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.StateDeclaration#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.StateDeclaration#getDomain()
   * @see #getStateDeclaration()
   * @generated
   */
  EReference getStateDeclaration_Domain();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.StateDeclaration#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.StateDeclaration#getAttribute()
   * @see #getStateDeclaration()
   * @generated
   */
  EReference getStateDeclaration_Attribute();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.AbstractTypeRef <em>Abstract Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Type Ref</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.AbstractTypeRef
   * @generated
   */
  EClass getAbstractTypeRef();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.DomainRef <em>Domain Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Ref</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.DomainRef
   * @generated
   */
  EClass getDomainRef();

  /**
   * Returns the meta object for the reference '{@link fr.onair.dsl.safety.altarica.altarica.DomainRef#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.DomainRef#getReference()
   * @see #getDomainRef()
   * @generated
   */
  EReference getDomainRef_Reference();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.NodeInstanceSpecification <em>Node Instance Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Instance Specification</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.NodeInstanceSpecification
   * @generated
   */
  EClass getNodeInstanceSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link fr.onair.dsl.safety.altarica.altarica.NodeInstanceSpecification#getOwnedNodeInstanceDeclarations <em>Owned Node Instance Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Node Instance Declarations</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.NodeInstanceSpecification#getOwnedNodeInstanceDeclarations()
   * @see #getNodeInstanceSpecification()
   * @generated
   */
  EReference getNodeInstanceSpecification_OwnedNodeInstanceDeclarations();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.NodeInstanceDeclaration <em>Node Instance Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Instance Declaration</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.NodeInstanceDeclaration
   * @generated
   */
  EClass getNodeInstanceDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link fr.onair.dsl.safety.altarica.altarica.NodeInstanceDeclaration#getOwnedNodeInstances <em>Owned Node Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Node Instances</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.NodeInstanceDeclaration#getOwnedNodeInstances()
   * @see #getNodeInstanceDeclaration()
   * @generated
   */
  EReference getNodeInstanceDeclaration_OwnedNodeInstances();

  /**
   * Returns the meta object for the reference '{@link fr.onair.dsl.safety.altarica.altarica.NodeInstanceDeclaration#getNodeType <em>Node Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Node Type</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.NodeInstanceDeclaration#getNodeType()
   * @see #getNodeInstanceDeclaration()
   * @generated
   */
  EReference getNodeInstanceDeclaration_NodeType();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.NodeInstance <em>Node Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Instance</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.NodeInstance
   * @generated
   */
  EClass getNodeInstance();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.AssertSpecification <em>Assert Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assert Specification</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.AssertSpecification
   * @generated
   */
  EClass getAssertSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link fr.onair.dsl.safety.altarica.altarica.AssertSpecification#getOwnedAsserts <em>Owned Asserts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Asserts</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.AssertSpecification#getOwnedAsserts()
   * @see #getAssertSpecification()
   * @generated
   */
  EReference getAssertSpecification_OwnedAsserts();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Assert <em>Assert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assert</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Assert
   * @generated
   */
  EClass getAssert();

  /**
   * Returns the meta object for the containment reference list '{@link fr.onair.dsl.safety.altarica.altarica.Assert#getOwnedExpressions <em>Owned Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Expressions</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Assert#getOwnedExpressions()
   * @see #getAssert()
   * @generated
   */
  EReference getAssert_OwnedExpressions();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.VectorSpecification <em>Vector Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vector Specification</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.VectorSpecification
   * @generated
   */
  EClass getVectorSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link fr.onair.dsl.safety.altarica.altarica.VectorSpecification#getOwnedVectors <em>Owned Vectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Vectors</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.VectorSpecification#getOwnedVectors()
   * @see #getVectorSpecification()
   * @generated
   */
  EReference getVectorSpecification_OwnedVectors();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Vector <em>Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vector</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Vector
   * @generated
   */
  EClass getVector();

  /**
   * Returns the meta object for the containment reference list '{@link fr.onair.dsl.safety.altarica.altarica.Vector#getOwnedParameters <em>Owned Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Parameters</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Vector#getOwnedParameters()
   * @see #getVector()
   * @generated
   */
  EReference getVector_OwnedParameters();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Vector#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cardinality</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Vector#getCardinality()
   * @see #getVector()
   * @generated
   */
  EReference getVector_Cardinality();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.VectorParameter <em>Vector Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vector Parameter</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.VectorParameter
   * @generated
   */
  EClass getVectorParameter();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.VectorParameter#getEventParameter <em>Event Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event Parameter</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.VectorParameter#getEventParameter()
   * @see #getVectorParameter()
   * @generated
   */
  EReference getVectorParameter_EventParameter();

  /**
   * Returns the meta object for the attribute '{@link fr.onair.dsl.safety.altarica.altarica.VectorParameter#isIsRequired <em>Is Required</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Required</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.VectorParameter#isIsRequired()
   * @see #getVectorParameter()
   * @generated
   */
  EAttribute getVectorParameter_IsRequired();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Cardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cardinality</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Cardinality
   * @generated
   */
  EClass getCardinality();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Cardinality#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Cardinality#getExpression()
   * @see #getCardinality()
   * @generated
   */
  EReference getCardinality_Expression();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.TransitionSpecification <em>Transition Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Specification</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.TransitionSpecification
   * @generated
   */
  EClass getTransitionSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link fr.onair.dsl.safety.altarica.altarica.TransitionSpecification#getOwnedTransitionTransitions <em>Owned Transition Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Transition Transitions</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.TransitionSpecification#getOwnedTransitionTransitions()
   * @see #getTransitionSpecification()
   * @generated
   */
  EReference getTransitionSpecification_OwnedTransitionTransitions();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Transition#getOwnedExpresion <em>Owned Expresion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owned Expresion</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Transition#getOwnedExpresion()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_OwnedExpresion();

  /**
   * Returns the meta object for the reference '{@link fr.onair.dsl.safety.altarica.altarica.Transition#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Transition#getEvent()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Event();

  /**
   * Returns the meta object for the containment reference list '{@link fr.onair.dsl.safety.altarica.altarica.Transition#getOwnedAffectations <em>Owned Affectations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Affectations</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Transition#getOwnedAffectations()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_OwnedAffectations();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Affectation <em>Affectation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Affectation</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Affectation
   * @generated
   */
  EClass getAffectation();

  /**
   * Returns the meta object for the reference '{@link fr.onair.dsl.safety.altarica.altarica.Affectation#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Affectation#getState()
   * @see #getAffectation()
   * @generated
   */
  EReference getAffectation_State();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Affectation#getOwnedExpression <em>Owned Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owned Expression</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Affectation#getOwnedExpression()
   * @see #getAffectation()
   * @generated
   */
  EReference getAffectation_OwnedExpression();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.AbstractExpression <em>Abstract Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Expression</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.AbstractExpression
   * @generated
   */
  EClass getAbstractExpression();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.AbstractBooleanExpression <em>Abstract Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Boolean Expression</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.AbstractBooleanExpression
   * @generated
   */
  EClass getAbstractBooleanExpression();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Switch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Switch
   * @generated
   */
  EClass getSwitch();

  /**
   * Returns the meta object for the containment reference list '{@link fr.onair.dsl.safety.altarica.altarica.Switch#getOwnedCases <em>Owned Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Cases</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Switch#getOwnedCases()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_OwnedCases();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Switch#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Switch#getDefault()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_Default();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.CaseExpression <em>Case Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Expression</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.CaseExpression
   * @generated
   */
  EClass getCaseExpression();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.CaseExpression#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.CaseExpression#getCondition()
   * @see #getCaseExpression()
   * @generated
   */
  EReference getCaseExpression_Condition();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.CaseExpression#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.CaseExpression#getBody()
   * @see #getCaseExpression()
   * @generated
   */
  EReference getCaseExpression_Body();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.IfThenElse <em>If Then Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Then Else</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.IfThenElse
   * @generated
   */
  EClass getIfThenElse();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.IfThenElse#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.IfThenElse#getCondition()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_Condition();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.IfThenElse#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.IfThenElse#getThen()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_Then();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.IfThenElse#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.IfThenElse#getElse()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_Else();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Expression#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Expression#getOperand()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Operand();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.EventRef <em>Event Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Ref</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.EventRef
   * @generated
   */
  EClass getEventRef();

  /**
   * Returns the meta object for the reference '{@link fr.onair.dsl.safety.altarica.altarica.EventRef#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.EventRef#getVariable()
   * @see #getEventRef()
   * @generated
   */
  EReference getEventRef_Variable();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.VariableRef <em>Variable Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Ref</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.VariableRef
   * @generated
   */
  EClass getVariableRef();

  /**
   * Returns the meta object for the reference '{@link fr.onair.dsl.safety.altarica.altarica.VariableRef#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.VariableRef#getVariable()
   * @see #getVariableRef()
   * @generated
   */
  EReference getVariableRef_Variable();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.NavigableVariable <em>Navigable Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Navigable Variable</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.NavigableVariable
   * @generated
   */
  EClass getNavigableVariable();

  /**
   * Returns the meta object for the attribute '{@link fr.onair.dsl.safety.altarica.altarica.NavigableVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.NavigableVariable#getName()
   * @see #getNavigableVariable()
   * @generated
   */
  EAttribute getNavigableVariable_Name();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.NonNavigableVariable <em>Non Navigable Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Navigable Variable</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.NonNavigableVariable
   * @generated
   */
  EClass getNonNavigableVariable();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.EBoolean <em>EBoolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EBoolean</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.EBoolean
   * @generated
   */
  EClass getEBoolean();

  /**
   * Returns the meta object for the attribute '{@link fr.onair.dsl.safety.altarica.altarica.EBoolean#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.EBoolean#getValue()
   * @see #getEBoolean()
   * @generated
   */
  EAttribute getEBoolean_Value();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.EString <em>EString</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EString</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.EString
   * @generated
   */
  EClass getEString();

  /**
   * Returns the meta object for the attribute '{@link fr.onair.dsl.safety.altarica.altarica.EString#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.EString#getValue()
   * @see #getEString()
   * @generated
   */
  EAttribute getEString_Value();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.EInteger <em>EInteger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EInteger</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.EInteger
   * @generated
   */
  EClass getEInteger();

  /**
   * Returns the meta object for the attribute '{@link fr.onair.dsl.safety.altarica.altarica.EInteger#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.EInteger#getValue()
   * @see #getEInteger()
   * @generated
   */
  EAttribute getEInteger_Value();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Addition <em>Addition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Addition</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Addition
   * @generated
   */
  EClass getAddition();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Addition#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Addition#getLeftOperand()
   * @see #getAddition()
   * @generated
   */
  EReference getAddition_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Addition#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Addition#getRightOperand()
   * @see #getAddition()
   * @generated
   */
  EReference getAddition_RightOperand();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Minus#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Minus#getLeftOperand()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Minus#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Minus#getRightOperand()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_RightOperand();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Multiplication
   * @generated
   */
  EClass getMultiplication();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Multiplication#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Multiplication#getLeftOperand()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Multiplication#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Multiplication#getRightOperand()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_RightOperand();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Division <em>Division</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Division</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Division
   * @generated
   */
  EClass getDivision();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Division#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Division#getLeftOperand()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Division#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Division#getRightOperand()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_RightOperand();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.And
   * @generated
   */
  EClass getAnd();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.And#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.And#getLeftOperand()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.And#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.And#getRightOperand()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_RightOperand();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Or
   * @generated
   */
  EClass getOr();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Or#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Or#getLeftOperand()
   * @see #getOr()
   * @generated
   */
  EReference getOr_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Or#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Or#getRightOperand()
   * @see #getOr()
   * @generated
   */
  EReference getOr_RightOperand();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Equal <em>Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equal</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Equal
   * @generated
   */
  EClass getEqual();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Equal#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Equal#getLeftOperand()
   * @see #getEqual()
   * @generated
   */
  EReference getEqual_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Equal#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Equal#getRightOperand()
   * @see #getEqual()
   * @generated
   */
  EReference getEqual_RightOperand();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.NotEqual <em>Not Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Equal</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.NotEqual
   * @generated
   */
  EClass getNotEqual();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.NotEqual#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.NotEqual#getLeftOperand()
   * @see #getNotEqual()
   * @generated
   */
  EReference getNotEqual_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.NotEqual#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.NotEqual#getRightOperand()
   * @see #getNotEqual()
   * @generated
   */
  EReference getNotEqual_RightOperand();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.StrictLower <em>Strict Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Strict Lower</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.StrictLower
   * @generated
   */
  EClass getStrictLower();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.StrictLower#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.StrictLower#getLeftOperand()
   * @see #getStrictLower()
   * @generated
   */
  EReference getStrictLower_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.StrictLower#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.StrictLower#getRightOperand()
   * @see #getStrictLower()
   * @generated
   */
  EReference getStrictLower_RightOperand();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Lower <em>Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lower</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Lower
   * @generated
   */
  EClass getLower();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Lower#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Lower#getLeftOperand()
   * @see #getLower()
   * @generated
   */
  EReference getLower_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Lower#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Lower#getRightOperand()
   * @see #getLower()
   * @generated
   */
  EReference getLower_RightOperand();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.StrictUpper <em>Strict Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Strict Upper</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.StrictUpper
   * @generated
   */
  EClass getStrictUpper();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.StrictUpper#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.StrictUpper#getLeftOperand()
   * @see #getStrictUpper()
   * @generated
   */
  EReference getStrictUpper_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.StrictUpper#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.StrictUpper#getRightOperand()
   * @see #getStrictUpper()
   * @generated
   */
  EReference getStrictUpper_RightOperand();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Upper <em>Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Upper</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Upper
   * @generated
   */
  EClass getUpper();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Upper#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Upper#getLeftOperand()
   * @see #getUpper()
   * @generated
   */
  EReference getUpper_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Upper#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Upper#getRightOperand()
   * @see #getUpper()
   * @generated
   */
  EReference getUpper_RightOperand();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.Imply <em>Imply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Imply</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Imply
   * @generated
   */
  EClass getImply();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Imply#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Imply#getLeftOperand()
   * @see #getImply()
   * @generated
   */
  EReference getImply_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.Imply#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.Imply#getRightOperand()
   * @see #getImply()
   * @generated
   */
  EReference getImply_RightOperand();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.NestedQualifiedEventRef <em>Nested Qualified Event Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Qualified Event Ref</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.NestedQualifiedEventRef
   * @generated
   */
  EClass getNestedQualifiedEventRef();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.NestedQualifiedEventRef#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.NestedQualifiedEventRef#getTarget()
   * @see #getNestedQualifiedEventRef()
   * @generated
   */
  EReference getNestedQualifiedEventRef_Target();

  /**
   * Returns the meta object for the reference '{@link fr.onair.dsl.safety.altarica.altarica.NestedQualifiedEventRef#getNestedVariable <em>Nested Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Nested Variable</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.NestedQualifiedEventRef#getNestedVariable()
   * @see #getNestedQualifiedEventRef()
   * @generated
   */
  EReference getNestedQualifiedEventRef_NestedVariable();

  /**
   * Returns the meta object for class '{@link fr.onair.dsl.safety.altarica.altarica.NestedQualifiedVariableRef <em>Nested Qualified Variable Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Qualified Variable Ref</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.NestedQualifiedVariableRef
   * @generated
   */
  EClass getNestedQualifiedVariableRef();

  /**
   * Returns the meta object for the containment reference '{@link fr.onair.dsl.safety.altarica.altarica.NestedQualifiedVariableRef#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.NestedQualifiedVariableRef#getTarget()
   * @see #getNestedQualifiedVariableRef()
   * @generated
   */
  EReference getNestedQualifiedVariableRef_Target();

  /**
   * Returns the meta object for the reference '{@link fr.onair.dsl.safety.altarica.altarica.NestedQualifiedVariableRef#getNestedVariable <em>Nested Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Nested Variable</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.NestedQualifiedVariableRef#getNestedVariable()
   * @see #getNestedQualifiedVariableRef()
   * @generated
   */
  EReference getNestedQualifiedVariableRef_NestedVariable();

  /**
   * Returns the meta object for enum '{@link fr.onair.dsl.safety.altarica.altarica.PrimitiveTypeKind <em>Primitive Type Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Primitive Type Kind</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.PrimitiveTypeKind
   * @generated
   */
  EEnum getPrimitiveTypeKind();

  /**
   * Returns the meta object for enum '{@link fr.onair.dsl.safety.altarica.altarica.FlowKind <em>Flow Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Flow Kind</em>'.
   * @see fr.onair.dsl.safety.altarica.altarica.FlowKind
   * @generated
   */
  EEnum getFlowKind();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AltaricaFactory getAltaricaFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.SystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.SystemImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getSystem()
     * @generated
     */
    EClass SYSTEM = eINSTANCE.getSystem();

    /**
     * The meta object literal for the '<em><b>Owned Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__OWNED_DECLARATIONS = eINSTANCE.getSystem_OwnedDeclarations();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AbstractDeclarationImpl <em>Abstract Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AbstractDeclarationImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAbstractDeclaration()
     * @generated
     */
    EClass ABSTRACT_DECLARATION = eINSTANCE.getAbstractDeclaration();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.ConstantDefinitionImpl <em>Constant Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.ConstantDefinitionImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getConstantDefinition()
     * @generated
     */
    EClass CONSTANT_DEFINITION = eINSTANCE.getConstantDefinition();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_DEFINITION__CONSTANT = eINSTANCE.getConstantDefinition_Constant();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_DEFINITION__EXPRESSION = eINSTANCE.getConstantDefinition_Expression();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.ConstantImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AbstractDefinitionConstantImpl <em>Abstract Definition Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AbstractDefinitionConstantImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAbstractDefinitionConstant()
     * @generated
     */
    EClass ABSTRACT_DEFINITION_CONSTANT = eINSTANCE.getAbstractDefinitionConstant();

    /**
     * The meta object literal for the '<em><b>Owned Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_DEFINITION_CONSTANT__OWNED_EXPRESSION = eINSTANCE.getAbstractDefinitionConstant_OwnedExpression();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.ExpressionConstantImpl <em>Expression Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.ExpressionConstantImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getExpressionConstant()
     * @generated
     */
    EClass EXPRESSION_CONSTANT = eINSTANCE.getExpressionConstant();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.DomainConstantImpl <em>Domain Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.DomainConstantImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getDomainConstant()
     * @generated
     */
    EClass DOMAIN_CONSTANT = eINSTANCE.getDomainConstant();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_CONSTANT__DOMAIN = eINSTANCE.getDomainConstant_Domain();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.DomainImpl <em>Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.DomainImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getDomain()
     * @generated
     */
    EClass DOMAIN = eINSTANCE.getDomain();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__DOMAIN = eINSTANCE.getDomain_Domain();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AbstractDomainImpl <em>Abstract Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AbstractDomainImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAbstractDomain()
     * @generated
     */
    EClass ABSTRACT_DOMAIN = eINSTANCE.getAbstractDomain();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.RangeImpl <em>Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.RangeImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getRange()
     * @generated
     */
    EClass RANGE = eINSTANCE.getRange();

    /**
     * The meta object literal for the '<em><b>Lower</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGE__LOWER = eINSTANCE.getRange_Lower();

    /**
     * The meta object literal for the '<em><b>Upper</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGE__UPPER = eINSTANCE.getRange_Upper();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.EnumerationImpl <em>Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.EnumerationImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getEnumeration()
     * @generated
     */
    EClass ENUMERATION = eINSTANCE.getEnumeration();

    /**
     * The meta object literal for the '<em><b>Owned Literals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUMERATION__OWNED_LITERALS = eINSTANCE.getEnumeration_OwnedLiterals();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.PrimitiveTypeImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getPrimitiveType()
     * @generated
     */
    EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_TYPE__NAME = eINSTANCE.getPrimitiveType_Name();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.LiteralImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.NodeImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Is Main</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__IS_MAIN = eINSTANCE.getNode_IsMain();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__NAME = eINSTANCE.getNode_Name();

    /**
     * The meta object literal for the '<em><b>Owned Specifications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__OWNED_SPECIFICATIONS = eINSTANCE.getNode_OwnedSpecifications();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AbstractSpecificationImpl <em>Abstract Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AbstractSpecificationImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAbstractSpecification()
     * @generated
     */
    EClass ABSTRACT_SPECIFICATION = eINSTANCE.getAbstractSpecification();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.VariableAttributeImpl <em>Variable Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.VariableAttributeImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getVariableAttribute()
     * @generated
     */
    EClass VARIABLE_ATTRIBUTE = eINSTANCE.getVariableAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_ATTRIBUTE__NAME = eINSTANCE.getVariableAttribute_Name();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.InitSpecificationImpl <em>Init Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.InitSpecificationImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getInitSpecification()
     * @generated
     */
    EClass INIT_SPECIFICATION = eINSTANCE.getInitSpecification();

    /**
     * The meta object literal for the '<em><b>Owned Init Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INIT_SPECIFICATION__OWNED_INIT_STATEMENTS = eINSTANCE.getInitSpecification_OwnedInitStatements();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.InitStatementImpl <em>Init Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.InitStatementImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getInitStatement()
     * @generated
     */
    EClass INIT_STATEMENT = eINSTANCE.getInitStatement();

    /**
     * The meta object literal for the '<em><b>Affectation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INIT_STATEMENT__AFFECTATION = eINSTANCE.getInitStatement_Affectation();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.ExternalSpecificationImpl <em>External Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.ExternalSpecificationImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getExternalSpecification()
     * @generated
     */
    EClass EXTERNAL_SPECIFICATION = eINSTANCE.getExternalSpecification();

    /**
     * The meta object literal for the '<em><b>Owned Directives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_SPECIFICATION__OWNED_DIRECTIVES = eINSTANCE.getExternalSpecification_OwnedDirectives();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.ExternalDirectiveImpl <em>External Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.ExternalDirectiveImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getExternalDirective()
     * @generated
     */
    EClass EXTERNAL_DIRECTIVE = eINSTANCE.getExternalDirective();

    /**
     * The meta object literal for the '<em><b>Directive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_DIRECTIVE__DIRECTIVE = eINSTANCE.getExternalDirective_Directive();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.FlowSpecificationImpl <em>Flow Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.FlowSpecificationImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getFlowSpecification()
     * @generated
     */
    EClass FLOW_SPECIFICATION = eINSTANCE.getFlowSpecification();

    /**
     * The meta object literal for the '<em><b>Owned Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_SPECIFICATION__OWNED_DECLARATIONS = eINSTANCE.getFlowSpecification_OwnedDeclarations();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.FlowDeclarationImpl <em>Flow Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.FlowDeclarationImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getFlowDeclaration()
     * @generated
     */
    EClass FLOW_DECLARATION = eINSTANCE.getFlowDeclaration();

    /**
     * The meta object literal for the '<em><b>Owned Flows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_DECLARATION__OWNED_FLOWS = eINSTANCE.getFlowDeclaration_OwnedFlows();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_DECLARATION__DOMAIN = eINSTANCE.getFlowDeclaration_Domain();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW_DECLARATION__KIND = eINSTANCE.getFlowDeclaration_Kind();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_DECLARATION__ATTRIBUTE = eINSTANCE.getFlowDeclaration_Attribute();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.FlowImpl <em>Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.FlowImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getFlow()
     * @generated
     */
    EClass FLOW = eINSTANCE.getFlow();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.EventSpecificationImpl <em>Event Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.EventSpecificationImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getEventSpecification()
     * @generated
     */
    EClass EVENT_SPECIFICATION = eINSTANCE.getEventSpecification();

    /**
     * The meta object literal for the '<em><b>Owned Event Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_SPECIFICATION__OWNED_EVENT_DECLARATIONS = eINSTANCE.getEventSpecification_OwnedEventDeclarations();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.EventDeclarationImpl <em>Event Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.EventDeclarationImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getEventDeclaration()
     * @generated
     */
    EClass EVENT_DECLARATION = eINSTANCE.getEventDeclaration();

    /**
     * The meta object literal for the '<em><b>Owned Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_DECLARATION__OWNED_EVENTS = eINSTANCE.getEventDeclaration_OwnedEvents();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_DECLARATION__ATTRIBUTE = eINSTANCE.getEventDeclaration_Attribute();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.EventImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Owned Priority</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__OWNED_PRIORITY = eINSTANCE.getEvent_OwnedPriority();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.PriorityImpl <em>Priority</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.PriorityImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getPriority()
     * @generated
     */
    EClass PRIORITY = eINSTANCE.getPriority();

    /**
     * The meta object literal for the '<em><b>Owned Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIORITY__OWNED_EXPRESSION = eINSTANCE.getPriority_OwnedExpression();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.StateSpecificationImpl <em>State Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.StateSpecificationImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getStateSpecification()
     * @generated
     */
    EClass STATE_SPECIFICATION = eINSTANCE.getStateSpecification();

    /**
     * The meta object literal for the '<em><b>Owned State Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_SPECIFICATION__OWNED_STATE_DECLARATIONS = eINSTANCE.getStateSpecification_OwnedStateDeclarations();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.StateDeclarationImpl <em>State Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.StateDeclarationImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getStateDeclaration()
     * @generated
     */
    EClass STATE_DECLARATION = eINSTANCE.getStateDeclaration();

    /**
     * The meta object literal for the '<em><b>Owned States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_DECLARATION__OWNED_STATES = eINSTANCE.getStateDeclaration_OwnedStates();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_DECLARATION__DOMAIN = eINSTANCE.getStateDeclaration_Domain();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_DECLARATION__ATTRIBUTE = eINSTANCE.getStateDeclaration_Attribute();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.StateImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AbstractTypeRefImpl <em>Abstract Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AbstractTypeRefImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAbstractTypeRef()
     * @generated
     */
    EClass ABSTRACT_TYPE_REF = eINSTANCE.getAbstractTypeRef();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.DomainRefImpl <em>Domain Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.DomainRefImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getDomainRef()
     * @generated
     */
    EClass DOMAIN_REF = eINSTANCE.getDomainRef();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_REF__REFERENCE = eINSTANCE.getDomainRef_Reference();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.NodeInstanceSpecificationImpl <em>Node Instance Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.NodeInstanceSpecificationImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getNodeInstanceSpecification()
     * @generated
     */
    EClass NODE_INSTANCE_SPECIFICATION = eINSTANCE.getNodeInstanceSpecification();

    /**
     * The meta object literal for the '<em><b>Owned Node Instance Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_INSTANCE_SPECIFICATION__OWNED_NODE_INSTANCE_DECLARATIONS = eINSTANCE.getNodeInstanceSpecification_OwnedNodeInstanceDeclarations();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.NodeInstanceDeclarationImpl <em>Node Instance Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.NodeInstanceDeclarationImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getNodeInstanceDeclaration()
     * @generated
     */
    EClass NODE_INSTANCE_DECLARATION = eINSTANCE.getNodeInstanceDeclaration();

    /**
     * The meta object literal for the '<em><b>Owned Node Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_INSTANCE_DECLARATION__OWNED_NODE_INSTANCES = eINSTANCE.getNodeInstanceDeclaration_OwnedNodeInstances();

    /**
     * The meta object literal for the '<em><b>Node Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_INSTANCE_DECLARATION__NODE_TYPE = eINSTANCE.getNodeInstanceDeclaration_NodeType();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.NodeInstanceImpl <em>Node Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.NodeInstanceImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getNodeInstance()
     * @generated
     */
    EClass NODE_INSTANCE = eINSTANCE.getNodeInstance();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AssertSpecificationImpl <em>Assert Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AssertSpecificationImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAssertSpecification()
     * @generated
     */
    EClass ASSERT_SPECIFICATION = eINSTANCE.getAssertSpecification();

    /**
     * The meta object literal for the '<em><b>Owned Asserts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERT_SPECIFICATION__OWNED_ASSERTS = eINSTANCE.getAssertSpecification_OwnedAsserts();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AssertImpl <em>Assert</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AssertImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAssert()
     * @generated
     */
    EClass ASSERT = eINSTANCE.getAssert();

    /**
     * The meta object literal for the '<em><b>Owned Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERT__OWNED_EXPRESSIONS = eINSTANCE.getAssert_OwnedExpressions();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.VectorSpecificationImpl <em>Vector Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.VectorSpecificationImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getVectorSpecification()
     * @generated
     */
    EClass VECTOR_SPECIFICATION = eINSTANCE.getVectorSpecification();

    /**
     * The meta object literal for the '<em><b>Owned Vectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VECTOR_SPECIFICATION__OWNED_VECTORS = eINSTANCE.getVectorSpecification_OwnedVectors();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.VectorImpl <em>Vector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.VectorImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getVector()
     * @generated
     */
    EClass VECTOR = eINSTANCE.getVector();

    /**
     * The meta object literal for the '<em><b>Owned Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VECTOR__OWNED_PARAMETERS = eINSTANCE.getVector_OwnedParameters();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VECTOR__CARDINALITY = eINSTANCE.getVector_Cardinality();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.VectorParameterImpl <em>Vector Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.VectorParameterImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getVectorParameter()
     * @generated
     */
    EClass VECTOR_PARAMETER = eINSTANCE.getVectorParameter();

    /**
     * The meta object literal for the '<em><b>Event Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VECTOR_PARAMETER__EVENT_PARAMETER = eINSTANCE.getVectorParameter_EventParameter();

    /**
     * The meta object literal for the '<em><b>Is Required</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VECTOR_PARAMETER__IS_REQUIRED = eINSTANCE.getVectorParameter_IsRequired();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.CardinalityImpl <em>Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.CardinalityImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getCardinality()
     * @generated
     */
    EClass CARDINALITY = eINSTANCE.getCardinality();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CARDINALITY__EXPRESSION = eINSTANCE.getCardinality_Expression();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.TransitionSpecificationImpl <em>Transition Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.TransitionSpecificationImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getTransitionSpecification()
     * @generated
     */
    EClass TRANSITION_SPECIFICATION = eINSTANCE.getTransitionSpecification();

    /**
     * The meta object literal for the '<em><b>Owned Transition Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_SPECIFICATION__OWNED_TRANSITION_TRANSITIONS = eINSTANCE.getTransitionSpecification_OwnedTransitionTransitions();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.TransitionImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Owned Expresion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__OWNED_EXPRESION = eINSTANCE.getTransition_OwnedExpresion();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__EVENT = eINSTANCE.getTransition_Event();

    /**
     * The meta object literal for the '<em><b>Owned Affectations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__OWNED_AFFECTATIONS = eINSTANCE.getTransition_OwnedAffectations();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AffectationImpl <em>Affectation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AffectationImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAffectation()
     * @generated
     */
    EClass AFFECTATION = eINSTANCE.getAffectation();

    /**
     * The meta object literal for the '<em><b>State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AFFECTATION__STATE = eINSTANCE.getAffectation_State();

    /**
     * The meta object literal for the '<em><b>Owned Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AFFECTATION__OWNED_EXPRESSION = eINSTANCE.getAffectation_OwnedExpression();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AbstractExpressionImpl <em>Abstract Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AbstractExpressionImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAbstractExpression()
     * @generated
     */
    EClass ABSTRACT_EXPRESSION = eINSTANCE.getAbstractExpression();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AbstractBooleanExpressionImpl <em>Abstract Boolean Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AbstractBooleanExpressionImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAbstractBooleanExpression()
     * @generated
     */
    EClass ABSTRACT_BOOLEAN_EXPRESSION = eINSTANCE.getAbstractBooleanExpression();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.SwitchImpl <em>Switch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.SwitchImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getSwitch()
     * @generated
     */
    EClass SWITCH = eINSTANCE.getSwitch();

    /**
     * The meta object literal for the '<em><b>Owned Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__OWNED_CASES = eINSTANCE.getSwitch_OwnedCases();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__DEFAULT = eINSTANCE.getSwitch_Default();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.CaseExpressionImpl <em>Case Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.CaseExpressionImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getCaseExpression()
     * @generated
     */
    EClass CASE_EXPRESSION = eINSTANCE.getCaseExpression();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_EXPRESSION__CONDITION = eINSTANCE.getCaseExpression_Condition();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_EXPRESSION__BODY = eINSTANCE.getCaseExpression_Body();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.IfThenElseImpl <em>If Then Else</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.IfThenElseImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getIfThenElse()
     * @generated
     */
    EClass IF_THEN_ELSE = eINSTANCE.getIfThenElse();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__CONDITION = eINSTANCE.getIfThenElse_Condition();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__THEN = eINSTANCE.getIfThenElse_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__ELSE = eINSTANCE.getIfThenElse_Else();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.ExpressionImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__OPERAND = eINSTANCE.getExpression_Operand();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.EventRefImpl <em>Event Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.EventRefImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getEventRef()
     * @generated
     */
    EClass EVENT_REF = eINSTANCE.getEventRef();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_REF__VARIABLE = eINSTANCE.getEventRef_Variable();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.VariableRefImpl <em>Variable Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.VariableRefImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getVariableRef()
     * @generated
     */
    EClass VARIABLE_REF = eINSTANCE.getVariableRef();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_REF__VARIABLE = eINSTANCE.getVariableRef_Variable();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.NavigableVariableImpl <em>Navigable Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.NavigableVariableImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getNavigableVariable()
     * @generated
     */
    EClass NAVIGABLE_VARIABLE = eINSTANCE.getNavigableVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAVIGABLE_VARIABLE__NAME = eINSTANCE.getNavigableVariable_Name();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.NonNavigableVariableImpl <em>Non Navigable Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.NonNavigableVariableImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getNonNavigableVariable()
     * @generated
     */
    EClass NON_NAVIGABLE_VARIABLE = eINSTANCE.getNonNavigableVariable();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.EBooleanImpl <em>EBoolean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.EBooleanImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getEBoolean()
     * @generated
     */
    EClass EBOOLEAN = eINSTANCE.getEBoolean();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EBOOLEAN__VALUE = eINSTANCE.getEBoolean_Value();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.EStringImpl <em>EString</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.EStringImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getEString()
     * @generated
     */
    EClass ESTRING = eINSTANCE.getEString();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESTRING__VALUE = eINSTANCE.getEString_Value();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.EIntegerImpl <em>EInteger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.EIntegerImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getEInteger()
     * @generated
     */
    EClass EINTEGER = eINSTANCE.getEInteger();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EINTEGER__VALUE = eINSTANCE.getEInteger_Value();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AdditionImpl <em>Addition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AdditionImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAddition()
     * @generated
     */
    EClass ADDITION = eINSTANCE.getAddition();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITION__LEFT_OPERAND = eINSTANCE.getAddition_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITION__RIGHT_OPERAND = eINSTANCE.getAddition_RightOperand();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.MinusImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__LEFT_OPERAND = eINSTANCE.getMinus_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT_OPERAND = eINSTANCE.getMinus_RightOperand();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.MultiplicationImpl <em>Multiplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.MultiplicationImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getMultiplication()
     * @generated
     */
    EClass MULTIPLICATION = eINSTANCE.getMultiplication();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION__LEFT_OPERAND = eINSTANCE.getMultiplication_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION__RIGHT_OPERAND = eINSTANCE.getMultiplication_RightOperand();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.DivisionImpl <em>Division</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.DivisionImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getDivision()
     * @generated
     */
    EClass DIVISION = eINSTANCE.getDivision();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__LEFT_OPERAND = eINSTANCE.getDivision_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__RIGHT_OPERAND = eINSTANCE.getDivision_RightOperand();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.AndImpl <em>And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AndImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getAnd()
     * @generated
     */
    EClass AND = eINSTANCE.getAnd();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__LEFT_OPERAND = eINSTANCE.getAnd_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__RIGHT_OPERAND = eINSTANCE.getAnd_RightOperand();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.OrImpl <em>Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.OrImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getOr()
     * @generated
     */
    EClass OR = eINSTANCE.getOr();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__LEFT_OPERAND = eINSTANCE.getOr_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__RIGHT_OPERAND = eINSTANCE.getOr_RightOperand();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.EqualImpl <em>Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.EqualImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getEqual()
     * @generated
     */
    EClass EQUAL = eINSTANCE.getEqual();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUAL__LEFT_OPERAND = eINSTANCE.getEqual_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUAL__RIGHT_OPERAND = eINSTANCE.getEqual_RightOperand();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.NotEqualImpl <em>Not Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.NotEqualImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getNotEqual()
     * @generated
     */
    EClass NOT_EQUAL = eINSTANCE.getNotEqual();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT_EQUAL__LEFT_OPERAND = eINSTANCE.getNotEqual_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT_EQUAL__RIGHT_OPERAND = eINSTANCE.getNotEqual_RightOperand();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.StrictLowerImpl <em>Strict Lower</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.StrictLowerImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getStrictLower()
     * @generated
     */
    EClass STRICT_LOWER = eINSTANCE.getStrictLower();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRICT_LOWER__LEFT_OPERAND = eINSTANCE.getStrictLower_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRICT_LOWER__RIGHT_OPERAND = eINSTANCE.getStrictLower_RightOperand();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.LowerImpl <em>Lower</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.LowerImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getLower()
     * @generated
     */
    EClass LOWER = eINSTANCE.getLower();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOWER__LEFT_OPERAND = eINSTANCE.getLower_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOWER__RIGHT_OPERAND = eINSTANCE.getLower_RightOperand();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.StrictUpperImpl <em>Strict Upper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.StrictUpperImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getStrictUpper()
     * @generated
     */
    EClass STRICT_UPPER = eINSTANCE.getStrictUpper();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRICT_UPPER__LEFT_OPERAND = eINSTANCE.getStrictUpper_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRICT_UPPER__RIGHT_OPERAND = eINSTANCE.getStrictUpper_RightOperand();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.UpperImpl <em>Upper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.UpperImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getUpper()
     * @generated
     */
    EClass UPPER = eINSTANCE.getUpper();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPPER__LEFT_OPERAND = eINSTANCE.getUpper_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPPER__RIGHT_OPERAND = eINSTANCE.getUpper_RightOperand();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.ImplyImpl <em>Imply</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.ImplyImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getImply()
     * @generated
     */
    EClass IMPLY = eINSTANCE.getImply();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLY__LEFT_OPERAND = eINSTANCE.getImply_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLY__RIGHT_OPERAND = eINSTANCE.getImply_RightOperand();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.NestedQualifiedEventRefImpl <em>Nested Qualified Event Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.NestedQualifiedEventRefImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getNestedQualifiedEventRef()
     * @generated
     */
    EClass NESTED_QUALIFIED_EVENT_REF = eINSTANCE.getNestedQualifiedEventRef();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_QUALIFIED_EVENT_REF__TARGET = eINSTANCE.getNestedQualifiedEventRef_Target();

    /**
     * The meta object literal for the '<em><b>Nested Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_QUALIFIED_EVENT_REF__NESTED_VARIABLE = eINSTANCE.getNestedQualifiedEventRef_NestedVariable();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.impl.NestedQualifiedVariableRefImpl <em>Nested Qualified Variable Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.impl.NestedQualifiedVariableRefImpl
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getNestedQualifiedVariableRef()
     * @generated
     */
    EClass NESTED_QUALIFIED_VARIABLE_REF = eINSTANCE.getNestedQualifiedVariableRef();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_QUALIFIED_VARIABLE_REF__TARGET = eINSTANCE.getNestedQualifiedVariableRef_Target();

    /**
     * The meta object literal for the '<em><b>Nested Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_QUALIFIED_VARIABLE_REF__NESTED_VARIABLE = eINSTANCE.getNestedQualifiedVariableRef_NestedVariable();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.PrimitiveTypeKind <em>Primitive Type Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.PrimitiveTypeKind
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getPrimitiveTypeKind()
     * @generated
     */
    EEnum PRIMITIVE_TYPE_KIND = eINSTANCE.getPrimitiveTypeKind();

    /**
     * The meta object literal for the '{@link fr.onair.dsl.safety.altarica.altarica.FlowKind <em>Flow Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.onair.dsl.safety.altarica.altarica.FlowKind
     * @see fr.onair.dsl.safety.altarica.altarica.impl.AltaricaPackageImpl#getFlowKind()
     * @generated
     */
    EEnum FLOW_KIND = eINSTANCE.getFlowKind();

  }

} //AltaricaPackage
