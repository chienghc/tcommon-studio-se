/**
 */
package org.talend.testcontainer.core.testcontainer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.testcontainer.core.testcontainer.TestcontainerPackage
 * @generated
 */
public interface TestcontainerFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TestcontainerFactory eINSTANCE = org.talend.testcontainer.core.testcontainer.impl.TestcontainerFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Test Container</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Test Container</em>'.
     * @generated
     */
    TestContainer createTestContainer();

    /**
     * Returns a new object of class '<em>Test Container Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Test Container Node</em>'.
     * @generated
     */
    TestContainerNode createTestContainerNode();

    /**
     * Returns a new object of class '<em>Original Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Original Node</em>'.
     * @generated
     */
    OriginalNode createOriginalNode();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    TestcontainerPackage getTestcontainerPackage();

} //TestcontainerFactory
