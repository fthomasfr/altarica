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
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.System#getOwnedDeclarations <em>Owned Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Declarations</b></em>' containment reference list.
   * The list contents are of type {@link fr.onair.dsl.safety.altarica.altarica.AbstractDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Declarations</em>' containment reference list.
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getSystem_OwnedDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<AbstractDeclaration> getOwnedDeclarations();

} // System
