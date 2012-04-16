/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.Event#getOwnedPriority <em>Owned Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends NavigableVariable
{
  /**
   * Returns the value of the '<em><b>Owned Priority</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Priority</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Priority</em>' containment reference.
   * @see #setOwnedPriority(Priority)
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getEvent_OwnedPriority()
   * @model containment="true"
   * @generated
   */
  Priority getOwnedPriority();

  /**
   * Sets the value of the '{@link fr.onair.dsl.safety.altarica.altarica.Event#getOwnedPriority <em>Owned Priority</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Priority</em>' containment reference.
   * @see #getOwnedPriority()
   * @generated
   */
  void setOwnedPriority(Priority value);

} // Event
