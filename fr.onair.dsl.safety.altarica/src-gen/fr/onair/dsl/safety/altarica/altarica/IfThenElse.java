/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Then Else</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.IfThenElse#getCondition <em>Condition</em>}</li>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.IfThenElse#getThen <em>Then</em>}</li>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.IfThenElse#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getIfThenElse()
 * @model
 * @generated
 */
public interface IfThenElse extends AbstractExpression, AbstractBooleanExpression
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Expression)
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getIfThenElse_Condition()
   * @model containment="true"
   * @generated
   */
  Expression getCondition();

  /**
   * Sets the value of the '{@link fr.onair.dsl.safety.altarica.altarica.IfThenElse#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Expression value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(EObject)
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getIfThenElse_Then()
   * @model containment="true"
   * @generated
   */
  EObject getThen();

  /**
   * Sets the value of the '{@link fr.onair.dsl.safety.altarica.altarica.IfThenElse#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(EObject value);

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(EObject)
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getIfThenElse_Else()
   * @model containment="true"
   * @generated
   */
  EObject getElse();

  /**
   * Sets the value of the '{@link fr.onair.dsl.safety.altarica.altarica.IfThenElse#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(EObject value);

} // IfThenElse
