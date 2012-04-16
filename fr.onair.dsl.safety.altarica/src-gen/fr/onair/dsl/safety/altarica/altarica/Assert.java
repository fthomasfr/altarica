/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.Assert#getOwnedExpressions <em>Owned Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getAssert()
 * @model
 * @generated
 */
public interface Assert extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Expressions</b></em>' containment reference list.
   * The list contents are of type {@link fr.onair.dsl.safety.altarica.altarica.AbstractBooleanExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Expressions</em>' containment reference list.
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getAssert_OwnedExpressions()
   * @model containment="true"
   * @generated
   */
  EList<AbstractBooleanExpression> getOwnedExpressions();

} // Assert
