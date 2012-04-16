/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.Enumeration#getOwnedLiterals <em>Owned Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends AbstractDomain
{
  /**
   * Returns the value of the '<em><b>Owned Literals</b></em>' containment reference list.
   * The list contents are of type {@link fr.onair.dsl.safety.altarica.altarica.Literal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Literals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Literals</em>' containment reference list.
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getEnumeration_OwnedLiterals()
   * @model containment="true"
   * @generated
   */
  EList<Literal> getOwnedLiterals();

} // Enumeration
