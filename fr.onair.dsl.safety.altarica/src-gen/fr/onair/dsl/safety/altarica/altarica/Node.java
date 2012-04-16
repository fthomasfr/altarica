/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.Node#isIsMain <em>Is Main</em>}</li>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.Node#getName <em>Name</em>}</li>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.Node#getOwnedSpecifications <em>Owned Specifications</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends AbstractDeclaration
{
  /**
   * Returns the value of the '<em><b>Is Main</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Main</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Main</em>' attribute.
   * @see #setIsMain(boolean)
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getNode_IsMain()
   * @model
   * @generated
   */
  boolean isIsMain();

  /**
   * Sets the value of the '{@link fr.onair.dsl.safety.altarica.altarica.Node#isIsMain <em>Is Main</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Main</em>' attribute.
   * @see #isIsMain()
   * @generated
   */
  void setIsMain(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getNode_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.onair.dsl.safety.altarica.altarica.Node#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Owned Specifications</b></em>' containment reference list.
   * The list contents are of type {@link fr.onair.dsl.safety.altarica.altarica.AbstractSpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Specifications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Specifications</em>' containment reference list.
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getNode_OwnedSpecifications()
   * @model containment="true"
   * @generated
   */
  EList<AbstractSpecification> getOwnedSpecifications();

} // Node
