/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.ExternalSpecification#getOwnedDirectives <em>Owned Directives</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getExternalSpecification()
 * @model
 * @generated
 */
public interface ExternalSpecification extends AbstractSpecification
{
  /**
   * Returns the value of the '<em><b>Owned Directives</b></em>' containment reference list.
   * The list contents are of type {@link fr.onair.dsl.safety.altarica.altarica.ExternalDirective}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Directives</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Directives</em>' containment reference list.
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getExternalSpecification_OwnedDirectives()
   * @model containment="true"
   * @generated
   */
  EList<ExternalDirective> getOwnedDirectives();

} // ExternalSpecification
