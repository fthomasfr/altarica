/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Instance Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.NodeInstanceSpecification#getOwnedNodeInstanceDeclarations <em>Owned Node Instance Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getNodeInstanceSpecification()
 * @model
 * @generated
 */
public interface NodeInstanceSpecification extends AbstractSpecification
{
  /**
   * Returns the value of the '<em><b>Owned Node Instance Declarations</b></em>' containment reference list.
   * The list contents are of type {@link fr.onair.dsl.safety.altarica.altarica.NodeInstanceDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Node Instance Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Node Instance Declarations</em>' containment reference list.
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getNodeInstanceSpecification_OwnedNodeInstanceDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<NodeInstanceDeclaration> getOwnedNodeInstanceDeclarations();

} // NodeInstanceSpecification
