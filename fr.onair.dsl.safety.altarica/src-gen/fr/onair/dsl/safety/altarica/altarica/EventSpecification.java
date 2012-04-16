/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.EventSpecification#getOwnedEventDeclarations <em>Owned Event Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getEventSpecification()
 * @model
 * @generated
 */
public interface EventSpecification extends AbstractSpecification
{
  /**
   * Returns the value of the '<em><b>Owned Event Declarations</b></em>' containment reference list.
   * The list contents are of type {@link fr.onair.dsl.safety.altarica.altarica.EventDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Event Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Event Declarations</em>' containment reference list.
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getEventSpecification_OwnedEventDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<EventDeclaration> getOwnedEventDeclarations();

} // EventSpecification
