/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.AssertSpecification#getOwnedAsserts <em>Owned Asserts</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getAssertSpecification()
 * @model
 * @generated
 */
public interface AssertSpecification extends AbstractSpecification
{
  /**
   * Returns the value of the '<em><b>Owned Asserts</b></em>' containment reference list.
   * The list contents are of type {@link fr.onair.dsl.safety.altarica.altarica.Assert}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Asserts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Asserts</em>' containment reference list.
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getAssertSpecification_OwnedAsserts()
   * @model containment="true"
   * @generated
   */
  EList<Assert> getOwnedAsserts();

} // AssertSpecification
