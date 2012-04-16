/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.VectorSpecification#getOwnedVectors <em>Owned Vectors</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getVectorSpecification()
 * @model
 * @generated
 */
public interface VectorSpecification extends AbstractSpecification
{
  /**
   * Returns the value of the '<em><b>Owned Vectors</b></em>' containment reference list.
   * The list contents are of type {@link fr.onair.dsl.safety.altarica.altarica.Vector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Vectors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Vectors</em>' containment reference list.
   * @see fr.onair.dsl.safety.altarica.altarica.AltaricaPackage#getVectorSpecification_OwnedVectors()
   * @model containment="true"
   * @generated
   */
  EList<Vector> getOwnedVectors();

} // VectorSpecification
