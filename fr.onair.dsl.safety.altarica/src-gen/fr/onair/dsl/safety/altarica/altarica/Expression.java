/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.Expression#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends AbstractExpression, AbstractBooleanExpression
{
  /**
   * Returns the value of the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operand</em>' containment reference.
   * @see #setOperand(Expression)
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getExpression_Operand()
   * @model containment="true"
   * @generated
   */
  Expression getOperand();

  /**
   * Sets the value of the '{@link fr.onair.dsl.safety.altarica.altarica.Expression#getOperand <em>Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operand</em>' containment reference.
   * @see #getOperand()
   * @generated
   */
  void setOperand(Expression value);

} // Expression
