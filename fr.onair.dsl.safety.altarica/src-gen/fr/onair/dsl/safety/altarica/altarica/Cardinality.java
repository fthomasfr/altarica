/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.Cardinality#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getCardinality()
 * @model
 * @generated
 */
public interface Cardinality extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(AbstractExpression)
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getCardinality_Expression()
   * @model containment="true"
   * @generated
   */
  AbstractExpression getExpression();

  /**
   * Sets the value of the '{@link fr.onair.dsl.safety.altarica.altarica.Cardinality#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(AbstractExpression value);

} // Cardinality
