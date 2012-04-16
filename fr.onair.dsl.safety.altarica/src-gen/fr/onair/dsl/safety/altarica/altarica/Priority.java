/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Priority</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.Priority#getOwnedExpression <em>Owned Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getPriority()
 * @model
 * @generated
 */
public interface Priority extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Expression</em>' containment reference.
   * @see #setOwnedExpression(AbstractExpression)
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getPriority_OwnedExpression()
   * @model containment="true"
   * @generated
   */
  AbstractExpression getOwnedExpression();

  /**
   * Sets the value of the '{@link fr.onair.dsl.safety.altarica.altarica.Priority#getOwnedExpression <em>Owned Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Expression</em>' containment reference.
   * @see #getOwnedExpression()
   * @generated
   */
  void setOwnedExpression(AbstractExpression value);

} // Priority
