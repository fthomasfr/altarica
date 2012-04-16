/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.ExternalDirective#getDirective <em>Directive</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getExternalDirective()
 * @model
 * @generated
 */
public interface ExternalDirective extends EObject
{
  /**
   * Returns the value of the '<em><b>Directive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Directive</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Directive</em>' attribute.
   * @see #setDirective(String)
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getExternalDirective_Directive()
   * @model
   * @generated
   */
  String getDirective();

  /**
   * Sets the value of the '{@link fr.onair.dsl.safety.altarica.altarica.ExternalDirective#getDirective <em>Directive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Directive</em>' attribute.
   * @see #getDirective()
   * @generated
   */
  void setDirective(String value);

} // ExternalDirective
