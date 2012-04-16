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
 * A representation of the model object '<em><b>State Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.StateDeclaration#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.StateDeclaration#getDomain <em>Domain</em>}</li>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.StateDeclaration#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getStateDeclaration()
 * @model
 * @generated
 */
public interface StateDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned States</b></em>' containment reference list.
   * The list contents are of type {@link fr.onair.dsl.safety.altarica.altarica.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned States</em>' containment reference list.
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getStateDeclaration_OwnedStates()
   * @model containment="true"
   * @generated
   */
  EList<State> getOwnedStates();

  /**
   * Returns the value of the '<em><b>Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain</em>' containment reference.
   * @see #setDomain(AbstractTypeRef)
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getStateDeclaration_Domain()
   * @model containment="true"
   * @generated
   */
  AbstractTypeRef getDomain();

  /**
   * Sets the value of the '{@link fr.onair.dsl.safety.altarica.altarica.StateDeclaration#getDomain <em>Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain</em>' containment reference.
   * @see #getDomain()
   * @generated
   */
  void setDomain(AbstractTypeRef value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference.
   * @see #setAttribute(VariableAttribute)
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getStateDeclaration_Attribute()
   * @model containment="true"
   * @generated
   */
  VariableAttribute getAttribute();

  /**
   * Sets the value of the '{@link fr.onair.dsl.safety.altarica.altarica.StateDeclaration#getAttribute <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' containment reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(VariableAttribute value);

} // StateDeclaration
