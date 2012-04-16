/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.Switch#getOwnedCases <em>Owned Cases</em>}</li>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.Switch#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getSwitch()
 * @model
 * @generated
 */
public interface Switch extends AbstractExpression, AbstractBooleanExpression
{
  /**
   * Returns the value of the '<em><b>Owned Cases</b></em>' containment reference list.
   * The list contents are of type {@link fr.onair.dsl.safety.altarica.altarica.CaseExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Cases</em>' containment reference list.
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getSwitch_OwnedCases()
   * @model containment="true"
   * @generated
   */
  EList<CaseExpression> getOwnedCases();

  /**
   * Returns the value of the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' containment reference.
   * @see #setDefault(Expression)
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getSwitch_Default()
   * @model containment="true"
   * @generated
   */
  Expression getDefault();

  /**
   * Sets the value of the '{@link fr.onair.dsl.safety.altarica.altarica.Switch#getDefault <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' containment reference.
   * @see #getDefault()
   * @generated
   */
  void setDefault(Expression value);

} // Switch
