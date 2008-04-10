/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.cwm.relational.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.talend.cwm.constants.ConstantsPackage;
import org.talend.cwm.constants.impl.ConstantsPackageImpl;
import org.talend.cwm.relational.RelationalFactory;
import org.talend.cwm.relational.RelationalPackage;
import org.talend.cwm.relational.TdCatalog;
import org.talend.cwm.relational.TdColumn;
import org.talend.cwm.relational.TdProcedure;
import org.talend.cwm.relational.TdSchema;
import org.talend.cwm.relational.TdSqlDataType;
import org.talend.cwm.relational.TdTable;
import org.talend.cwm.relational.TdTrigger;
import org.talend.cwm.relational.TdView;

import org.talend.cwm.softwaredeployment.impl.SoftwaredeploymentPackageImpl;

import orgomg.cwm.analysis.businessnomenclature.BusinessnomenclaturePackage;

import orgomg.cwm.analysis.datamining.DataminingPackage;

import orgomg.cwm.analysis.informationvisualization.InformationvisualizationPackage;

import orgomg.cwm.analysis.olap.OlapPackage;

import orgomg.cwm.analysis.transformation.TransformationPackage;

import orgomg.cwm.foundation.businessinformation.BusinessinformationPackage;

import orgomg.cwm.foundation.datatypes.DatatypesPackage;

import orgomg.cwm.foundation.expressions.ExpressionsPackage;

import orgomg.cwm.foundation.keysindexes.KeysindexesPackage;

import orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentPackage;

import orgomg.cwm.foundation.typemapping.TypemappingPackage;

import orgomg.cwm.management.warehouseoperation.WarehouseoperationPackage;

import orgomg.cwm.management.warehouseprocess.WarehouseprocessPackage;

import orgomg.cwm.objectmodel.behavioral.BehavioralPackage;

import orgomg.cwm.objectmodel.core.CorePackage;

import orgomg.cwm.objectmodel.instance.InstancePackage;

import orgomg.cwm.objectmodel.relationships.RelationshipsPackage;

import orgomg.cwm.resource.multidimensional.MultidimensionalPackage;

import orgomg.cwm.resource.record.RecordPackage;

import orgomg.cwm.resource.xml.XmlPackage;

import orgomg.cwmmip.CwmmipPackage;

import orgomg.cwmx.analysis.informationreporting.InformationreportingPackage;

import orgomg.cwmx.analysis.informationset.InformationsetPackage;

import orgomg.cwmx.foundation.er.ErPackage;

import orgomg.cwmx.resource.coboldata.CoboldataPackage;

import orgomg.cwmx.resource.dmsii.DmsiiPackage;

import orgomg.cwmx.resource.essbase.EssbasePackage;

import orgomg.cwmx.resource.express.ExpressPackage;

import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;

import orgomg.mof.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationalPackageImpl extends EPackageImpl implements RelationalPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tdTableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tdViewEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tdCatalogEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tdSchemaEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tdColumnEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tdSqlDataTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tdTriggerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tdProcedureEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.talend.cwm.relational.RelationalPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private RelationalPackageImpl() {
        super(eNS_URI, RelationalFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this
     * model, and for any others upon which it depends.  Simple
     * dependencies are satisfied by calling this method on all
     * dependent packages before doing anything else.  This method drives
     * initialization for interdependent packages directly, in parallel
     * with this package, itself.
     * <p>Of this package and its interdependencies, all packages which
     * have not yet been registered by their URI values are first created
     * and registered.  The packages are then initialized in two steps:
     * meta-model objects for all of the packages are created before any
     * are initialized, since one package's meta-model objects may refer to
     * those of another.
     * <p>Invocation of this method will not affect any packages that have
     * already been initialized.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static RelationalPackage init() {
        if (isInited) return (RelationalPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalPackage.eNS_URI);

        // Obtain or create and register package
        RelationalPackageImpl theRelationalPackage = (RelationalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof RelationalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new RelationalPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        CorePackage.eINSTANCE.eClass();
        BehavioralPackage.eINSTANCE.eClass();
        RelationshipsPackage.eINSTANCE.eClass();
        InstancePackage.eINSTANCE.eClass();
        BusinessinformationPackage.eINSTANCE.eClass();
        DatatypesPackage.eINSTANCE.eClass();
        ExpressionsPackage.eINSTANCE.eClass();
        KeysindexesPackage.eINSTANCE.eClass();
        SoftwaredeploymentPackage.eINSTANCE.eClass();
        TypemappingPackage.eINSTANCE.eClass();
        orgomg.cwm.resource.relational.RelationalPackage.eINSTANCE.eClass();
        RecordPackage.eINSTANCE.eClass();
        MultidimensionalPackage.eINSTANCE.eClass();
        XmlPackage.eINSTANCE.eClass();
        TransformationPackage.eINSTANCE.eClass();
        OlapPackage.eINSTANCE.eClass();
        DataminingPackage.eINSTANCE.eClass();
        InformationvisualizationPackage.eINSTANCE.eClass();
        BusinessnomenclaturePackage.eINSTANCE.eClass();
        WarehouseprocessPackage.eINSTANCE.eClass();
        WarehouseoperationPackage.eINSTANCE.eClass();
        ErPackage.eINSTANCE.eClass();
        CoboldataPackage.eINSTANCE.eClass();
        DmsiiPackage.eINSTANCE.eClass();
        ImsdatabasePackage.eINSTANCE.eClass();
        EssbasePackage.eINSTANCE.eClass();
        ExpressPackage.eINSTANCE.eClass();
        InformationsetPackage.eINSTANCE.eClass();
        InformationreportingPackage.eINSTANCE.eClass();
        CwmmipPackage.eINSTANCE.eClass();
        ModelPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        SoftwaredeploymentPackageImpl theSoftwaredeploymentPackage_1 = (SoftwaredeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.talend.cwm.softwaredeployment.SoftwaredeploymentPackage.eNS_URI) instanceof SoftwaredeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.talend.cwm.softwaredeployment.SoftwaredeploymentPackage.eNS_URI) : org.talend.cwm.softwaredeployment.SoftwaredeploymentPackage.eINSTANCE);
        ConstantsPackageImpl theConstantsPackage = (ConstantsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstantsPackage.eNS_URI) instanceof ConstantsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstantsPackage.eNS_URI) : ConstantsPackage.eINSTANCE);

        // Create package meta-data objects
        theRelationalPackage.createPackageContents();
        theSoftwaredeploymentPackage_1.createPackageContents();
        theConstantsPackage.createPackageContents();

        // Initialize created meta-data
        theRelationalPackage.initializePackageContents();
        theSoftwaredeploymentPackage_1.initializePackageContents();
        theConstantsPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theRelationalPackage.freeze();

        return theRelationalPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTdTable() {
        return tdTableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTdView() {
        return tdViewEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTdCatalog() {
        return tdCatalogEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTdSchema() {
        return tdSchemaEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTdColumn() {
        return tdColumnEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTdColumn_JavaType() {
        return (EAttribute)tdColumnEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTdSqlDataType() {
        return tdSqlDataTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTdSqlDataType_JavaDataType() {
        return (EAttribute)tdSqlDataTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTdSqlDataType_Nullable() {
        return (EAttribute)tdSqlDataTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTdSqlDataType_UnsignedAttribute() {
        return (EAttribute)tdSqlDataTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTdSqlDataType_CaseSensitive() {
        return (EAttribute)tdSqlDataTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTdSqlDataType_AutoIncrement() {
        return (EAttribute)tdSqlDataTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTdSqlDataType_LocalTypeName() {
        return (EAttribute)tdSqlDataTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTdSqlDataType_Searchable() {
        return (EAttribute)tdSqlDataTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTdTrigger() {
        return tdTriggerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTdProcedure() {
        return tdProcedureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelationalFactory getRelationalFactory() {
        return (RelationalFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        tdTableEClass = createEClass(TD_TABLE);

        tdViewEClass = createEClass(TD_VIEW);

        tdCatalogEClass = createEClass(TD_CATALOG);

        tdSchemaEClass = createEClass(TD_SCHEMA);

        tdColumnEClass = createEClass(TD_COLUMN);
        createEAttribute(tdColumnEClass, TD_COLUMN__JAVA_TYPE);

        tdSqlDataTypeEClass = createEClass(TD_SQL_DATA_TYPE);
        createEAttribute(tdSqlDataTypeEClass, TD_SQL_DATA_TYPE__JAVA_DATA_TYPE);
        createEAttribute(tdSqlDataTypeEClass, TD_SQL_DATA_TYPE__NULLABLE);
        createEAttribute(tdSqlDataTypeEClass, TD_SQL_DATA_TYPE__UNSIGNED_ATTRIBUTE);
        createEAttribute(tdSqlDataTypeEClass, TD_SQL_DATA_TYPE__CASE_SENSITIVE);
        createEAttribute(tdSqlDataTypeEClass, TD_SQL_DATA_TYPE__AUTO_INCREMENT);
        createEAttribute(tdSqlDataTypeEClass, TD_SQL_DATA_TYPE__LOCAL_TYPE_NAME);
        createEAttribute(tdSqlDataTypeEClass, TD_SQL_DATA_TYPE__SEARCHABLE);

        tdTriggerEClass = createEClass(TD_TRIGGER);

        tdProcedureEClass = createEClass(TD_PROCEDURE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        orgomg.cwm.resource.relational.RelationalPackage theRelationalPackage_1 = (orgomg.cwm.resource.relational.RelationalPackage)EPackage.Registry.INSTANCE.getEPackage(orgomg.cwm.resource.relational.RelationalPackage.eNS_URI);
        CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        tdTableEClass.getESuperTypes().add(theRelationalPackage_1.getTable());
        tdViewEClass.getESuperTypes().add(theRelationalPackage_1.getView());
        tdCatalogEClass.getESuperTypes().add(theRelationalPackage_1.getCatalog());
        tdSchemaEClass.getESuperTypes().add(theRelationalPackage_1.getSchema());
        tdColumnEClass.getESuperTypes().add(theRelationalPackage_1.getColumn());
        tdSqlDataTypeEClass.getESuperTypes().add(theRelationalPackage_1.getSQLSimpleType());
        tdTriggerEClass.getESuperTypes().add(theRelationalPackage_1.getTrigger());
        tdProcedureEClass.getESuperTypes().add(theRelationalPackage_1.getProcedure());

        // Initialize classes and features; add operations and parameters
        initEClass(tdTableEClass, TdTable.class, "TdTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(tdViewEClass, TdView.class, "TdView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(tdCatalogEClass, TdCatalog.class, "TdCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        EOperation op = addEOperation(tdCatalogEClass, ecorePackage.getEBoolean(), "addSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getTdSchema(), "schema", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(tdSchemaEClass, TdSchema.class, "TdSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(tdColumnEClass, TdColumn.class, "TdColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTdColumn_JavaType(), ecorePackage.getEInt(), "javaType", null, 0, 1, TdColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        op = addEOperation(tdColumnEClass, null, "setContentType", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theCorePackage.getString(), "contentType", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(tdColumnEClass, theCorePackage.getString(), "getContentType", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(tdSqlDataTypeEClass, TdSqlDataType.class, "TdSqlDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTdSqlDataType_JavaDataType(), ecorePackage.getEInt(), "javaDataType", null, 0, 1, TdSqlDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTdSqlDataType_Nullable(), ecorePackage.getEShort(), "nullable", null, 0, 1, TdSqlDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTdSqlDataType_UnsignedAttribute(), theCorePackage.getBoolean(), "unsignedAttribute", null, 0, 1, TdSqlDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTdSqlDataType_CaseSensitive(), theCorePackage.getBoolean(), "caseSensitive", null, 0, 1, TdSqlDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTdSqlDataType_AutoIncrement(), theCorePackage.getBoolean(), "autoIncrement", null, 0, 1, TdSqlDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTdSqlDataType_LocalTypeName(), theCorePackage.getString(), "localTypeName", null, 0, 1, TdSqlDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTdSqlDataType_Searchable(), ecorePackage.getEShort(), "searchable", null, 0, 1, TdSqlDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tdTriggerEClass, TdTrigger.class, "TdTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(tdProcedureEClass, TdProcedure.class, "TdProcedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //RelationalPackageImpl
