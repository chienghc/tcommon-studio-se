/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.metadata.builder.connection;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.talend.cwm.relational.RelationalPackage;
import orgomg.cwm.objectmodel.core.CorePackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.talend.core.model.metadata.builder.connection.ConnectionFactory
 * @model kind="package"
 * @generated
 */
public interface ConnectionPackage extends EPackage {

    /**
     * The package name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "connection";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.talend.org/metadata/connection/2010";

    /**
     * The package namespace name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "TalendMetadata";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    ConnectionPackage eINSTANCE = org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.AbstractMetadataObjectImpl <em>Abstract Metadata Object</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.AbstractMetadataObjectImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getAbstractMetadataObject()
     * @generated
     */
    int ABSTRACT_METADATA_OBJECT = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__NAME = CorePackage.MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__SUPPLIER_DEPENDENCY = CorePackage.MODEL_ELEMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__DOCUMENT = CorePackage.MODEL_ELEMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__DESCRIPTION = CorePackage.MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__RESPONSIBLE_PARTY = CorePackage.MODEL_ELEMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__ELEMENT_NODE = CorePackage.MODEL_ELEMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__SET = CorePackage.MODEL_ELEMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__RENDERED_OBJECT = CorePackage.MODEL_ELEMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__VOCABULARY_ELEMENT = CorePackage.MODEL_ELEMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__MEASUREMENT = CorePackage.MODEL_ELEMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__CHANGE_REQUEST = CorePackage.MODEL_ELEMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__DASDL_PROPERTY = CorePackage.MODEL_ELEMENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__PROPERTIES = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__ID = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__COMMENT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__LABEL = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__READ_ONLY = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__SYNCHRONISED = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT__DIVERGENCY = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Abstract Metadata Object</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_METADATA_OBJECT_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.MetadataImpl <em>Metadata</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.MetadataImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getMetadata()
     * @generated
     */
    int METADATA = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA__NAME = ABSTRACT_METADATA_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA__VISIBILITY = ABSTRACT_METADATA_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA__CLIENT_DEPENDENCY = ABSTRACT_METADATA_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA__SUPPLIER_DEPENDENCY = ABSTRACT_METADATA_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA__CONSTRAINT = ABSTRACT_METADATA_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA__NAMESPACE = ABSTRACT_METADATA_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA__IMPORTER = ABSTRACT_METADATA_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA__STEREOTYPE = ABSTRACT_METADATA_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA__TAGGED_VALUE = ABSTRACT_METADATA_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA__DOCUMENT = ABSTRACT_METADATA_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA__DESCRIPTION = ABSTRACT_METADATA_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA__RESPONSIBLE_PARTY = ABSTRACT_METADATA_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA__ELEMENT_NODE = ABSTRACT_METADATA_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA__SET = ABSTRACT_METADATA_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA__RENDERED_OBJECT = ABSTRACT_METADATA_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA__VOCABULARY_ELEMENT = ABSTRACT_METADATA_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA__MEASUREMENT = ABSTRACT_METADATA_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA__CHANGE_REQUEST = ABSTRACT_METADATA_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA__DASDL_PROPERTY = ABSTRACT_METADATA_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA__PROPERTIES = ABSTRACT_METADATA_OBJECT__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA__ID = ABSTRACT_METADATA_OBJECT__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA__COMMENT = ABSTRACT_METADATA_OBJECT__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA__LABEL = ABSTRACT_METADATA_OBJECT__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA__READ_ONLY = ABSTRACT_METADATA_OBJECT__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA__SYNCHRONISED = ABSTRACT_METADATA_OBJECT__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA__DIVERGENCY = ABSTRACT_METADATA_OBJECT__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Connections</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA__CONNECTIONS = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Metadata</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_FEATURE_COUNT = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.ConnectionImpl <em>Connection</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getConnection()
     * @generated
     */
    int CONNECTION = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__NAME = ABSTRACT_METADATA_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__VISIBILITY = ABSTRACT_METADATA_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__CLIENT_DEPENDENCY = ABSTRACT_METADATA_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__SUPPLIER_DEPENDENCY = ABSTRACT_METADATA_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__CONSTRAINT = ABSTRACT_METADATA_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONNECTION__NAMESPACE = ABSTRACT_METADATA_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__IMPORTER = ABSTRACT_METADATA_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__STEREOTYPE = ABSTRACT_METADATA_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__TAGGED_VALUE = ABSTRACT_METADATA_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__DOCUMENT = ABSTRACT_METADATA_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONNECTION__DESCRIPTION = ABSTRACT_METADATA_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__RESPONSIBLE_PARTY = ABSTRACT_METADATA_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONNECTION__ELEMENT_NODE = ABSTRACT_METADATA_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__SET = ABSTRACT_METADATA_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__RENDERED_OBJECT = ABSTRACT_METADATA_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__VOCABULARY_ELEMENT = ABSTRACT_METADATA_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONNECTION__MEASUREMENT = ABSTRACT_METADATA_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONNECTION__CHANGE_REQUEST = ABSTRACT_METADATA_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONNECTION__DASDL_PROPERTY = ABSTRACT_METADATA_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__PROPERTIES = ABSTRACT_METADATA_OBJECT__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__ID = ABSTRACT_METADATA_OBJECT__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__COMMENT = ABSTRACT_METADATA_OBJECT__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__LABEL = ABSTRACT_METADATA_OBJECT__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__READ_ONLY = ABSTRACT_METADATA_OBJECT__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__SYNCHRONISED = ABSTRACT_METADATA_OBJECT__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__DIVERGENCY = ABSTRACT_METADATA_OBJECT__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__OWNED_ELEMENT = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__IMPORTED_ELEMENT = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONNECTION__DATA_MANAGER = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__PATHNAME = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONNECTION__MACHINE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__COMPONENT = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONNECTION__IS_CASE_SENSITIVE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__CLIENT_CONNECTION = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONNECTION__DATA_PACKAGE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__RESOURCE_CONNECTION = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__VERSION = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONNECTION__QUERIES = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__CONTEXT_MODE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION__CONTEXT_ID = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 14;

    /**
     * The number of structural features of the '<em>Connection</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONNECTION_FEATURE_COUNT = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 15;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.MetadataColumnImpl <em>Metadata Column</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.MetadataColumnImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getMetadataColumn()
     * @generated
     */
    int METADATA_COLUMN = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__NAME = ABSTRACT_METADATA_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__VISIBILITY = ABSTRACT_METADATA_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__CLIENT_DEPENDENCY = ABSTRACT_METADATA_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__SUPPLIER_DEPENDENCY = ABSTRACT_METADATA_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__CONSTRAINT = ABSTRACT_METADATA_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__NAMESPACE = ABSTRACT_METADATA_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__IMPORTER = ABSTRACT_METADATA_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__STEREOTYPE = ABSTRACT_METADATA_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__TAGGED_VALUE = ABSTRACT_METADATA_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__DOCUMENT = ABSTRACT_METADATA_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__DESCRIPTION = ABSTRACT_METADATA_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__RESPONSIBLE_PARTY = ABSTRACT_METADATA_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__ELEMENT_NODE = ABSTRACT_METADATA_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__SET = ABSTRACT_METADATA_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__RENDERED_OBJECT = ABSTRACT_METADATA_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__VOCABULARY_ELEMENT = ABSTRACT_METADATA_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__MEASUREMENT = ABSTRACT_METADATA_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__CHANGE_REQUEST = ABSTRACT_METADATA_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__DASDL_PROPERTY = ABSTRACT_METADATA_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__PROPERTIES = ABSTRACT_METADATA_OBJECT__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__ID = ABSTRACT_METADATA_OBJECT__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__COMMENT = ABSTRACT_METADATA_OBJECT__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__LABEL = ABSTRACT_METADATA_OBJECT__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__READ_ONLY = ABSTRACT_METADATA_OBJECT__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__SYNCHRONISED = ABSTRACT_METADATA_OBJECT__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__DIVERGENCY = ABSTRACT_METADATA_OBJECT__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__OWNER_SCOPE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__OWNER = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__FEATURE_NODE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__FEATURE_MAP = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__CF_MAP = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__CHANGEABILITY = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__MULTIPLICITY = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__ORDERING = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__TARGET_SCOPE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__TYPE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__SLOT = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__DISCRIMINATED_UNION = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__INDEXED_FEATURE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__KEY_RELATIONSHIP = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__UNIQUE_KEY = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__DATA_ITEM = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__REMAP = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__INITIAL_VALUE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__LENGTH = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Precision</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__PRECISION = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>Scale</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__SCALE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 20;

    /**
     * The feature id for the '<em><b>Source Type</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__SOURCE_TYPE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 21;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__DEFAULT_VALUE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 22;

    /**
     * The feature id for the '<em><b>Talend Type</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__TALEND_TYPE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 23;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__KEY = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 24;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__NULLABLE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 25;

    /**
     * The feature id for the '<em><b>Table</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__TABLE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 26;

    /**
     * The feature id for the '<em><b>Original Field</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__ORIGINAL_FIELD = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 27;

    /**
     * The feature id for the '<em><b>Pattern</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__PATTERN = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 28;

    /**
     * The feature id for the '<em><b>Display Field</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__DISPLAY_FIELD = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 29;

    /**
     * The feature id for the '<em><b>Related Entity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__RELATED_ENTITY = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 30;

    /**
     * The feature id for the '<em><b>Relationship Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN__RELATIONSHIP_TYPE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 31;

    /**
     * The number of structural features of the '<em>Metadata Column</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_COLUMN_FEATURE_COUNT = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 32;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.MetadataTableImpl <em>Metadata Table</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.MetadataTableImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getMetadataTable()
     * @generated
     */
    int METADATA_TABLE = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__NAME = ABSTRACT_METADATA_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__VISIBILITY = ABSTRACT_METADATA_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__CLIENT_DEPENDENCY = ABSTRACT_METADATA_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__SUPPLIER_DEPENDENCY = ABSTRACT_METADATA_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__CONSTRAINT = ABSTRACT_METADATA_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA_TABLE__NAMESPACE = ABSTRACT_METADATA_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__IMPORTER = ABSTRACT_METADATA_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__STEREOTYPE = ABSTRACT_METADATA_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__TAGGED_VALUE = ABSTRACT_METADATA_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__DOCUMENT = ABSTRACT_METADATA_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA_TABLE__DESCRIPTION = ABSTRACT_METADATA_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__RESPONSIBLE_PARTY = ABSTRACT_METADATA_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA_TABLE__ELEMENT_NODE = ABSTRACT_METADATA_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__SET = ABSTRACT_METADATA_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__RENDERED_OBJECT = ABSTRACT_METADATA_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__VOCABULARY_ELEMENT = ABSTRACT_METADATA_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA_TABLE__MEASUREMENT = ABSTRACT_METADATA_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA_TABLE__CHANGE_REQUEST = ABSTRACT_METADATA_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA_TABLE__DASDL_PROPERTY = ABSTRACT_METADATA_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__PROPERTIES = ABSTRACT_METADATA_OBJECT__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__ID = ABSTRACT_METADATA_OBJECT__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__COMMENT = ABSTRACT_METADATA_OBJECT__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__LABEL = ABSTRACT_METADATA_OBJECT__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__READ_ONLY = ABSTRACT_METADATA_OBJECT__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__SYNCHRONISED = ABSTRACT_METADATA_OBJECT__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__DIVERGENCY = ABSTRACT_METADATA_OBJECT__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__OWNED_ELEMENT = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__IS_ABSTRACT = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__FEATURE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__STRUCTURAL_FEATURE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__PARAMETER = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA_TABLE__GENERALIZATION = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA_TABLE__SPECIALIZATION = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__INSTANCE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__ALIAS = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__EXPRESSION_NODE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA_TABLE__MAPPING_FROM = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__MAPPING_TO = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int METADATA_TABLE__CLASSIFIER_MAP = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__CF_MAP = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__DOMAIN = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__SIMPLE_DIMENSION = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__INDEX = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Source Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__SOURCE_NAME = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Table Type</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__TABLE_TYPE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Attached CDC</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__ATTACHED_CDC = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>Activated CDC</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__ACTIVATED_CDC = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 20;

    /**
     * The feature id for the '<em><b>Columns</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__COLUMNS = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 21;

    /**
     * The feature id for the '<em><b>Connection</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE__CONNECTION = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 22;

    /**
     * The number of structural features of the '<em>Metadata Table</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TABLE_FEATURE_COUNT = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 23;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.FileConnectionImpl <em>File Connection</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.FileConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getFileConnection()
     * @generated
     */
    int FILE_CONNECTION = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__NAME = CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__VISIBILITY = CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__CLIENT_DEPENDENCY = CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__SUPPLIER_DEPENDENCY = CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__CONSTRAINT = CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__NAMESPACE = CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__IMPORTER = CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__STEREOTYPE = CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__TAGGED_VALUE = CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__DOCUMENT = CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__DESCRIPTION = CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__RESPONSIBLE_PARTY = CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__ELEMENT_NODE = CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__SET = CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__RENDERED_OBJECT = CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__VOCABULARY_ELEMENT = CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__MEASUREMENT = CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__CHANGE_REQUEST = CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__DASDL_PROPERTY = CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__PROPERTIES = CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__ID = CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__COMMENT = CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__LABEL = CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__READ_ONLY = CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__SYNCHRONISED = CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__DIVERGENCY = CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__OWNED_ELEMENT = CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__IMPORTED_ELEMENT = CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__DATA_MANAGER = CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__PATHNAME = CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__MACHINE = CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__COMPONENT = CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__IS_CASE_SENSITIVE = CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__CLIENT_CONNECTION = CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__DATA_PACKAGE = CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__RESOURCE_CONNECTION = CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__VERSION = CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__QUERIES = CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__CONTEXT_MODE = CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__CONTEXT_ID = CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Server</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__SERVER = CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>File Path</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__FILE_PATH = CONNECTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Format</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__FORMAT = CONNECTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Encoding</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__ENCODING = CONNECTION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Field Separator Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__FIELD_SEPARATOR_VALUE = CONNECTION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Row Separator Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__ROW_SEPARATOR_TYPE = CONNECTION_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Row Separator Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__ROW_SEPARATOR_VALUE = CONNECTION_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Text Identifier</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__TEXT_IDENTIFIER = CONNECTION_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Use Header</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__USE_HEADER = CONNECTION_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Header Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__HEADER_VALUE = CONNECTION_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Use Footer</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__USE_FOOTER = CONNECTION_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Footer Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__FOOTER_VALUE = CONNECTION_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Use Limit</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__USE_LIMIT = CONNECTION_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Limit Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__LIMIT_VALUE = CONNECTION_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>First Line Caption</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__FIRST_LINE_CAPTION = CONNECTION_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Remove Empty Row</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__REMOVE_EMPTY_ROW = CONNECTION_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Escape Type</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__ESCAPE_TYPE = CONNECTION_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Escape Char</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__ESCAPE_CHAR = CONNECTION_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Text Enclosure</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__TEXT_ENCLOSURE = CONNECTION_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Csv Option</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION__CSV_OPTION = CONNECTION_FEATURE_COUNT + 19;

    /**
     * The number of structural features of the '<em>File Connection</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 20;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.DelimitedFileConnectionImpl <em>Delimited File Connection</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.DelimitedFileConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getDelimitedFileConnection()
     * @generated
     */
    int DELIMITED_FILE_CONNECTION = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__NAME = FILE_CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__VISIBILITY = FILE_CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__CLIENT_DEPENDENCY = FILE_CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__SUPPLIER_DEPENDENCY = FILE_CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__CONSTRAINT = FILE_CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__NAMESPACE = FILE_CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__IMPORTER = FILE_CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__STEREOTYPE = FILE_CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__TAGGED_VALUE = FILE_CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__DOCUMENT = FILE_CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__DESCRIPTION = FILE_CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__RESPONSIBLE_PARTY = FILE_CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__ELEMENT_NODE = FILE_CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__SET = FILE_CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__RENDERED_OBJECT = FILE_CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__VOCABULARY_ELEMENT = FILE_CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__MEASUREMENT = FILE_CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__CHANGE_REQUEST = FILE_CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__DASDL_PROPERTY = FILE_CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__PROPERTIES = FILE_CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__ID = FILE_CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__COMMENT = FILE_CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__LABEL = FILE_CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__READ_ONLY = FILE_CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__SYNCHRONISED = FILE_CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__DIVERGENCY = FILE_CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__OWNED_ELEMENT = FILE_CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__IMPORTED_ELEMENT = FILE_CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__DATA_MANAGER = FILE_CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__PATHNAME = FILE_CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__MACHINE = FILE_CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = FILE_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__COMPONENT = FILE_CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__IS_CASE_SENSITIVE = FILE_CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__CLIENT_CONNECTION = FILE_CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__DATA_PACKAGE = FILE_CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__RESOURCE_CONNECTION = FILE_CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__VERSION = FILE_CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__QUERIES = FILE_CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__CONTEXT_MODE = FILE_CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__CONTEXT_ID = FILE_CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Server</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__SERVER = FILE_CONNECTION__SERVER;

    /**
     * The feature id for the '<em><b>File Path</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__FILE_PATH = FILE_CONNECTION__FILE_PATH;

    /**
     * The feature id for the '<em><b>Format</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__FORMAT = FILE_CONNECTION__FORMAT;

    /**
     * The feature id for the '<em><b>Encoding</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__ENCODING = FILE_CONNECTION__ENCODING;

    /**
     * The feature id for the '<em><b>Field Separator Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__FIELD_SEPARATOR_VALUE = FILE_CONNECTION__FIELD_SEPARATOR_VALUE;

    /**
     * The feature id for the '<em><b>Row Separator Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__ROW_SEPARATOR_TYPE = FILE_CONNECTION__ROW_SEPARATOR_TYPE;

    /**
     * The feature id for the '<em><b>Row Separator Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__ROW_SEPARATOR_VALUE = FILE_CONNECTION__ROW_SEPARATOR_VALUE;

    /**
     * The feature id for the '<em><b>Text Identifier</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__TEXT_IDENTIFIER = FILE_CONNECTION__TEXT_IDENTIFIER;

    /**
     * The feature id for the '<em><b>Use Header</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__USE_HEADER = FILE_CONNECTION__USE_HEADER;

    /**
     * The feature id for the '<em><b>Header Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__HEADER_VALUE = FILE_CONNECTION__HEADER_VALUE;

    /**
     * The feature id for the '<em><b>Use Footer</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__USE_FOOTER = FILE_CONNECTION__USE_FOOTER;

    /**
     * The feature id for the '<em><b>Footer Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__FOOTER_VALUE = FILE_CONNECTION__FOOTER_VALUE;

    /**
     * The feature id for the '<em><b>Use Limit</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__USE_LIMIT = FILE_CONNECTION__USE_LIMIT;

    /**
     * The feature id for the '<em><b>Limit Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__LIMIT_VALUE = FILE_CONNECTION__LIMIT_VALUE;

    /**
     * The feature id for the '<em><b>First Line Caption</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__FIRST_LINE_CAPTION = FILE_CONNECTION__FIRST_LINE_CAPTION;

    /**
     * The feature id for the '<em><b>Remove Empty Row</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__REMOVE_EMPTY_ROW = FILE_CONNECTION__REMOVE_EMPTY_ROW;

    /**
     * The feature id for the '<em><b>Escape Type</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__ESCAPE_TYPE = FILE_CONNECTION__ESCAPE_TYPE;

    /**
     * The feature id for the '<em><b>Escape Char</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__ESCAPE_CHAR = FILE_CONNECTION__ESCAPE_CHAR;

    /**
     * The feature id for the '<em><b>Text Enclosure</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__TEXT_ENCLOSURE = FILE_CONNECTION__TEXT_ENCLOSURE;

    /**
     * The feature id for the '<em><b>Csv Option</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__CSV_OPTION = FILE_CONNECTION__CSV_OPTION;

    /**
     * The feature id for the '<em><b>Field Separator Type</b></em>' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__FIELD_SEPARATOR_TYPE = FILE_CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Split Record</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION__SPLIT_RECORD = FILE_CONNECTION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Delimited File Connection</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIMITED_FILE_CONNECTION_FEATURE_COUNT = FILE_CONNECTION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.PositionalFileConnectionImpl <em>Positional File Connection</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.PositionalFileConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getPositionalFileConnection()
     * @generated
     */
    int POSITIONAL_FILE_CONNECTION = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__NAME = FILE_CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__VISIBILITY = FILE_CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__CLIENT_DEPENDENCY = FILE_CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__SUPPLIER_DEPENDENCY = FILE_CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__CONSTRAINT = FILE_CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__NAMESPACE = FILE_CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__IMPORTER = FILE_CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__STEREOTYPE = FILE_CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__TAGGED_VALUE = FILE_CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__DOCUMENT = FILE_CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__DESCRIPTION = FILE_CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__RESPONSIBLE_PARTY = FILE_CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__ELEMENT_NODE = FILE_CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__SET = FILE_CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__RENDERED_OBJECT = FILE_CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__VOCABULARY_ELEMENT = FILE_CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__MEASUREMENT = FILE_CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__CHANGE_REQUEST = FILE_CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__DASDL_PROPERTY = FILE_CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__PROPERTIES = FILE_CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__ID = FILE_CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__COMMENT = FILE_CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__LABEL = FILE_CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__READ_ONLY = FILE_CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__SYNCHRONISED = FILE_CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__DIVERGENCY = FILE_CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__OWNED_ELEMENT = FILE_CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__IMPORTED_ELEMENT = FILE_CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__DATA_MANAGER = FILE_CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__PATHNAME = FILE_CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__MACHINE = FILE_CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = FILE_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__COMPONENT = FILE_CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__IS_CASE_SENSITIVE = FILE_CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__CLIENT_CONNECTION = FILE_CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__DATA_PACKAGE = FILE_CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__RESOURCE_CONNECTION = FILE_CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__VERSION = FILE_CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__QUERIES = FILE_CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__CONTEXT_MODE = FILE_CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__CONTEXT_ID = FILE_CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Server</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__SERVER = FILE_CONNECTION__SERVER;

    /**
     * The feature id for the '<em><b>File Path</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__FILE_PATH = FILE_CONNECTION__FILE_PATH;

    /**
     * The feature id for the '<em><b>Format</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__FORMAT = FILE_CONNECTION__FORMAT;

    /**
     * The feature id for the '<em><b>Encoding</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__ENCODING = FILE_CONNECTION__ENCODING;

    /**
     * The feature id for the '<em><b>Field Separator Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__FIELD_SEPARATOR_VALUE = FILE_CONNECTION__FIELD_SEPARATOR_VALUE;

    /**
     * The feature id for the '<em><b>Row Separator Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__ROW_SEPARATOR_TYPE = FILE_CONNECTION__ROW_SEPARATOR_TYPE;

    /**
     * The feature id for the '<em><b>Row Separator Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__ROW_SEPARATOR_VALUE = FILE_CONNECTION__ROW_SEPARATOR_VALUE;

    /**
     * The feature id for the '<em><b>Text Identifier</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__TEXT_IDENTIFIER = FILE_CONNECTION__TEXT_IDENTIFIER;

    /**
     * The feature id for the '<em><b>Use Header</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__USE_HEADER = FILE_CONNECTION__USE_HEADER;

    /**
     * The feature id for the '<em><b>Header Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__HEADER_VALUE = FILE_CONNECTION__HEADER_VALUE;

    /**
     * The feature id for the '<em><b>Use Footer</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__USE_FOOTER = FILE_CONNECTION__USE_FOOTER;

    /**
     * The feature id for the '<em><b>Footer Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__FOOTER_VALUE = FILE_CONNECTION__FOOTER_VALUE;

    /**
     * The feature id for the '<em><b>Use Limit</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__USE_LIMIT = FILE_CONNECTION__USE_LIMIT;

    /**
     * The feature id for the '<em><b>Limit Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__LIMIT_VALUE = FILE_CONNECTION__LIMIT_VALUE;

    /**
     * The feature id for the '<em><b>First Line Caption</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__FIRST_LINE_CAPTION = FILE_CONNECTION__FIRST_LINE_CAPTION;

    /**
     * The feature id for the '<em><b>Remove Empty Row</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__REMOVE_EMPTY_ROW = FILE_CONNECTION__REMOVE_EMPTY_ROW;

    /**
     * The feature id for the '<em><b>Escape Type</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__ESCAPE_TYPE = FILE_CONNECTION__ESCAPE_TYPE;

    /**
     * The feature id for the '<em><b>Escape Char</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__ESCAPE_CHAR = FILE_CONNECTION__ESCAPE_CHAR;

    /**
     * The feature id for the '<em><b>Text Enclosure</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__TEXT_ENCLOSURE = FILE_CONNECTION__TEXT_ENCLOSURE;

    /**
     * The feature id for the '<em><b>Csv Option</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION__CSV_OPTION = FILE_CONNECTION__CSV_OPTION;

    /**
     * The number of structural features of the '<em>Positional File Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIONAL_FILE_CONNECTION_FEATURE_COUNT = FILE_CONNECTION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.EbcdicConnectionImpl <em>Ebcdic Connection</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.EbcdicConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getEbcdicConnection()
     * @generated
     */
    int EBCDIC_CONNECTION = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__NAME = FILE_CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__VISIBILITY = FILE_CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__CLIENT_DEPENDENCY = FILE_CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__SUPPLIER_DEPENDENCY = FILE_CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__CONSTRAINT = FILE_CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__NAMESPACE = FILE_CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__IMPORTER = FILE_CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__STEREOTYPE = FILE_CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__TAGGED_VALUE = FILE_CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__DOCUMENT = FILE_CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__DESCRIPTION = FILE_CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__RESPONSIBLE_PARTY = FILE_CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__ELEMENT_NODE = FILE_CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__SET = FILE_CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__RENDERED_OBJECT = FILE_CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__VOCABULARY_ELEMENT = FILE_CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__MEASUREMENT = FILE_CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__CHANGE_REQUEST = FILE_CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__DASDL_PROPERTY = FILE_CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__PROPERTIES = FILE_CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__ID = FILE_CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__COMMENT = FILE_CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__LABEL = FILE_CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__READ_ONLY = FILE_CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__SYNCHRONISED = FILE_CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__DIVERGENCY = FILE_CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__OWNED_ELEMENT = FILE_CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__IMPORTED_ELEMENT = FILE_CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__DATA_MANAGER = FILE_CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__PATHNAME = FILE_CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__MACHINE = FILE_CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = FILE_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__COMPONENT = FILE_CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__IS_CASE_SENSITIVE = FILE_CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__CLIENT_CONNECTION = FILE_CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__DATA_PACKAGE = FILE_CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__RESOURCE_CONNECTION = FILE_CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__VERSION = FILE_CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__QUERIES = FILE_CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__CONTEXT_MODE = FILE_CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__CONTEXT_ID = FILE_CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Server</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__SERVER = FILE_CONNECTION__SERVER;

    /**
     * The feature id for the '<em><b>File Path</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__FILE_PATH = FILE_CONNECTION__FILE_PATH;

    /**
     * The feature id for the '<em><b>Format</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__FORMAT = FILE_CONNECTION__FORMAT;

    /**
     * The feature id for the '<em><b>Encoding</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__ENCODING = FILE_CONNECTION__ENCODING;

    /**
     * The feature id for the '<em><b>Field Separator Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__FIELD_SEPARATOR_VALUE = FILE_CONNECTION__FIELD_SEPARATOR_VALUE;

    /**
     * The feature id for the '<em><b>Row Separator Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__ROW_SEPARATOR_TYPE = FILE_CONNECTION__ROW_SEPARATOR_TYPE;

    /**
     * The feature id for the '<em><b>Row Separator Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__ROW_SEPARATOR_VALUE = FILE_CONNECTION__ROW_SEPARATOR_VALUE;

    /**
     * The feature id for the '<em><b>Text Identifier</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__TEXT_IDENTIFIER = FILE_CONNECTION__TEXT_IDENTIFIER;

    /**
     * The feature id for the '<em><b>Use Header</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__USE_HEADER = FILE_CONNECTION__USE_HEADER;

    /**
     * The feature id for the '<em><b>Header Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__HEADER_VALUE = FILE_CONNECTION__HEADER_VALUE;

    /**
     * The feature id for the '<em><b>Use Footer</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__USE_FOOTER = FILE_CONNECTION__USE_FOOTER;

    /**
     * The feature id for the '<em><b>Footer Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__FOOTER_VALUE = FILE_CONNECTION__FOOTER_VALUE;

    /**
     * The feature id for the '<em><b>Use Limit</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__USE_LIMIT = FILE_CONNECTION__USE_LIMIT;

    /**
     * The feature id for the '<em><b>Limit Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__LIMIT_VALUE = FILE_CONNECTION__LIMIT_VALUE;

    /**
     * The feature id for the '<em><b>First Line Caption</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__FIRST_LINE_CAPTION = FILE_CONNECTION__FIRST_LINE_CAPTION;

    /**
     * The feature id for the '<em><b>Remove Empty Row</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__REMOVE_EMPTY_ROW = FILE_CONNECTION__REMOVE_EMPTY_ROW;

    /**
     * The feature id for the '<em><b>Escape Type</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__ESCAPE_TYPE = FILE_CONNECTION__ESCAPE_TYPE;

    /**
     * The feature id for the '<em><b>Escape Char</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__ESCAPE_CHAR = FILE_CONNECTION__ESCAPE_CHAR;

    /**
     * The feature id for the '<em><b>Text Enclosure</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__TEXT_ENCLOSURE = FILE_CONNECTION__TEXT_ENCLOSURE;

    /**
     * The feature id for the '<em><b>Csv Option</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__CSV_OPTION = FILE_CONNECTION__CSV_OPTION;

    /**
     * The feature id for the '<em><b>Mid File</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__MID_FILE = FILE_CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data File</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION__DATA_FILE = FILE_CONNECTION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Ebcdic Connection</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int EBCDIC_CONNECTION_FEATURE_COUNT = FILE_CONNECTION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.MDMConnectionImpl <em>MDM Connection</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.MDMConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getMDMConnection()
     * @generated
     */
    int MDM_CONNECTION = 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__NAME = CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__VISIBILITY = CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__CLIENT_DEPENDENCY = CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__SUPPLIER_DEPENDENCY = CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__CONSTRAINT = CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__NAMESPACE = CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__IMPORTER = CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__STEREOTYPE = CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__TAGGED_VALUE = CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__DOCUMENT = CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__DESCRIPTION = CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__RESPONSIBLE_PARTY = CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__ELEMENT_NODE = CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__SET = CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__RENDERED_OBJECT = CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__VOCABULARY_ELEMENT = CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__MEASUREMENT = CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__CHANGE_REQUEST = CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__DASDL_PROPERTY = CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__PROPERTIES = CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__ID = CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__COMMENT = CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__LABEL = CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__READ_ONLY = CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__SYNCHRONISED = CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__DIVERGENCY = CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__OWNED_ELEMENT = CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__IMPORTED_ELEMENT = CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__DATA_MANAGER = CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__PATHNAME = CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__MACHINE = CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__COMPONENT = CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__IS_CASE_SENSITIVE = CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__CLIENT_CONNECTION = CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__DATA_PACKAGE = CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__RESOURCE_CONNECTION = CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__VERSION = CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__QUERIES = CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__CONTEXT_MODE = CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__CONTEXT_ID = CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__USERNAME = CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__PASSWORD = CONNECTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__PORT = CONNECTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Server</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__SERVER = CONNECTION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Universe</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__UNIVERSE = CONNECTION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Datamodel</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__DATAMODEL = CONNECTION_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Datacluster</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__DATACLUSTER = CONNECTION_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Schemas</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__SCHEMAS = CONNECTION_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Protocol</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__PROTOCOL = CONNECTION_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Context</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION__CONTEXT = CONNECTION_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>MDM Connection</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 10;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.DatabaseConnectionImpl <em>Database Connection</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.DatabaseConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getDatabaseConnection()
     * @generated
     */
    int DATABASE_CONNECTION = 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__NAME = CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__VISIBILITY = CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__CLIENT_DEPENDENCY = CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__SUPPLIER_DEPENDENCY = CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__CONSTRAINT = CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__NAMESPACE = CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__IMPORTER = CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__STEREOTYPE = CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__TAGGED_VALUE = CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__DOCUMENT = CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__DESCRIPTION = CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__RESPONSIBLE_PARTY = CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__ELEMENT_NODE = CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__SET = CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__RENDERED_OBJECT = CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__VOCABULARY_ELEMENT = CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__MEASUREMENT = CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__CHANGE_REQUEST = CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__DASDL_PROPERTY = CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__PROPERTIES = CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__ID = CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__COMMENT = CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__LABEL = CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__READ_ONLY = CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__SYNCHRONISED = CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__DIVERGENCY = CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__OWNED_ELEMENT = CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__IMPORTED_ELEMENT = CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__DATA_MANAGER = CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__PATHNAME = CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__MACHINE = CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__COMPONENT = CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__IS_CASE_SENSITIVE = CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__CLIENT_CONNECTION = CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__DATA_PACKAGE = CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__RESOURCE_CONNECTION = CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__VERSION = CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__QUERIES = CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__CONTEXT_MODE = CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__CONTEXT_ID = CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Database Type</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__DATABASE_TYPE = CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Driver Jar Path</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__DRIVER_JAR_PATH = CONNECTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Driver Class</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__DRIVER_CLASS = CONNECTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>URL</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__URL = CONNECTION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Db Version String</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__DB_VERSION_STRING = CONNECTION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__PORT = CONNECTION_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__USERNAME = CONNECTION_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__PASSWORD = CONNECTION_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Server Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__SERVER_NAME = CONNECTION_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Datasource Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__DATASOURCE_NAME = CONNECTION_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>File Field Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__FILE_FIELD_NAME = CONNECTION_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>SID</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__SID = CONNECTION_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Sql Synthax</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__SQL_SYNTHAX = CONNECTION_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>String Quote</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__STRING_QUOTE = CONNECTION_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Null Char</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__NULL_CHAR = CONNECTION_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Dbms Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__DBMS_ID = CONNECTION_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Product Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__PRODUCT_ID = CONNECTION_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>DB Root Path</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__DB_ROOT_PATH = CONNECTION_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Additional Params</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__ADDITIONAL_PARAMS = CONNECTION_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Standard SQL</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__STANDARD_SQL = CONNECTION_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>System SQL</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__SYSTEM_SQL = CONNECTION_FEATURE_COUNT + 20;

    /**
     * The feature id for the '<em><b>Cdc Conns</b></em>' containment reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__CDC_CONNS = CONNECTION_FEATURE_COUNT + 21;

    /**
     * The feature id for the '<em><b>Cdc Type Mode</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__CDC_TYPE_MODE = CONNECTION_FEATURE_COUNT + 22;

    /**
     * The feature id for the '<em><b>SQL Mode</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__SQL_MODE = CONNECTION_FEATURE_COUNT + 23;

    /**
     * The feature id for the '<em><b>Ui Schema</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION__UI_SCHEMA = CONNECTION_FEATURE_COUNT + 24;

    /**
     * The number of structural features of the '<em>Database Connection</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 25;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.SAPConnectionImpl <em>SAP Connection</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.SAPConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getSAPConnection()
     * @generated
     */
    int SAP_CONNECTION = 11;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__NAME = CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__VISIBILITY = CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__CLIENT_DEPENDENCY = CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__SUPPLIER_DEPENDENCY = CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__CONSTRAINT = CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__NAMESPACE = CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__IMPORTER = CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__STEREOTYPE = CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__TAGGED_VALUE = CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__DOCUMENT = CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__DESCRIPTION = CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__RESPONSIBLE_PARTY = CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__ELEMENT_NODE = CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__SET = CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__RENDERED_OBJECT = CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__VOCABULARY_ELEMENT = CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__MEASUREMENT = CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__CHANGE_REQUEST = CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__DASDL_PROPERTY = CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__PROPERTIES = CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__ID = CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__COMMENT = CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__LABEL = CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__READ_ONLY = CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__SYNCHRONISED = CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__DIVERGENCY = CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__OWNED_ELEMENT = CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__IMPORTED_ELEMENT = CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__DATA_MANAGER = CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__PATHNAME = CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__MACHINE = CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__COMPONENT = CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__IS_CASE_SENSITIVE = CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__CLIENT_CONNECTION = CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__DATA_PACKAGE = CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__RESOURCE_CONNECTION = CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__VERSION = CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__QUERIES = CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__CONTEXT_MODE = CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__CONTEXT_ID = CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__HOST = CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__USERNAME = CONNECTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__PASSWORD = CONNECTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Client</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__CLIENT = CONNECTION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>System Number</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__SYSTEM_NUMBER = CONNECTION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Language</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__LANGUAGE = CONNECTION_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Funtions</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__FUNTIONS = CONNECTION_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Current Fucntion</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__CURRENT_FUCNTION = CONNECTION_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>IDocs</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__IDOCS = CONNECTION_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Jco Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION__JCO_VERSION = CONNECTION_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>SAP Connection</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 10;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.SAPFunctionUnitImpl <em>SAP Function Unit</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.SAPFunctionUnitImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getSAPFunctionUnit()
     * @generated
     */
    int SAP_FUNCTION_UNIT = 12;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__NAME = ABSTRACT_METADATA_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__VISIBILITY = ABSTRACT_METADATA_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__CLIENT_DEPENDENCY = ABSTRACT_METADATA_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__SUPPLIER_DEPENDENCY = ABSTRACT_METADATA_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__CONSTRAINT = ABSTRACT_METADATA_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__NAMESPACE = ABSTRACT_METADATA_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__IMPORTER = ABSTRACT_METADATA_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__STEREOTYPE = ABSTRACT_METADATA_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__TAGGED_VALUE = ABSTRACT_METADATA_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__DOCUMENT = ABSTRACT_METADATA_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__DESCRIPTION = ABSTRACT_METADATA_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__RESPONSIBLE_PARTY = ABSTRACT_METADATA_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__ELEMENT_NODE = ABSTRACT_METADATA_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__SET = ABSTRACT_METADATA_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__RENDERED_OBJECT = ABSTRACT_METADATA_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__VOCABULARY_ELEMENT = ABSTRACT_METADATA_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__MEASUREMENT = ABSTRACT_METADATA_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__CHANGE_REQUEST = ABSTRACT_METADATA_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__DASDL_PROPERTY = ABSTRACT_METADATA_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__PROPERTIES = ABSTRACT_METADATA_OBJECT__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__ID = ABSTRACT_METADATA_OBJECT__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__COMMENT = ABSTRACT_METADATA_OBJECT__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__LABEL = ABSTRACT_METADATA_OBJECT__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__READ_ONLY = ABSTRACT_METADATA_OBJECT__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__SYNCHRONISED = ABSTRACT_METADATA_OBJECT__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__DIVERGENCY = ABSTRACT_METADATA_OBJECT__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Output Type</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__OUTPUT_TYPE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Output Table Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__OUTPUT_TABLE_NAME = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Input Parameter Table</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__INPUT_PARAMETER_TABLE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Output Parameter Table</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__OUTPUT_PARAMETER_TABLE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Metadata Table</b></em>' containment reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__METADATA_TABLE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Connection</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__CONNECTION = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Tables</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__TABLES = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Test Input Parameter Table</b></em>' containment reference.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT__TEST_INPUT_PARAMETER_TABLE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>SAP Function Unit</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_UNIT_FEATURE_COUNT = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 8;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.SAPIDocUnitImpl <em>SAPI Doc Unit</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.SAPIDocUnitImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getSAPIDocUnit()
     * @generated
     */
    int SAPI_DOC_UNIT = 13;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__NAME = ABSTRACT_METADATA_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__VISIBILITY = ABSTRACT_METADATA_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__CLIENT_DEPENDENCY = ABSTRACT_METADATA_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__SUPPLIER_DEPENDENCY = ABSTRACT_METADATA_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__CONSTRAINT = ABSTRACT_METADATA_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__NAMESPACE = ABSTRACT_METADATA_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__IMPORTER = ABSTRACT_METADATA_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__STEREOTYPE = ABSTRACT_METADATA_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__TAGGED_VALUE = ABSTRACT_METADATA_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__DOCUMENT = ABSTRACT_METADATA_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__DESCRIPTION = ABSTRACT_METADATA_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__RESPONSIBLE_PARTY = ABSTRACT_METADATA_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__ELEMENT_NODE = ABSTRACT_METADATA_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__SET = ABSTRACT_METADATA_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__RENDERED_OBJECT = ABSTRACT_METADATA_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__VOCABULARY_ELEMENT = ABSTRACT_METADATA_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__MEASUREMENT = ABSTRACT_METADATA_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__CHANGE_REQUEST = ABSTRACT_METADATA_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__DASDL_PROPERTY = ABSTRACT_METADATA_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__PROPERTIES = ABSTRACT_METADATA_OBJECT__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__ID = ABSTRACT_METADATA_OBJECT__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__COMMENT = ABSTRACT_METADATA_OBJECT__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__LABEL = ABSTRACT_METADATA_OBJECT__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__READ_ONLY = ABSTRACT_METADATA_OBJECT__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__SYNCHRONISED = ABSTRACT_METADATA_OBJECT__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__DIVERGENCY = ABSTRACT_METADATA_OBJECT__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Connection</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__CONNECTION = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Program Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__PROGRAM_ID = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Gateway Service</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__GATEWAY_SERVICE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Use Xml Output</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__USE_XML_OUTPUT = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Xml File</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__XML_FILE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Use Html Output</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__USE_HTML_OUTPUT = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Html File</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT__HTML_FILE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>SAPI Doc Unit</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAPI_DOC_UNIT_FEATURE_COUNT = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 7;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.SAPFunctionParameterColumnImpl <em>SAP Function Parameter Column</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.SAPFunctionParameterColumnImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getSAPFunctionParameterColumn()
     * @generated
     */
    int SAP_FUNCTION_PARAMETER_COLUMN = 14;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__NAME = ABSTRACT_METADATA_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__VISIBILITY = ABSTRACT_METADATA_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__CLIENT_DEPENDENCY = ABSTRACT_METADATA_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__SUPPLIER_DEPENDENCY = ABSTRACT_METADATA_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__CONSTRAINT = ABSTRACT_METADATA_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__NAMESPACE = ABSTRACT_METADATA_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__IMPORTER = ABSTRACT_METADATA_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__STEREOTYPE = ABSTRACT_METADATA_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__TAGGED_VALUE = ABSTRACT_METADATA_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__DOCUMENT = ABSTRACT_METADATA_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__DESCRIPTION = ABSTRACT_METADATA_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__RESPONSIBLE_PARTY = ABSTRACT_METADATA_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__ELEMENT_NODE = ABSTRACT_METADATA_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__SET = ABSTRACT_METADATA_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__RENDERED_OBJECT = ABSTRACT_METADATA_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__VOCABULARY_ELEMENT = ABSTRACT_METADATA_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__MEASUREMENT = ABSTRACT_METADATA_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__CHANGE_REQUEST = ABSTRACT_METADATA_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__DASDL_PROPERTY = ABSTRACT_METADATA_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__PROPERTIES = ABSTRACT_METADATA_OBJECT__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__ID = ABSTRACT_METADATA_OBJECT__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__COMMENT = ABSTRACT_METADATA_OBJECT__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__LABEL = ABSTRACT_METADATA_OBJECT__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__READ_ONLY = ABSTRACT_METADATA_OBJECT__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__SYNCHRONISED = ABSTRACT_METADATA_OBJECT__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__DIVERGENCY = ABSTRACT_METADATA_OBJECT__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__PARAMETER_TYPE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Structure Or Table Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__STRUCTURE_OR_TABLE_NAME = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__DATA_TYPE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__LENGTH = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__VALUE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Parameter Table</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN__PARAMETER_TABLE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>SAP Function Parameter Column</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_COLUMN_FEATURE_COUNT = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 6;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.SAPFunctionParameterTableImpl <em>SAP Function Parameter Table</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.SAPFunctionParameterTableImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getSAPFunctionParameterTable()
     * @generated
     */
    int SAP_FUNCTION_PARAMETER_TABLE = 15;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__NAME = ABSTRACT_METADATA_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__VISIBILITY = ABSTRACT_METADATA_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__CLIENT_DEPENDENCY = ABSTRACT_METADATA_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__SUPPLIER_DEPENDENCY = ABSTRACT_METADATA_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__CONSTRAINT = ABSTRACT_METADATA_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__NAMESPACE = ABSTRACT_METADATA_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__IMPORTER = ABSTRACT_METADATA_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__STEREOTYPE = ABSTRACT_METADATA_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__TAGGED_VALUE = ABSTRACT_METADATA_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__DOCUMENT = ABSTRACT_METADATA_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__DESCRIPTION = ABSTRACT_METADATA_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__RESPONSIBLE_PARTY = ABSTRACT_METADATA_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__ELEMENT_NODE = ABSTRACT_METADATA_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__SET = ABSTRACT_METADATA_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__RENDERED_OBJECT = ABSTRACT_METADATA_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__VOCABULARY_ELEMENT = ABSTRACT_METADATA_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__MEASUREMENT = ABSTRACT_METADATA_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__CHANGE_REQUEST = ABSTRACT_METADATA_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__DASDL_PROPERTY = ABSTRACT_METADATA_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__PROPERTIES = ABSTRACT_METADATA_OBJECT__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__ID = ABSTRACT_METADATA_OBJECT__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__COMMENT = ABSTRACT_METADATA_OBJECT__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__LABEL = ABSTRACT_METADATA_OBJECT__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__READ_ONLY = ABSTRACT_METADATA_OBJECT__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__SYNCHRONISED = ABSTRACT_METADATA_OBJECT__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__DIVERGENCY = ABSTRACT_METADATA_OBJECT__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Columns</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE__COLUMNS = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>SAP Function Parameter Table</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_FUNCTION_PARAMETER_TABLE_FEATURE_COUNT = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.InputSAPFunctionParameterTableImpl <em>Input SAP Function Parameter Table</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.InputSAPFunctionParameterTableImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getInputSAPFunctionParameterTable()
     * @generated
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE = 16;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__NAME = SAP_FUNCTION_PARAMETER_TABLE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__VISIBILITY = SAP_FUNCTION_PARAMETER_TABLE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__CLIENT_DEPENDENCY = SAP_FUNCTION_PARAMETER_TABLE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__SUPPLIER_DEPENDENCY = SAP_FUNCTION_PARAMETER_TABLE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__CONSTRAINT = SAP_FUNCTION_PARAMETER_TABLE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__NAMESPACE = SAP_FUNCTION_PARAMETER_TABLE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__IMPORTER = SAP_FUNCTION_PARAMETER_TABLE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__STEREOTYPE = SAP_FUNCTION_PARAMETER_TABLE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__TAGGED_VALUE = SAP_FUNCTION_PARAMETER_TABLE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__DOCUMENT = SAP_FUNCTION_PARAMETER_TABLE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__DESCRIPTION = SAP_FUNCTION_PARAMETER_TABLE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__RESPONSIBLE_PARTY = SAP_FUNCTION_PARAMETER_TABLE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__ELEMENT_NODE = SAP_FUNCTION_PARAMETER_TABLE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__SET = SAP_FUNCTION_PARAMETER_TABLE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__RENDERED_OBJECT = SAP_FUNCTION_PARAMETER_TABLE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__VOCABULARY_ELEMENT = SAP_FUNCTION_PARAMETER_TABLE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__MEASUREMENT = SAP_FUNCTION_PARAMETER_TABLE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__CHANGE_REQUEST = SAP_FUNCTION_PARAMETER_TABLE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__DASDL_PROPERTY = SAP_FUNCTION_PARAMETER_TABLE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__PROPERTIES = SAP_FUNCTION_PARAMETER_TABLE__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__ID = SAP_FUNCTION_PARAMETER_TABLE__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__COMMENT = SAP_FUNCTION_PARAMETER_TABLE__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__LABEL = SAP_FUNCTION_PARAMETER_TABLE__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__READ_ONLY = SAP_FUNCTION_PARAMETER_TABLE__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__SYNCHRONISED = SAP_FUNCTION_PARAMETER_TABLE__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__DIVERGENCY = SAP_FUNCTION_PARAMETER_TABLE__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Columns</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__COLUMNS = SAP_FUNCTION_PARAMETER_TABLE__COLUMNS;

    /**
     * The feature id for the '<em><b>Function Unit</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE__FUNCTION_UNIT = SAP_FUNCTION_PARAMETER_TABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Input SAP Function Parameter Table</em>' class.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SAP_FUNCTION_PARAMETER_TABLE_FEATURE_COUNT = SAP_FUNCTION_PARAMETER_TABLE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.OutputSAPFunctionParameterTableImpl <em>Output SAP Function Parameter Table</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.OutputSAPFunctionParameterTableImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getOutputSAPFunctionParameterTable()
     * @generated
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE = 17;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__NAME = SAP_FUNCTION_PARAMETER_TABLE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__VISIBILITY = SAP_FUNCTION_PARAMETER_TABLE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__CLIENT_DEPENDENCY = SAP_FUNCTION_PARAMETER_TABLE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__SUPPLIER_DEPENDENCY = SAP_FUNCTION_PARAMETER_TABLE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__CONSTRAINT = SAP_FUNCTION_PARAMETER_TABLE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__NAMESPACE = SAP_FUNCTION_PARAMETER_TABLE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__IMPORTER = SAP_FUNCTION_PARAMETER_TABLE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__STEREOTYPE = SAP_FUNCTION_PARAMETER_TABLE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__TAGGED_VALUE = SAP_FUNCTION_PARAMETER_TABLE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__DOCUMENT = SAP_FUNCTION_PARAMETER_TABLE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__DESCRIPTION = SAP_FUNCTION_PARAMETER_TABLE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__RESPONSIBLE_PARTY = SAP_FUNCTION_PARAMETER_TABLE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__ELEMENT_NODE = SAP_FUNCTION_PARAMETER_TABLE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__SET = SAP_FUNCTION_PARAMETER_TABLE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__RENDERED_OBJECT = SAP_FUNCTION_PARAMETER_TABLE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__VOCABULARY_ELEMENT = SAP_FUNCTION_PARAMETER_TABLE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__MEASUREMENT = SAP_FUNCTION_PARAMETER_TABLE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__CHANGE_REQUEST = SAP_FUNCTION_PARAMETER_TABLE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__DASDL_PROPERTY = SAP_FUNCTION_PARAMETER_TABLE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__PROPERTIES = SAP_FUNCTION_PARAMETER_TABLE__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__ID = SAP_FUNCTION_PARAMETER_TABLE__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__COMMENT = SAP_FUNCTION_PARAMETER_TABLE__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__LABEL = SAP_FUNCTION_PARAMETER_TABLE__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__READ_ONLY = SAP_FUNCTION_PARAMETER_TABLE__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__SYNCHRONISED = SAP_FUNCTION_PARAMETER_TABLE__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__DIVERGENCY = SAP_FUNCTION_PARAMETER_TABLE__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Columns</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__COLUMNS = SAP_FUNCTION_PARAMETER_TABLE__COLUMNS;

    /**
     * The feature id for the '<em><b>Function Unit</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__FUNCTION_UNIT = SAP_FUNCTION_PARAMETER_TABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Output SAP Function Parameter Table</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int OUTPUT_SAP_FUNCTION_PARAMETER_TABLE_FEATURE_COUNT = SAP_FUNCTION_PARAMETER_TABLE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.RegexpFileConnectionImpl <em>Regexp File Connection</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.RegexpFileConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getRegexpFileConnection()
     * @generated
     */
    int REGEXP_FILE_CONNECTION = 18;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__NAME = FILE_CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__VISIBILITY = FILE_CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__CLIENT_DEPENDENCY = FILE_CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__SUPPLIER_DEPENDENCY = FILE_CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__CONSTRAINT = FILE_CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__NAMESPACE = FILE_CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__IMPORTER = FILE_CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__STEREOTYPE = FILE_CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__TAGGED_VALUE = FILE_CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__DOCUMENT = FILE_CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__DESCRIPTION = FILE_CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__RESPONSIBLE_PARTY = FILE_CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__ELEMENT_NODE = FILE_CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__SET = FILE_CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__RENDERED_OBJECT = FILE_CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__VOCABULARY_ELEMENT = FILE_CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__MEASUREMENT = FILE_CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__CHANGE_REQUEST = FILE_CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__DASDL_PROPERTY = FILE_CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__PROPERTIES = FILE_CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__ID = FILE_CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__COMMENT = FILE_CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__LABEL = FILE_CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__READ_ONLY = FILE_CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__SYNCHRONISED = FILE_CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__DIVERGENCY = FILE_CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__OWNED_ELEMENT = FILE_CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__IMPORTED_ELEMENT = FILE_CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__DATA_MANAGER = FILE_CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__PATHNAME = FILE_CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__MACHINE = FILE_CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = FILE_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__COMPONENT = FILE_CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__IS_CASE_SENSITIVE = FILE_CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__CLIENT_CONNECTION = FILE_CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__DATA_PACKAGE = FILE_CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__RESOURCE_CONNECTION = FILE_CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__VERSION = FILE_CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__QUERIES = FILE_CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__CONTEXT_MODE = FILE_CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__CONTEXT_ID = FILE_CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Server</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__SERVER = FILE_CONNECTION__SERVER;

    /**
     * The feature id for the '<em><b>File Path</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__FILE_PATH = FILE_CONNECTION__FILE_PATH;

    /**
     * The feature id for the '<em><b>Format</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__FORMAT = FILE_CONNECTION__FORMAT;

    /**
     * The feature id for the '<em><b>Encoding</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__ENCODING = FILE_CONNECTION__ENCODING;

    /**
     * The feature id for the '<em><b>Field Separator Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__FIELD_SEPARATOR_VALUE = FILE_CONNECTION__FIELD_SEPARATOR_VALUE;

    /**
     * The feature id for the '<em><b>Row Separator Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__ROW_SEPARATOR_TYPE = FILE_CONNECTION__ROW_SEPARATOR_TYPE;

    /**
     * The feature id for the '<em><b>Row Separator Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__ROW_SEPARATOR_VALUE = FILE_CONNECTION__ROW_SEPARATOR_VALUE;

    /**
     * The feature id for the '<em><b>Text Identifier</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__TEXT_IDENTIFIER = FILE_CONNECTION__TEXT_IDENTIFIER;

    /**
     * The feature id for the '<em><b>Use Header</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__USE_HEADER = FILE_CONNECTION__USE_HEADER;

    /**
     * The feature id for the '<em><b>Header Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__HEADER_VALUE = FILE_CONNECTION__HEADER_VALUE;

    /**
     * The feature id for the '<em><b>Use Footer</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__USE_FOOTER = FILE_CONNECTION__USE_FOOTER;

    /**
     * The feature id for the '<em><b>Footer Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__FOOTER_VALUE = FILE_CONNECTION__FOOTER_VALUE;

    /**
     * The feature id for the '<em><b>Use Limit</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__USE_LIMIT = FILE_CONNECTION__USE_LIMIT;

    /**
     * The feature id for the '<em><b>Limit Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__LIMIT_VALUE = FILE_CONNECTION__LIMIT_VALUE;

    /**
     * The feature id for the '<em><b>First Line Caption</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__FIRST_LINE_CAPTION = FILE_CONNECTION__FIRST_LINE_CAPTION;

    /**
     * The feature id for the '<em><b>Remove Empty Row</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__REMOVE_EMPTY_ROW = FILE_CONNECTION__REMOVE_EMPTY_ROW;

    /**
     * The feature id for the '<em><b>Escape Type</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__ESCAPE_TYPE = FILE_CONNECTION__ESCAPE_TYPE;

    /**
     * The feature id for the '<em><b>Escape Char</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__ESCAPE_CHAR = FILE_CONNECTION__ESCAPE_CHAR;

    /**
     * The feature id for the '<em><b>Text Enclosure</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__TEXT_ENCLOSURE = FILE_CONNECTION__TEXT_ENCLOSURE;

    /**
     * The feature id for the '<em><b>Csv Option</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__CSV_OPTION = FILE_CONNECTION__CSV_OPTION;

    /**
     * The feature id for the '<em><b>Field Separator Type</b></em>' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION__FIELD_SEPARATOR_TYPE = FILE_CONNECTION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Regexp File Connection</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int REGEXP_FILE_CONNECTION_FEATURE_COUNT = FILE_CONNECTION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.XmlFileConnectionImpl <em>Xml File Connection</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.XmlFileConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getXmlFileConnection()
     * @generated
     */
    int XML_FILE_CONNECTION = 19;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__NAME = CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__VISIBILITY = CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__CLIENT_DEPENDENCY = CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__SUPPLIER_DEPENDENCY = CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__CONSTRAINT = CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__NAMESPACE = CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__IMPORTER = CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__STEREOTYPE = CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__TAGGED_VALUE = CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__DOCUMENT = CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__DESCRIPTION = CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__RESPONSIBLE_PARTY = CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__ELEMENT_NODE = CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__SET = CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__RENDERED_OBJECT = CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__VOCABULARY_ELEMENT = CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__MEASUREMENT = CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__CHANGE_REQUEST = CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__DASDL_PROPERTY = CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__PROPERTIES = CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__ID = CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__COMMENT = CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__LABEL = CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__READ_ONLY = CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__SYNCHRONISED = CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__DIVERGENCY = CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__OWNED_ELEMENT = CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__IMPORTED_ELEMENT = CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__DATA_MANAGER = CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__PATHNAME = CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__MACHINE = CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__COMPONENT = CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__IS_CASE_SENSITIVE = CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__CLIENT_CONNECTION = CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__DATA_PACKAGE = CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__RESOURCE_CONNECTION = CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__VERSION = CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__QUERIES = CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__CONTEXT_MODE = CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__CONTEXT_ID = CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Xsd File Path</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__XSD_FILE_PATH = CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Xml File Path</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__XML_FILE_PATH = CONNECTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Guess</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__GUESS = CONNECTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Mask XPattern</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__MASK_XPATTERN = CONNECTION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Schema</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__SCHEMA = CONNECTION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Encoding</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__ENCODING = CONNECTION_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Group</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__GROUP = CONNECTION_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Root</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__ROOT = CONNECTION_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Loop</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__LOOP = CONNECTION_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Input Model</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__INPUT_MODEL = CONNECTION_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Output File Path</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__OUTPUT_FILE_PATH = CONNECTION_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>File Content</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION__FILE_CONTENT = CONNECTION_FEATURE_COUNT + 11;

    /**
     * The number of structural features of the '<em>Xml File Connection</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 12;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.SchemaTargetImpl <em>Schema Target</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.SchemaTargetImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getSchemaTarget()
     * @generated
     */
    int SCHEMA_TARGET = 20;

    /**
     * The feature id for the '<em><b>Relative XPath Query</b></em>' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TARGET__RELATIVE_XPATH_QUERY = 0;

    /**
     * The feature id for the '<em><b>Tag Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TARGET__TAG_NAME = 1;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SCHEMA_TARGET__SCHEMA = 2;

    /**
     * The number of structural features of the '<em>Schema Target</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_TARGET_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.QueriesConnectionImpl <em>Queries Connection</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.QueriesConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getQueriesConnection()
     * @generated
     */
    int QUERIES_CONNECTION = 21;

    /**
     * The feature id for the '<em><b>Connection</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERIES_CONNECTION__CONNECTION = 0;

    /**
     * The feature id for the '<em><b>Query</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERIES_CONNECTION__QUERY = 1;

    /**
     * The number of structural features of the '<em>Queries Connection</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERIES_CONNECTION_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.QueryImpl <em>Query</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.QueryImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getQuery()
     * @generated
     */
    int QUERY = 22;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__NAME = ABSTRACT_METADATA_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__VISIBILITY = ABSTRACT_METADATA_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__CLIENT_DEPENDENCY = ABSTRACT_METADATA_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__SUPPLIER_DEPENDENCY = ABSTRACT_METADATA_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__CONSTRAINT = ABSTRACT_METADATA_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int QUERY__NAMESPACE = ABSTRACT_METADATA_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__IMPORTER = ABSTRACT_METADATA_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__STEREOTYPE = ABSTRACT_METADATA_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__TAGGED_VALUE = ABSTRACT_METADATA_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__DOCUMENT = ABSTRACT_METADATA_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int QUERY__DESCRIPTION = ABSTRACT_METADATA_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__RESPONSIBLE_PARTY = ABSTRACT_METADATA_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int QUERY__ELEMENT_NODE = ABSTRACT_METADATA_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__SET = ABSTRACT_METADATA_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__RENDERED_OBJECT = ABSTRACT_METADATA_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__VOCABULARY_ELEMENT = ABSTRACT_METADATA_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int QUERY__MEASUREMENT = ABSTRACT_METADATA_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int QUERY__CHANGE_REQUEST = ABSTRACT_METADATA_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int QUERY__DASDL_PROPERTY = ABSTRACT_METADATA_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__PROPERTIES = ABSTRACT_METADATA_OBJECT__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__ID = ABSTRACT_METADATA_OBJECT__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__COMMENT = ABSTRACT_METADATA_OBJECT__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__LABEL = ABSTRACT_METADATA_OBJECT__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__READ_ONLY = ABSTRACT_METADATA_OBJECT__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__SYNCHRONISED = ABSTRACT_METADATA_OBJECT__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__DIVERGENCY = ABSTRACT_METADATA_OBJECT__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__VALUE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Queries</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int QUERY__QUERIES = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__CONTEXT_MODE = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Query</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY_FEATURE_COUNT = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.LdifFileConnectionImpl <em>Ldif File Connection</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.LdifFileConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getLdifFileConnection()
     * @generated
     */
    int LDIF_FILE_CONNECTION = 23;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__NAME = CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__VISIBILITY = CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__CLIENT_DEPENDENCY = CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__SUPPLIER_DEPENDENCY = CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__CONSTRAINT = CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__NAMESPACE = CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__IMPORTER = CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__STEREOTYPE = CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__TAGGED_VALUE = CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__DOCUMENT = CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__DESCRIPTION = CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__RESPONSIBLE_PARTY = CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__ELEMENT_NODE = CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__SET = CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__RENDERED_OBJECT = CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__VOCABULARY_ELEMENT = CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__MEASUREMENT = CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__CHANGE_REQUEST = CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__DASDL_PROPERTY = CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__PROPERTIES = CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__ID = CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__COMMENT = CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__LABEL = CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__READ_ONLY = CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__SYNCHRONISED = CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__DIVERGENCY = CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__OWNED_ELEMENT = CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__IMPORTED_ELEMENT = CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__DATA_MANAGER = CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__PATHNAME = CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__MACHINE = CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__COMPONENT = CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__IS_CASE_SENSITIVE = CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__CLIENT_CONNECTION = CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__DATA_PACKAGE = CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__RESOURCE_CONNECTION = CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__VERSION = CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__QUERIES = CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__CONTEXT_MODE = CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__CONTEXT_ID = CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__VALUE = CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>File Path</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__FILE_PATH = CONNECTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Limit Entry</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__LIMIT_ENTRY = CONNECTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Use Limit</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__USE_LIMIT = CONNECTION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Server</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION__SERVER = CONNECTION_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Ldif File Connection</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDIF_FILE_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.FileExcelConnectionImpl <em>File Excel Connection</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.FileExcelConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getFileExcelConnection()
     * @generated
     */
    int FILE_EXCEL_CONNECTION = 24;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__NAME = FILE_CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__VISIBILITY = FILE_CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__CLIENT_DEPENDENCY = FILE_CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__SUPPLIER_DEPENDENCY = FILE_CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__CONSTRAINT = FILE_CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__NAMESPACE = FILE_CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__IMPORTER = FILE_CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__STEREOTYPE = FILE_CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__TAGGED_VALUE = FILE_CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__DOCUMENT = FILE_CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__DESCRIPTION = FILE_CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__RESPONSIBLE_PARTY = FILE_CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__ELEMENT_NODE = FILE_CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__SET = FILE_CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__RENDERED_OBJECT = FILE_CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__VOCABULARY_ELEMENT = FILE_CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__MEASUREMENT = FILE_CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__CHANGE_REQUEST = FILE_CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__DASDL_PROPERTY = FILE_CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__PROPERTIES = FILE_CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__ID = FILE_CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__COMMENT = FILE_CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__LABEL = FILE_CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__READ_ONLY = FILE_CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__SYNCHRONISED = FILE_CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__DIVERGENCY = FILE_CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__OWNED_ELEMENT = FILE_CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__IMPORTED_ELEMENT = FILE_CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__DATA_MANAGER = FILE_CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__PATHNAME = FILE_CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__MACHINE = FILE_CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = FILE_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__COMPONENT = FILE_CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__IS_CASE_SENSITIVE = FILE_CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__CLIENT_CONNECTION = FILE_CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__DATA_PACKAGE = FILE_CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__RESOURCE_CONNECTION = FILE_CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__VERSION = FILE_CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__QUERIES = FILE_CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__CONTEXT_MODE = FILE_CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__CONTEXT_ID = FILE_CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Server</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__SERVER = FILE_CONNECTION__SERVER;

    /**
     * The feature id for the '<em><b>File Path</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__FILE_PATH = FILE_CONNECTION__FILE_PATH;

    /**
     * The feature id for the '<em><b>Format</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__FORMAT = FILE_CONNECTION__FORMAT;

    /**
     * The feature id for the '<em><b>Encoding</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__ENCODING = FILE_CONNECTION__ENCODING;

    /**
     * The feature id for the '<em><b>Field Separator Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__FIELD_SEPARATOR_VALUE = FILE_CONNECTION__FIELD_SEPARATOR_VALUE;

    /**
     * The feature id for the '<em><b>Row Separator Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__ROW_SEPARATOR_TYPE = FILE_CONNECTION__ROW_SEPARATOR_TYPE;

    /**
     * The feature id for the '<em><b>Row Separator Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__ROW_SEPARATOR_VALUE = FILE_CONNECTION__ROW_SEPARATOR_VALUE;

    /**
     * The feature id for the '<em><b>Text Identifier</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__TEXT_IDENTIFIER = FILE_CONNECTION__TEXT_IDENTIFIER;

    /**
     * The feature id for the '<em><b>Use Header</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__USE_HEADER = FILE_CONNECTION__USE_HEADER;

    /**
     * The feature id for the '<em><b>Header Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__HEADER_VALUE = FILE_CONNECTION__HEADER_VALUE;

    /**
     * The feature id for the '<em><b>Use Footer</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__USE_FOOTER = FILE_CONNECTION__USE_FOOTER;

    /**
     * The feature id for the '<em><b>Footer Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__FOOTER_VALUE = FILE_CONNECTION__FOOTER_VALUE;

    /**
     * The feature id for the '<em><b>Use Limit</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__USE_LIMIT = FILE_CONNECTION__USE_LIMIT;

    /**
     * The feature id for the '<em><b>Limit Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__LIMIT_VALUE = FILE_CONNECTION__LIMIT_VALUE;

    /**
     * The feature id for the '<em><b>First Line Caption</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__FIRST_LINE_CAPTION = FILE_CONNECTION__FIRST_LINE_CAPTION;

    /**
     * The feature id for the '<em><b>Remove Empty Row</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__REMOVE_EMPTY_ROW = FILE_CONNECTION__REMOVE_EMPTY_ROW;

    /**
     * The feature id for the '<em><b>Escape Type</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__ESCAPE_TYPE = FILE_CONNECTION__ESCAPE_TYPE;

    /**
     * The feature id for the '<em><b>Escape Char</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__ESCAPE_CHAR = FILE_CONNECTION__ESCAPE_CHAR;

    /**
     * The feature id for the '<em><b>Text Enclosure</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__TEXT_ENCLOSURE = FILE_CONNECTION__TEXT_ENCLOSURE;

    /**
     * The feature id for the '<em><b>Csv Option</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__CSV_OPTION = FILE_CONNECTION__CSV_OPTION;

    /**
     * The feature id for the '<em><b>Sheet Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__SHEET_NAME = FILE_CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Sheet Columns</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__SHEET_COLUMNS = FILE_CONNECTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>First Column</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__FIRST_COLUMN = FILE_CONNECTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Last Column</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__LAST_COLUMN = FILE_CONNECTION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Thousand Separator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__THOUSAND_SEPARATOR = FILE_CONNECTION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Decimal Separator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__DECIMAL_SEPARATOR = FILE_CONNECTION_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Advanced Spearator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__ADVANCED_SPEARATOR = FILE_CONNECTION_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Select All Sheets</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__SELECT_ALL_SHEETS = FILE_CONNECTION_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Sheet List</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION__SHEET_LIST = FILE_CONNECTION_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>File Excel Connection</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_EXCEL_CONNECTION_FEATURE_COUNT = FILE_CONNECTION_FEATURE_COUNT + 9;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.XmlXPathLoopDescriptorImpl <em>Xml XPath Loop Descriptor</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.XmlXPathLoopDescriptorImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getXmlXPathLoopDescriptor()
     * @generated
     */
    int XML_XPATH_LOOP_DESCRIPTOR = 25;

    /**
     * The feature id for the '<em><b>Limit Boucle</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_XPATH_LOOP_DESCRIPTOR__LIMIT_BOUCLE = 0;

    /**
     * The feature id for the '<em><b>Absolute XPath Query</b></em>' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_XPATH_LOOP_DESCRIPTOR__ABSOLUTE_XPATH_QUERY = 1;

    /**
     * The feature id for the '<em><b>Connection</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_XPATH_LOOP_DESCRIPTOR__CONNECTION = 2;

    /**
     * The feature id for the '<em><b>Schema Targets</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_XPATH_LOOP_DESCRIPTOR__SCHEMA_TARGETS = 3;

    /**
     * The number of structural features of the '<em>Xml XPath Loop Descriptor</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_XPATH_LOOP_DESCRIPTOR_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.GenericSchemaConnectionImpl <em>Generic Schema Connection</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.GenericSchemaConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getGenericSchemaConnection()
     * @generated
     */
    int GENERIC_SCHEMA_CONNECTION = 26;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__NAME = CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__VISIBILITY = CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__CLIENT_DEPENDENCY = CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__SUPPLIER_DEPENDENCY = CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__CONSTRAINT = CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__NAMESPACE = CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__IMPORTER = CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__STEREOTYPE = CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__TAGGED_VALUE = CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__DOCUMENT = CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__DESCRIPTION = CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__RESPONSIBLE_PARTY = CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__ELEMENT_NODE = CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__SET = CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__RENDERED_OBJECT = CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__VOCABULARY_ELEMENT = CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__MEASUREMENT = CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__CHANGE_REQUEST = CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__DASDL_PROPERTY = CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__PROPERTIES = CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__ID = CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__COMMENT = CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__LABEL = CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__READ_ONLY = CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__SYNCHRONISED = CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__DIVERGENCY = CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__OWNED_ELEMENT = CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__IMPORTED_ELEMENT = CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__DATA_MANAGER = CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__PATHNAME = CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__MACHINE = CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__COMPONENT = CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__IS_CASE_SENSITIVE = CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__CLIENT_CONNECTION = CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__DATA_PACKAGE = CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__RESOURCE_CONNECTION = CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__VERSION = CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__QUERIES = CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__CONTEXT_MODE = CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__CONTEXT_ID = CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Mapping Type Used</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__MAPPING_TYPE_USED = CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Mapping Type Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION__MAPPING_TYPE_ID = CONNECTION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Generic Schema Connection</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_SCHEMA_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.LDAPSchemaConnectionImpl <em>LDAP Schema Connection</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.LDAPSchemaConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getLDAPSchemaConnection()
     * @generated
     */
    int LDAP_SCHEMA_CONNECTION = 27;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__NAME = CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__VISIBILITY = CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__CLIENT_DEPENDENCY = CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__SUPPLIER_DEPENDENCY = CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__CONSTRAINT = CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__NAMESPACE = CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__IMPORTER = CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__STEREOTYPE = CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__TAGGED_VALUE = CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__DOCUMENT = CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__DESCRIPTION = CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__RESPONSIBLE_PARTY = CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__ELEMENT_NODE = CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__SET = CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__RENDERED_OBJECT = CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__VOCABULARY_ELEMENT = CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__MEASUREMENT = CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__CHANGE_REQUEST = CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__DASDL_PROPERTY = CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__PROPERTIES = CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__ID = CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__COMMENT = CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__LABEL = CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__READ_ONLY = CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__SYNCHRONISED = CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__DIVERGENCY = CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__OWNED_ELEMENT = CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__IMPORTED_ELEMENT = CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__DATA_MANAGER = CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__PATHNAME = CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__MACHINE = CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__COMPONENT = CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__IS_CASE_SENSITIVE = CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__CLIENT_CONNECTION = CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__DATA_PACKAGE = CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__RESOURCE_CONNECTION = CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__VERSION = CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__QUERIES = CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__CONTEXT_MODE = CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__CONTEXT_ID = CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__HOST = CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__PORT = CONNECTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Protocol</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__PROTOCOL = CONNECTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Filter</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__FILTER = CONNECTION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Separator</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__SEPARATOR = CONNECTION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Use Advanced</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__USE_ADVANCED = CONNECTION_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Store Path</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__STORE_PATH = CONNECTION_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Use Limit</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__USE_LIMIT = CONNECTION_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Use Authen</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__USE_AUTHEN = CONNECTION_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Bind Principal</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__BIND_PRINCIPAL = CONNECTION_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Bind Password</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__BIND_PASSWORD = CONNECTION_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Limit Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__LIMIT_VALUE = CONNECTION_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Encryption Method Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__ENCRYPTION_METHOD_NAME = CONNECTION_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__VALUE = CONNECTION_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Save Password</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__SAVE_PASSWORD = CONNECTION_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Aliases</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__ALIASES = CONNECTION_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Referrals</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__REFERRALS = CONNECTION_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Count Limit</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__COUNT_LIMIT = CONNECTION_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Time Out Limit</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__TIME_OUT_LIMIT = CONNECTION_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Base DNs</b></em>' attribute list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__BASE_DNS = CONNECTION_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>Get Base DNs From Root</b></em>' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__GET_BASE_DNS_FROM_ROOT = CONNECTION_FEATURE_COUNT + 20;

    /**
     * The feature id for the '<em><b>Return Attributes</b></em>' attribute list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__RETURN_ATTRIBUTES = CONNECTION_FEATURE_COUNT + 21;

    /**
     * The feature id for the '<em><b>Selected DN</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION__SELECTED_DN = CONNECTION_FEATURE_COUNT + 22;

    /**
     * The number of structural features of the '<em>LDAP Schema Connection</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LDAP_SCHEMA_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 23;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.WSDLSchemaConnectionImpl <em>WSDL Schema Connection</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.WSDLSchemaConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getWSDLSchemaConnection()
     * @generated
     */
    int WSDL_SCHEMA_CONNECTION = 28;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__NAME = CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__VISIBILITY = CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__CLIENT_DEPENDENCY = CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__SUPPLIER_DEPENDENCY = CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__CONSTRAINT = CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__NAMESPACE = CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__IMPORTER = CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__STEREOTYPE = CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__TAGGED_VALUE = CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__DOCUMENT = CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__DESCRIPTION = CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__RESPONSIBLE_PARTY = CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__ELEMENT_NODE = CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__SET = CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__RENDERED_OBJECT = CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__VOCABULARY_ELEMENT = CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__MEASUREMENT = CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__CHANGE_REQUEST = CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__DASDL_PROPERTY = CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__PROPERTIES = CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__ID = CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__COMMENT = CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__LABEL = CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__READ_ONLY = CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__SYNCHRONISED = CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__DIVERGENCY = CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__OWNED_ELEMENT = CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__IMPORTED_ELEMENT = CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__DATA_MANAGER = CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__PATHNAME = CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__MACHINE = CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__COMPONENT = CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__IS_CASE_SENSITIVE = CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__CLIENT_CONNECTION = CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__DATA_PACKAGE = CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__RESOURCE_CONNECTION = CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__VERSION = CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__QUERIES = CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__CONTEXT_MODE = CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__CONTEXT_ID = CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>WSDL</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__WSDL = CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Need Auth</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__NEED_AUTH = CONNECTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Method Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__METHOD_NAME = CONNECTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__PARAMETERS = CONNECTION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>User Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__USER_NAME = CONNECTION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__PASSWORD = CONNECTION_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Use Proxy</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__USE_PROXY = CONNECTION_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Proxy Host</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__PROXY_HOST = CONNECTION_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Proxy Port</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__PROXY_PORT = CONNECTION_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Proxy User</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__PROXY_USER = CONNECTION_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Proxy Password</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__PROXY_PASSWORD = CONNECTION_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__VALUE = CONNECTION_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Endpoint URI</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__ENDPOINT_URI = CONNECTION_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Encoding</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__ENCODING = CONNECTION_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Time Out</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION__TIME_OUT = CONNECTION_FEATURE_COUNT + 14;

    int WSDL_SCHEMA_CONNECTION__IS_INPUT_MODEL = CONNECTION_FEATURE_COUNT + 15;

    int WSDL_SCHEMA_CONNECTION__SERVER_NAME_SPACE = CONNECTION_FEATURE_COUNT + 16;

    int WSDL_SCHEMA_CONNECTION__SERVER_NAME = CONNECTION_FEATURE_COUNT + 17;

    int WSDL_SCHEMA_CONNECTION__PORT_NAME_SPACE = CONNECTION_FEATURE_COUNT + 18;

    int WSDL_SCHEMA_CONNECTION__PORT_NAME = CONNECTION_FEATURE_COUNT + 19;

    int WSDL_SCHEMA_CONNECTION__PARAMETER_VALUE = CONNECTION_FEATURE_COUNT + 20;

    int WSDL_SCHEMA_CONNECTION__OUTPUT_PARAMETER = CONNECTION_FEATURE_COUNT + 21;

    /**
     * The number of structural features of the '<em>WSDL Schema Connection</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_SCHEMA_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 22;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.SalesforceSchemaConnectionImpl <em>Salesforce Schema Connection</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.SalesforceSchemaConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getSalesforceSchemaConnection()
     * @generated
     */
    int SALESFORCE_SCHEMA_CONNECTION = 29;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__NAME = CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__VISIBILITY = CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__CLIENT_DEPENDENCY = CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__SUPPLIER_DEPENDENCY = CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__CONSTRAINT = CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__NAMESPACE = CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__IMPORTER = CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__STEREOTYPE = CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__TAGGED_VALUE = CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__DOCUMENT = CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__DESCRIPTION = CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__RESPONSIBLE_PARTY = CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__ELEMENT_NODE = CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__SET = CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__RENDERED_OBJECT = CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__VOCABULARY_ELEMENT = CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__MEASUREMENT = CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__CHANGE_REQUEST = CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__DASDL_PROPERTY = CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__PROPERTIES = CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__ID = CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__COMMENT = CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__LABEL = CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__READ_ONLY = CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__SYNCHRONISED = CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__DIVERGENCY = CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__OWNED_ELEMENT = CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__IMPORTED_ELEMENT = CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__DATA_MANAGER = CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__PATHNAME = CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__MACHINE = CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__COMPONENT = CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__IS_CASE_SENSITIVE = CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__CLIENT_CONNECTION = CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__DATA_PACKAGE = CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__RESOURCE_CONNECTION = CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__VERSION = CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__QUERIES = CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__CONTEXT_MODE = CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__CONTEXT_ID = CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Web Service Url</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__WEB_SERVICE_URL = CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>User Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__USER_NAME = CONNECTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__PASSWORD = CONNECTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Module Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__MODULE_NAME = CONNECTION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Query Condition</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__QUERY_CONDITION = CONNECTION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Use Custom Module Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__USE_CUSTOM_MODULE_NAME = CONNECTION_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Use Proxy</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__USE_PROXY = CONNECTION_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Proxy Host</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__PROXY_HOST = CONNECTION_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Proxy Port</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__PROXY_PORT = CONNECTION_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Proxy Username</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__PROXY_USERNAME = CONNECTION_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Proxy Password</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__PROXY_PASSWORD = CONNECTION_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Batch Size</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__BATCH_SIZE = CONNECTION_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Use Http Proxy</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__USE_HTTP_PROXY = CONNECTION_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Use Alphbet</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__USE_ALPHBET = CONNECTION_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Time Out</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION__TIME_OUT = CONNECTION_FEATURE_COUNT + 14;

    /**
     * The number of structural features of the '<em>Salesforce Schema Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SALESFORCE_SCHEMA_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 15;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.CDCConnectionImpl <em>CDC Connection</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.CDCConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getCDCConnection()
     * @generated
     */
    int CDC_CONNECTION = 30;

    /**
     * The feature id for the '<em><b>Connection</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_CONNECTION__CONNECTION = 0;

    /**
     * The feature id for the '<em><b>Cdc Types</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_CONNECTION__CDC_TYPES = 1;

    /**
     * The number of structural features of the '<em>CDC Connection</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_CONNECTION_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.CDCTypeImpl <em>CDC Type</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.CDCTypeImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getCDCType()
     * @generated
     */
    int CDC_TYPE = 31;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__NAME = ABSTRACT_METADATA_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__VISIBILITY = ABSTRACT_METADATA_OBJECT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__CLIENT_DEPENDENCY = ABSTRACT_METADATA_OBJECT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__SUPPLIER_DEPENDENCY = ABSTRACT_METADATA_OBJECT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__CONSTRAINT = ABSTRACT_METADATA_OBJECT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CDC_TYPE__NAMESPACE = ABSTRACT_METADATA_OBJECT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__IMPORTER = ABSTRACT_METADATA_OBJECT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__STEREOTYPE = ABSTRACT_METADATA_OBJECT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__TAGGED_VALUE = ABSTRACT_METADATA_OBJECT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__DOCUMENT = ABSTRACT_METADATA_OBJECT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CDC_TYPE__DESCRIPTION = ABSTRACT_METADATA_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__RESPONSIBLE_PARTY = ABSTRACT_METADATA_OBJECT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CDC_TYPE__ELEMENT_NODE = ABSTRACT_METADATA_OBJECT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__SET = ABSTRACT_METADATA_OBJECT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__RENDERED_OBJECT = ABSTRACT_METADATA_OBJECT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__VOCABULARY_ELEMENT = ABSTRACT_METADATA_OBJECT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CDC_TYPE__MEASUREMENT = ABSTRACT_METADATA_OBJECT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CDC_TYPE__CHANGE_REQUEST = ABSTRACT_METADATA_OBJECT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CDC_TYPE__DASDL_PROPERTY = ABSTRACT_METADATA_OBJECT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__PROPERTIES = ABSTRACT_METADATA_OBJECT__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__ID = ABSTRACT_METADATA_OBJECT__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__COMMENT = ABSTRACT_METADATA_OBJECT__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__LABEL = ABSTRACT_METADATA_OBJECT__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__READ_ONLY = ABSTRACT_METADATA_OBJECT__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__SYNCHRONISED = ABSTRACT_METADATA_OBJECT__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__DIVERGENCY = ABSTRACT_METADATA_OBJECT__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Link DB</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__LINK_DB = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Subscribers</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__SUBSCRIBERS = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Cdc Connection</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__CDC_CONNECTION = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Journal Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE__JOURNAL_NAME = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>CDC Type</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CDC_TYPE_FEATURE_COUNT = ABSTRACT_METADATA_OBJECT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.SubscriberTableImpl <em>Subscriber Table</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.SubscriberTableImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getSubscriberTable()
     * @generated
     */
    int SUBSCRIBER_TABLE = 32;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__NAME = RelationalPackage.TD_TABLE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__VISIBILITY = RelationalPackage.TD_TABLE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__CLIENT_DEPENDENCY = RelationalPackage.TD_TABLE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__SUPPLIER_DEPENDENCY = RelationalPackage.TD_TABLE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__CONSTRAINT = RelationalPackage.TD_TABLE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__NAMESPACE = RelationalPackage.TD_TABLE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__IMPORTER = RelationalPackage.TD_TABLE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__STEREOTYPE = RelationalPackage.TD_TABLE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__TAGGED_VALUE = RelationalPackage.TD_TABLE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__DOCUMENT = RelationalPackage.TD_TABLE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__DESCRIPTION = RelationalPackage.TD_TABLE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__RESPONSIBLE_PARTY = RelationalPackage.TD_TABLE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__ELEMENT_NODE = RelationalPackage.TD_TABLE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__SET = RelationalPackage.TD_TABLE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__RENDERED_OBJECT = RelationalPackage.TD_TABLE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__VOCABULARY_ELEMENT = RelationalPackage.TD_TABLE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__MEASUREMENT = RelationalPackage.TD_TABLE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__CHANGE_REQUEST = RelationalPackage.TD_TABLE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__DASDL_PROPERTY = RelationalPackage.TD_TABLE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__PROPERTIES = RelationalPackage.TD_TABLE__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__ID = RelationalPackage.TD_TABLE__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__COMMENT = RelationalPackage.TD_TABLE__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__LABEL = RelationalPackage.TD_TABLE__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__READ_ONLY = RelationalPackage.TD_TABLE__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__SYNCHRONISED = RelationalPackage.TD_TABLE__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__DIVERGENCY = RelationalPackage.TD_TABLE__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__OWNED_ELEMENT = RelationalPackage.TD_TABLE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__IS_ABSTRACT = RelationalPackage.TD_TABLE__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__FEATURE = RelationalPackage.TD_TABLE__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__STRUCTURAL_FEATURE = RelationalPackage.TD_TABLE__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__PARAMETER = RelationalPackage.TD_TABLE__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__GENERALIZATION = RelationalPackage.TD_TABLE__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__SPECIALIZATION = RelationalPackage.TD_TABLE__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__INSTANCE = RelationalPackage.TD_TABLE__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__ALIAS = RelationalPackage.TD_TABLE__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__EXPRESSION_NODE = RelationalPackage.TD_TABLE__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__MAPPING_FROM = RelationalPackage.TD_TABLE__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__MAPPING_TO = RelationalPackage.TD_TABLE__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__CLASSIFIER_MAP = RelationalPackage.TD_TABLE__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__CF_MAP = RelationalPackage.TD_TABLE__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__DOMAIN = RelationalPackage.TD_TABLE__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__SIMPLE_DIMENSION = RelationalPackage.TD_TABLE__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__INDEX = RelationalPackage.TD_TABLE__INDEX;

    /**
     * The feature id for the '<em><b>Source Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__SOURCE_NAME = RelationalPackage.TD_TABLE__SOURCE_NAME;

    /**
     * The feature id for the '<em><b>Table Type</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__TABLE_TYPE = RelationalPackage.TD_TABLE__TABLE_TYPE;

    /**
     * The feature id for the '<em><b>Attached CDC</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__ATTACHED_CDC = RelationalPackage.TD_TABLE__ATTACHED_CDC;

    /**
     * The feature id for the '<em><b>Activated CDC</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__ACTIVATED_CDC = RelationalPackage.TD_TABLE__ACTIVATED_CDC;

    /**
     * The feature id for the '<em><b>Columns</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__COLUMNS = RelationalPackage.TD_TABLE__COLUMNS;

    /**
     * The feature id for the '<em><b>Connection</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__CONNECTION = RelationalPackage.TD_TABLE__CONNECTION;

    /**
     * The feature id for the '<em><b>Using Trigger</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__USING_TRIGGER = RelationalPackage.TD_TABLE__USING_TRIGGER;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__TYPE = RelationalPackage.TD_TABLE__TYPE;

    /**
     * The feature id for the '<em><b>Option Scope Column</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__OPTION_SCOPE_COLUMN = RelationalPackage.TD_TABLE__OPTION_SCOPE_COLUMN;

    /**
     * The feature id for the '<em><b>Is Temporary</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__IS_TEMPORARY = RelationalPackage.TD_TABLE__IS_TEMPORARY;

    /**
     * The feature id for the '<em><b>Temporary Scope</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__TEMPORARY_SCOPE = RelationalPackage.TD_TABLE__TEMPORARY_SCOPE;

    /**
     * The feature id for the '<em><b>Is System</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__IS_SYSTEM = RelationalPackage.TD_TABLE__IS_SYSTEM;

    /**
     * The feature id for the '<em><b>Trigger</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__TRIGGER = RelationalPackage.TD_TABLE__TRIGGER;

    /**
     * The feature id for the '<em><b>System</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE__SYSTEM = RelationalPackage.TD_TABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Subscriber Table</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_TABLE_FEATURE_COUNT = RelationalPackage.TD_TABLE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.SAPTestInputParameterTableImpl <em>SAP Test Input Parameter Table</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.SAPTestInputParameterTableImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getSAPTestInputParameterTable()
     * @generated
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE = 33;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__NAME = SAP_FUNCTION_PARAMETER_TABLE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__VISIBILITY = SAP_FUNCTION_PARAMETER_TABLE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__CLIENT_DEPENDENCY = SAP_FUNCTION_PARAMETER_TABLE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__SUPPLIER_DEPENDENCY = SAP_FUNCTION_PARAMETER_TABLE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__CONSTRAINT = SAP_FUNCTION_PARAMETER_TABLE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__NAMESPACE = SAP_FUNCTION_PARAMETER_TABLE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__IMPORTER = SAP_FUNCTION_PARAMETER_TABLE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__STEREOTYPE = SAP_FUNCTION_PARAMETER_TABLE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__TAGGED_VALUE = SAP_FUNCTION_PARAMETER_TABLE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__DOCUMENT = SAP_FUNCTION_PARAMETER_TABLE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__DESCRIPTION = SAP_FUNCTION_PARAMETER_TABLE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__RESPONSIBLE_PARTY = SAP_FUNCTION_PARAMETER_TABLE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__ELEMENT_NODE = SAP_FUNCTION_PARAMETER_TABLE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__SET = SAP_FUNCTION_PARAMETER_TABLE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__RENDERED_OBJECT = SAP_FUNCTION_PARAMETER_TABLE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__VOCABULARY_ELEMENT = SAP_FUNCTION_PARAMETER_TABLE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__MEASUREMENT = SAP_FUNCTION_PARAMETER_TABLE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__CHANGE_REQUEST = SAP_FUNCTION_PARAMETER_TABLE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__DASDL_PROPERTY = SAP_FUNCTION_PARAMETER_TABLE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__PROPERTIES = SAP_FUNCTION_PARAMETER_TABLE__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__ID = SAP_FUNCTION_PARAMETER_TABLE__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__COMMENT = SAP_FUNCTION_PARAMETER_TABLE__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__LABEL = SAP_FUNCTION_PARAMETER_TABLE__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__READ_ONLY = SAP_FUNCTION_PARAMETER_TABLE__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__SYNCHRONISED = SAP_FUNCTION_PARAMETER_TABLE__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__DIVERGENCY = SAP_FUNCTION_PARAMETER_TABLE__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Columns</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__COLUMNS = SAP_FUNCTION_PARAMETER_TABLE__COLUMNS;

    /**
     * The feature id for the '<em><b>Function Unit</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE__FUNCTION_UNIT = SAP_FUNCTION_PARAMETER_TABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>SAP Test Input Parameter Table</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAP_TEST_INPUT_PARAMETER_TABLE_FEATURE_COUNT = SAP_FUNCTION_PARAMETER_TABLE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.ConceptImpl <em>Concept</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.ConceptImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getConcept()
     * @generated
     */
    int CONCEPT = 34;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__NAME = RelationalPackage.TD_TABLE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__VISIBILITY = RelationalPackage.TD_TABLE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__CLIENT_DEPENDENCY = RelationalPackage.TD_TABLE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__SUPPLIER_DEPENDENCY = RelationalPackage.TD_TABLE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__CONSTRAINT = RelationalPackage.TD_TABLE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONCEPT__NAMESPACE = RelationalPackage.TD_TABLE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__IMPORTER = RelationalPackage.TD_TABLE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__STEREOTYPE = RelationalPackage.TD_TABLE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__TAGGED_VALUE = RelationalPackage.TD_TABLE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__DOCUMENT = RelationalPackage.TD_TABLE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONCEPT__DESCRIPTION = RelationalPackage.TD_TABLE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__RESPONSIBLE_PARTY = RelationalPackage.TD_TABLE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONCEPT__ELEMENT_NODE = RelationalPackage.TD_TABLE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__SET = RelationalPackage.TD_TABLE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__RENDERED_OBJECT = RelationalPackage.TD_TABLE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__VOCABULARY_ELEMENT = RelationalPackage.TD_TABLE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONCEPT__MEASUREMENT = RelationalPackage.TD_TABLE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONCEPT__CHANGE_REQUEST = RelationalPackage.TD_TABLE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONCEPT__DASDL_PROPERTY = RelationalPackage.TD_TABLE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__PROPERTIES = RelationalPackage.TD_TABLE__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__ID = RelationalPackage.TD_TABLE__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__COMMENT = RelationalPackage.TD_TABLE__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__LABEL = RelationalPackage.TD_TABLE__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__READ_ONLY = RelationalPackage.TD_TABLE__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__SYNCHRONISED = RelationalPackage.TD_TABLE__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__DIVERGENCY = RelationalPackage.TD_TABLE__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__OWNED_ELEMENT = RelationalPackage.TD_TABLE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__IS_ABSTRACT = RelationalPackage.TD_TABLE__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__FEATURE = RelationalPackage.TD_TABLE__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__STRUCTURAL_FEATURE = RelationalPackage.TD_TABLE__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__PARAMETER = RelationalPackage.TD_TABLE__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONCEPT__GENERALIZATION = RelationalPackage.TD_TABLE__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONCEPT__SPECIALIZATION = RelationalPackage.TD_TABLE__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__INSTANCE = RelationalPackage.TD_TABLE__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__ALIAS = RelationalPackage.TD_TABLE__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__EXPRESSION_NODE = RelationalPackage.TD_TABLE__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONCEPT__MAPPING_FROM = RelationalPackage.TD_TABLE__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__MAPPING_TO = RelationalPackage.TD_TABLE__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONCEPT__CLASSIFIER_MAP = RelationalPackage.TD_TABLE__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__CF_MAP = RelationalPackage.TD_TABLE__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__DOMAIN = RelationalPackage.TD_TABLE__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__SIMPLE_DIMENSION = RelationalPackage.TD_TABLE__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__INDEX = RelationalPackage.TD_TABLE__INDEX;

    /**
     * The feature id for the '<em><b>Source Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__SOURCE_NAME = RelationalPackage.TD_TABLE__SOURCE_NAME;

    /**
     * The feature id for the '<em><b>Table Type</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__TABLE_TYPE = RelationalPackage.TD_TABLE__TABLE_TYPE;

    /**
     * The feature id for the '<em><b>Attached CDC</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__ATTACHED_CDC = RelationalPackage.TD_TABLE__ATTACHED_CDC;

    /**
     * The feature id for the '<em><b>Activated CDC</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__ACTIVATED_CDC = RelationalPackage.TD_TABLE__ACTIVATED_CDC;

    /**
     * The feature id for the '<em><b>Columns</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__COLUMNS = RelationalPackage.TD_TABLE__COLUMNS;

    /**
     * The feature id for the '<em><b>Connection</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__CONNECTION = RelationalPackage.TD_TABLE__CONNECTION;

    /**
     * The feature id for the '<em><b>Using Trigger</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONCEPT__USING_TRIGGER = RelationalPackage.TD_TABLE__USING_TRIGGER;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__TYPE = RelationalPackage.TD_TABLE__TYPE;

    /**
     * The feature id for the '<em><b>Option Scope Column</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__OPTION_SCOPE_COLUMN = RelationalPackage.TD_TABLE__OPTION_SCOPE_COLUMN;

    /**
     * The feature id for the '<em><b>Is Temporary</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__IS_TEMPORARY = RelationalPackage.TD_TABLE__IS_TEMPORARY;

    /**
     * The feature id for the '<em><b>Temporary Scope</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__TEMPORARY_SCOPE = RelationalPackage.TD_TABLE__TEMPORARY_SCOPE;

    /**
     * The feature id for the '<em><b>Is System</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__IS_SYSTEM = RelationalPackage.TD_TABLE__IS_SYSTEM;

    /**
     * The feature id for the '<em><b>Trigger</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__TRIGGER = RelationalPackage.TD_TABLE__TRIGGER;

    /**
     * The feature id for the '<em><b>Loop Expression</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__LOOP_EXPRESSION = RelationalPackage.TD_TABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Loop Limit</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__LOOP_LIMIT = RelationalPackage.TD_TABLE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Concept Targets</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__CONCEPT_TARGETS = RelationalPackage.TD_TABLE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Input Model</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__INPUT_MODEL = RelationalPackage.TD_TABLE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Group</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__GROUP = RelationalPackage.TD_TABLE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Root</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__ROOT = RelationalPackage.TD_TABLE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Loop</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__LOOP = RelationalPackage.TD_TABLE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Concept Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__CONCEPT_TYPE = RelationalPackage.TD_TABLE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>XPath Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT__XPATH_PREFIX = RelationalPackage.TD_TABLE_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Concept</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT_FEATURE_COUNT = RelationalPackage.TD_TABLE_FEATURE_COUNT + 9;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.ConceptTargetImpl <em>Concept Target</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.ConceptTargetImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getConceptTarget()
     * @generated
     */
    int CONCEPT_TARGET = 35;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int CONCEPT_TARGET__SCHEMA = 0;

    /**
     * The feature id for the '<em><b>Target Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT_TARGET__TARGET_NAME = 1;

    /**
     * The feature id for the '<em><b>Relative Loop Expression</b></em>' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT_TARGET__RELATIVE_LOOP_EXPRESSION = 2;

    /**
     * The number of structural features of the '<em>Concept Target</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCEPT_TARGET_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.HL7ConnectionImpl <em>HL7 Connection</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.HL7ConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getHL7Connection()
     * @generated
     */
    int HL7_CONNECTION = 36;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__NAME = FILE_CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__VISIBILITY = FILE_CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__CLIENT_DEPENDENCY = FILE_CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__SUPPLIER_DEPENDENCY = FILE_CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__CONSTRAINT = FILE_CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__NAMESPACE = FILE_CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__IMPORTER = FILE_CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__STEREOTYPE = FILE_CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__TAGGED_VALUE = FILE_CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__DOCUMENT = FILE_CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__DESCRIPTION = FILE_CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__RESPONSIBLE_PARTY = FILE_CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__ELEMENT_NODE = FILE_CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__SET = FILE_CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__RENDERED_OBJECT = FILE_CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__VOCABULARY_ELEMENT = FILE_CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__MEASUREMENT = FILE_CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__CHANGE_REQUEST = FILE_CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__DASDL_PROPERTY = FILE_CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__PROPERTIES = FILE_CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__ID = FILE_CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__COMMENT = FILE_CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__LABEL = FILE_CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__READ_ONLY = FILE_CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__SYNCHRONISED = FILE_CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__DIVERGENCY = FILE_CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__OWNED_ELEMENT = FILE_CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__IMPORTED_ELEMENT = FILE_CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__DATA_MANAGER = FILE_CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__PATHNAME = FILE_CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__MACHINE = FILE_CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = FILE_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__COMPONENT = FILE_CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__IS_CASE_SENSITIVE = FILE_CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__CLIENT_CONNECTION = FILE_CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__DATA_PACKAGE = FILE_CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__RESOURCE_CONNECTION = FILE_CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__VERSION = FILE_CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__QUERIES = FILE_CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__CONTEXT_MODE = FILE_CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__CONTEXT_ID = FILE_CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Server</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__SERVER = FILE_CONNECTION__SERVER;

    /**
     * The feature id for the '<em><b>File Path</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__FILE_PATH = FILE_CONNECTION__FILE_PATH;

    /**
     * The feature id for the '<em><b>Format</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__FORMAT = FILE_CONNECTION__FORMAT;

    /**
     * The feature id for the '<em><b>Encoding</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__ENCODING = FILE_CONNECTION__ENCODING;

    /**
     * The feature id for the '<em><b>Field Separator Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__FIELD_SEPARATOR_VALUE = FILE_CONNECTION__FIELD_SEPARATOR_VALUE;

    /**
     * The feature id for the '<em><b>Row Separator Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__ROW_SEPARATOR_TYPE = FILE_CONNECTION__ROW_SEPARATOR_TYPE;

    /**
     * The feature id for the '<em><b>Row Separator Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__ROW_SEPARATOR_VALUE = FILE_CONNECTION__ROW_SEPARATOR_VALUE;

    /**
     * The feature id for the '<em><b>Text Identifier</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__TEXT_IDENTIFIER = FILE_CONNECTION__TEXT_IDENTIFIER;

    /**
     * The feature id for the '<em><b>Use Header</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__USE_HEADER = FILE_CONNECTION__USE_HEADER;

    /**
     * The feature id for the '<em><b>Header Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__HEADER_VALUE = FILE_CONNECTION__HEADER_VALUE;

    /**
     * The feature id for the '<em><b>Use Footer</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__USE_FOOTER = FILE_CONNECTION__USE_FOOTER;

    /**
     * The feature id for the '<em><b>Footer Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__FOOTER_VALUE = FILE_CONNECTION__FOOTER_VALUE;

    /**
     * The feature id for the '<em><b>Use Limit</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__USE_LIMIT = FILE_CONNECTION__USE_LIMIT;

    /**
     * The feature id for the '<em><b>Limit Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__LIMIT_VALUE = FILE_CONNECTION__LIMIT_VALUE;

    /**
     * The feature id for the '<em><b>First Line Caption</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__FIRST_LINE_CAPTION = FILE_CONNECTION__FIRST_LINE_CAPTION;

    /**
     * The feature id for the '<em><b>Remove Empty Row</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__REMOVE_EMPTY_ROW = FILE_CONNECTION__REMOVE_EMPTY_ROW;

    /**
     * The feature id for the '<em><b>Escape Type</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__ESCAPE_TYPE = FILE_CONNECTION__ESCAPE_TYPE;

    /**
     * The feature id for the '<em><b>Escape Char</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__ESCAPE_CHAR = FILE_CONNECTION__ESCAPE_CHAR;

    /**
     * The feature id for the '<em><b>Text Enclosure</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__TEXT_ENCLOSURE = FILE_CONNECTION__TEXT_ENCLOSURE;

    /**
     * The feature id for the '<em><b>Csv Option</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__CSV_OPTION = FILE_CONNECTION__CSV_OPTION;

    /**
     * The feature id for the '<em><b>Start Char</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__START_CHAR = FILE_CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>End Char</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__END_CHAR = FILE_CONNECTION_FEATURE_COUNT + 1;

    /**
     * <<<<<<< .mine The feature id for the '<em><b>Root</b></em>' reference list. <!-- begin-user-doc --> <!--
     * end-user-doc --> ======= The feature id for the '<em><b>Root</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc --> >>>>>>> .r46225
     * 
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__ROOT = FILE_CONNECTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Output File Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- ======= The feature id for the '<em><b>Output File Path</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION__OUTPUT_FILE_PATH = FILE_CONNECTION_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>HL7 Connection</em>' class.
     * <!-- begin-user-doc --> <!-- >>>>>>>
     * .r46225 end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_CONNECTION_FEATURE_COUNT = FILE_CONNECTION_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.HeaderFooterConnectionImpl <em>Header Footer Connection</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.HeaderFooterConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getHeaderFooterConnection()
     * @generated
     */
    int HEADER_FOOTER_CONNECTION = 37;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__NAME = CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__VISIBILITY = CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__CLIENT_DEPENDENCY = CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__SUPPLIER_DEPENDENCY = CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__CONSTRAINT = CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__NAMESPACE = CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__IMPORTER = CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__STEREOTYPE = CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__TAGGED_VALUE = CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__DOCUMENT = CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__DESCRIPTION = CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__RESPONSIBLE_PARTY = CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__ELEMENT_NODE = CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__SET = CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__RENDERED_OBJECT = CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__VOCABULARY_ELEMENT = CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__MEASUREMENT = CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__CHANGE_REQUEST = CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__DASDL_PROPERTY = CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__PROPERTIES = CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__ID = CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__COMMENT = CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__LABEL = CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__READ_ONLY = CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__SYNCHRONISED = CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__DIVERGENCY = CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__OWNED_ELEMENT = CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__IMPORTED_ELEMENT = CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__DATA_MANAGER = CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__PATHNAME = CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__MACHINE = CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__COMPONENT = CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__IS_CASE_SENSITIVE = CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__CLIENT_CONNECTION = CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__DATA_PACKAGE = CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__RESOURCE_CONNECTION = CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__VERSION = CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__QUERIES = CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__CONTEXT_MODE = CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__CONTEXT_ID = CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Is Header</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__IS_HEADER = CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Imports</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__IMPORTS = CONNECTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Main Code</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__MAIN_CODE = CONNECTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Libraries</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION__LIBRARIES = CONNECTION_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Header Footer Connection</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FOOTER_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.XMLFileNodeImpl <em>XML File Node</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.XMLFileNodeImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getXMLFileNode()
     * @generated
     */
    int XML_FILE_NODE = 38;

    /**
     * The feature id for the '<em><b>XML Path</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_NODE__XML_PATH = 0;

    /**
     * The feature id for the '<em><b>Related Column</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_NODE__RELATED_COLUMN = 1;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_NODE__DEFAULT_VALUE = 2;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_NODE__ATTRIBUTE = 3;

    /**
     * The feature id for the '<em><b>Order</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_NODE__ORDER = 4;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_NODE__TYPE = 5;

    /**
     * The number of structural features of the '<em>XML File Node</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_FILE_NODE_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.WSDLParameterImpl <em>WSDL Parameter</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.WSDLParameterImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getWSDLParameter()
     * @generated
     */
    int WSDL_PARAMETER = 39;

    /**
     * The feature id for the '<em><b>Element</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_PARAMETER__ELEMENT = 0;

    /**
     * The feature id for the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_PARAMETER__SOURCE = 1;

    /**
     * The feature id for the '<em><b>Column</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_PARAMETER__COLUMN = 2;

    /**
     * The feature id for the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_PARAMETER__EXPRESSION = 3;

    /**
     * The feature id for the '<em><b>Parameter Info</b></em>' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_PARAMETER__PARAMETER_INFO = 4;

    /**
     * The feature id for the '<em><b>Parameter Info Parent</b></em>' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_PARAMETER__PARAMETER_INFO_PARENT = 5;

    /**
     * The number of structural features of the '<em>WSDL Parameter</em>' class.
     * <!-- begin-user-doc --> <!-- =======
     * The number of structural features of the '<em>WSDL Parameter</em>' class. <!-- begin-user-doc --> <!-- >>>>>>>
     * .r46225 end-user-doc -->
     * @generated
     * @ordered
     */
    int WSDL_PARAMETER_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.GenericPackageImpl <em>Generic Package</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.GenericPackageImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getGenericPackage()
     * @generated
     */
    int GENERIC_PACKAGE = 40;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_PACKAGE__NAME = CorePackage.PACKAGE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_PACKAGE__VISIBILITY = CorePackage.PACKAGE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_PACKAGE__CLIENT_DEPENDENCY = CorePackage.PACKAGE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_PACKAGE__SUPPLIER_DEPENDENCY = CorePackage.PACKAGE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_PACKAGE__CONSTRAINT = CorePackage.PACKAGE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_PACKAGE__NAMESPACE = CorePackage.PACKAGE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_PACKAGE__IMPORTER = CorePackage.PACKAGE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_PACKAGE__STEREOTYPE = CorePackage.PACKAGE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_PACKAGE__TAGGED_VALUE = CorePackage.PACKAGE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_PACKAGE__DOCUMENT = CorePackage.PACKAGE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_PACKAGE__DESCRIPTION = CorePackage.PACKAGE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_PACKAGE__RESPONSIBLE_PARTY = CorePackage.PACKAGE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_PACKAGE__ELEMENT_NODE = CorePackage.PACKAGE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_PACKAGE__SET = CorePackage.PACKAGE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_PACKAGE__RENDERED_OBJECT = CorePackage.PACKAGE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_PACKAGE__VOCABULARY_ELEMENT = CorePackage.PACKAGE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_PACKAGE__MEASUREMENT = CorePackage.PACKAGE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_PACKAGE__CHANGE_REQUEST = CorePackage.PACKAGE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_PACKAGE__DASDL_PROPERTY = CorePackage.PACKAGE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_PACKAGE__OWNED_ELEMENT = CorePackage.PACKAGE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_PACKAGE__IMPORTED_ELEMENT = CorePackage.PACKAGE__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int GENERIC_PACKAGE__DATA_MANAGER = CorePackage.PACKAGE__DATA_MANAGER;

    /**
     * The number of structural features of the '<em>Generic Package</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERIC_PACKAGE_FEATURE_COUNT = CorePackage.PACKAGE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.HL7FileNodeImpl <em>HL7 File Node</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.HL7FileNodeImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getHL7FileNode()
     * @generated
     */
    int HL7_FILE_NODE = 41;

    /**
     * The feature id for the '<em><b>File Path</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_FILE_NODE__FILE_PATH = 0;

    /**
     * The feature id for the '<em><b>Order</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_FILE_NODE__ORDER = 1;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_FILE_NODE__ATTRIBUTE = 2;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_FILE_NODE__DEFAULT_VALUE = 3;

    /**
     * The feature id for the '<em><b>Related Column</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_FILE_NODE__RELATED_COLUMN = 4;

    /**
     * The feature id for the '<em><b>Repeatable</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_FILE_NODE__REPEATABLE = 5;

    /**
     * The number of structural features of the '<em>HL7 File Node</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int HL7_FILE_NODE_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.FTPConnectionImpl <em>FTP Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.FTPConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getFTPConnection()
     * @generated
     */
    int FTP_CONNECTION = 42;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__NAME = CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__VISIBILITY = CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__CLIENT_DEPENDENCY = CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__SUPPLIER_DEPENDENCY = CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__CONSTRAINT = CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__NAMESPACE = CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__IMPORTER = CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__STEREOTYPE = CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__TAGGED_VALUE = CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__DOCUMENT = CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__DESCRIPTION = CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__RESPONSIBLE_PARTY = CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__ELEMENT_NODE = CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__SET = CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__RENDERED_OBJECT = CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__VOCABULARY_ELEMENT = CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__MEASUREMENT = CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__CHANGE_REQUEST = CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__DASDL_PROPERTY = CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__PROPERTIES = CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__ID = CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__COMMENT = CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__LABEL = CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__READ_ONLY = CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__SYNCHRONISED = CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__DIVERGENCY = CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__OWNED_ELEMENT = CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__IMPORTED_ELEMENT = CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__DATA_MANAGER = CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__PATHNAME = CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__MACHINE = CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__COMPONENT = CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__IS_CASE_SENSITIVE = CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__CLIENT_CONNECTION = CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__DATA_PACKAGE = CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__RESOURCE_CONNECTION = CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__VERSION = CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__QUERIES = CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__CONTEXT_MODE = CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__CONTEXT_ID = CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__HOST = CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__PORT = CONNECTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__USERNAME = CONNECTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__PASSWORD = CONNECTION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__MODE = CONNECTION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Ecoding</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__ECODING = CONNECTION_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>SFTP</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__SFTP = CONNECTION_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>FTPS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__FTPS = CONNECTION_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Method</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__METHOD = CONNECTION_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Keystore File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__KEYSTORE_FILE = CONNECTION_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Keystore Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__KEYSTORE_PASSWORD = CONNECTION_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Usesocks</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__USESOCKS = CONNECTION_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Proxyhost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__PROXYHOST = CONNECTION_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Proxyport</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__PROXYPORT = CONNECTION_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Proxyuser</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__PROXYUSER = CONNECTION_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Proxypassword</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__PROXYPASSWORD = CONNECTION_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Custom Encode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION__CUSTOM_ENCODE = CONNECTION_FEATURE_COUNT + 16;

    /**
     * The number of structural features of the '<em>FTP Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FTP_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 17;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.BRMSConnectionImpl <em>BRMS Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.BRMSConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getBRMSConnection()
     * @generated
     */
    int BRMS_CONNECTION = 43;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__NAME = CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__VISIBILITY = CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__CLIENT_DEPENDENCY = CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__SUPPLIER_DEPENDENCY = CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__CONSTRAINT = CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__NAMESPACE = CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__IMPORTER = CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__STEREOTYPE = CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__TAGGED_VALUE = CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__DOCUMENT = CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__DESCRIPTION = CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__RESPONSIBLE_PARTY = CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__ELEMENT_NODE = CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__SET = CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__RENDERED_OBJECT = CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__VOCABULARY_ELEMENT = CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__MEASUREMENT = CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__CHANGE_REQUEST = CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__DASDL_PROPERTY = CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__PROPERTIES = CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__ID = CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__COMMENT = CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__LABEL = CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__READ_ONLY = CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__SYNCHRONISED = CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__DIVERGENCY = CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__OWNED_ELEMENT = CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__IMPORTED_ELEMENT = CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__DATA_MANAGER = CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__PATHNAME = CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__MACHINE = CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__COMPONENT = CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__IS_CASE_SENSITIVE = CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__CLIENT_CONNECTION = CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__DATA_PACKAGE = CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__RESOURCE_CONNECTION = CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__VERSION = CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__QUERIES = CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__CONTEXT_MODE = CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__CONTEXT_ID = CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Xml Field</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__XML_FIELD = CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Url Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__URL_NAME = CONNECTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Class Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__CLASS_NAME = CONNECTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Module Used</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__MODULE_USED = CONNECTION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Root</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__ROOT = CONNECTION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__GROUP = CONNECTION_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Loop</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__LOOP = CONNECTION_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Package</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION__PACKAGE = CONNECTION_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>BRMS Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRMS_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 8;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.ConditionTypeImpl <em>Condition Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.ConditionTypeImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getConditionType()
     * @generated
     */
    int CONDITION_TYPE = 45;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.ValidationRulesConnectionImpl <em>Validation Rules Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.ValidationRulesConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getValidationRulesConnection()
     * @generated
     */
    int VALIDATION_RULES_CONNECTION = 44;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__NAME = CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__VISIBILITY = CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__CLIENT_DEPENDENCY = CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__SUPPLIER_DEPENDENCY = CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__CONSTRAINT = CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__NAMESPACE = CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__IMPORTER = CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__STEREOTYPE = CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__TAGGED_VALUE = CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__DOCUMENT = CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__DESCRIPTION = CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__RESPONSIBLE_PARTY = CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__ELEMENT_NODE = CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__SET = CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__RENDERED_OBJECT = CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__VOCABULARY_ELEMENT = CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__MEASUREMENT = CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__CHANGE_REQUEST = CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__DASDL_PROPERTY = CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__PROPERTIES = CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__ID = CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__COMMENT = CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__LABEL = CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__READ_ONLY = CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__SYNCHRONISED = CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__DIVERGENCY = CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__OWNED_ELEMENT = CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__IMPORTED_ELEMENT = CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__DATA_MANAGER = CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__PATHNAME = CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__MACHINE = CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__COMPONENT = CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__IS_CASE_SENSITIVE = CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__CLIENT_CONNECTION = CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__DATA_PACKAGE = CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__RESOURCE_CONNECTION = CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__VERSION = CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__QUERIES = CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__CONTEXT_MODE = CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__CONTEXT_ID = CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Is Select</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__IS_SELECT = CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Insert</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__IS_INSERT = CONNECTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Is Update</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__IS_UPDATE = CONNECTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Is Delete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__IS_DELETE = CONNECTION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__TYPE = CONNECTION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Base Schema</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__BASE_SCHEMA = CONNECTION_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Base Column Names</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__BASE_COLUMN_NAMES = CONNECTION_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Ref Schema</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__REF_SCHEMA = CONNECTION_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Ref Column Names</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__REF_COLUMN_NAMES = CONNECTION_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Java Condition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__JAVA_CONDITION = CONNECTION_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Sql Condition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__SQL_CONDITION = CONNECTION_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Logical Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__LOGICAL_OPERATOR = CONNECTION_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__CONDITIONS = CONNECTION_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Inner Joins</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__INNER_JOINS = CONNECTION_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Is Disallow</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__IS_DISALLOW = CONNECTION_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Is Reject Link</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION__IS_REJECT_LINK = CONNECTION_FEATURE_COUNT + 15;

    /**
     * The number of structural features of the '<em>Validation Rules Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RULES_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Input Column</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITION_TYPE__INPUT_COLUMN = 0;

    /**
     * The feature id for the '<em><b>Function</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITION_TYPE__FUNCTION = 1;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITION_TYPE__OPERATOR = 2;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITION_TYPE__VALUE = 3;

    /**
     * The number of structural features of the '<em>Condition Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITION_TYPE_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.InnerJoinMapImpl <em>Inner Join Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.InnerJoinMapImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getInnerJoinMap()
     * @generated
     */
    int INNER_JOIN_MAP = 46;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INNER_JOIN_MAP__KEY = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INNER_JOIN_MAP__VALUE = 1;

    /**
     * The number of structural features of the '<em>Inner Join Map</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INNER_JOIN_MAP_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.impl.EDIFACTConnectionImpl <em>EDIFACT Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.impl.EDIFACTConnectionImpl
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getEDIFACTConnection()
     * @generated
     */
    int EDIFACT_CONNECTION = 47;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__NAME = CONNECTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__VISIBILITY = CONNECTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__CLIENT_DEPENDENCY = CONNECTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__SUPPLIER_DEPENDENCY = CONNECTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__CONSTRAINT = CONNECTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__NAMESPACE = CONNECTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__IMPORTER = CONNECTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__STEREOTYPE = CONNECTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__TAGGED_VALUE = CONNECTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__DOCUMENT = CONNECTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__DESCRIPTION = CONNECTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__RESPONSIBLE_PARTY = CONNECTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__ELEMENT_NODE = CONNECTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__SET = CONNECTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__RENDERED_OBJECT = CONNECTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__VOCABULARY_ELEMENT = CONNECTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__MEASUREMENT = CONNECTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__CHANGE_REQUEST = CONNECTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__DASDL_PROPERTY = CONNECTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Properties</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__PROPERTIES = CONNECTION__PROPERTIES;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__ID = CONNECTION__ID;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__COMMENT = CONNECTION__COMMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__LABEL = CONNECTION__LABEL;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__READ_ONLY = CONNECTION__READ_ONLY;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__SYNCHRONISED = CONNECTION__SYNCHRONISED;

    /**
     * The feature id for the '<em><b>Divergency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__DIVERGENCY = CONNECTION__DIVERGENCY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__OWNED_ELEMENT = CONNECTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__IMPORTED_ELEMENT = CONNECTION__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__DATA_MANAGER = CONNECTION__DATA_MANAGER;

    /**
     * The feature id for the '<em><b>Pathname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__PATHNAME = CONNECTION__PATHNAME;

    /**
     * The feature id for the '<em><b>Machine</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__MACHINE = CONNECTION__MACHINE;

    /**
     * The feature id for the '<em><b>Deployed Software System</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__DEPLOYED_SOFTWARE_SYSTEM = CONNECTION__DEPLOYED_SOFTWARE_SYSTEM;

    /**
     * The feature id for the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__COMPONENT = CONNECTION__COMPONENT;

    /**
     * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__IS_CASE_SENSITIVE = CONNECTION__IS_CASE_SENSITIVE;

    /**
     * The feature id for the '<em><b>Client Connection</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__CLIENT_CONNECTION = CONNECTION__CLIENT_CONNECTION;

    /**
     * The feature id for the '<em><b>Data Package</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__DATA_PACKAGE = CONNECTION__DATA_PACKAGE;

    /**
     * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__RESOURCE_CONNECTION = CONNECTION__RESOURCE_CONNECTION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__VERSION = CONNECTION__VERSION;

    /**
     * The feature id for the '<em><b>Queries</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__QUERIES = CONNECTION__QUERIES;

    /**
     * The feature id for the '<em><b>Context Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__CONTEXT_MODE = CONNECTION__CONTEXT_MODE;

    /**
     * The feature id for the '<em><b>Context Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__CONTEXT_ID = CONNECTION__CONTEXT_ID;

    /**
     * The feature id for the '<em><b>Xml Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__XML_NAME = CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__FILE_NAME = CONNECTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Xml Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__XML_PATH = CONNECTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Input Model</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__INPUT_MODEL = CONNECTION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Xml Node</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION__XML_NODE = CONNECTION_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>EDIFACT Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDIFACT_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.FileFormat <em>File Format</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.FileFormat
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getFileFormat()
     * @generated
     */
    int FILE_FORMAT = 48;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.FieldSeparator <em>Field Separator</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.FieldSeparator
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getFieldSeparator()
     * @generated
     */
    int FIELD_SEPARATOR = 49;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.Escape <em>Escape</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.Escape
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getEscape()
     * @generated
     */
    int ESCAPE = 50;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.RowSeparator <em>Row Separator</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.RowSeparator
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getRowSeparator()
     * @generated
     */
    int ROW_SEPARATOR = 51;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.MDMConnectionProtocol <em>MDM Connection Protocol</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.MDMConnectionProtocol
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getMDMConnectionProtocol()
     * @generated
     */
    int MDM_CONNECTION_PROTOCOL = 52;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.MdmConceptType <em>Mdm Concept Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.MdmConceptType
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getMdmConceptType()
     * @generated
     */
    int MDM_CONCEPT_TYPE = 53;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.RuleType <em>Rule Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.RuleType
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getRuleType()
     * @generated
     */
    int RULE_TYPE = 54;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.Function <em>Function</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.Function
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getFunction()
     * @generated
     */
    int FUNCTION = 55;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.Operator <em>Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.Operator
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getOperator()
     * @generated
     */
    int OPERATOR = 56;

    /**
     * The meta object id for the '{@link org.talend.core.model.metadata.builder.connection.LogicalOperator <em>Logical Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.core.model.metadata.builder.connection.LogicalOperator
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getLogicalOperator()
     * @generated
     */
    int LOGICAL_OPERATOR = 57;

    /**
     * The meta object id for the '<em>Map</em>' data type.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see java.util.HashMap
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getMap()
     * @generated
     */
    int MAP = 58;

    /**
     * The meta object id for the '<em>List</em>' data type.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see java.util.ArrayList
     * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getList()
     * @generated
     */
    int LIST = 59;

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.Metadata <em>Metadata</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Metadata</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Metadata
     * @generated
     */
    EClass getMetadata();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.talend.core.model.metadata.builder.connection.Metadata#getConnections <em>Connections</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Connections</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Metadata#getConnections()
     * @see #getMetadata()
     * @generated
     */
    EReference getMetadata_Connections();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.Connection <em>Connection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Connection
     * @generated
     */
    EClass getConnection();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.Connection#getVersion <em>Version</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Connection#getVersion()
     * @see #getConnection()
     * @generated
     */
    EAttribute getConnection_Version();

    /**
     * Returns the meta object for the containment reference '
     * {@link org.talend.core.model.metadata.builder.connection.Connection#getQueries <em>Queries</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference '<em>Queries</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Connection#getQueries()
     * @see #getConnection()
     * @generated
     */
    EReference getConnection_Queries();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.Connection#isContextMode <em>Context Mode</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Context Mode</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Connection#isContextMode()
     * @see #getConnection()
     * @generated
     */
    EAttribute getConnection_ContextMode();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.Connection#getContextId <em>Context Id</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Context Id</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Connection#getContextId()
     * @see #getConnection()
     * @generated
     */
    EAttribute getConnection_ContextId();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.MetadataColumn <em>Metadata Column</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Metadata Column</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MetadataColumn
     * @generated
     */
    EClass getMetadataColumn();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.MetadataColumn#getSourceType <em>Source Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Type</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MetadataColumn#getSourceType()
     * @see #getMetadataColumn()
     * @generated
     */
    EAttribute getMetadataColumn_SourceType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.MetadataColumn#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MetadataColumn#getDefaultValue()
     * @see #getMetadataColumn()
     * @generated
     */
    EAttribute getMetadataColumn_DefaultValue();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.MetadataColumn#getTalendType <em>Talend Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Talend Type</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MetadataColumn#getTalendType()
     * @see #getMetadataColumn()
     * @generated
     */
    EAttribute getMetadataColumn_TalendType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.MetadataColumn#isKey <em>Key</em>}'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MetadataColumn#isKey()
     * @see #getMetadataColumn()
     * @generated
     */
    EAttribute getMetadataColumn_Key();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.MetadataColumn#isNullable <em>Nullable</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Nullable</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MetadataColumn#isNullable()
     * @see #getMetadataColumn()
     * @generated
     */
    EAttribute getMetadataColumn_Nullable();

    /**
     * Returns the meta object for the reference '
     * {@link org.talend.core.model.metadata.builder.connection.MetadataColumn#getTable <em>Table</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the reference '<em>Table</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MetadataColumn#getTable()
     * @see #getMetadataColumn()
     * @generated
     */
    EReference getMetadataColumn_Table();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.MetadataColumn#getOriginalField <em>Original Field</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Original Field</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MetadataColumn#getOriginalField()
     * @see #getMetadataColumn()
     * @generated
     */
    EAttribute getMetadataColumn_OriginalField();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.MetadataColumn#getPattern <em>Pattern</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Pattern</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MetadataColumn#getPattern()
     * @see #getMetadataColumn()
     * @generated
     */
    EAttribute getMetadataColumn_Pattern();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.MetadataColumn#getDisplayField <em>Display Field</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Display Field</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MetadataColumn#getDisplayField()
     * @see #getMetadataColumn()
     * @generated
     */
    EAttribute getMetadataColumn_DisplayField();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.MetadataColumn#getRelatedEntity <em>Related Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Related Entity</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MetadataColumn#getRelatedEntity()
     * @see #getMetadataColumn()
     * @generated
     */
    EAttribute getMetadataColumn_RelatedEntity();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.MetadataColumn#getRelationshipType <em>Relationship Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Relationship Type</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MetadataColumn#getRelationshipType()
     * @see #getMetadataColumn()
     * @generated
     */
    EAttribute getMetadataColumn_RelationshipType();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.AbstractMetadataObject <em>Abstract Metadata Object</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Metadata Object</em>'.
     * @see org.talend.core.model.metadata.builder.connection.AbstractMetadataObject
     * @generated
     */
    EClass getAbstractMetadataObject();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.AbstractMetadataObject#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Properties</em>'.
     * @see org.talend.core.model.metadata.builder.connection.AbstractMetadataObject#getProperties()
     * @see #getAbstractMetadataObject()
     * @generated
     */
    EAttribute getAbstractMetadataObject_Properties();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.AbstractMetadataObject#getId <em>Id</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.talend.core.model.metadata.builder.connection.AbstractMetadataObject#getId()
     * @see #getAbstractMetadataObject()
     * @generated
     */
    EAttribute getAbstractMetadataObject_Id();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.AbstractMetadataObject#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @see org.talend.core.model.metadata.builder.connection.AbstractMetadataObject#getComment()
     * @see #getAbstractMetadataObject()
     * @generated
     */
    EAttribute getAbstractMetadataObject_Comment();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.AbstractMetadataObject#getLabel <em>Label</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see org.talend.core.model.metadata.builder.connection.AbstractMetadataObject#getLabel()
     * @see #getAbstractMetadataObject()
     * @generated
     */
    EAttribute getAbstractMetadataObject_Label();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.AbstractMetadataObject#isReadOnly <em>Read Only</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Read Only</em>'.
     * @see org.talend.core.model.metadata.builder.connection.AbstractMetadataObject#isReadOnly()
     * @see #getAbstractMetadataObject()
     * @generated
     */
    EAttribute getAbstractMetadataObject_ReadOnly();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.AbstractMetadataObject#isSynchronised <em>Synchronised</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Synchronised</em>'.
     * @see org.talend.core.model.metadata.builder.connection.AbstractMetadataObject#isSynchronised()
     * @see #getAbstractMetadataObject()
     * @generated
     */
    EAttribute getAbstractMetadataObject_Synchronised();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.AbstractMetadataObject#isDivergency <em>Divergency</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Divergency</em>'.
     * @see org.talend.core.model.metadata.builder.connection.AbstractMetadataObject#isDivergency()
     * @see #getAbstractMetadataObject()
     * @generated
     */
    EAttribute getAbstractMetadataObject_Divergency();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.MetadataTable <em>Metadata Table</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Metadata Table</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MetadataTable
     * @generated
     */
    EClass getMetadataTable();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.MetadataTable#getSourceName <em>Source Name</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Source Name</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MetadataTable#getSourceName()
     * @see #getMetadataTable()
     * @generated
     */
    EAttribute getMetadataTable_SourceName();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.MetadataTable#getTableType <em>Table Type</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Table Type</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MetadataTable#getTableType()
     * @see #getMetadataTable()
     * @generated
     */
    EAttribute getMetadataTable_TableType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.MetadataTable#isAttachedCDC <em>Attached CDC</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Attached CDC</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MetadataTable#isAttachedCDC()
     * @see #getMetadataTable()
     * @generated
     */
    EAttribute getMetadataTable_AttachedCDC();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.MetadataTable#isActivatedCDC <em>Activated CDC</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Activated CDC</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MetadataTable#isActivatedCDC()
     * @see #getMetadataTable()
     * @generated
     */
    EAttribute getMetadataTable_ActivatedCDC();

    /**
     * Returns the meta object for the reference list '
     * {@link org.talend.core.model.metadata.builder.connection.MetadataTable#getColumns <em>Columns</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the reference list '<em>Columns</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MetadataTable#getColumns()
     * @see #getMetadataTable()
     * @generated
     */
    EReference getMetadataTable_Columns();

    /**
     * Returns the meta object for the reference '
     * {@link org.talend.core.model.metadata.builder.connection.MetadataTable#getConnection <em>Connection</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the reference '<em>Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MetadataTable#getConnection()
     * @see #getMetadataTable()
     * @generated
     */
    EReference getMetadataTable_Connection();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.FileConnection <em>File Connection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>File Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileConnection
     * @generated
     */
    EClass getFileConnection();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.FileConnection#getServer <em>Server</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Server</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileConnection#getServer()
     * @see #getFileConnection()
     * @generated
     */
    EAttribute getFileConnection_Server();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.FileConnection#getFilePath <em>File Path</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>File Path</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileConnection#getFilePath()
     * @see #getFileConnection()
     * @generated
     */
    EAttribute getFileConnection_FilePath();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.FileConnection#getFormat <em>Format</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Format</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileConnection#getFormat()
     * @see #getFileConnection()
     * @generated
     */
    EAttribute getFileConnection_Format();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.FileConnection#getEncoding <em>Encoding</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Encoding</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileConnection#getEncoding()
     * @see #getFileConnection()
     * @generated
     */
    EAttribute getFileConnection_Encoding();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FileConnection#getFieldSeparatorValue <em>Field Separator Value</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Field Separator Value</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileConnection#getFieldSeparatorValue()
     * @see #getFileConnection()
     * @generated
     */
    EAttribute getFileConnection_FieldSeparatorValue();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FileConnection#getRowSeparatorType <em>Row Separator Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Row Separator Type</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileConnection#getRowSeparatorType()
     * @see #getFileConnection()
     * @generated
     */
    EAttribute getFileConnection_RowSeparatorType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FileConnection#getRowSeparatorValue <em>Row Separator Value</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Row Separator Value</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileConnection#getRowSeparatorValue()
     * @see #getFileConnection()
     * @generated
     */
    EAttribute getFileConnection_RowSeparatorValue();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FileConnection#getTextIdentifier <em>Text Identifier</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Text Identifier</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileConnection#getTextIdentifier()
     * @see #getFileConnection()
     * @generated
     */
    EAttribute getFileConnection_TextIdentifier();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.FileConnection#isUseHeader <em>Use Header</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Use Header</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileConnection#isUseHeader()
     * @see #getFileConnection()
     * @generated
     */
    EAttribute getFileConnection_UseHeader();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FileConnection#getHeaderValue <em>Header Value</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Header Value</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileConnection#getHeaderValue()
     * @see #getFileConnection()
     * @generated
     */
    EAttribute getFileConnection_HeaderValue();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.FileConnection#isUseFooter <em>Use Footer</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Use Footer</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileConnection#isUseFooter()
     * @see #getFileConnection()
     * @generated
     */
    EAttribute getFileConnection_UseFooter();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FileConnection#getFooterValue <em>Footer Value</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Footer Value</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileConnection#getFooterValue()
     * @see #getFileConnection()
     * @generated
     */
    EAttribute getFileConnection_FooterValue();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.FileConnection#isUseLimit <em>Use Limit</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Use Limit</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileConnection#isUseLimit()
     * @see #getFileConnection()
     * @generated
     */
    EAttribute getFileConnection_UseLimit();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FileConnection#getLimitValue <em>Limit Value</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Limit Value</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileConnection#getLimitValue()
     * @see #getFileConnection()
     * @generated
     */
    EAttribute getFileConnection_LimitValue();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FileConnection#isFirstLineCaption <em>First Line Caption</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>First Line Caption</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileConnection#isFirstLineCaption()
     * @see #getFileConnection()
     * @generated
     */
    EAttribute getFileConnection_FirstLineCaption();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FileConnection#isRemoveEmptyRow <em>Remove Empty Row</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remove Empty Row</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileConnection#isRemoveEmptyRow()
     * @see #getFileConnection()
     * @generated
     */
    EAttribute getFileConnection_RemoveEmptyRow();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FileConnection#getEscapeType <em>Escape Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Escape Type</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileConnection#getEscapeType()
     * @see #getFileConnection()
     * @generated
     */
    EAttribute getFileConnection_EscapeType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FileConnection#getEscapeChar <em>Escape Char</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Escape Char</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileConnection#getEscapeChar()
     * @see #getFileConnection()
     * @generated
     */
    EAttribute getFileConnection_EscapeChar();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FileConnection#getTextEnclosure <em>Text Enclosure</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Text Enclosure</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileConnection#getTextEnclosure()
     * @see #getFileConnection()
     * @generated
     */
    EAttribute getFileConnection_TextEnclosure();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.FileConnection#isCsvOption <em>Csv Option</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Csv Option</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileConnection#isCsvOption()
     * @see #getFileConnection()
     * @generated
     */
    EAttribute getFileConnection_CsvOption();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.DelimitedFileConnection <em>Delimited File Connection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Delimited File Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DelimitedFileConnection
     * @generated
     */
    EClass getDelimitedFileConnection();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.DelimitedFileConnection#getFieldSeparatorType <em>Field Separator Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Field Separator Type</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DelimitedFileConnection#getFieldSeparatorType()
     * @see #getDelimitedFileConnection()
     * @generated
     */
    EAttribute getDelimitedFileConnection_FieldSeparatorType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.DelimitedFileConnection#isSplitRecord <em>Split Record</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Split Record</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DelimitedFileConnection#isSplitRecord()
     * @see #getDelimitedFileConnection()
     * @generated
     */
    EAttribute getDelimitedFileConnection_SplitRecord();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.PositionalFileConnection <em>Positional File Connection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Positional File Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.PositionalFileConnection
     * @generated
     */
    EClass getPositionalFileConnection();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.EbcdicConnection <em>Ebcdic Connection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Ebcdic Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.EbcdicConnection
     * @generated
     */
    EClass getEbcdicConnection();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.EbcdicConnection#getMidFile <em>Mid File</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Mid File</em>'.
     * @see org.talend.core.model.metadata.builder.connection.EbcdicConnection#getMidFile()
     * @see #getEbcdicConnection()
     * @generated
     */
    EAttribute getEbcdicConnection_MidFile();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.EbcdicConnection#getDataFile <em>Data File</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Data File</em>'.
     * @see org.talend.core.model.metadata.builder.connection.EbcdicConnection#getDataFile()
     * @see #getEbcdicConnection()
     * @generated
     */
    EAttribute getEbcdicConnection_DataFile();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.MDMConnection <em>MDM Connection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>MDM Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MDMConnection
     * @generated
     */
    EClass getMDMConnection();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.MDMConnection#getUsername <em>Username</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Username</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MDMConnection#getUsername()
     * @see #getMDMConnection()
     * @generated
     */
    EAttribute getMDMConnection_Username();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.MDMConnection#getPassword <em>Password</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Password</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MDMConnection#getPassword()
     * @see #getMDMConnection()
     * @generated
     */
    EAttribute getMDMConnection_Password();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.MDMConnection#getPort <em>Port</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Port</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MDMConnection#getPort()
     * @see #getMDMConnection()
     * @generated
     */
    EAttribute getMDMConnection_Port();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.MDMConnection#getServer <em>Server</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Server</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MDMConnection#getServer()
     * @see #getMDMConnection()
     * @generated
     */
    EAttribute getMDMConnection_Server();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.MDMConnection#getUniverse <em>Universe</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Universe</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MDMConnection#getUniverse()
     * @see #getMDMConnection()
     * @generated
     */
    EAttribute getMDMConnection_Universe();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.MDMConnection#getDatamodel <em>Datamodel</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Datamodel</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MDMConnection#getDatamodel()
     * @see #getMDMConnection()
     * @generated
     */
    EAttribute getMDMConnection_Datamodel();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.MDMConnection#getDatacluster <em>Datacluster</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Datacluster</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MDMConnection#getDatacluster()
     * @see #getMDMConnection()
     * @generated
     */
    EAttribute getMDMConnection_Datacluster();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.talend.core.model.metadata.builder.connection.MDMConnection#getSchemas <em>Schemas</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Schemas</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MDMConnection#getSchemas()
     * @see #getMDMConnection()
     * @generated
     */
    EReference getMDMConnection_Schemas();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.MDMConnection#getProtocol <em>Protocol</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Protocol</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MDMConnection#getProtocol()
     * @see #getMDMConnection()
     * @generated
     */
    EAttribute getMDMConnection_Protocol();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.MDMConnection#getContext <em>Context</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Context</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MDMConnection#getContext()
     * @see #getMDMConnection()
     * @generated
     */
    EAttribute getMDMConnection_Context();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.DatabaseConnection <em>Database Connection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Database Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection
     * @generated
     */
    EClass getDatabaseConnection();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#getDatabaseType <em>Database Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Database Type</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#getDatabaseType()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_DatabaseType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#getDriverJarPath <em>Driver Jar Path</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Driver Jar Path</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#getDriverJarPath()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_DriverJarPath();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#getDriverClass <em>Driver Class</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Driver Class</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#getDriverClass()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_DriverClass();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#getURL <em>URL</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>URL</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#getURL()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_URL();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#getDbVersionString <em>Db Version String</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Db Version String</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#getDbVersionString()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_DbVersionString();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#getPort <em>Port</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Port</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#getPort()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_Port();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#getUsername <em>Username</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Username</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#getUsername()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_Username();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#getPassword <em>Password</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Password</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#getPassword()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_Password();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#getServerName <em>Server Name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Server Name</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#getServerName()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_ServerName();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#getDatasourceName <em>Datasource Name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Datasource Name</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#getDatasourceName()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_DatasourceName();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#getFileFieldName <em>File Field Name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File Field Name</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#getFileFieldName()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_FileFieldName();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#getSID <em>SID</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>SID</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#getSID()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_SID();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#getSqlSynthax <em>Sql Synthax</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sql Synthax</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#getSqlSynthax()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_SqlSynthax();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#getStringQuote <em>String Quote</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>String Quote</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#getStringQuote()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_StringQuote();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#getNullChar <em>Null Char</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Null Char</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#getNullChar()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_NullChar();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#getDbmsId <em>Dbms Id</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Dbms Id</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#getDbmsId()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_DbmsId();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#getProductId <em>Product Id</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Product Id</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#getProductId()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_ProductId();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#getDBRootPath <em>DB Root Path</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>DB Root Path</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#getDBRootPath()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_DBRootPath();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#getAdditionalParams <em>Additional Params</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Additional Params</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#getAdditionalParams()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_AdditionalParams();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#isStandardSQL <em>Standard SQL</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Standard SQL</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#isStandardSQL()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_StandardSQL();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#isSystemSQL <em>System SQL</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>System SQL</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#isSystemSQL()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_SystemSQL();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#getCdcConns <em>Cdc Conns</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Cdc Conns</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#getCdcConns()
     * @see #getDatabaseConnection()
     * @generated
     */
    EReference getDatabaseConnection_CdcConns();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#getCdcTypeMode <em>Cdc Type Mode</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cdc Type Mode</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#getCdcTypeMode()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_CdcTypeMode();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#isSQLMode <em>SQL Mode</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>SQL Mode</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#isSQLMode()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_SQLMode();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.DatabaseConnection#getUiSchema <em>Ui Schema</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ui Schema</em>'.
     * @see org.talend.core.model.metadata.builder.connection.DatabaseConnection#getUiSchema()
     * @see #getDatabaseConnection()
     * @generated
     */
    EAttribute getDatabaseConnection_UiSchema();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.SAPConnection <em>SAP Connection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>SAP Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPConnection
     * @generated
     */
    EClass getSAPConnection();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.SAPConnection#getHost <em>Host</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Host</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPConnection#getHost()
     * @see #getSAPConnection()
     * @generated
     */
    EAttribute getSAPConnection_Host();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.SAPConnection#getUsername <em>Username</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Username</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPConnection#getUsername()
     * @see #getSAPConnection()
     * @generated
     */
    EAttribute getSAPConnection_Username();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.SAPConnection#getPassword <em>Password</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Password</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPConnection#getPassword()
     * @see #getSAPConnection()
     * @generated
     */
    EAttribute getSAPConnection_Password();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.SAPConnection#getClient <em>Client</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Client</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPConnection#getClient()
     * @see #getSAPConnection()
     * @generated
     */
    EAttribute getSAPConnection_Client();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SAPConnection#getSystemNumber <em>System Number</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>System Number</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPConnection#getSystemNumber()
     * @see #getSAPConnection()
     * @generated
     */
    EAttribute getSAPConnection_SystemNumber();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.SAPConnection#getLanguage <em>Language</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Language</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPConnection#getLanguage()
     * @see #getSAPConnection()
     * @generated
     */
    EAttribute getSAPConnection_Language();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.talend.core.model.metadata.builder.connection.SAPConnection#getFuntions <em>Funtions</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Funtions</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPConnection#getFuntions()
     * @see #getSAPConnection()
     * @generated
     */
    EReference getSAPConnection_Funtions();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SAPConnection#getCurrentFucntion <em>Current Fucntion</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Current Fucntion</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPConnection#getCurrentFucntion()
     * @see #getSAPConnection()
     * @generated
     */
    EAttribute getSAPConnection_CurrentFucntion();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.talend.core.model.metadata.builder.connection.SAPConnection#getIDocs <em>IDocs</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>IDocs</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPConnection#getIDocs()
     * @see #getSAPConnection()
     * @generated
     */
    EReference getSAPConnection_IDocs();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SAPConnection#getJcoVersion <em>Jco Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Jco Version</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPConnection#getJcoVersion()
     * @see #getSAPConnection()
     * @generated
     */
    EAttribute getSAPConnection_JcoVersion();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.SAPFunctionUnit <em>SAP Function Unit</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>SAP Function Unit</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPFunctionUnit
     * @generated
     */
    EClass getSAPFunctionUnit();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SAPFunctionUnit#getOutputType <em>Output Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output Type</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPFunctionUnit#getOutputType()
     * @see #getSAPFunctionUnit()
     * @generated
     */
    EAttribute getSAPFunctionUnit_OutputType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SAPFunctionUnit#getOutputTableName <em>Output Table Name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output Table Name</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPFunctionUnit#getOutputTableName()
     * @see #getSAPFunctionUnit()
     * @generated
     */
    EAttribute getSAPFunctionUnit_OutputTableName();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.core.model.metadata.builder.connection.SAPFunctionUnit#getInputParameterTable <em>Input Parameter Table</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Input Parameter Table</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPFunctionUnit#getInputParameterTable()
     * @see #getSAPFunctionUnit()
     * @generated
     */
    EReference getSAPFunctionUnit_InputParameterTable();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.core.model.metadata.builder.connection.SAPFunctionUnit#getOutputParameterTable <em>Output Parameter Table</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Output Parameter Table</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPFunctionUnit#getOutputParameterTable()
     * @see #getSAPFunctionUnit()
     * @generated
     */
    EReference getSAPFunctionUnit_OutputParameterTable();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.core.model.metadata.builder.connection.SAPFunctionUnit#getMetadataTable <em>Metadata Table</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Metadata Table</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPFunctionUnit#getMetadataTable()
     * @see #getSAPFunctionUnit()
     * @generated
     */
    EReference getSAPFunctionUnit_MetadataTable();

    /**
     * Returns the meta object for the container reference '{@link org.talend.core.model.metadata.builder.connection.SAPFunctionUnit#getConnection <em>Connection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPFunctionUnit#getConnection()
     * @see #getSAPFunctionUnit()
     * @generated
     */
    EReference getSAPFunctionUnit_Connection();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.talend.core.model.metadata.builder.connection.SAPFunctionUnit#getTables <em>Tables</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Tables</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPFunctionUnit#getTables()
     * @see #getSAPFunctionUnit()
     * @generated
     */
    EReference getSAPFunctionUnit_Tables();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.core.model.metadata.builder.connection.SAPFunctionUnit#getTestInputParameterTable <em>Test Input Parameter Table</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Test Input Parameter Table</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPFunctionUnit#getTestInputParameterTable()
     * @see #getSAPFunctionUnit()
     * @generated
     */
    EReference getSAPFunctionUnit_TestInputParameterTable();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.SAPIDocUnit <em>SAPI Doc Unit</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>SAPI Doc Unit</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPIDocUnit
     * @generated
     */
    EClass getSAPIDocUnit();

    /**
     * Returns the meta object for the container reference '
     * {@link org.talend.core.model.metadata.builder.connection.SAPIDocUnit#getConnection <em>Connection</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the container reference '<em>Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPIDocUnit#getConnection()
     * @see #getSAPIDocUnit()
     * @generated
     */
    EReference getSAPIDocUnit_Connection();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.SAPIDocUnit#getProgramId <em>Program Id</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Program Id</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPIDocUnit#getProgramId()
     * @see #getSAPIDocUnit()
     * @generated
     */
    EAttribute getSAPIDocUnit_ProgramId();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SAPIDocUnit#getGatewayService <em>Gateway Service</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Gateway Service</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPIDocUnit#getGatewayService()
     * @see #getSAPIDocUnit()
     * @generated
     */
    EAttribute getSAPIDocUnit_GatewayService();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SAPIDocUnit#isUseXmlOutput <em>Use Xml Output</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Xml Output</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPIDocUnit#isUseXmlOutput()
     * @see #getSAPIDocUnit()
     * @generated
     */
    EAttribute getSAPIDocUnit_UseXmlOutput();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.SAPIDocUnit#getXmlFile <em>Xml File</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Xml File</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPIDocUnit#getXmlFile()
     * @see #getSAPIDocUnit()
     * @generated
     */
    EAttribute getSAPIDocUnit_XmlFile();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SAPIDocUnit#isUseHtmlOutput <em>Use Html Output</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Html Output</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPIDocUnit#isUseHtmlOutput()
     * @see #getSAPIDocUnit()
     * @generated
     */
    EAttribute getSAPIDocUnit_UseHtmlOutput();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.SAPIDocUnit#getHtmlFile <em>Html File</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Html File</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPIDocUnit#getHtmlFile()
     * @see #getSAPIDocUnit()
     * @generated
     */
    EAttribute getSAPIDocUnit_HtmlFile();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.SAPFunctionParameterColumn <em>SAP Function Parameter Column</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>SAP Function Parameter Column</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPFunctionParameterColumn
     * @generated
     */
    EClass getSAPFunctionParameterColumn();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SAPFunctionParameterColumn#getParameterType <em>Parameter Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Parameter Type</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPFunctionParameterColumn#getParameterType()
     * @see #getSAPFunctionParameterColumn()
     * @generated
     */
    EAttribute getSAPFunctionParameterColumn_ParameterType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SAPFunctionParameterColumn#getStructureOrTableName <em>Structure Or Table Name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Structure Or Table Name</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPFunctionParameterColumn#getStructureOrTableName()
     * @see #getSAPFunctionParameterColumn()
     * @generated
     */
    EAttribute getSAPFunctionParameterColumn_StructureOrTableName();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SAPFunctionParameterColumn#getDataType <em>Data Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Type</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPFunctionParameterColumn#getDataType()
     * @see #getSAPFunctionParameterColumn()
     * @generated
     */
    EAttribute getSAPFunctionParameterColumn_DataType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SAPFunctionParameterColumn#getLength <em>Length</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Length</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPFunctionParameterColumn#getLength()
     * @see #getSAPFunctionParameterColumn()
     * @generated
     */
    EAttribute getSAPFunctionParameterColumn_Length();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SAPFunctionParameterColumn#getValue <em>Value</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPFunctionParameterColumn#getValue()
     * @see #getSAPFunctionParameterColumn()
     * @generated
     */
    EAttribute getSAPFunctionParameterColumn_Value();

    /**
     * Returns the meta object for the container reference '{@link org.talend.core.model.metadata.builder.connection.SAPFunctionParameterColumn#getParameterTable <em>Parameter Table</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parameter Table</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPFunctionParameterColumn#getParameterTable()
     * @see #getSAPFunctionParameterColumn()
     * @generated
     */
    EReference getSAPFunctionParameterColumn_ParameterTable();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.SAPFunctionParameterTable <em>SAP Function Parameter Table</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>SAP Function Parameter Table</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPFunctionParameterTable
     * @generated
     */
    EClass getSAPFunctionParameterTable();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.core.model.metadata.builder.connection.SAPFunctionParameterTable#getColumns <em>Columns</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Columns</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPFunctionParameterTable#getColumns()
     * @see #getSAPFunctionParameterTable()
     * @generated
     */
    EReference getSAPFunctionParameterTable_Columns();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.InputSAPFunctionParameterTable <em>Input SAP Function Parameter Table</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Input SAP Function Parameter Table</em>'.
     * @see org.talend.core.model.metadata.builder.connection.InputSAPFunctionParameterTable
     * @generated
     */
    EClass getInputSAPFunctionParameterTable();

    /**
     * Returns the meta object for the container reference '{@link org.talend.core.model.metadata.builder.connection.InputSAPFunctionParameterTable#getFunctionUnit <em>Function Unit</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Function Unit</em>'.
     * @see org.talend.core.model.metadata.builder.connection.InputSAPFunctionParameterTable#getFunctionUnit()
     * @see #getInputSAPFunctionParameterTable()
     * @generated
     */
    EReference getInputSAPFunctionParameterTable_FunctionUnit();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.OutputSAPFunctionParameterTable <em>Output SAP Function Parameter Table</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Output SAP Function Parameter Table</em>'.
     * @see org.talend.core.model.metadata.builder.connection.OutputSAPFunctionParameterTable
     * @generated
     */
    EClass getOutputSAPFunctionParameterTable();

    /**
     * Returns the meta object for the container reference '{@link org.talend.core.model.metadata.builder.connection.OutputSAPFunctionParameterTable#getFunctionUnit <em>Function Unit</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Function Unit</em>'.
     * @see org.talend.core.model.metadata.builder.connection.OutputSAPFunctionParameterTable#getFunctionUnit()
     * @see #getOutputSAPFunctionParameterTable()
     * @generated
     */
    EReference getOutputSAPFunctionParameterTable_FunctionUnit();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.RegexpFileConnection <em>Regexp File Connection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Regexp File Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.RegexpFileConnection
     * @generated
     */
    EClass getRegexpFileConnection();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.RegexpFileConnection#getFieldSeparatorType <em>Field Separator Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Field Separator Type</em>'.
     * @see org.talend.core.model.metadata.builder.connection.RegexpFileConnection#getFieldSeparatorType()
     * @see #getRegexpFileConnection()
     * @generated
     */
    EAttribute getRegexpFileConnection_FieldSeparatorType();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.XmlFileConnection <em>Xml File Connection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Xml File Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XmlFileConnection
     * @generated
     */
    EClass getXmlFileConnection();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.XmlFileConnection#getXsdFilePath <em>Xsd File Path</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xsd File Path</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XmlFileConnection#getXsdFilePath()
     * @see #getXmlFileConnection()
     * @generated
     */
    EAttribute getXmlFileConnection_XsdFilePath();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.XmlFileConnection#getXmlFilePath <em>Xml File Path</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xml File Path</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XmlFileConnection#getXmlFilePath()
     * @see #getXmlFileConnection()
     * @generated
     */
    EAttribute getXmlFileConnection_XmlFilePath();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.XmlFileConnection#isGuess <em>Guess</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Guess</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XmlFileConnection#isGuess()
     * @see #getXmlFileConnection()
     * @generated
     */
    EAttribute getXmlFileConnection_Guess();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.XmlFileConnection#getMaskXPattern <em>Mask XPattern</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mask XPattern</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XmlFileConnection#getMaskXPattern()
     * @see #getXmlFileConnection()
     * @generated
     */
    EAttribute getXmlFileConnection_MaskXPattern();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.talend.core.model.metadata.builder.connection.XmlFileConnection#getSchema <em>Schema</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Schema</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XmlFileConnection#getSchema()
     * @see #getXmlFileConnection()
     * @generated
     */
    EReference getXmlFileConnection_Schema();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.XmlFileConnection#getEncoding <em>Encoding</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Encoding</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XmlFileConnection#getEncoding()
     * @see #getXmlFileConnection()
     * @generated
     */
    EAttribute getXmlFileConnection_Encoding();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.talend.core.model.metadata.builder.connection.XmlFileConnection#getGroup <em>Group</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Group</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XmlFileConnection#getGroup()
     * @see #getXmlFileConnection()
     * @generated
     */
    EReference getXmlFileConnection_Group();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.talend.core.model.metadata.builder.connection.XmlFileConnection#getRoot <em>Root</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Root</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XmlFileConnection#getRoot()
     * @see #getXmlFileConnection()
     * @generated
     */
    EReference getXmlFileConnection_Root();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.talend.core.model.metadata.builder.connection.XmlFileConnection#getLoop <em>Loop</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Loop</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XmlFileConnection#getLoop()
     * @see #getXmlFileConnection()
     * @generated
     */
    EReference getXmlFileConnection_Loop();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.XmlFileConnection#isInputModel <em>Input Model</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input Model</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XmlFileConnection#isInputModel()
     * @see #getXmlFileConnection()
     * @generated
     */
    EAttribute getXmlFileConnection_InputModel();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.XmlFileConnection#getOutputFilePath <em>Output File Path</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output File Path</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XmlFileConnection#getOutputFilePath()
     * @see #getXmlFileConnection()
     * @generated
     */
    EAttribute getXmlFileConnection_OutputFilePath();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.XmlFileConnection#getFileContent <em>File Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File Content</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XmlFileConnection#getFileContent()
     * @see #getXmlFileConnection()
     * @generated
     */
    EAttribute getXmlFileConnection_FileContent();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.SchemaTarget <em>Schema Target</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Schema Target</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SchemaTarget
     * @generated
     */
    EClass getSchemaTarget();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SchemaTarget#getRelativeXPathQuery <em>Relative XPath Query</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Relative XPath Query</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SchemaTarget#getRelativeXPathQuery()
     * @see #getSchemaTarget()
     * @generated
     */
    EAttribute getSchemaTarget_RelativeXPathQuery();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.SchemaTarget#getTagName <em>Tag Name</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Tag Name</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SchemaTarget#getTagName()
     * @see #getSchemaTarget()
     * @generated
     */
    EAttribute getSchemaTarget_TagName();

    /**
     * Returns the meta object for the container reference '
     * {@link org.talend.core.model.metadata.builder.connection.SchemaTarget#getSchema <em>Schema</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the container reference '<em>Schema</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SchemaTarget#getSchema()
     * @see #getSchemaTarget()
     * @generated
     */
    EReference getSchemaTarget_Schema();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.QueriesConnection <em>Queries Connection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Queries Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.QueriesConnection
     * @generated
     */
    EClass getQueriesConnection();

    /**
     * Returns the meta object for the container reference '{@link org.talend.core.model.metadata.builder.connection.QueriesConnection#getConnection <em>Connection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.QueriesConnection#getConnection()
     * @see #getQueriesConnection()
     * @generated
     */
    EReference getQueriesConnection_Connection();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.talend.core.model.metadata.builder.connection.QueriesConnection#getQuery <em>Query</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Query</em>'.
     * @see org.talend.core.model.metadata.builder.connection.QueriesConnection#getQuery()
     * @see #getQueriesConnection()
     * @generated
     */
    EReference getQueriesConnection_Query();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.Query <em>Query</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Query</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Query
     * @generated
     */
    EClass getQuery();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.Query#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Query#getValue()
     * @see #getQuery()
     * @generated
     */
    EAttribute getQuery_Value();

    /**
     * Returns the meta object for the container reference '{@link org.talend.core.model.metadata.builder.connection.Query#getQueries <em>Queries</em>}'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Queries</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Query#getQueries()
     * @see #getQuery()
     * @generated
     */
    EReference getQuery_Queries();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.Query#isContextMode <em>Context Mode</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Context Mode</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Query#isContextMode()
     * @see #getQuery()
     * @generated
     */
    EAttribute getQuery_ContextMode();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.LdifFileConnection <em>Ldif File Connection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Ldif File Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LdifFileConnection
     * @generated
     */
    EClass getLdifFileConnection();

    /**
     * Returns the meta object for the attribute list '
     * {@link org.talend.core.model.metadata.builder.connection.LdifFileConnection#getValue <em>Value</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute list '<em>Value</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LdifFileConnection#getValue()
     * @see #getLdifFileConnection()
     * @generated
     */
    EAttribute getLdifFileConnection_Value();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.LdifFileConnection#getFilePath <em>File Path</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File Path</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LdifFileConnection#getFilePath()
     * @see #getLdifFileConnection()
     * @generated
     */
    EAttribute getLdifFileConnection_FilePath();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.LdifFileConnection#getLimitEntry <em>Limit Entry</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Limit Entry</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LdifFileConnection#getLimitEntry()
     * @see #getLdifFileConnection()
     * @generated
     */
    EAttribute getLdifFileConnection_LimitEntry();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.LdifFileConnection#isUseLimit <em>Use Limit</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Use Limit</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LdifFileConnection#isUseLimit()
     * @see #getLdifFileConnection()
     * @generated
     */
    EAttribute getLdifFileConnection_UseLimit();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.LdifFileConnection#getServer <em>Server</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Server</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LdifFileConnection#getServer()
     * @see #getLdifFileConnection()
     * @generated
     */
    EAttribute getLdifFileConnection_Server();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.FileExcelConnection <em>File Excel Connection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>File Excel Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileExcelConnection
     * @generated
     */
    EClass getFileExcelConnection();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FileExcelConnection#getSheetName <em>Sheet Name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sheet Name</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileExcelConnection#getSheetName()
     * @see #getFileExcelConnection()
     * @generated
     */
    EAttribute getFileExcelConnection_SheetName();

    /**
     * Returns the meta object for the attribute list '{@link org.talend.core.model.metadata.builder.connection.FileExcelConnection#getSheetColumns <em>Sheet Columns</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Sheet Columns</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileExcelConnection#getSheetColumns()
     * @see #getFileExcelConnection()
     * @generated
     */
    EAttribute getFileExcelConnection_SheetColumns();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FileExcelConnection#getFirstColumn <em>First Column</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>First Column</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileExcelConnection#getFirstColumn()
     * @see #getFileExcelConnection()
     * @generated
     */
    EAttribute getFileExcelConnection_FirstColumn();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FileExcelConnection#getLastColumn <em>Last Column</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Last Column</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileExcelConnection#getLastColumn()
     * @see #getFileExcelConnection()
     * @generated
     */
    EAttribute getFileExcelConnection_LastColumn();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FileExcelConnection#getThousandSeparator <em>Thousand Separator</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Thousand Separator</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileExcelConnection#getThousandSeparator()
     * @see #getFileExcelConnection()
     * @generated
     */
    EAttribute getFileExcelConnection_ThousandSeparator();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FileExcelConnection#getDecimalSeparator <em>Decimal Separator</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Decimal Separator</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileExcelConnection#getDecimalSeparator()
     * @see #getFileExcelConnection()
     * @generated
     */
    EAttribute getFileExcelConnection_DecimalSeparator();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FileExcelConnection#isAdvancedSpearator <em>Advanced Spearator</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Advanced Spearator</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileExcelConnection#isAdvancedSpearator()
     * @see #getFileExcelConnection()
     * @generated
     */
    EAttribute getFileExcelConnection_AdvancedSpearator();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FileExcelConnection#isSelectAllSheets <em>Select All Sheets</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Select All Sheets</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileExcelConnection#isSelectAllSheets()
     * @see #getFileExcelConnection()
     * @generated
     */
    EAttribute getFileExcelConnection_SelectAllSheets();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FileExcelConnection#getSheetList <em>Sheet List</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sheet List</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileExcelConnection#getSheetList()
     * @see #getFileExcelConnection()
     * @generated
     */
    EAttribute getFileExcelConnection_SheetList();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.XmlXPathLoopDescriptor <em>Xml XPath Loop Descriptor</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Xml XPath Loop Descriptor</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XmlXPathLoopDescriptor
     * @generated
     */
    EClass getXmlXPathLoopDescriptor();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.XmlXPathLoopDescriptor#getLimitBoucle <em>Limit Boucle</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Limit Boucle</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XmlXPathLoopDescriptor#getLimitBoucle()
     * @see #getXmlXPathLoopDescriptor()
     * @generated
     */
    EAttribute getXmlXPathLoopDescriptor_LimitBoucle();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.XmlXPathLoopDescriptor#getAbsoluteXPathQuery <em>Absolute XPath Query</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Absolute XPath Query</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XmlXPathLoopDescriptor#getAbsoluteXPathQuery()
     * @see #getXmlXPathLoopDescriptor()
     * @generated
     */
    EAttribute getXmlXPathLoopDescriptor_AbsoluteXPathQuery();

    /**
     * Returns the meta object for the container reference '{@link org.talend.core.model.metadata.builder.connection.XmlXPathLoopDescriptor#getConnection <em>Connection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XmlXPathLoopDescriptor#getConnection()
     * @see #getXmlXPathLoopDescriptor()
     * @generated
     */
    EReference getXmlXPathLoopDescriptor_Connection();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.core.model.metadata.builder.connection.XmlXPathLoopDescriptor#getSchemaTargets <em>Schema Targets</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Schema Targets</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XmlXPathLoopDescriptor#getSchemaTargets()
     * @see #getXmlXPathLoopDescriptor()
     * @generated
     */
    EReference getXmlXPathLoopDescriptor_SchemaTargets();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.GenericSchemaConnection <em>Generic Schema Connection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Generic Schema Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.GenericSchemaConnection
     * @generated
     */
    EClass getGenericSchemaConnection();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.GenericSchemaConnection#isMappingTypeUsed <em>Mapping Type Used</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mapping Type Used</em>'.
     * @see org.talend.core.model.metadata.builder.connection.GenericSchemaConnection#isMappingTypeUsed()
     * @see #getGenericSchemaConnection()
     * @generated
     */
    EAttribute getGenericSchemaConnection_MappingTypeUsed();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.GenericSchemaConnection#getMappingTypeId <em>Mapping Type Id</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mapping Type Id</em>'.
     * @see org.talend.core.model.metadata.builder.connection.GenericSchemaConnection#getMappingTypeId()
     * @see #getGenericSchemaConnection()
     * @generated
     */
    EAttribute getGenericSchemaConnection_MappingTypeId();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection <em>LDAP Schema Connection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>LDAP Schema Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection
     * @generated
     */
    EClass getLDAPSchemaConnection();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getHost <em>Host</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Host</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getHost()
     * @see #getLDAPSchemaConnection()
     * @generated
     */
    EAttribute getLDAPSchemaConnection_Host();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getPort <em>Port</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Port</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getPort()
     * @see #getLDAPSchemaConnection()
     * @generated
     */
    EAttribute getLDAPSchemaConnection_Port();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getProtocol <em>Protocol</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Protocol</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getProtocol()
     * @see #getLDAPSchemaConnection()
     * @generated
     */
    EAttribute getLDAPSchemaConnection_Protocol();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getFilter <em>Filter</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Filter</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getFilter()
     * @see #getLDAPSchemaConnection()
     * @generated
     */
    EAttribute getLDAPSchemaConnection_Filter();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getSeparator <em>Separator</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Separator</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getSeparator()
     * @see #getLDAPSchemaConnection()
     * @generated
     */
    EAttribute getLDAPSchemaConnection_Separator();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#isUseAdvanced <em>Use Advanced</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Advanced</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#isUseAdvanced()
     * @see #getLDAPSchemaConnection()
     * @generated
     */
    EAttribute getLDAPSchemaConnection_UseAdvanced();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getStorePath <em>Store Path</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Store Path</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getStorePath()
     * @see #getLDAPSchemaConnection()
     * @generated
     */
    EAttribute getLDAPSchemaConnection_StorePath();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#isUseLimit <em>Use Limit</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Limit</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#isUseLimit()
     * @see #getLDAPSchemaConnection()
     * @generated
     */
    EAttribute getLDAPSchemaConnection_UseLimit();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#isUseAuthen <em>Use Authen</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Authen</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#isUseAuthen()
     * @see #getLDAPSchemaConnection()
     * @generated
     */
    EAttribute getLDAPSchemaConnection_UseAuthen();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getBindPrincipal <em>Bind Principal</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Bind Principal</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getBindPrincipal()
     * @see #getLDAPSchemaConnection()
     * @generated
     */
    EAttribute getLDAPSchemaConnection_BindPrincipal();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getBindPassword <em>Bind Password</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Bind Password</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getBindPassword()
     * @see #getLDAPSchemaConnection()
     * @generated
     */
    EAttribute getLDAPSchemaConnection_BindPassword();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getLimitValue <em>Limit Value</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Limit Value</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getLimitValue()
     * @see #getLDAPSchemaConnection()
     * @generated
     */
    EAttribute getLDAPSchemaConnection_LimitValue();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getEncryptionMethodName <em>Encryption Method Name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Encryption Method Name</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getEncryptionMethodName()
     * @see #getLDAPSchemaConnection()
     * @generated
     */
    EAttribute getLDAPSchemaConnection_EncryptionMethodName();

    /**
     * Returns the meta object for the attribute list '
     * {@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getValue <em>Value</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute list '<em>Value</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getValue()
     * @see #getLDAPSchemaConnection()
     * @generated
     */
    EAttribute getLDAPSchemaConnection_Value();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#isSavePassword <em>Save Password</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Save Password</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#isSavePassword()
     * @see #getLDAPSchemaConnection()
     * @generated
     */
    EAttribute getLDAPSchemaConnection_SavePassword();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getAliases <em>Aliases</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Aliases</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getAliases()
     * @see #getLDAPSchemaConnection()
     * @generated
     */
    EAttribute getLDAPSchemaConnection_Aliases();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getReferrals <em>Referrals</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Referrals</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getReferrals()
     * @see #getLDAPSchemaConnection()
     * @generated
     */
    EAttribute getLDAPSchemaConnection_Referrals();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getCountLimit <em>Count Limit</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Count Limit</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getCountLimit()
     * @see #getLDAPSchemaConnection()
     * @generated
     */
    EAttribute getLDAPSchemaConnection_CountLimit();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getTimeOutLimit <em>Time Out Limit</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time Out Limit</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getTimeOutLimit()
     * @see #getLDAPSchemaConnection()
     * @generated
     */
    EAttribute getLDAPSchemaConnection_TimeOutLimit();

    /**
     * Returns the meta object for the attribute list '{@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getBaseDNs <em>Base DNs</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Base DNs</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getBaseDNs()
     * @see #getLDAPSchemaConnection()
     * @generated
     */
    EAttribute getLDAPSchemaConnection_BaseDNs();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#isGetBaseDNsFromRoot <em>Get Base DNs From Root</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Get Base DNs From Root</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#isGetBaseDNsFromRoot()
     * @see #getLDAPSchemaConnection()
     * @generated
     */
    EAttribute getLDAPSchemaConnection_GetBaseDNsFromRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getReturnAttributes <em>Return Attributes</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Return Attributes</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getReturnAttributes()
     * @see #getLDAPSchemaConnection()
     * @generated
     */
    EAttribute getLDAPSchemaConnection_ReturnAttributes();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getSelectedDN <em>Selected DN</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Selected DN</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LDAPSchemaConnection#getSelectedDN()
     * @see #getLDAPSchemaConnection()
     * @generated
     */
    EAttribute getLDAPSchemaConnection_SelectedDN();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection <em>WSDL Schema Connection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>WSDL Schema Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection
     * @generated
     */
    EClass getWSDLSchemaConnection();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getWSDL <em>WSDL</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>WSDL</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getWSDL()
     * @see #getWSDLSchemaConnection()
     * @generated
     */
    EAttribute getWSDLSchemaConnection_WSDL();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#isNeedAuth <em>Need Auth</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Need Auth</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#isNeedAuth()
     * @see #getWSDLSchemaConnection()
     * @generated
     */
    EAttribute getWSDLSchemaConnection_NeedAuth();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getMethodName <em>Method Name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Method Name</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getMethodName()
     * @see #getWSDLSchemaConnection()
     * @generated
     */
    EAttribute getWSDLSchemaConnection_MethodName();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Parameters</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getParameters()
     * @see #getWSDLSchemaConnection()
     * @generated
     */
    EAttribute getWSDLSchemaConnection_Parameters();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getUserName <em>User Name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>User Name</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getUserName()
     * @see #getWSDLSchemaConnection()
     * @generated
     */
    EAttribute getWSDLSchemaConnection_UserName();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getPassword <em>Password</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Password</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getPassword()
     * @see #getWSDLSchemaConnection()
     * @generated
     */
    EAttribute getWSDLSchemaConnection_Password();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#isUseProxy <em>Use Proxy</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Proxy</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#isUseProxy()
     * @see #getWSDLSchemaConnection()
     * @generated
     */
    EAttribute getWSDLSchemaConnection_UseProxy();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getProxyHost <em>Proxy Host</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Proxy Host</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getProxyHost()
     * @see #getWSDLSchemaConnection()
     * @generated
     */
    EAttribute getWSDLSchemaConnection_ProxyHost();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getProxyPort <em>Proxy Port</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Proxy Port</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getProxyPort()
     * @see #getWSDLSchemaConnection()
     * @generated
     */
    EAttribute getWSDLSchemaConnection_ProxyPort();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getProxyUser <em>Proxy User</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Proxy User</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getProxyUser()
     * @see #getWSDLSchemaConnection()
     * @generated
     */
    EAttribute getWSDLSchemaConnection_ProxyUser();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getProxyPassword <em>Proxy Password</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Proxy Password</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getProxyPassword()
     * @see #getWSDLSchemaConnection()
     * @generated
     */
    EAttribute getWSDLSchemaConnection_ProxyPassword();

    /**
     * Returns the meta object for the attribute list '
     * {@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getValue <em>Value</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute list '<em>Value</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getValue()
     * @see #getWSDLSchemaConnection()
     * @generated
     */
    EAttribute getWSDLSchemaConnection_Value();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getEndpointURI <em>Endpoint URI</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Endpoint URI</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getEndpointURI()
     * @see #getWSDLSchemaConnection()
     * @generated
     */
    EAttribute getWSDLSchemaConnection_EndpointURI();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getEncoding <em>Encoding</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Encoding</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getEncoding()
     * @see #getWSDLSchemaConnection()
     * @generated
     */
    EAttribute getWSDLSchemaConnection_Encoding();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getTimeOut <em>Time Out</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time Out</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getTimeOut()
     * @see #getWSDLSchemaConnection()
     * @generated
     */
    EAttribute getWSDLSchemaConnection_TimeOut();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#isIsInputModel <em>Is Input Model</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Input Model</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#isIsInputModel()
     * @see #getWSDLSchemaConnection()
     * @generated
     */
    EAttribute getWSDLSchemaConnection_IsInputModel();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getServerNameSpace <em>Server Name Space</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Server Name Space</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getServerNameSpace()
     * @see #getWSDLSchemaConnection()
     * @generated
     */
    EAttribute getWSDLSchemaConnection_ServerNameSpace();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getServerName <em>Server Name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Server Name</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getServerName()
     * @see #getWSDLSchemaConnection()
     * @generated
     */
    EAttribute getWSDLSchemaConnection_ServerName();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getPortNameSpace <em>Port Name Space</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Port Name Space</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getPortNameSpace()
     * @see #getWSDLSchemaConnection()
     * @generated
     */
    EAttribute getWSDLSchemaConnection_PortNameSpace();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getPortName <em>Port Name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Port Name</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getPortName()
     * @see #getWSDLSchemaConnection()
     * @generated
     */
    EAttribute getWSDLSchemaConnection_PortName();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getParameterValue <em>Parameter Value</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameter Value</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getParameterValue()
     * @see #getWSDLSchemaConnection()
     * @generated
     */
    EReference getWSDLSchemaConnection_ParameterValue();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getOutputParameter <em>Output Parameter</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Output Parameter</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLSchemaConnection#getOutputParameter()
     * @see #getWSDLSchemaConnection()
     * @generated
     */
    EReference getWSDLSchemaConnection_OutputParameter();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection <em>Salesforce Schema Connection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Salesforce Schema Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection
     * @generated
     */
    EClass getSalesforceSchemaConnection();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#getWebServiceUrl <em>Web Service Url</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Web Service Url</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#getWebServiceUrl()
     * @see #getSalesforceSchemaConnection()
     * @generated
     */
    EAttribute getSalesforceSchemaConnection_WebServiceUrl();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#getUserName <em>User Name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>User Name</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#getUserName()
     * @see #getSalesforceSchemaConnection()
     * @generated
     */
    EAttribute getSalesforceSchemaConnection_UserName();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#getPassword <em>Password</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Password</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#getPassword()
     * @see #getSalesforceSchemaConnection()
     * @generated
     */
    EAttribute getSalesforceSchemaConnection_Password();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#getModuleName <em>Module Name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Module Name</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#getModuleName()
     * @see #getSalesforceSchemaConnection()
     * @generated
     */
    EAttribute getSalesforceSchemaConnection_ModuleName();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#getQueryCondition <em>Query Condition</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Query Condition</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#getQueryCondition()
     * @see #getSalesforceSchemaConnection()
     * @generated
     */
    EAttribute getSalesforceSchemaConnection_QueryCondition();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#isUseCustomModuleName <em>Use Custom Module Name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Custom Module Name</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#isUseCustomModuleName()
     * @see #getSalesforceSchemaConnection()
     * @generated
     */
    EAttribute getSalesforceSchemaConnection_UseCustomModuleName();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#isUseProxy <em>Use Proxy</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Proxy</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#isUseProxy()
     * @see #getSalesforceSchemaConnection()
     * @generated
     */
    EAttribute getSalesforceSchemaConnection_UseProxy();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#getProxyHost <em>Proxy Host</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Proxy Host</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#getProxyHost()
     * @see #getSalesforceSchemaConnection()
     * @generated
     */
    EAttribute getSalesforceSchemaConnection_ProxyHost();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#getProxyPort <em>Proxy Port</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Proxy Port</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#getProxyPort()
     * @see #getSalesforceSchemaConnection()
     * @generated
     */
    EAttribute getSalesforceSchemaConnection_ProxyPort();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#getProxyUsername <em>Proxy Username</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Proxy Username</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#getProxyUsername()
     * @see #getSalesforceSchemaConnection()
     * @generated
     */
    EAttribute getSalesforceSchemaConnection_ProxyUsername();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#getProxyPassword <em>Proxy Password</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Proxy Password</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#getProxyPassword()
     * @see #getSalesforceSchemaConnection()
     * @generated
     */
    EAttribute getSalesforceSchemaConnection_ProxyPassword();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#getBatchSize <em>Batch Size</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Batch Size</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#getBatchSize()
     * @see #getSalesforceSchemaConnection()
     * @generated
     */
    EAttribute getSalesforceSchemaConnection_BatchSize();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#isUseHttpProxy <em>Use Http Proxy</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Http Proxy</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#isUseHttpProxy()
     * @see #getSalesforceSchemaConnection()
     * @generated
     */
    EAttribute getSalesforceSchemaConnection_UseHttpProxy();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#isUseAlphbet <em>Use Alphbet</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Alphbet</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#isUseAlphbet()
     * @see #getSalesforceSchemaConnection()
     * @generated
     */
    EAttribute getSalesforceSchemaConnection_UseAlphbet();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#getTimeOut <em>Time Out</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time Out</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection#getTimeOut()
     * @see #getSalesforceSchemaConnection()
     * @generated
     */
    EAttribute getSalesforceSchemaConnection_TimeOut();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.CDCConnection <em>CDC Connection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>CDC Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.CDCConnection
     * @generated
     */
    EClass getCDCConnection();

    /**
     * Returns the meta object for the container reference '
     * {@link org.talend.core.model.metadata.builder.connection.CDCConnection#getConnection <em>Connection</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the container reference '<em>Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.CDCConnection#getConnection()
     * @see #getCDCConnection()
     * @generated
     */
    EReference getCDCConnection_Connection();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.talend.core.model.metadata.builder.connection.CDCConnection#getCdcTypes <em>Cdc Types</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Cdc Types</em>'.
     * @see org.talend.core.model.metadata.builder.connection.CDCConnection#getCdcTypes()
     * @see #getCDCConnection()
     * @generated
     */
    EReference getCDCConnection_CdcTypes();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.CDCType <em>CDC Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>CDC Type</em>'.
     * @see org.talend.core.model.metadata.builder.connection.CDCType
     * @generated
     */
    EClass getCDCType();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.CDCType#getLinkDB <em>Link DB</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Link DB</em>'.
     * @see org.talend.core.model.metadata.builder.connection.CDCType#getLinkDB()
     * @see #getCDCType()
     * @generated
     */
    EAttribute getCDCType_LinkDB();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.talend.core.model.metadata.builder.connection.CDCType#getSubscribers <em>Subscribers</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Subscribers</em>'.
     * @see org.talend.core.model.metadata.builder.connection.CDCType#getSubscribers()
     * @see #getCDCType()
     * @generated
     */
    EReference getCDCType_Subscribers();

    /**
     * Returns the meta object for the reference '
     * {@link org.talend.core.model.metadata.builder.connection.CDCType#getCdcConnection <em>Cdc Connection</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the reference '<em>Cdc Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.CDCType#getCdcConnection()
     * @see #getCDCType()
     * @generated
     */
    EReference getCDCType_CdcConnection();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.CDCType#getJournalName <em>Journal Name</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Journal Name</em>'.
     * @see org.talend.core.model.metadata.builder.connection.CDCType#getJournalName()
     * @see #getCDCType()
     * @generated
     */
    EAttribute getCDCType_JournalName();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.SubscriberTable <em>Subscriber Table</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Subscriber Table</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SubscriberTable
     * @generated
     */
    EClass getSubscriberTable();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.SubscriberTable#isSystem <em>System</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>System</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SubscriberTable#isSystem()
     * @see #getSubscriberTable()
     * @generated
     */
    EAttribute getSubscriberTable_System();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.SAPTestInputParameterTable <em>SAP Test Input Parameter Table</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>SAP Test Input Parameter Table</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPTestInputParameterTable
     * @generated
     */
    EClass getSAPTestInputParameterTable();

    /**
     * Returns the meta object for the container reference '{@link org.talend.core.model.metadata.builder.connection.SAPTestInputParameterTable#getFunctionUnit <em>Function Unit</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Function Unit</em>'.
     * @see org.talend.core.model.metadata.builder.connection.SAPTestInputParameterTable#getFunctionUnit()
     * @see #getSAPTestInputParameterTable()
     * @generated
     */
    EReference getSAPTestInputParameterTable_FunctionUnit();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.Concept <em>Concept</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Concept</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Concept
     * @generated
     */
    EClass getConcept();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.Concept#getLoopExpression <em>Loop Expression</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Loop Expression</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Concept#getLoopExpression()
     * @see #getConcept()
     * @generated
     */
    EAttribute getConcept_LoopExpression();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.Concept#getLoopLimit <em>Loop Limit</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Loop Limit</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Concept#getLoopLimit()
     * @see #getConcept()
     * @generated
     */
    EAttribute getConcept_LoopLimit();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.core.model.metadata.builder.connection.Concept#getConceptTargets <em>Concept Targets</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Concept Targets</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Concept#getConceptTargets()
     * @see #getConcept()
     * @generated
     */
    EReference getConcept_ConceptTargets();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.Concept#isInputModel <em>Input Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input Model</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Concept#isInputModel()
     * @see #getConcept()
     * @generated
     */
    EAttribute getConcept_InputModel();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.core.model.metadata.builder.connection.Concept#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Group</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Concept#getGroup()
     * @see #getConcept()
     * @generated
     */
    EReference getConcept_Group();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.core.model.metadata.builder.connection.Concept#getRoot <em>Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Root</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Concept#getRoot()
     * @see #getConcept()
     * @generated
     */
    EReference getConcept_Root();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.core.model.metadata.builder.connection.Concept#getLoop <em>Loop</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Loop</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Concept#getLoop()
     * @see #getConcept()
     * @generated
     */
    EReference getConcept_Loop();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.Concept#getConceptType <em>Concept Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Concept Type</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Concept#getConceptType()
     * @see #getConcept()
     * @generated
     */
    EAttribute getConcept_ConceptType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.Concept#getXPathPrefix <em>XPath Prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>XPath Prefix</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Concept#getXPathPrefix()
     * @see #getConcept()
     * @generated
     */
    EAttribute getConcept_XPathPrefix();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.ConceptTarget <em>Concept Target</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Concept Target</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ConceptTarget
     * @generated
     */
    EClass getConceptTarget();

    /**
     * Returns the meta object for the container reference '
     * {@link org.talend.core.model.metadata.builder.connection.ConceptTarget#getSchema <em>Schema</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the container reference '<em>Schema</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ConceptTarget#getSchema()
     * @see #getConceptTarget()
     * @generated
     */
    EReference getConceptTarget_Schema();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.ConceptTarget#getTargetName <em>Target Name</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Target Name</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ConceptTarget#getTargetName()
     * @see #getConceptTarget()
     * @generated
     */
    EAttribute getConceptTarget_TargetName();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.ConceptTarget#getRelativeLoopExpression <em>Relative Loop Expression</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Relative Loop Expression</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ConceptTarget#getRelativeLoopExpression()
     * @see #getConceptTarget()
     * @generated
     */
    EAttribute getConceptTarget_RelativeLoopExpression();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.HL7Connection <em>HL7 Connection</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>HL7 Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.HL7Connection
     * @generated
     */
    EClass getHL7Connection();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.HL7Connection#getStartChar <em>Start Char</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Start Char</em>'.
     * @see org.talend.core.model.metadata.builder.connection.HL7Connection#getStartChar()
     * @see #getHL7Connection()
     * @generated
     */
    EAttribute getHL7Connection_StartChar();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.HL7Connection#getEndChar <em>End Char</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>End Char</em>'.
     * @see org.talend.core.model.metadata.builder.connection.HL7Connection#getEndChar()
     * @see #getHL7Connection()
     * @generated
     */
    EAttribute getHL7Connection_EndChar();

    /**
     * Returns the meta object for the reference list '
     * {@link org.talend.core.model.metadata.builder.connection.HL7Connection#getRoot <em>Root</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the reference list '<em>Root</em>'.
     * @see org.talend.core.model.metadata.builder.connection.HL7Connection#getRoot()
     * @see #getHL7Connection()
     * @generated
     */
    EReference getHL7Connection_Root();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.HL7Connection#getOutputFilePath <em>Output File Path</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc --> ======= Returns the meta
     * object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.HL7Connection#getOutputFilePath
     * <em>Output File Path</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output File Path</em>'.
     * @see org.talend.core.model.metadata.builder.connection.HL7Connection#getOutputFilePath()
     * @see #getHL7Connection()
     * @generated
     */
    EAttribute getHL7Connection_OutputFilePath();

    /**
     * Returns the meta object for class '
     * {@link org.talend.core.model.metadata.builder.connection.HeaderFooterConnection
     * <em>Header Footer Connection</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> >>>>>>> .r46225
     * 
     * @return the meta object for class '<em>Header Footer Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.HeaderFooterConnection
     * @generated
     */
    EClass getHeaderFooterConnection();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.HeaderFooterConnection#isIsHeader <em>Is Header</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Header</em>'.
     * @see org.talend.core.model.metadata.builder.connection.HeaderFooterConnection#isIsHeader()
     * @see #getHeaderFooterConnection()
     * @generated
     */
    EAttribute getHeaderFooterConnection_IsHeader();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.HeaderFooterConnection#getImports <em>Imports</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Imports</em>'.
     * @see org.talend.core.model.metadata.builder.connection.HeaderFooterConnection#getImports()
     * @see #getHeaderFooterConnection()
     * @generated
     */
    EAttribute getHeaderFooterConnection_Imports();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.HeaderFooterConnection#getMainCode <em>Main Code</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Main Code</em>'.
     * @see org.talend.core.model.metadata.builder.connection.HeaderFooterConnection#getMainCode()
     * @see #getHeaderFooterConnection()
     * @generated
     */
    EAttribute getHeaderFooterConnection_MainCode();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.HeaderFooterConnection#getLibraries <em>Libraries</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Libraries</em>'.
     * @see org.talend.core.model.metadata.builder.connection.HeaderFooterConnection#getLibraries()
     * @see #getHeaderFooterConnection()
     * @generated
     */
    EAttribute getHeaderFooterConnection_Libraries();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.XMLFileNode <em>XML File Node</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>XML File Node</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XMLFileNode
     * @generated
     */
    EClass getXMLFileNode();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.XMLFileNode#getXMLPath <em>XML Path</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>XML Path</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XMLFileNode#getXMLPath()
     * @see #getXMLFileNode()
     * @generated
     */
    EAttribute getXMLFileNode_XMLPath();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.XMLFileNode#getRelatedColumn <em>Related Column</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Related Column</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XMLFileNode#getRelatedColumn()
     * @see #getXMLFileNode()
     * @generated
     */
    EAttribute getXMLFileNode_RelatedColumn();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.XMLFileNode#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XMLFileNode#getDefaultValue()
     * @see #getXMLFileNode()
     * @generated
     */
    EAttribute getXMLFileNode_DefaultValue();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.XMLFileNode#getAttribute <em>Attribute</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Attribute</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XMLFileNode#getAttribute()
     * @see #getXMLFileNode()
     * @generated
     */
    EAttribute getXMLFileNode_Attribute();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.XMLFileNode#getOrder <em>Order</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Order</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XMLFileNode#getOrder()
     * @see #getXMLFileNode()
     * @generated
     */
    EAttribute getXMLFileNode_Order();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.XMLFileNode#getType <em>Type</em>}'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.talend.core.model.metadata.builder.connection.XMLFileNode#getType()
     * @see #getXMLFileNode()
     * @generated
     */
    EAttribute getXMLFileNode_Type();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.WSDLParameter <em>WSDL Parameter</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>WSDL Parameter</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLParameter
     * @generated
     */
    EClass getWSDLParameter();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.WSDLParameter#getElement <em>Element</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Element</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLParameter#getElement()
     * @see #getWSDLParameter()
     * @generated
     */
    EAttribute getWSDLParameter_Element();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.WSDLParameter#getSource <em>Source</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Source</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLParameter#getSource()
     * @see #getWSDLParameter()
     * @generated
     */
    EAttribute getWSDLParameter_Source();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.WSDLParameter#getColumn <em>Column</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Column</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLParameter#getColumn()
     * @see #getWSDLParameter()
     * @generated
     */
    EAttribute getWSDLParameter_Column();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.WSDLParameter#getExpression <em>Expression</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Expression</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLParameter#getExpression()
     * @see #getWSDLParameter()
     * @generated
     */
    EAttribute getWSDLParameter_Expression();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.WSDLParameter#getParameterInfo <em>Parameter Info</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Parameter Info</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLParameter#getParameterInfo()
     * @see #getWSDLParameter()
     * @generated
     */
    EAttribute getWSDLParameter_ParameterInfo();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.WSDLParameter#getParameterInfoParent <em>Parameter Info Parent</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Parameter Info Parent</em>'.
     * @see org.talend.core.model.metadata.builder.connection.WSDLParameter#getParameterInfoParent()
     * @see #getWSDLParameter()
     * @generated
     */
    EAttribute getWSDLParameter_ParameterInfoParent();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.GenericPackage
     * <em>Generic Package</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> ======= Returns the meta object for
     * class '{@link org.talend.core.model.metadata.builder.connection.GenericPackage <em>Generic Package</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc --> >>>>>>> .r46225
     * 
     * @return the meta object for class '<em>Generic Package</em>'.
     * @see org.talend.core.model.metadata.builder.connection.GenericPackage
     * @generated
     */
    EClass getGenericPackage();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.HL7FileNode <em>HL7 File Node</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>HL7 File Node</em>'.
     * @see org.talend.core.model.metadata.builder.connection.HL7FileNode
     * @generated
     */
    EClass getHL7FileNode();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.HL7FileNode#getFilePath <em>File Path</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>File Path</em>'.
     * @see org.talend.core.model.metadata.builder.connection.HL7FileNode#getFilePath()
     * @see #getHL7FileNode()
     * @generated
     */
    EAttribute getHL7FileNode_FilePath();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.HL7FileNode#getOrder <em>Order</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Order</em>'.
     * @see org.talend.core.model.metadata.builder.connection.HL7FileNode#getOrder()
     * @see #getHL7FileNode()
     * @generated
     */
    EAttribute getHL7FileNode_Order();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.HL7FileNode#getAttribute <em>Attribute</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Attribute</em>'.
     * @see org.talend.core.model.metadata.builder.connection.HL7FileNode#getAttribute()
     * @see #getHL7FileNode()
     * @generated
     */
    EAttribute getHL7FileNode_Attribute();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.HL7FileNode#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see org.talend.core.model.metadata.builder.connection.HL7FileNode#getDefaultValue()
     * @see #getHL7FileNode()
     * @generated
     */
    EAttribute getHL7FileNode_DefaultValue();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.HL7FileNode#getRelatedColumn <em>Related Column</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Related Column</em>'.
     * @see org.talend.core.model.metadata.builder.connection.HL7FileNode#getRelatedColumn()
     * @see #getHL7FileNode()
     * @generated
     */
    EAttribute getHL7FileNode_RelatedColumn();

    /**
     * Returns the meta object for the attribute '
     * {@link org.talend.core.model.metadata.builder.connection.HL7FileNode#isRepeatable <em>Repeatable</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Repeatable</em>'.
     * @see org.talend.core.model.metadata.builder.connection.HL7FileNode#isRepeatable()
     * @see #getHL7FileNode()
     * @generated
     */
    EAttribute getHL7FileNode_Repeatable();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.FTPConnection <em>FTP Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>FTP Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FTPConnection
     * @generated
     */
    EClass getFTPConnection();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FTPConnection#getHost <em>Host</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Host</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FTPConnection#getHost()
     * @see #getFTPConnection()
     * @generated
     */
    EAttribute getFTPConnection_Host();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FTPConnection#getPort <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Port</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FTPConnection#getPort()
     * @see #getFTPConnection()
     * @generated
     */
    EAttribute getFTPConnection_Port();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FTPConnection#getUsername <em>Username</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Username</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FTPConnection#getUsername()
     * @see #getFTPConnection()
     * @generated
     */
    EAttribute getFTPConnection_Username();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FTPConnection#getPassword <em>Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Password</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FTPConnection#getPassword()
     * @see #getFTPConnection()
     * @generated
     */
    EAttribute getFTPConnection_Password();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FTPConnection#getMode <em>Mode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mode</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FTPConnection#getMode()
     * @see #getFTPConnection()
     * @generated
     */
    EAttribute getFTPConnection_Mode();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FTPConnection#getEcoding <em>Ecoding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ecoding</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FTPConnection#getEcoding()
     * @see #getFTPConnection()
     * @generated
     */
    EAttribute getFTPConnection_Ecoding();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FTPConnection#isSFTP <em>SFTP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SFTP</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FTPConnection#isSFTP()
     * @see #getFTPConnection()
     * @generated
     */
    EAttribute getFTPConnection_SFTP();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FTPConnection#isFTPS <em>FTPS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>FTPS</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FTPConnection#isFTPS()
     * @see #getFTPConnection()
     * @generated
     */
    EAttribute getFTPConnection_FTPS();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FTPConnection#getMethod <em>Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Method</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FTPConnection#getMethod()
     * @see #getFTPConnection()
     * @generated
     */
    EAttribute getFTPConnection_Method();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FTPConnection#getKeystoreFile <em>Keystore File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Keystore File</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FTPConnection#getKeystoreFile()
     * @see #getFTPConnection()
     * @generated
     */
    EAttribute getFTPConnection_KeystoreFile();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FTPConnection#getKeystorePassword <em>Keystore Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Keystore Password</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FTPConnection#getKeystorePassword()
     * @see #getFTPConnection()
     * @generated
     */
    EAttribute getFTPConnection_KeystorePassword();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FTPConnection#isUsesocks <em>Usesocks</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Usesocks</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FTPConnection#isUsesocks()
     * @see #getFTPConnection()
     * @generated
     */
    EAttribute getFTPConnection_Usesocks();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FTPConnection#getProxyhost <em>Proxyhost</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Proxyhost</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FTPConnection#getProxyhost()
     * @see #getFTPConnection()
     * @generated
     */
    EAttribute getFTPConnection_Proxyhost();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FTPConnection#getProxyport <em>Proxyport</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Proxyport</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FTPConnection#getProxyport()
     * @see #getFTPConnection()
     * @generated
     */
    EAttribute getFTPConnection_Proxyport();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FTPConnection#getProxyuser <em>Proxyuser</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Proxyuser</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FTPConnection#getProxyuser()
     * @see #getFTPConnection()
     * @generated
     */
    EAttribute getFTPConnection_Proxyuser();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FTPConnection#getProxypassword <em>Proxypassword</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Proxypassword</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FTPConnection#getProxypassword()
     * @see #getFTPConnection()
     * @generated
     */
    EAttribute getFTPConnection_Proxypassword();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.FTPConnection#getCustomEncode <em>Custom Encode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Custom Encode</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FTPConnection#getCustomEncode()
     * @see #getFTPConnection()
     * @generated
     */
    EAttribute getFTPConnection_CustomEncode();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.BRMSConnection <em>BRMS Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>BRMS Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.BRMSConnection
     * @generated
     */
    EClass getBRMSConnection();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.BRMSConnection#getXmlField <em>Xml Field</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xml Field</em>'.
     * @see org.talend.core.model.metadata.builder.connection.BRMSConnection#getXmlField()
     * @see #getBRMSConnection()
     * @generated
     */
    EAttribute getBRMSConnection_XmlField();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.BRMSConnection#getUrlName <em>Url Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Url Name</em>'.
     * @see org.talend.core.model.metadata.builder.connection.BRMSConnection#getUrlName()
     * @see #getBRMSConnection()
     * @generated
     */
    EAttribute getBRMSConnection_UrlName();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.BRMSConnection#getClassName <em>Class Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Class Name</em>'.
     * @see org.talend.core.model.metadata.builder.connection.BRMSConnection#getClassName()
     * @see #getBRMSConnection()
     * @generated
     */
    EAttribute getBRMSConnection_ClassName();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.BRMSConnection#getModuleUsed <em>Module Used</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Module Used</em>'.
     * @see org.talend.core.model.metadata.builder.connection.BRMSConnection#getModuleUsed()
     * @see #getBRMSConnection()
     * @generated
     */
    EAttribute getBRMSConnection_ModuleUsed();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.core.model.metadata.builder.connection.BRMSConnection#getRoot <em>Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Root</em>'.
     * @see org.talend.core.model.metadata.builder.connection.BRMSConnection#getRoot()
     * @see #getBRMSConnection()
     * @generated
     */
    EReference getBRMSConnection_Root();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.core.model.metadata.builder.connection.BRMSConnection#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Group</em>'.
     * @see org.talend.core.model.metadata.builder.connection.BRMSConnection#getGroup()
     * @see #getBRMSConnection()
     * @generated
     */
    EReference getBRMSConnection_Group();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.core.model.metadata.builder.connection.BRMSConnection#getLoop <em>Loop</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Loop</em>'.
     * @see org.talend.core.model.metadata.builder.connection.BRMSConnection#getLoop()
     * @see #getBRMSConnection()
     * @generated
     */
    EReference getBRMSConnection_Loop();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.BRMSConnection#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Package</em>'.
     * @see org.talend.core.model.metadata.builder.connection.BRMSConnection#getPackage()
     * @see #getBRMSConnection()
     * @generated
     */
    EAttribute getBRMSConnection_Package();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.ConditionType <em>Condition Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Condition Type</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ConditionType
     * @generated
     */
    EClass getConditionType();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.ConditionType#getInputColumn <em>Input Column</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input Column</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ConditionType#getInputColumn()
     * @see #getConditionType()
     * @generated
     */
    EAttribute getConditionType_InputColumn();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.ConditionType#getFunction <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Function</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ConditionType#getFunction()
     * @see #getConditionType()
     * @generated
     */
    EAttribute getConditionType_Function();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.ConditionType#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operator</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ConditionType#getOperator()
     * @see #getConditionType()
     * @generated
     */
    EAttribute getConditionType_Operator();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.ConditionType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ConditionType#getValue()
     * @see #getConditionType()
     * @generated
     */
    EAttribute getConditionType_Value();

    /**
     * Returns the meta object for class '{@link java.util.Map.Entry <em>Inner Join Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Inner Join Map</em>'.
     * @see java.util.Map.Entry
     * @model keyDataType="org.eclipse.emf.ecore.EString"
     *        valueDataType="org.eclipse.emf.ecore.EString"
     * @generated
     */
    EClass getInnerJoinMap();

    /**
     * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see java.util.Map.Entry
     * @see #getInnerJoinMap()
     * @generated
     */
    EAttribute getInnerJoinMap_Key();

    /**
     * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see java.util.Map.Entry
     * @see #getInnerJoinMap()
     * @generated
     */
    EAttribute getInnerJoinMap_Value();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.EDIFACTConnection <em>EDIFACT Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EDIFACT Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.EDIFACTConnection
     * @generated
     */
    EClass getEDIFACTConnection();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.EDIFACTConnection#getXmlName <em>Xml Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xml Name</em>'.
     * @see org.talend.core.model.metadata.builder.connection.EDIFACTConnection#getXmlName()
     * @see #getEDIFACTConnection()
     * @generated
     */
    EAttribute getEDIFACTConnection_XmlName();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.EDIFACTConnection#getFileName <em>File Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File Name</em>'.
     * @see org.talend.core.model.metadata.builder.connection.EDIFACTConnection#getFileName()
     * @see #getEDIFACTConnection()
     * @generated
     */
    EAttribute getEDIFACTConnection_FileName();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.EDIFACTConnection#getXmlPath <em>Xml Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xml Path</em>'.
     * @see org.talend.core.model.metadata.builder.connection.EDIFACTConnection#getXmlPath()
     * @see #getEDIFACTConnection()
     * @generated
     */
    EAttribute getEDIFACTConnection_XmlPath();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.EDIFACTConnection#isInputModel <em>Input Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input Model</em>'.
     * @see org.talend.core.model.metadata.builder.connection.EDIFACTConnection#isInputModel()
     * @see #getEDIFACTConnection()
     * @generated
     */
    EAttribute getEDIFACTConnection_InputModel();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.EDIFACTConnection#getXmlNode <em>Xml Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xml Node</em>'.
     * @see org.talend.core.model.metadata.builder.connection.EDIFACTConnection#getXmlNode()
     * @see #getEDIFACTConnection()
     * @generated
     */
    EAttribute getEDIFACTConnection_XmlNode();

    /**
     * Returns the meta object for class '{@link org.talend.core.model.metadata.builder.connection.ValidationRulesConnection <em>Validation Rules Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Validation Rules Connection</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ValidationRulesConnection
     * @generated
     */
    EClass getValidationRulesConnection();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#isIsSelect <em>Is Select</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Select</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#isIsSelect()
     * @see #getValidationRulesConnection()
     * @generated
     */
    EAttribute getValidationRulesConnection_IsSelect();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#isIsInsert <em>Is Insert</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Insert</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#isIsInsert()
     * @see #getValidationRulesConnection()
     * @generated
     */
    EAttribute getValidationRulesConnection_IsInsert();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#isIsUpdate <em>Is Update</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Update</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#isIsUpdate()
     * @see #getValidationRulesConnection()
     * @generated
     */
    EAttribute getValidationRulesConnection_IsUpdate();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#isIsDelete <em>Is Delete</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Delete</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#isIsDelete()
     * @see #getValidationRulesConnection()
     * @generated
     */
    EAttribute getValidationRulesConnection_IsDelete();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#getType()
     * @see #getValidationRulesConnection()
     * @generated
     */
    EAttribute getValidationRulesConnection_Type();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#getBaseSchema <em>Base Schema</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Base Schema</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#getBaseSchema()
     * @see #getValidationRulesConnection()
     * @generated
     */
    EAttribute getValidationRulesConnection_BaseSchema();

    /**
     * Returns the meta object for the attribute list '{@link org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#getBaseColumnNames <em>Base Column Names</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Base Column Names</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#getBaseColumnNames()
     * @see #getValidationRulesConnection()
     * @generated
     */
    EAttribute getValidationRulesConnection_BaseColumnNames();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#getRefSchema <em>Ref Schema</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ref Schema</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#getRefSchema()
     * @see #getValidationRulesConnection()
     * @generated
     */
    EAttribute getValidationRulesConnection_RefSchema();

    /**
     * Returns the meta object for the attribute list '{@link org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#getRefColumnNames <em>Ref Column Names</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Ref Column Names</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#getRefColumnNames()
     * @see #getValidationRulesConnection()
     * @generated
     */
    EAttribute getValidationRulesConnection_RefColumnNames();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#getJavaCondition <em>Java Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Java Condition</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#getJavaCondition()
     * @see #getValidationRulesConnection()
     * @generated
     */
    EAttribute getValidationRulesConnection_JavaCondition();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#getSqlCondition <em>Sql Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sql Condition</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#getSqlCondition()
     * @see #getValidationRulesConnection()
     * @generated
     */
    EAttribute getValidationRulesConnection_SqlCondition();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#getLogicalOperator <em>Logical Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Logical Operator</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#getLogicalOperator()
     * @see #getValidationRulesConnection()
     * @generated
     */
    EAttribute getValidationRulesConnection_LogicalOperator();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#getConditions <em>Conditions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Conditions</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#getConditions()
     * @see #getValidationRulesConnection()
     * @generated
     */
    EReference getValidationRulesConnection_Conditions();

    /**
     * Returns the meta object for the map '{@link org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#getInnerJoins <em>Inner Joins</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>Inner Joins</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#getInnerJoins()
     * @see #getValidationRulesConnection()
     * @generated
     */
    EReference getValidationRulesConnection_InnerJoins();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#isIsDisallow <em>Is Disallow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Disallow</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#isIsDisallow()
     * @see #getValidationRulesConnection()
     * @generated
     */
    EAttribute getValidationRulesConnection_IsDisallow();

    /**
     * Returns the meta object for the attribute '{@link org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#isIsRejectLink <em>Is Reject Link</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Reject Link</em>'.
     * @see org.talend.core.model.metadata.builder.connection.ValidationRulesConnection#isIsRejectLink()
     * @see #getValidationRulesConnection()
     * @generated
     */
    EAttribute getValidationRulesConnection_IsRejectLink();

    /**
     * Returns the meta object for enum '{@link org.talend.core.model.metadata.builder.connection.FileFormat <em>File Format</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for enum '<em>File Format</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FileFormat
     * @generated
     */
    EEnum getFileFormat();

    /**
     * Returns the meta object for enum '{@link org.talend.core.model.metadata.builder.connection.FieldSeparator <em>Field Separator</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for enum '<em>Field Separator</em>'.
     * @see org.talend.core.model.metadata.builder.connection.FieldSeparator
     * @generated
     */
    EEnum getFieldSeparator();

    /**
     * Returns the meta object for enum '{@link org.talend.core.model.metadata.builder.connection.Escape <em>Escape</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for enum '<em>Escape</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Escape
     * @generated
     */
    EEnum getEscape();

    /**
     * Returns the meta object for enum '{@link org.talend.core.model.metadata.builder.connection.RowSeparator <em>Row Separator</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for enum '<em>Row Separator</em>'.
     * @see org.talend.core.model.metadata.builder.connection.RowSeparator
     * @generated
     */
    EEnum getRowSeparator();

    /**
     * Returns the meta object for enum '{@link org.talend.core.model.metadata.builder.connection.MDMConnectionProtocol <em>MDM Connection Protocol</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for enum '<em>MDM Connection Protocol</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MDMConnectionProtocol
     * @generated
     */
    EEnum getMDMConnectionProtocol();

    /**
     * Returns the meta object for enum '{@link org.talend.core.model.metadata.builder.connection.MdmConceptType <em>Mdm Concept Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Mdm Concept Type</em>'.
     * @see org.talend.core.model.metadata.builder.connection.MdmConceptType
     * @generated
     */
    EEnum getMdmConceptType();

    /**
     * Returns the meta object for enum '{@link org.talend.core.model.metadata.builder.connection.RuleType <em>Rule Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Rule Type</em>'.
     * @see org.talend.core.model.metadata.builder.connection.RuleType
     * @generated
     */
    EEnum getRuleType();

    /**
     * Returns the meta object for enum '{@link org.talend.core.model.metadata.builder.connection.Function <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Function</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Function
     * @generated
     */
    EEnum getFunction();

    /**
     * Returns the meta object for enum '{@link org.talend.core.model.metadata.builder.connection.Operator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Operator</em>'.
     * @see org.talend.core.model.metadata.builder.connection.Operator
     * @generated
     */
    EEnum getOperator();

    /**
     * Returns the meta object for enum '{@link org.talend.core.model.metadata.builder.connection.LogicalOperator <em>Logical Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Logical Operator</em>'.
     * @see org.talend.core.model.metadata.builder.connection.LogicalOperator
     * @generated
     */
    EEnum getLogicalOperator();

    /**
     * Returns the meta object for data type '{@link java.util.HashMap <em>Map</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for data type '<em>Map</em>'.
     * @see java.util.HashMap
     * @model instanceClass="java.util.HashMap"
     * @generated
     */
    EDataType getMap();

    /**
     * Returns the meta object for data type '{@link java.util.ArrayList <em>List</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for data type '<em>List</em>'.
     * @see java.util.ArrayList
     * @model instanceClass="java.util.ArrayList"
     * @generated
     */
    EDataType getList();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ConnectionFactory getConnectionFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.MetadataImpl <em>Metadata</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.MetadataImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getMetadata()
         * @generated
         */
        EClass METADATA = eINSTANCE.getMetadata();

        /**
         * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference METADATA__CONNECTIONS = eINSTANCE.getMetadata_Connections();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.ConnectionImpl <em>Connection</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getConnection()
         * @generated
         */
        EClass CONNECTION = eINSTANCE.getConnection();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION__VERSION = eINSTANCE.getConnection_Version();

        /**
         * The meta object literal for the '<em><b>Queries</b></em>' containment reference feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTION__QUERIES = eINSTANCE.getConnection_Queries();

        /**
         * The meta object literal for the '<em><b>Context Mode</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION__CONTEXT_MODE = eINSTANCE.getConnection_ContextMode();

        /**
         * The meta object literal for the '<em><b>Context Id</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute CONNECTION__CONTEXT_ID = eINSTANCE.getConnection_ContextId();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.MetadataColumnImpl <em>Metadata Column</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.MetadataColumnImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getMetadataColumn()
         * @generated
         */
        EClass METADATA_COLUMN = eINSTANCE.getMetadataColumn();

        /**
         * The meta object literal for the '<em><b>Source Type</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute METADATA_COLUMN__SOURCE_TYPE = eINSTANCE.getMetadataColumn_SourceType();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METADATA_COLUMN__DEFAULT_VALUE = eINSTANCE.getMetadataColumn_DefaultValue();

        /**
         * The meta object literal for the '<em><b>Talend Type</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute METADATA_COLUMN__TALEND_TYPE = eINSTANCE.getMetadataColumn_TalendType();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute METADATA_COLUMN__KEY = eINSTANCE.getMetadataColumn_Key();

        /**
         * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute METADATA_COLUMN__NULLABLE = eINSTANCE.getMetadataColumn_Nullable();

        /**
         * The meta object literal for the '<em><b>Table</b></em>' reference feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference METADATA_COLUMN__TABLE = eINSTANCE.getMetadataColumn_Table();

        /**
         * The meta object literal for the '<em><b>Original Field</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METADATA_COLUMN__ORIGINAL_FIELD = eINSTANCE.getMetadataColumn_OriginalField();

        /**
         * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute METADATA_COLUMN__PATTERN = eINSTANCE.getMetadataColumn_Pattern();

        /**
         * The meta object literal for the '<em><b>Display Field</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METADATA_COLUMN__DISPLAY_FIELD = eINSTANCE.getMetadataColumn_DisplayField();

        /**
         * The meta object literal for the '<em><b>Related Entity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METADATA_COLUMN__RELATED_ENTITY = eINSTANCE.getMetadataColumn_RelatedEntity();

        /**
         * The meta object literal for the '<em><b>Relationship Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METADATA_COLUMN__RELATIONSHIP_TYPE = eINSTANCE.getMetadataColumn_RelationshipType();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.AbstractMetadataObjectImpl <em>Abstract Metadata Object</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.AbstractMetadataObjectImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getAbstractMetadataObject()
         * @generated
         */
        EClass ABSTRACT_METADATA_OBJECT = eINSTANCE.getAbstractMetadataObject();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_METADATA_OBJECT__PROPERTIES = eINSTANCE.getAbstractMetadataObject_Properties();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_METADATA_OBJECT__ID = eINSTANCE.getAbstractMetadataObject_Id();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_METADATA_OBJECT__COMMENT = eINSTANCE.getAbstractMetadataObject_Comment();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_METADATA_OBJECT__LABEL = eINSTANCE.getAbstractMetadataObject_Label();

        /**
         * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_METADATA_OBJECT__READ_ONLY = eINSTANCE.getAbstractMetadataObject_ReadOnly();

        /**
         * The meta object literal for the '<em><b>Synchronised</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_METADATA_OBJECT__SYNCHRONISED = eINSTANCE.getAbstractMetadataObject_Synchronised();

        /**
         * The meta object literal for the '<em><b>Divergency</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_METADATA_OBJECT__DIVERGENCY = eINSTANCE.getAbstractMetadataObject_Divergency();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.MetadataTableImpl <em>Metadata Table</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.MetadataTableImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getMetadataTable()
         * @generated
         */
        EClass METADATA_TABLE = eINSTANCE.getMetadataTable();

        /**
         * The meta object literal for the '<em><b>Source Name</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute METADATA_TABLE__SOURCE_NAME = eINSTANCE.getMetadataTable_SourceName();

        /**
         * The meta object literal for the '<em><b>Table Type</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute METADATA_TABLE__TABLE_TYPE = eINSTANCE.getMetadataTable_TableType();

        /**
         * The meta object literal for the '<em><b>Attached CDC</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METADATA_TABLE__ATTACHED_CDC = eINSTANCE.getMetadataTable_AttachedCDC();

        /**
         * The meta object literal for the '<em><b>Activated CDC</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METADATA_TABLE__ACTIVATED_CDC = eINSTANCE.getMetadataTable_ActivatedCDC();

        /**
         * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference METADATA_TABLE__COLUMNS = eINSTANCE.getMetadataTable_Columns();

        /**
         * The meta object literal for the '<em><b>Connection</b></em>' reference feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference METADATA_TABLE__CONNECTION = eINSTANCE.getMetadataTable_Connection();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.FileConnectionImpl <em>File Connection</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.FileConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getFileConnection()
         * @generated
         */
        EClass FILE_CONNECTION = eINSTANCE.getFileConnection();

        /**
         * The meta object literal for the '<em><b>Server</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONNECTION__SERVER = eINSTANCE.getFileConnection_Server();

        /**
         * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONNECTION__FILE_PATH = eINSTANCE.getFileConnection_FilePath();

        /**
         * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONNECTION__FORMAT = eINSTANCE.getFileConnection_Format();

        /**
         * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONNECTION__ENCODING = eINSTANCE.getFileConnection_Encoding();

        /**
         * The meta object literal for the '<em><b>Field Separator Value</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute FILE_CONNECTION__FIELD_SEPARATOR_VALUE = eINSTANCE.getFileConnection_FieldSeparatorValue();

        /**
         * The meta object literal for the '<em><b>Row Separator Type</b></em>' attribute feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONNECTION__ROW_SEPARATOR_TYPE = eINSTANCE.getFileConnection_RowSeparatorType();

        /**
         * The meta object literal for the '<em><b>Row Separator Value</b></em>' attribute feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONNECTION__ROW_SEPARATOR_VALUE = eINSTANCE.getFileConnection_RowSeparatorValue();

        /**
         * The meta object literal for the '<em><b>Text Identifier</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONNECTION__TEXT_IDENTIFIER = eINSTANCE.getFileConnection_TextIdentifier();

        /**
         * The meta object literal for the '<em><b>Use Header</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONNECTION__USE_HEADER = eINSTANCE.getFileConnection_UseHeader();

        /**
         * The meta object literal for the '<em><b>Header Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONNECTION__HEADER_VALUE = eINSTANCE.getFileConnection_HeaderValue();

        /**
         * The meta object literal for the '<em><b>Use Footer</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONNECTION__USE_FOOTER = eINSTANCE.getFileConnection_UseFooter();

        /**
         * The meta object literal for the '<em><b>Footer Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONNECTION__FOOTER_VALUE = eINSTANCE.getFileConnection_FooterValue();

        /**
         * The meta object literal for the '<em><b>Use Limit</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONNECTION__USE_LIMIT = eINSTANCE.getFileConnection_UseLimit();

        /**
         * The meta object literal for the '<em><b>Limit Value</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONNECTION__LIMIT_VALUE = eINSTANCE.getFileConnection_LimitValue();

        /**
         * The meta object literal for the '<em><b>First Line Caption</b></em>' attribute feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONNECTION__FIRST_LINE_CAPTION = eINSTANCE.getFileConnection_FirstLineCaption();

        /**
         * The meta object literal for the '<em><b>Remove Empty Row</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONNECTION__REMOVE_EMPTY_ROW = eINSTANCE.getFileConnection_RemoveEmptyRow();

        /**
         * The meta object literal for the '<em><b>Escape Type</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONNECTION__ESCAPE_TYPE = eINSTANCE.getFileConnection_EscapeType();

        /**
         * The meta object literal for the '<em><b>Escape Char</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONNECTION__ESCAPE_CHAR = eINSTANCE.getFileConnection_EscapeChar();

        /**
         * The meta object literal for the '<em><b>Text Enclosure</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONNECTION__TEXT_ENCLOSURE = eINSTANCE.getFileConnection_TextEnclosure();

        /**
         * The meta object literal for the '<em><b>Csv Option</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute FILE_CONNECTION__CSV_OPTION = eINSTANCE.getFileConnection_CsvOption();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.DelimitedFileConnectionImpl <em>Delimited File Connection</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.DelimitedFileConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getDelimitedFileConnection()
         * @generated
         */
        EClass DELIMITED_FILE_CONNECTION = eINSTANCE.getDelimitedFileConnection();

        /**
         * The meta object literal for the '<em><b>Field Separator Type</b></em>' attribute feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DELIMITED_FILE_CONNECTION__FIELD_SEPARATOR_TYPE = eINSTANCE.getDelimitedFileConnection_FieldSeparatorType();

        /**
         * The meta object literal for the '<em><b>Split Record</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DELIMITED_FILE_CONNECTION__SPLIT_RECORD = eINSTANCE.getDelimitedFileConnection_SplitRecord();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.PositionalFileConnectionImpl <em>Positional File Connection</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.PositionalFileConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getPositionalFileConnection()
         * @generated
         */
        EClass POSITIONAL_FILE_CONNECTION = eINSTANCE.getPositionalFileConnection();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.EbcdicConnectionImpl <em>Ebcdic Connection</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.EbcdicConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getEbcdicConnection()
         * @generated
         */
        EClass EBCDIC_CONNECTION = eINSTANCE.getEbcdicConnection();

        /**
         * The meta object literal for the '<em><b>Mid File</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute EBCDIC_CONNECTION__MID_FILE = eINSTANCE.getEbcdicConnection_MidFile();

        /**
         * The meta object literal for the '<em><b>Data File</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute EBCDIC_CONNECTION__DATA_FILE = eINSTANCE.getEbcdicConnection_DataFile();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.MDMConnectionImpl <em>MDM Connection</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.MDMConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getMDMConnection()
         * @generated
         */
        EClass MDM_CONNECTION = eINSTANCE.getMDMConnection();

        /**
         * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute MDM_CONNECTION__USERNAME = eINSTANCE.getMDMConnection_Username();

        /**
         * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute MDM_CONNECTION__PASSWORD = eINSTANCE.getMDMConnection_Password();

        /**
         * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute MDM_CONNECTION__PORT = eINSTANCE.getMDMConnection_Port();

        /**
         * The meta object literal for the '<em><b>Server</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute MDM_CONNECTION__SERVER = eINSTANCE.getMDMConnection_Server();

        /**
         * The meta object literal for the '<em><b>Universe</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute MDM_CONNECTION__UNIVERSE = eINSTANCE.getMDMConnection_Universe();

        /**
         * The meta object literal for the '<em><b>Datamodel</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute MDM_CONNECTION__DATAMODEL = eINSTANCE.getMDMConnection_Datamodel();

        /**
         * The meta object literal for the '<em><b>Datacluster</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute MDM_CONNECTION__DATACLUSTER = eINSTANCE.getMDMConnection_Datacluster();

        /**
         * The meta object literal for the '<em><b>Schemas</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference MDM_CONNECTION__SCHEMAS = eINSTANCE.getMDMConnection_Schemas();

        /**
         * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute MDM_CONNECTION__PROTOCOL = eINSTANCE.getMDMConnection_Protocol();

        /**
         * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute MDM_CONNECTION__CONTEXT = eINSTANCE.getMDMConnection_Context();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.DatabaseConnectionImpl <em>Database Connection</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.DatabaseConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getDatabaseConnection()
         * @generated
         */
        EClass DATABASE_CONNECTION = eINSTANCE.getDatabaseConnection();

        /**
         * The meta object literal for the '<em><b>Database Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__DATABASE_TYPE = eINSTANCE.getDatabaseConnection_DatabaseType();

        /**
         * The meta object literal for the '<em><b>Driver Jar Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__DRIVER_JAR_PATH = eINSTANCE.getDatabaseConnection_DriverJarPath();

        /**
         * The meta object literal for the '<em><b>Driver Class</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__DRIVER_CLASS = eINSTANCE.getDatabaseConnection_DriverClass();

        /**
         * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__URL = eINSTANCE.getDatabaseConnection_URL();

        /**
         * The meta object literal for the '<em><b>Db Version String</b></em>' attribute feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__DB_VERSION_STRING = eINSTANCE.getDatabaseConnection_DbVersionString();

        /**
         * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__PORT = eINSTANCE.getDatabaseConnection_Port();

        /**
         * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__USERNAME = eINSTANCE.getDatabaseConnection_Username();

        /**
         * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__PASSWORD = eINSTANCE.getDatabaseConnection_Password();

        /**
         * The meta object literal for the '<em><b>Server Name</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__SERVER_NAME = eINSTANCE.getDatabaseConnection_ServerName();

        /**
         * The meta object literal for the '<em><b>Datasource Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__DATASOURCE_NAME = eINSTANCE.getDatabaseConnection_DatasourceName();

        /**
         * The meta object literal for the '<em><b>File Field Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__FILE_FIELD_NAME = eINSTANCE.getDatabaseConnection_FileFieldName();

        /**
         * The meta object literal for the '<em><b>SID</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__SID = eINSTANCE.getDatabaseConnection_SID();

        /**
         * The meta object literal for the '<em><b>Sql Synthax</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__SQL_SYNTHAX = eINSTANCE.getDatabaseConnection_SqlSynthax();

        /**
         * The meta object literal for the '<em><b>String Quote</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__STRING_QUOTE = eINSTANCE.getDatabaseConnection_StringQuote();

        /**
         * The meta object literal for the '<em><b>Null Char</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__NULL_CHAR = eINSTANCE.getDatabaseConnection_NullChar();

        /**
         * The meta object literal for the '<em><b>Dbms Id</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__DBMS_ID = eINSTANCE.getDatabaseConnection_DbmsId();

        /**
         * The meta object literal for the '<em><b>Product Id</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__PRODUCT_ID = eINSTANCE.getDatabaseConnection_ProductId();

        /**
         * The meta object literal for the '<em><b>DB Root Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__DB_ROOT_PATH = eINSTANCE.getDatabaseConnection_DBRootPath();

        /**
         * The meta object literal for the '<em><b>Additional Params</b></em>' attribute feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__ADDITIONAL_PARAMS = eINSTANCE.getDatabaseConnection_AdditionalParams();

        /**
         * The meta object literal for the '<em><b>Standard SQL</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__STANDARD_SQL = eINSTANCE.getDatabaseConnection_StandardSQL();

        /**
         * The meta object literal for the '<em><b>System SQL</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__SYSTEM_SQL = eINSTANCE.getDatabaseConnection_SystemSQL();

        /**
         * The meta object literal for the '<em><b>Cdc Conns</b></em>' containment reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference DATABASE_CONNECTION__CDC_CONNS = eINSTANCE.getDatabaseConnection_CdcConns();

        /**
         * The meta object literal for the '<em><b>Cdc Type Mode</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__CDC_TYPE_MODE = eINSTANCE.getDatabaseConnection_CdcTypeMode();

        /**
         * The meta object literal for the '<em><b>SQL Mode</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__SQL_MODE = eINSTANCE.getDatabaseConnection_SQLMode();

        /**
         * The meta object literal for the '<em><b>Ui Schema</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute DATABASE_CONNECTION__UI_SCHEMA = eINSTANCE.getDatabaseConnection_UiSchema();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.SAPConnectionImpl <em>SAP Connection</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.SAPConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getSAPConnection()
         * @generated
         */
        EClass SAP_CONNECTION = eINSTANCE.getSAPConnection();

        /**
         * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute SAP_CONNECTION__HOST = eINSTANCE.getSAPConnection_Host();

        /**
         * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute SAP_CONNECTION__USERNAME = eINSTANCE.getSAPConnection_Username();

        /**
         * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute SAP_CONNECTION__PASSWORD = eINSTANCE.getSAPConnection_Password();

        /**
         * The meta object literal for the '<em><b>Client</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute SAP_CONNECTION__CLIENT = eINSTANCE.getSAPConnection_Client();

        /**
         * The meta object literal for the '<em><b>System Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SAP_CONNECTION__SYSTEM_NUMBER = eINSTANCE.getSAPConnection_SystemNumber();

        /**
         * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute SAP_CONNECTION__LANGUAGE = eINSTANCE.getSAPConnection_Language();

        /**
         * The meta object literal for the '<em><b>Funtions</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference SAP_CONNECTION__FUNTIONS = eINSTANCE.getSAPConnection_Funtions();

        /**
         * The meta object literal for the '<em><b>Current Fucntion</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SAP_CONNECTION__CURRENT_FUCNTION = eINSTANCE.getSAPConnection_CurrentFucntion();

        /**
         * The meta object literal for the '<em><b>IDocs</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference SAP_CONNECTION__IDOCS = eINSTANCE.getSAPConnection_IDocs();

        /**
         * The meta object literal for the '<em><b>Jco Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SAP_CONNECTION__JCO_VERSION = eINSTANCE.getSAPConnection_JcoVersion();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.SAPFunctionUnitImpl <em>SAP Function Unit</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.SAPFunctionUnitImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getSAPFunctionUnit()
         * @generated
         */
        EClass SAP_FUNCTION_UNIT = eINSTANCE.getSAPFunctionUnit();

        /**
         * The meta object literal for the '<em><b>Output Type</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute SAP_FUNCTION_UNIT__OUTPUT_TYPE = eINSTANCE.getSAPFunctionUnit_OutputType();

        /**
         * The meta object literal for the '<em><b>Output Table Name</b></em>' attribute feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SAP_FUNCTION_UNIT__OUTPUT_TABLE_NAME = eINSTANCE.getSAPFunctionUnit_OutputTableName();

        /**
         * The meta object literal for the '<em><b>Input Parameter Table</b></em>' containment reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference SAP_FUNCTION_UNIT__INPUT_PARAMETER_TABLE = eINSTANCE.getSAPFunctionUnit_InputParameterTable();

        /**
         * The meta object literal for the '<em><b>Output Parameter Table</b></em>' containment reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference SAP_FUNCTION_UNIT__OUTPUT_PARAMETER_TABLE = eINSTANCE.getSAPFunctionUnit_OutputParameterTable();

        /**
         * The meta object literal for the '<em><b>Metadata Table</b></em>' containment reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference SAP_FUNCTION_UNIT__METADATA_TABLE = eINSTANCE.getSAPFunctionUnit_MetadataTable();

        /**
         * The meta object literal for the '<em><b>Connection</b></em>' container reference feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EReference SAP_FUNCTION_UNIT__CONNECTION = eINSTANCE.getSAPFunctionUnit_Connection();

        /**
         * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference SAP_FUNCTION_UNIT__TABLES = eINSTANCE.getSAPFunctionUnit_Tables();

        /**
         * The meta object literal for the '<em><b>Test Input Parameter Table</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SAP_FUNCTION_UNIT__TEST_INPUT_PARAMETER_TABLE = eINSTANCE.getSAPFunctionUnit_TestInputParameterTable();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.SAPIDocUnitImpl <em>SAPI Doc Unit</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.SAPIDocUnitImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getSAPIDocUnit()
         * @generated
         */
        EClass SAPI_DOC_UNIT = eINSTANCE.getSAPIDocUnit();

        /**
         * The meta object literal for the '<em><b>Connection</b></em>' container reference feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EReference SAPI_DOC_UNIT__CONNECTION = eINSTANCE.getSAPIDocUnit_Connection();

        /**
         * The meta object literal for the '<em><b>Program Id</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute SAPI_DOC_UNIT__PROGRAM_ID = eINSTANCE.getSAPIDocUnit_ProgramId();

        /**
         * The meta object literal for the '<em><b>Gateway Service</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SAPI_DOC_UNIT__GATEWAY_SERVICE = eINSTANCE.getSAPIDocUnit_GatewayService();

        /**
         * The meta object literal for the '<em><b>Use Xml Output</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SAPI_DOC_UNIT__USE_XML_OUTPUT = eINSTANCE.getSAPIDocUnit_UseXmlOutput();

        /**
         * The meta object literal for the '<em><b>Xml File</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute SAPI_DOC_UNIT__XML_FILE = eINSTANCE.getSAPIDocUnit_XmlFile();

        /**
         * The meta object literal for the '<em><b>Use Html Output</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SAPI_DOC_UNIT__USE_HTML_OUTPUT = eINSTANCE.getSAPIDocUnit_UseHtmlOutput();

        /**
         * The meta object literal for the '<em><b>Html File</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute SAPI_DOC_UNIT__HTML_FILE = eINSTANCE.getSAPIDocUnit_HtmlFile();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.SAPFunctionParameterColumnImpl <em>SAP Function Parameter Column</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.SAPFunctionParameterColumnImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getSAPFunctionParameterColumn()
         * @generated
         */
        EClass SAP_FUNCTION_PARAMETER_COLUMN = eINSTANCE.getSAPFunctionParameterColumn();

        /**
         * The meta object literal for the '<em><b>Parameter Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SAP_FUNCTION_PARAMETER_COLUMN__PARAMETER_TYPE = eINSTANCE.getSAPFunctionParameterColumn_ParameterType();

        /**
         * The meta object literal for the '<em><b>Structure Or Table Name</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute SAP_FUNCTION_PARAMETER_COLUMN__STRUCTURE_OR_TABLE_NAME = eINSTANCE
                .getSAPFunctionParameterColumn_StructureOrTableName();

        /**
         * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute SAP_FUNCTION_PARAMETER_COLUMN__DATA_TYPE = eINSTANCE.getSAPFunctionParameterColumn_DataType();

        /**
         * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute SAP_FUNCTION_PARAMETER_COLUMN__LENGTH = eINSTANCE.getSAPFunctionParameterColumn_Length();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute SAP_FUNCTION_PARAMETER_COLUMN__VALUE = eINSTANCE.getSAPFunctionParameterColumn_Value();

        /**
         * The meta object literal for the '<em><b>Parameter Table</b></em>' container reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference SAP_FUNCTION_PARAMETER_COLUMN__PARAMETER_TABLE = eINSTANCE.getSAPFunctionParameterColumn_ParameterTable();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.SAPFunctionParameterTableImpl <em>SAP Function Parameter Table</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.SAPFunctionParameterTableImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getSAPFunctionParameterTable()
         * @generated
         */
        EClass SAP_FUNCTION_PARAMETER_TABLE = eINSTANCE.getSAPFunctionParameterTable();

        /**
         * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference SAP_FUNCTION_PARAMETER_TABLE__COLUMNS = eINSTANCE.getSAPFunctionParameterTable_Columns();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.InputSAPFunctionParameterTableImpl <em>Input SAP Function Parameter Table</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.InputSAPFunctionParameterTableImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getInputSAPFunctionParameterTable()
         * @generated
         */
        EClass INPUT_SAP_FUNCTION_PARAMETER_TABLE = eINSTANCE.getInputSAPFunctionParameterTable();

        /**
         * The meta object literal for the '<em><b>Function Unit</b></em>' container reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference INPUT_SAP_FUNCTION_PARAMETER_TABLE__FUNCTION_UNIT = eINSTANCE.getInputSAPFunctionParameterTable_FunctionUnit();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.OutputSAPFunctionParameterTableImpl <em>Output SAP Function Parameter Table</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.OutputSAPFunctionParameterTableImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getOutputSAPFunctionParameterTable()
         * @generated
         */
        EClass OUTPUT_SAP_FUNCTION_PARAMETER_TABLE = eINSTANCE.getOutputSAPFunctionParameterTable();

        /**
         * The meta object literal for the '<em><b>Function Unit</b></em>' container reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference OUTPUT_SAP_FUNCTION_PARAMETER_TABLE__FUNCTION_UNIT = eINSTANCE
                .getOutputSAPFunctionParameterTable_FunctionUnit();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.RegexpFileConnectionImpl <em>Regexp File Connection</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.RegexpFileConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getRegexpFileConnection()
         * @generated
         */
        EClass REGEXP_FILE_CONNECTION = eINSTANCE.getRegexpFileConnection();

        /**
         * The meta object literal for the '<em><b>Field Separator Type</b></em>' attribute feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute REGEXP_FILE_CONNECTION__FIELD_SEPARATOR_TYPE = eINSTANCE.getRegexpFileConnection_FieldSeparatorType();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.XmlFileConnectionImpl <em>Xml File Connection</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.XmlFileConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getXmlFileConnection()
         * @generated
         */
        EClass XML_FILE_CONNECTION = eINSTANCE.getXmlFileConnection();

        /**
         * The meta object literal for the '<em><b>Xsd File Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute XML_FILE_CONNECTION__XSD_FILE_PATH = eINSTANCE.getXmlFileConnection_XsdFilePath();

        /**
         * The meta object literal for the '<em><b>Xml File Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute XML_FILE_CONNECTION__XML_FILE_PATH = eINSTANCE.getXmlFileConnection_XmlFilePath();

        /**
         * The meta object literal for the '<em><b>Guess</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute XML_FILE_CONNECTION__GUESS = eINSTANCE.getXmlFileConnection_Guess();

        /**
         * The meta object literal for the '<em><b>Mask XPattern</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute XML_FILE_CONNECTION__MASK_XPATTERN = eINSTANCE.getXmlFileConnection_MaskXPattern();

        /**
         * The meta object literal for the '<em><b>Schema</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference XML_FILE_CONNECTION__SCHEMA = eINSTANCE.getXmlFileConnection_Schema();

        /**
         * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute XML_FILE_CONNECTION__ENCODING = eINSTANCE.getXmlFileConnection_Encoding();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference XML_FILE_CONNECTION__GROUP = eINSTANCE.getXmlFileConnection_Group();

        /**
         * The meta object literal for the '<em><b>Root</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference XML_FILE_CONNECTION__ROOT = eINSTANCE.getXmlFileConnection_Root();

        /**
         * The meta object literal for the '<em><b>Loop</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference XML_FILE_CONNECTION__LOOP = eINSTANCE.getXmlFileConnection_Loop();

        /**
         * The meta object literal for the '<em><b>Input Model</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute XML_FILE_CONNECTION__INPUT_MODEL = eINSTANCE.getXmlFileConnection_InputModel();

        /**
         * The meta object literal for the '<em><b>Output File Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute XML_FILE_CONNECTION__OUTPUT_FILE_PATH = eINSTANCE.getXmlFileConnection_OutputFilePath();

        /**
         * The meta object literal for the '<em><b>File Content</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute XML_FILE_CONNECTION__FILE_CONTENT = eINSTANCE.getXmlFileConnection_FileContent();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.SchemaTargetImpl <em>Schema Target</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.SchemaTargetImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getSchemaTarget()
         * @generated
         */
        EClass SCHEMA_TARGET = eINSTANCE.getSchemaTarget();

        /**
         * The meta object literal for the '<em><b>Relative XPath Query</b></em>' attribute feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_TARGET__RELATIVE_XPATH_QUERY = eINSTANCE.getSchemaTarget_RelativeXPathQuery();

        /**
         * The meta object literal for the '<em><b>Tag Name</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute SCHEMA_TARGET__TAG_NAME = eINSTANCE.getSchemaTarget_TagName();

        /**
         * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEMA_TARGET__SCHEMA = eINSTANCE.getSchemaTarget_Schema();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.QueriesConnectionImpl <em>Queries Connection</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.QueriesConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getQueriesConnection()
         * @generated
         */
        EClass QUERIES_CONNECTION = eINSTANCE.getQueriesConnection();

        /**
         * The meta object literal for the '<em><b>Connection</b></em>' container reference feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EReference QUERIES_CONNECTION__CONNECTION = eINSTANCE.getQueriesConnection_Connection();

        /**
         * The meta object literal for the '<em><b>Query</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference QUERIES_CONNECTION__QUERY = eINSTANCE.getQueriesConnection_Query();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.QueryImpl <em>Query</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.QueryImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getQuery()
         * @generated
         */
        EClass QUERY = eINSTANCE.getQuery();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute QUERY__VALUE = eINSTANCE.getQuery_Value();

        /**
         * The meta object literal for the '<em><b>Queries</b></em>' container reference feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EReference QUERY__QUERIES = eINSTANCE.getQuery_Queries();

        /**
         * The meta object literal for the '<em><b>Context Mode</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute QUERY__CONTEXT_MODE = eINSTANCE.getQuery_ContextMode();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.LdifFileConnectionImpl <em>Ldif File Connection</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.LdifFileConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getLdifFileConnection()
         * @generated
         */
        EClass LDIF_FILE_CONNECTION = eINSTANCE.getLdifFileConnection();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute LDIF_FILE_CONNECTION__VALUE = eINSTANCE.getLdifFileConnection_Value();

        /**
         * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute LDIF_FILE_CONNECTION__FILE_PATH = eINSTANCE.getLdifFileConnection_FilePath();

        /**
         * The meta object literal for the '<em><b>Limit Entry</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute LDIF_FILE_CONNECTION__LIMIT_ENTRY = eINSTANCE.getLdifFileConnection_LimitEntry();

        /**
         * The meta object literal for the '<em><b>Use Limit</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute LDIF_FILE_CONNECTION__USE_LIMIT = eINSTANCE.getLdifFileConnection_UseLimit();

        /**
         * The meta object literal for the '<em><b>Server</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute LDIF_FILE_CONNECTION__SERVER = eINSTANCE.getLdifFileConnection_Server();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.FileExcelConnectionImpl <em>File Excel Connection</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.FileExcelConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getFileExcelConnection()
         * @generated
         */
        EClass FILE_EXCEL_CONNECTION = eINSTANCE.getFileExcelConnection();

        /**
         * The meta object literal for the '<em><b>Sheet Name</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute FILE_EXCEL_CONNECTION__SHEET_NAME = eINSTANCE.getFileExcelConnection_SheetName();

        /**
         * The meta object literal for the '<em><b>Sheet Columns</b></em>' attribute list feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_EXCEL_CONNECTION__SHEET_COLUMNS = eINSTANCE.getFileExcelConnection_SheetColumns();

        /**
         * The meta object literal for the '<em><b>First Column</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_EXCEL_CONNECTION__FIRST_COLUMN = eINSTANCE.getFileExcelConnection_FirstColumn();

        /**
         * The meta object literal for the '<em><b>Last Column</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute FILE_EXCEL_CONNECTION__LAST_COLUMN = eINSTANCE.getFileExcelConnection_LastColumn();

        /**
         * The meta object literal for the '<em><b>Thousand Separator</b></em>' attribute feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_EXCEL_CONNECTION__THOUSAND_SEPARATOR = eINSTANCE.getFileExcelConnection_ThousandSeparator();

        /**
         * The meta object literal for the '<em><b>Decimal Separator</b></em>' attribute feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_EXCEL_CONNECTION__DECIMAL_SEPARATOR = eINSTANCE.getFileExcelConnection_DecimalSeparator();

        /**
         * The meta object literal for the '<em><b>Advanced Spearator</b></em>' attribute feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_EXCEL_CONNECTION__ADVANCED_SPEARATOR = eINSTANCE.getFileExcelConnection_AdvancedSpearator();

        /**
         * The meta object literal for the '<em><b>Select All Sheets</b></em>' attribute feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute FILE_EXCEL_CONNECTION__SELECT_ALL_SHEETS = eINSTANCE.getFileExcelConnection_SelectAllSheets();

        /**
         * The meta object literal for the '<em><b>Sheet List</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute FILE_EXCEL_CONNECTION__SHEET_LIST = eINSTANCE.getFileExcelConnection_SheetList();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.XmlXPathLoopDescriptorImpl <em>Xml XPath Loop Descriptor</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.XmlXPathLoopDescriptorImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getXmlXPathLoopDescriptor()
         * @generated
         */
        EClass XML_XPATH_LOOP_DESCRIPTOR = eINSTANCE.getXmlXPathLoopDescriptor();

        /**
         * The meta object literal for the '<em><b>Limit Boucle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute XML_XPATH_LOOP_DESCRIPTOR__LIMIT_BOUCLE = eINSTANCE.getXmlXPathLoopDescriptor_LimitBoucle();

        /**
         * The meta object literal for the '<em><b>Absolute XPath Query</b></em>' attribute feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute XML_XPATH_LOOP_DESCRIPTOR__ABSOLUTE_XPATH_QUERY = eINSTANCE.getXmlXPathLoopDescriptor_AbsoluteXPathQuery();

        /**
         * The meta object literal for the '<em><b>Connection</b></em>' container reference feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EReference XML_XPATH_LOOP_DESCRIPTOR__CONNECTION = eINSTANCE.getXmlXPathLoopDescriptor_Connection();

        /**
         * The meta object literal for the '<em><b>Schema Targets</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference XML_XPATH_LOOP_DESCRIPTOR__SCHEMA_TARGETS = eINSTANCE.getXmlXPathLoopDescriptor_SchemaTargets();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.GenericSchemaConnectionImpl <em>Generic Schema Connection</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.GenericSchemaConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getGenericSchemaConnection()
         * @generated
         */
        EClass GENERIC_SCHEMA_CONNECTION = eINSTANCE.getGenericSchemaConnection();

        /**
         * The meta object literal for the '<em><b>Mapping Type Used</b></em>' attribute feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_SCHEMA_CONNECTION__MAPPING_TYPE_USED = eINSTANCE.getGenericSchemaConnection_MappingTypeUsed();

        /**
         * The meta object literal for the '<em><b>Mapping Type Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERIC_SCHEMA_CONNECTION__MAPPING_TYPE_ID = eINSTANCE.getGenericSchemaConnection_MappingTypeId();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.LDAPSchemaConnectionImpl <em>LDAP Schema Connection</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.LDAPSchemaConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getLDAPSchemaConnection()
         * @generated
         */
        EClass LDAP_SCHEMA_CONNECTION = eINSTANCE.getLDAPSchemaConnection();

        /**
         * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute LDAP_SCHEMA_CONNECTION__HOST = eINSTANCE.getLDAPSchemaConnection_Host();

        /**
         * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute LDAP_SCHEMA_CONNECTION__PORT = eINSTANCE.getLDAPSchemaConnection_Port();

        /**
         * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute LDAP_SCHEMA_CONNECTION__PROTOCOL = eINSTANCE.getLDAPSchemaConnection_Protocol();

        /**
         * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute LDAP_SCHEMA_CONNECTION__FILTER = eINSTANCE.getLDAPSchemaConnection_Filter();

        /**
         * The meta object literal for the '<em><b>Separator</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute LDAP_SCHEMA_CONNECTION__SEPARATOR = eINSTANCE.getLDAPSchemaConnection_Separator();

        /**
         * The meta object literal for the '<em><b>Use Advanced</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LDAP_SCHEMA_CONNECTION__USE_ADVANCED = eINSTANCE.getLDAPSchemaConnection_UseAdvanced();

        /**
         * The meta object literal for the '<em><b>Store Path</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute LDAP_SCHEMA_CONNECTION__STORE_PATH = eINSTANCE.getLDAPSchemaConnection_StorePath();

        /**
         * The meta object literal for the '<em><b>Use Limit</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute LDAP_SCHEMA_CONNECTION__USE_LIMIT = eINSTANCE.getLDAPSchemaConnection_UseLimit();

        /**
         * The meta object literal for the '<em><b>Use Authen</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute LDAP_SCHEMA_CONNECTION__USE_AUTHEN = eINSTANCE.getLDAPSchemaConnection_UseAuthen();

        /**
         * The meta object literal for the '<em><b>Bind Principal</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LDAP_SCHEMA_CONNECTION__BIND_PRINCIPAL = eINSTANCE.getLDAPSchemaConnection_BindPrincipal();

        /**
         * The meta object literal for the '<em><b>Bind Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LDAP_SCHEMA_CONNECTION__BIND_PASSWORD = eINSTANCE.getLDAPSchemaConnection_BindPassword();

        /**
         * The meta object literal for the '<em><b>Limit Value</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute LDAP_SCHEMA_CONNECTION__LIMIT_VALUE = eINSTANCE.getLDAPSchemaConnection_LimitValue();

        /**
         * The meta object literal for the '<em><b>Encryption Method Name</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute LDAP_SCHEMA_CONNECTION__ENCRYPTION_METHOD_NAME = eINSTANCE.getLDAPSchemaConnection_EncryptionMethodName();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute LDAP_SCHEMA_CONNECTION__VALUE = eINSTANCE.getLDAPSchemaConnection_Value();

        /**
         * The meta object literal for the '<em><b>Save Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LDAP_SCHEMA_CONNECTION__SAVE_PASSWORD = eINSTANCE.getLDAPSchemaConnection_SavePassword();

        /**
         * The meta object literal for the '<em><b>Aliases</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute LDAP_SCHEMA_CONNECTION__ALIASES = eINSTANCE.getLDAPSchemaConnection_Aliases();

        /**
         * The meta object literal for the '<em><b>Referrals</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute LDAP_SCHEMA_CONNECTION__REFERRALS = eINSTANCE.getLDAPSchemaConnection_Referrals();

        /**
         * The meta object literal for the '<em><b>Count Limit</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute LDAP_SCHEMA_CONNECTION__COUNT_LIMIT = eINSTANCE.getLDAPSchemaConnection_CountLimit();

        /**
         * The meta object literal for the '<em><b>Time Out Limit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LDAP_SCHEMA_CONNECTION__TIME_OUT_LIMIT = eINSTANCE.getLDAPSchemaConnection_TimeOutLimit();

        /**
         * The meta object literal for the '<em><b>Base DNs</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LDAP_SCHEMA_CONNECTION__BASE_DNS = eINSTANCE.getLDAPSchemaConnection_BaseDNs();

        /**
         * The meta object literal for the '<em><b>Get Base DNs From Root</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute LDAP_SCHEMA_CONNECTION__GET_BASE_DNS_FROM_ROOT = eINSTANCE.getLDAPSchemaConnection_GetBaseDNsFromRoot();

        /**
         * The meta object literal for the '<em><b>Return Attributes</b></em>' attribute list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute LDAP_SCHEMA_CONNECTION__RETURN_ATTRIBUTES = eINSTANCE.getLDAPSchemaConnection_ReturnAttributes();

        /**
         * The meta object literal for the '<em><b>Selected DN</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute LDAP_SCHEMA_CONNECTION__SELECTED_DN = eINSTANCE.getLDAPSchemaConnection_SelectedDN();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.WSDLSchemaConnectionImpl <em>WSDL Schema Connection</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.WSDLSchemaConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getWSDLSchemaConnection()
         * @generated
         */
        EClass WSDL_SCHEMA_CONNECTION = eINSTANCE.getWSDLSchemaConnection();

        /**
         * The meta object literal for the '<em><b>WSDL</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute WSDL_SCHEMA_CONNECTION__WSDL = eINSTANCE.getWSDLSchemaConnection_WSDL();

        /**
         * The meta object literal for the '<em><b>Need Auth</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute WSDL_SCHEMA_CONNECTION__NEED_AUTH = eINSTANCE.getWSDLSchemaConnection_NeedAuth();

        /**
         * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute WSDL_SCHEMA_CONNECTION__METHOD_NAME = eINSTANCE.getWSDLSchemaConnection_MethodName();

        /**
         * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute WSDL_SCHEMA_CONNECTION__PARAMETERS = eINSTANCE.getWSDLSchemaConnection_Parameters();

        /**
         * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute WSDL_SCHEMA_CONNECTION__USER_NAME = eINSTANCE.getWSDLSchemaConnection_UserName();

        /**
         * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute WSDL_SCHEMA_CONNECTION__PASSWORD = eINSTANCE.getWSDLSchemaConnection_Password();

        /**
         * The meta object literal for the '<em><b>Use Proxy</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute WSDL_SCHEMA_CONNECTION__USE_PROXY = eINSTANCE.getWSDLSchemaConnection_UseProxy();

        /**
         * The meta object literal for the '<em><b>Proxy Host</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute WSDL_SCHEMA_CONNECTION__PROXY_HOST = eINSTANCE.getWSDLSchemaConnection_ProxyHost();

        /**
         * The meta object literal for the '<em><b>Proxy Port</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute WSDL_SCHEMA_CONNECTION__PROXY_PORT = eINSTANCE.getWSDLSchemaConnection_ProxyPort();

        /**
         * The meta object literal for the '<em><b>Proxy User</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute WSDL_SCHEMA_CONNECTION__PROXY_USER = eINSTANCE.getWSDLSchemaConnection_ProxyUser();

        /**
         * The meta object literal for the '<em><b>Proxy Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WSDL_SCHEMA_CONNECTION__PROXY_PASSWORD = eINSTANCE.getWSDLSchemaConnection_ProxyPassword();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute WSDL_SCHEMA_CONNECTION__VALUE = eINSTANCE.getWSDLSchemaConnection_Value();

        /**
         * The meta object literal for the '<em><b>Endpoint URI</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WSDL_SCHEMA_CONNECTION__ENDPOINT_URI = eINSTANCE.getWSDLSchemaConnection_EndpointURI();

        /**
         * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute WSDL_SCHEMA_CONNECTION__ENCODING = eINSTANCE.getWSDLSchemaConnection_Encoding();

        /**
         * The meta object literal for the '<em><b>Time Out</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute WSDL_SCHEMA_CONNECTION__TIME_OUT = eINSTANCE.getWSDLSchemaConnection_TimeOut();

        /**
         * The meta object literal for the '<em><b>Is Input Model</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WSDL_SCHEMA_CONNECTION__IS_INPUT_MODEL = eINSTANCE.getWSDLSchemaConnection_IsInputModel();

        /**
         * The meta object literal for the '<em><b>Server Name Space</b></em>' attribute feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute WSDL_SCHEMA_CONNECTION__SERVER_NAME_SPACE = eINSTANCE.getWSDLSchemaConnection_ServerNameSpace();

        /**
         * The meta object literal for the '<em><b>Server Name</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute WSDL_SCHEMA_CONNECTION__SERVER_NAME = eINSTANCE.getWSDLSchemaConnection_ServerName();

        /**
         * The meta object literal for the '<em><b>Port Name Space</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WSDL_SCHEMA_CONNECTION__PORT_NAME_SPACE = eINSTANCE.getWSDLSchemaConnection_PortNameSpace();

        /**
         * The meta object literal for the '<em><b>Port Name</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute WSDL_SCHEMA_CONNECTION__PORT_NAME = eINSTANCE.getWSDLSchemaConnection_PortName();

        /**
         * The meta object literal for the '<em><b>Parameter Value</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference WSDL_SCHEMA_CONNECTION__PARAMETER_VALUE = eINSTANCE.getWSDLSchemaConnection_ParameterValue();

        /**
         * The meta object literal for the '<em><b>Output Parameter</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference WSDL_SCHEMA_CONNECTION__OUTPUT_PARAMETER = eINSTANCE.getWSDLSchemaConnection_OutputParameter();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.SalesforceSchemaConnectionImpl <em>Salesforce Schema Connection</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.SalesforceSchemaConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getSalesforceSchemaConnection()
         * @generated
         */
        EClass SALESFORCE_SCHEMA_CONNECTION = eINSTANCE.getSalesforceSchemaConnection();

        /**
         * The meta object literal for the '<em><b>Web Service Url</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SALESFORCE_SCHEMA_CONNECTION__WEB_SERVICE_URL = eINSTANCE.getSalesforceSchemaConnection_WebServiceUrl();

        /**
         * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute SALESFORCE_SCHEMA_CONNECTION__USER_NAME = eINSTANCE.getSalesforceSchemaConnection_UserName();

        /**
         * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute SALESFORCE_SCHEMA_CONNECTION__PASSWORD = eINSTANCE.getSalesforceSchemaConnection_Password();

        /**
         * The meta object literal for the '<em><b>Module Name</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute SALESFORCE_SCHEMA_CONNECTION__MODULE_NAME = eINSTANCE.getSalesforceSchemaConnection_ModuleName();

        /**
         * The meta object literal for the '<em><b>Query Condition</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SALESFORCE_SCHEMA_CONNECTION__QUERY_CONDITION = eINSTANCE.getSalesforceSchemaConnection_QueryCondition();

        /**
         * The meta object literal for the '<em><b>Use Custom Module Name</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute SALESFORCE_SCHEMA_CONNECTION__USE_CUSTOM_MODULE_NAME = eINSTANCE
                .getSalesforceSchemaConnection_UseCustomModuleName();

        /**
         * The meta object literal for the '<em><b>Use Proxy</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute SALESFORCE_SCHEMA_CONNECTION__USE_PROXY = eINSTANCE.getSalesforceSchemaConnection_UseProxy();

        /**
         * The meta object literal for the '<em><b>Proxy Host</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute SALESFORCE_SCHEMA_CONNECTION__PROXY_HOST = eINSTANCE.getSalesforceSchemaConnection_ProxyHost();

        /**
         * The meta object literal for the '<em><b>Proxy Port</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute SALESFORCE_SCHEMA_CONNECTION__PROXY_PORT = eINSTANCE.getSalesforceSchemaConnection_ProxyPort();

        /**
         * The meta object literal for the '<em><b>Proxy Username</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SALESFORCE_SCHEMA_CONNECTION__PROXY_USERNAME = eINSTANCE.getSalesforceSchemaConnection_ProxyUsername();

        /**
         * The meta object literal for the '<em><b>Proxy Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SALESFORCE_SCHEMA_CONNECTION__PROXY_PASSWORD = eINSTANCE.getSalesforceSchemaConnection_ProxyPassword();

        /**
         * The meta object literal for the '<em><b>Batch Size</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute SALESFORCE_SCHEMA_CONNECTION__BATCH_SIZE = eINSTANCE.getSalesforceSchemaConnection_BatchSize();

        /**
         * The meta object literal for the '<em><b>Use Http Proxy</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SALESFORCE_SCHEMA_CONNECTION__USE_HTTP_PROXY = eINSTANCE.getSalesforceSchemaConnection_UseHttpProxy();

        /**
         * The meta object literal for the '<em><b>Use Alphbet</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute SALESFORCE_SCHEMA_CONNECTION__USE_ALPHBET = eINSTANCE.getSalesforceSchemaConnection_UseAlphbet();

        /**
         * The meta object literal for the '<em><b>Time Out</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute SALESFORCE_SCHEMA_CONNECTION__TIME_OUT = eINSTANCE.getSalesforceSchemaConnection_TimeOut();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.CDCConnectionImpl <em>CDC Connection</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.CDCConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getCDCConnection()
         * @generated
         */
        EClass CDC_CONNECTION = eINSTANCE.getCDCConnection();

        /**
         * The meta object literal for the '<em><b>Connection</b></em>' container reference feature.
         * <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         * @generated
         */
        EReference CDC_CONNECTION__CONNECTION = eINSTANCE.getCDCConnection_Connection();

        /**
         * The meta object literal for the '<em><b>Cdc Types</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference CDC_CONNECTION__CDC_TYPES = eINSTANCE.getCDCConnection_CdcTypes();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.CDCTypeImpl <em>CDC Type</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.CDCTypeImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getCDCType()
         * @generated
         */
        EClass CDC_TYPE = eINSTANCE.getCDCType();

        /**
         * The meta object literal for the '<em><b>Link DB</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute CDC_TYPE__LINK_DB = eINSTANCE.getCDCType_LinkDB();

        /**
         * The meta object literal for the '<em><b>Subscribers</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference CDC_TYPE__SUBSCRIBERS = eINSTANCE.getCDCType_Subscribers();

        /**
         * The meta object literal for the '<em><b>Cdc Connection</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CDC_TYPE__CDC_CONNECTION = eINSTANCE.getCDCType_CdcConnection();

        /**
         * The meta object literal for the '<em><b>Journal Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CDC_TYPE__JOURNAL_NAME = eINSTANCE.getCDCType_JournalName();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.SubscriberTableImpl <em>Subscriber Table</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.SubscriberTableImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getSubscriberTable()
         * @generated
         */
        EClass SUBSCRIBER_TABLE = eINSTANCE.getSubscriberTable();

        /**
         * The meta object literal for the '<em><b>System</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute SUBSCRIBER_TABLE__SYSTEM = eINSTANCE.getSubscriberTable_System();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.SAPTestInputParameterTableImpl <em>SAP Test Input Parameter Table</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.SAPTestInputParameterTableImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getSAPTestInputParameterTable()
         * @generated
         */
        EClass SAP_TEST_INPUT_PARAMETER_TABLE = eINSTANCE.getSAPTestInputParameterTable();

        /**
         * The meta object literal for the '<em><b>Function Unit</b></em>' container reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference SAP_TEST_INPUT_PARAMETER_TABLE__FUNCTION_UNIT = eINSTANCE.getSAPTestInputParameterTable_FunctionUnit();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.ConceptImpl <em>Concept</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.ConceptImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getConcept()
         * @generated
         */
        EClass CONCEPT = eINSTANCE.getConcept();

        /**
         * The meta object literal for the '<em><b>Loop Expression</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONCEPT__LOOP_EXPRESSION = eINSTANCE.getConcept_LoopExpression();

        /**
         * The meta object literal for the '<em><b>Loop Limit</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute CONCEPT__LOOP_LIMIT = eINSTANCE.getConcept_LoopLimit();

        /**
         * The meta object literal for the '<em><b>Concept Targets</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference CONCEPT__CONCEPT_TARGETS = eINSTANCE.getConcept_ConceptTargets();

        /**
         * The meta object literal for the '<em><b>Input Model</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONCEPT__INPUT_MODEL = eINSTANCE.getConcept_InputModel();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference CONCEPT__GROUP = eINSTANCE.getConcept_Group();

        /**
         * The meta object literal for the '<em><b>Root</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference CONCEPT__ROOT = eINSTANCE.getConcept_Root();

        /**
         * The meta object literal for the '<em><b>Loop</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference CONCEPT__LOOP = eINSTANCE.getConcept_Loop();

        /**
         * The meta object literal for the '<em><b>Concept Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONCEPT__CONCEPT_TYPE = eINSTANCE.getConcept_ConceptType();

        /**
         * The meta object literal for the '<em><b>XPath Prefix</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONCEPT__XPATH_PREFIX = eINSTANCE.getConcept_XPathPrefix();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.ConceptTargetImpl <em>Concept Target</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.ConceptTargetImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getConceptTarget()
         * @generated
         */
        EClass CONCEPT_TARGET = eINSTANCE.getConceptTarget();

        /**
         * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONCEPT_TARGET__SCHEMA = eINSTANCE.getConceptTarget_Schema();

        /**
         * The meta object literal for the '<em><b>Target Name</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute CONCEPT_TARGET__TARGET_NAME = eINSTANCE.getConceptTarget_TargetName();

        /**
         * The meta object literal for the '<em><b>Relative Loop Expression</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute CONCEPT_TARGET__RELATIVE_LOOP_EXPRESSION = eINSTANCE.getConceptTarget_RelativeLoopExpression();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.HL7ConnectionImpl <em>HL7 Connection</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.HL7ConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getHL7Connection()
         * @generated
         */
        EClass HL7_CONNECTION = eINSTANCE.getHL7Connection();

        /**
         * The meta object literal for the '<em><b>Start Char</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute HL7_CONNECTION__START_CHAR = eINSTANCE.getHL7Connection_StartChar();

        /**
         * The meta object literal for the '<em><b>End Char</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute HL7_CONNECTION__END_CHAR = eINSTANCE.getHL7Connection_EndChar();

        /**
         * The meta object literal for the '<em><b>Root</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference HL7_CONNECTION__ROOT = eINSTANCE.getHL7Connection_Root();

        /**
         * The meta object literal for the '<em><b>Output File Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HL7_CONNECTION__OUTPUT_FILE_PATH = eINSTANCE.getHL7Connection_OutputFilePath();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.HeaderFooterConnectionImpl <em>Header Footer Connection</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.HeaderFooterConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getHeaderFooterConnection()
         * @generated
         */
        EClass HEADER_FOOTER_CONNECTION = eINSTANCE.getHeaderFooterConnection();

        /**
         * The meta object literal for the '<em><b>Is Header</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute HEADER_FOOTER_CONNECTION__IS_HEADER = eINSTANCE.getHeaderFooterConnection_IsHeader();

        /**
         * The meta object literal for the '<em><b>Imports</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute HEADER_FOOTER_CONNECTION__IMPORTS = eINSTANCE.getHeaderFooterConnection_Imports();

        /**
         * The meta object literal for the '<em><b>Main Code</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute HEADER_FOOTER_CONNECTION__MAIN_CODE = eINSTANCE.getHeaderFooterConnection_MainCode();

        /**
         * The meta object literal for the '<em><b>Libraries</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute HEADER_FOOTER_CONNECTION__LIBRARIES = eINSTANCE.getHeaderFooterConnection_Libraries();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.XMLFileNodeImpl <em>XML File Node</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.XMLFileNodeImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getXMLFileNode()
         * @generated
         */
        EClass XML_FILE_NODE = eINSTANCE.getXMLFileNode();

        /**
         * The meta object literal for the '<em><b>XML Path</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute XML_FILE_NODE__XML_PATH = eINSTANCE.getXMLFileNode_XMLPath();

        /**
         * The meta object literal for the '<em><b>Related Column</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute XML_FILE_NODE__RELATED_COLUMN = eINSTANCE.getXMLFileNode_RelatedColumn();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute XML_FILE_NODE__DEFAULT_VALUE = eINSTANCE.getXMLFileNode_DefaultValue();

        /**
         * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute XML_FILE_NODE__ATTRIBUTE = eINSTANCE.getXMLFileNode_Attribute();

        /**
         * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute XML_FILE_NODE__ORDER = eINSTANCE.getXMLFileNode_Order();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute XML_FILE_NODE__TYPE = eINSTANCE.getXMLFileNode_Type();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.WSDLParameterImpl <em>WSDL Parameter</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.WSDLParameterImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getWSDLParameter()
         * @generated
         */
        EClass WSDL_PARAMETER = eINSTANCE.getWSDLParameter();

        /**
         * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute WSDL_PARAMETER__ELEMENT = eINSTANCE.getWSDLParameter_Element();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute WSDL_PARAMETER__SOURCE = eINSTANCE.getWSDLParameter_Source();

        /**
         * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute WSDL_PARAMETER__COLUMN = eINSTANCE.getWSDLParameter_Column();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute WSDL_PARAMETER__EXPRESSION = eINSTANCE.getWSDLParameter_Expression();

        /**
         * The meta object literal for the '<em><b>Parameter Info</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WSDL_PARAMETER__PARAMETER_INFO = eINSTANCE.getWSDLParameter_ParameterInfo();

        /**
         * The meta object literal for the '<em><b>Parameter Info Parent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WSDL_PARAMETER__PARAMETER_INFO_PARENT = eINSTANCE.getWSDLParameter_ParameterInfoParent();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.GenericPackageImpl <em>Generic Package</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.GenericPackageImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getGenericPackage()
         * @generated
         */
        EClass GENERIC_PACKAGE = eINSTANCE.getGenericPackage();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.HL7FileNodeImpl <em>HL7 File Node</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.HL7FileNodeImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getHL7FileNode()
         * @generated
         */
        EClass HL7_FILE_NODE = eINSTANCE.getHL7FileNode();

        /**
         * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute HL7_FILE_NODE__FILE_PATH = eINSTANCE.getHL7FileNode_FilePath();

        /**
         * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute HL7_FILE_NODE__ORDER = eINSTANCE.getHL7FileNode_Order();

        /**
         * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute HL7_FILE_NODE__ATTRIBUTE = eINSTANCE.getHL7FileNode_Attribute();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HL7_FILE_NODE__DEFAULT_VALUE = eINSTANCE.getHL7FileNode_DefaultValue();

        /**
         * The meta object literal for the '<em><b>Related Column</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute HL7_FILE_NODE__RELATED_COLUMN = eINSTANCE.getHL7FileNode_RelatedColumn();

        /**
         * The meta object literal for the '<em><b>Repeatable</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute HL7_FILE_NODE__REPEATABLE = eINSTANCE.getHL7FileNode_Repeatable();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.FTPConnectionImpl <em>FTP Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.FTPConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getFTPConnection()
         * @generated
         */
        EClass FTP_CONNECTION = eINSTANCE.getFTPConnection();

        /**
         * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FTP_CONNECTION__HOST = eINSTANCE.getFTPConnection_Host();

        /**
         * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FTP_CONNECTION__PORT = eINSTANCE.getFTPConnection_Port();

        /**
         * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FTP_CONNECTION__USERNAME = eINSTANCE.getFTPConnection_Username();

        /**
         * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FTP_CONNECTION__PASSWORD = eINSTANCE.getFTPConnection_Password();

        /**
         * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FTP_CONNECTION__MODE = eINSTANCE.getFTPConnection_Mode();

        /**
         * The meta object literal for the '<em><b>Ecoding</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FTP_CONNECTION__ECODING = eINSTANCE.getFTPConnection_Ecoding();

        /**
         * The meta object literal for the '<em><b>SFTP</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FTP_CONNECTION__SFTP = eINSTANCE.getFTPConnection_SFTP();

        /**
         * The meta object literal for the '<em><b>FTPS</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FTP_CONNECTION__FTPS = eINSTANCE.getFTPConnection_FTPS();

        /**
         * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FTP_CONNECTION__METHOD = eINSTANCE.getFTPConnection_Method();

        /**
         * The meta object literal for the '<em><b>Keystore File</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FTP_CONNECTION__KEYSTORE_FILE = eINSTANCE.getFTPConnection_KeystoreFile();

        /**
         * The meta object literal for the '<em><b>Keystore Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FTP_CONNECTION__KEYSTORE_PASSWORD = eINSTANCE.getFTPConnection_KeystorePassword();

        /**
         * The meta object literal for the '<em><b>Usesocks</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FTP_CONNECTION__USESOCKS = eINSTANCE.getFTPConnection_Usesocks();

        /**
         * The meta object literal for the '<em><b>Proxyhost</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FTP_CONNECTION__PROXYHOST = eINSTANCE.getFTPConnection_Proxyhost();

        /**
         * The meta object literal for the '<em><b>Proxyport</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FTP_CONNECTION__PROXYPORT = eINSTANCE.getFTPConnection_Proxyport();

        /**
         * The meta object literal for the '<em><b>Proxyuser</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FTP_CONNECTION__PROXYUSER = eINSTANCE.getFTPConnection_Proxyuser();

        /**
         * The meta object literal for the '<em><b>Proxypassword</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FTP_CONNECTION__PROXYPASSWORD = eINSTANCE.getFTPConnection_Proxypassword();

        /**
         * The meta object literal for the '<em><b>Custom Encode</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FTP_CONNECTION__CUSTOM_ENCODE = eINSTANCE.getFTPConnection_CustomEncode();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.BRMSConnectionImpl <em>BRMS Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.BRMSConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getBRMSConnection()
         * @generated
         */
        EClass BRMS_CONNECTION = eINSTANCE.getBRMSConnection();

        /**
         * The meta object literal for the '<em><b>Xml Field</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BRMS_CONNECTION__XML_FIELD = eINSTANCE.getBRMSConnection_XmlField();

        /**
         * The meta object literal for the '<em><b>Url Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BRMS_CONNECTION__URL_NAME = eINSTANCE.getBRMSConnection_UrlName();

        /**
         * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BRMS_CONNECTION__CLASS_NAME = eINSTANCE.getBRMSConnection_ClassName();

        /**
         * The meta object literal for the '<em><b>Module Used</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BRMS_CONNECTION__MODULE_USED = eINSTANCE.getBRMSConnection_ModuleUsed();

        /**
         * The meta object literal for the '<em><b>Root</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BRMS_CONNECTION__ROOT = eINSTANCE.getBRMSConnection_Root();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BRMS_CONNECTION__GROUP = eINSTANCE.getBRMSConnection_Group();

        /**
         * The meta object literal for the '<em><b>Loop</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BRMS_CONNECTION__LOOP = eINSTANCE.getBRMSConnection_Loop();

        /**
         * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BRMS_CONNECTION__PACKAGE = eINSTANCE.getBRMSConnection_Package();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.ConditionTypeImpl <em>Condition Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.ConditionTypeImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getConditionType()
         * @generated
         */
        EClass CONDITION_TYPE = eINSTANCE.getConditionType();

        /**
         * The meta object literal for the '<em><b>Input Column</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONDITION_TYPE__INPUT_COLUMN = eINSTANCE.getConditionType_InputColumn();

        /**
         * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONDITION_TYPE__FUNCTION = eINSTANCE.getConditionType_Function();

        /**
         * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONDITION_TYPE__OPERATOR = eINSTANCE.getConditionType_Operator();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONDITION_TYPE__VALUE = eINSTANCE.getConditionType_Value();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.InnerJoinMapImpl <em>Inner Join Map</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.InnerJoinMapImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getInnerJoinMap()
         * @generated
         */
        EClass INNER_JOIN_MAP = eINSTANCE.getInnerJoinMap();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INNER_JOIN_MAP__KEY = eINSTANCE.getInnerJoinMap_Key();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INNER_JOIN_MAP__VALUE = eINSTANCE.getInnerJoinMap_Value();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.EDIFACTConnectionImpl <em>EDIFACT Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.EDIFACTConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getEDIFACTConnection()
         * @generated
         */
        EClass EDIFACT_CONNECTION = eINSTANCE.getEDIFACTConnection();

        /**
         * The meta object literal for the '<em><b>Xml Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EDIFACT_CONNECTION__XML_NAME = eINSTANCE.getEDIFACTConnection_XmlName();

        /**
         * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EDIFACT_CONNECTION__FILE_NAME = eINSTANCE.getEDIFACTConnection_FileName();

        /**
         * The meta object literal for the '<em><b>Xml Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EDIFACT_CONNECTION__XML_PATH = eINSTANCE.getEDIFACTConnection_XmlPath();

        /**
         * The meta object literal for the '<em><b>Input Model</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EDIFACT_CONNECTION__INPUT_MODEL = eINSTANCE.getEDIFACTConnection_InputModel();

        /**
         * The meta object literal for the '<em><b>Xml Node</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EDIFACT_CONNECTION__XML_NODE = eINSTANCE.getEDIFACTConnection_XmlNode();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.impl.ValidationRulesConnectionImpl <em>Validation Rules Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.impl.ValidationRulesConnectionImpl
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getValidationRulesConnection()
         * @generated
         */
        EClass VALIDATION_RULES_CONNECTION = eINSTANCE.getValidationRulesConnection();

        /**
         * The meta object literal for the '<em><b>Is Select</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALIDATION_RULES_CONNECTION__IS_SELECT = eINSTANCE.getValidationRulesConnection_IsSelect();

        /**
         * The meta object literal for the '<em><b>Is Insert</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALIDATION_RULES_CONNECTION__IS_INSERT = eINSTANCE.getValidationRulesConnection_IsInsert();

        /**
         * The meta object literal for the '<em><b>Is Update</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALIDATION_RULES_CONNECTION__IS_UPDATE = eINSTANCE.getValidationRulesConnection_IsUpdate();

        /**
         * The meta object literal for the '<em><b>Is Delete</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALIDATION_RULES_CONNECTION__IS_DELETE = eINSTANCE.getValidationRulesConnection_IsDelete();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALIDATION_RULES_CONNECTION__TYPE = eINSTANCE.getValidationRulesConnection_Type();

        /**
         * The meta object literal for the '<em><b>Base Schema</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALIDATION_RULES_CONNECTION__BASE_SCHEMA = eINSTANCE.getValidationRulesConnection_BaseSchema();

        /**
         * The meta object literal for the '<em><b>Base Column Names</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALIDATION_RULES_CONNECTION__BASE_COLUMN_NAMES = eINSTANCE.getValidationRulesConnection_BaseColumnNames();

        /**
         * The meta object literal for the '<em><b>Ref Schema</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALIDATION_RULES_CONNECTION__REF_SCHEMA = eINSTANCE.getValidationRulesConnection_RefSchema();

        /**
         * The meta object literal for the '<em><b>Ref Column Names</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALIDATION_RULES_CONNECTION__REF_COLUMN_NAMES = eINSTANCE.getValidationRulesConnection_RefColumnNames();

        /**
         * The meta object literal for the '<em><b>Java Condition</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALIDATION_RULES_CONNECTION__JAVA_CONDITION = eINSTANCE.getValidationRulesConnection_JavaCondition();

        /**
         * The meta object literal for the '<em><b>Sql Condition</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALIDATION_RULES_CONNECTION__SQL_CONDITION = eINSTANCE.getValidationRulesConnection_SqlCondition();

        /**
         * The meta object literal for the '<em><b>Logical Operator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALIDATION_RULES_CONNECTION__LOGICAL_OPERATOR = eINSTANCE.getValidationRulesConnection_LogicalOperator();

        /**
         * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALIDATION_RULES_CONNECTION__CONDITIONS = eINSTANCE.getValidationRulesConnection_Conditions();

        /**
         * The meta object literal for the '<em><b>Inner Joins</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALIDATION_RULES_CONNECTION__INNER_JOINS = eINSTANCE.getValidationRulesConnection_InnerJoins();

        /**
         * The meta object literal for the '<em><b>Is Disallow</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALIDATION_RULES_CONNECTION__IS_DISALLOW = eINSTANCE.getValidationRulesConnection_IsDisallow();

        /**
         * The meta object literal for the '<em><b>Is Reject Link</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALIDATION_RULES_CONNECTION__IS_REJECT_LINK = eINSTANCE.getValidationRulesConnection_IsRejectLink();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.FileFormat <em>File Format</em>}' enum.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.FileFormat
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getFileFormat()
         * @generated
         */
        EEnum FILE_FORMAT = eINSTANCE.getFileFormat();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.FieldSeparator <em>Field Separator</em>}' enum.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.FieldSeparator
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getFieldSeparator()
         * @generated
         */
        EEnum FIELD_SEPARATOR = eINSTANCE.getFieldSeparator();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.Escape <em>Escape</em>}' enum.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.Escape
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getEscape()
         * @generated
         */
        EEnum ESCAPE = eINSTANCE.getEscape();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.RowSeparator <em>Row Separator</em>}' enum.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.RowSeparator
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getRowSeparator()
         * @generated
         */
        EEnum ROW_SEPARATOR = eINSTANCE.getRowSeparator();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.MDMConnectionProtocol <em>MDM Connection Protocol</em>}' enum.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.MDMConnectionProtocol
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getMDMConnectionProtocol()
         * @generated
         */
        EEnum MDM_CONNECTION_PROTOCOL = eINSTANCE.getMDMConnectionProtocol();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.MdmConceptType <em>Mdm Concept Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.MdmConceptType
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getMdmConceptType()
         * @generated
         */
        EEnum MDM_CONCEPT_TYPE = eINSTANCE.getMdmConceptType();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.RuleType <em>Rule Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.RuleType
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getRuleType()
         * @generated
         */
        EEnum RULE_TYPE = eINSTANCE.getRuleType();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.Function <em>Function</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.Function
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getFunction()
         * @generated
         */
        EEnum FUNCTION = eINSTANCE.getFunction();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.Operator <em>Operator</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.Operator
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getOperator()
         * @generated
         */
        EEnum OPERATOR = eINSTANCE.getOperator();

        /**
         * The meta object literal for the '{@link org.talend.core.model.metadata.builder.connection.LogicalOperator <em>Logical Operator</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.core.model.metadata.builder.connection.LogicalOperator
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getLogicalOperator()
         * @generated
         */
        EEnum LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

        /**
         * The meta object literal for the '<em>Map</em>' data type.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see java.util.HashMap
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getMap()
         * @generated
         */
        EDataType MAP = eINSTANCE.getMap();

        /**
         * The meta object literal for the '<em>List</em>' data type.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see java.util.ArrayList
         * @see org.talend.core.model.metadata.builder.connection.impl.ConnectionPackageImpl#getList()
         * @generated
         */
        EDataType LIST = eINSTANCE.getList();

    }

} // ConnectionPackage
