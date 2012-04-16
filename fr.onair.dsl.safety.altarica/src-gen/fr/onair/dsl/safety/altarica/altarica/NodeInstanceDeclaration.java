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
 * A representation of the model object '<em><b>Node Instance Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.NodeInstanceDeclaration#getOwnedNodeInstances <em>Owned Node Instances</em>}</li>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.NodeInstanceDeclaration#getNodeType <em>Node Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getNodeInstanceDeclaration()
 * @model
 * @generated
 */
public interface NodeInstanceDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Node Instances</b></em>' containment reference list.
   * The list contents are of type {@link fr.onair.dsl.safety.altarica.altarica.NodeInstance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Node Instances</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Node Instances</em>' containment reference list.
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getNodeInstanceDeclaration_OwnedNodeInstances()
   * @model containment="true"
   * @generated
   */
  EList<NodeInstance> getOwnedNodeInstances();

  /**
   * Returns the value of the '<em><b>Node Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Type</em>' reference.
   * @see #setNodeType(Node)
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getNodeInstanceDeclaration_NodeType()
   * @model
   * @generated
   */
  Node getNodeType();

  /**
   * Sets the value of the '{@link fr.onair.dsl.safety.altarica.altarica.NodeInstanceDeclaration#getNodeType <em>Node Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node Type</em>' reference.
   * @see #getNodeType()
   * @generated
   */
  void setNodeType(Node value);

} // NodeInstanceDeclaration
