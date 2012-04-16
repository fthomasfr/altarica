/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.StateSpecification#getOwnedStateDeclarations <em>Owned State Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getStateSpecification()
 * @model
 * @generated
 */
public interface StateSpecification extends AbstractSpecification
{
  /**
   * Returns the value of the '<em><b>Owned State Declarations</b></em>' containment reference list.
   * The list contents are of type {@link fr.onair.dsl.safety.altarica.altarica.StateDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned State Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned State Declarations</em>' containment reference list.
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getStateSpecification_OwnedStateDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<StateDeclaration> getOwnedStateDeclarations();

} // StateSpecification
