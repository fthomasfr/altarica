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
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.Transition#getOwnedExpresion <em>Owned Expresion</em>}</li>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.Transition#getEvent <em>Event</em>}</li>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.Transition#getOwnedAffectations <em>Owned Affectations</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Expresion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Expresion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Expresion</em>' containment reference.
   * @see #setOwnedExpresion(AbstractExpression)
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getTransition_OwnedExpresion()
   * @model containment="true"
   * @generated
   */
  AbstractExpression getOwnedExpresion();

  /**
   * Sets the value of the '{@link fr.onair.dsl.safety.altarica.altarica.Transition#getOwnedExpresion <em>Owned Expresion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Expresion</em>' containment reference.
   * @see #getOwnedExpresion()
   * @generated
   */
  void setOwnedExpresion(AbstractExpression value);

  /**
   * Returns the value of the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' reference.
   * @see #setEvent(Event)
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getTransition_Event()
   * @model
   * @generated
   */
  Event getEvent();

  /**
   * Sets the value of the '{@link fr.onair.dsl.safety.altarica.altarica.Transition#getEvent <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(Event value);

  /**
   * Returns the value of the '<em><b>Owned Affectations</b></em>' containment reference list.
   * The list contents are of type {@link fr.onair.dsl.safety.altarica.altarica.Affectation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Affectations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Affectations</em>' containment reference list.
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getTransition_OwnedAffectations()
   * @model containment="true"
   * @generated
   */
  EList<Affectation> getOwnedAffectations();

} // Transition
