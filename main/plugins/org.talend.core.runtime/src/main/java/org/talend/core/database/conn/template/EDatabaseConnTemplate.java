// ============================================================================
//
// Copyright (C) 2006-2015 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.database.conn.template;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.talend.core.database.EDatabaseTypeName;
import org.talend.core.database.conn.version.EDatabaseVersion4Drivers;

/**
 * cli class global comment. Detailled comment
 */
public enum EDatabaseConnTemplate {

    MYSQL(new DbConnStr(EDatabaseTypeName.MYSQL, //
            "jdbc:mysql://<host>:<port>/<sid>?<property>", //$NON-NLS-1$
            "3306", //$NON-NLS-1$
            "noDatetimeStringSync=true")), //$NON-NLS-1$

    MARIADB(new DbConnStr(EDatabaseTypeName.MYSQL, //
            "jdbc:mariadb://<host>:<port>/<sid>?<property>", //$NON-NLS-1$
            "3306", //$NON-NLS-1$
            "noDatetimeStringSync=true")), //$NON-NLS-1$

    PSQL(new DbConnStr(EDatabaseTypeName.PSQL, //
            "jdbc:postgresql://<host>:<port>/<sid>", //$NON-NLS-1$
            "5432")), //$NON-NLS-1$

    PLUSPSQL(new DbConnStr(EDatabaseTypeName.PLUSPSQL, //
            "jdbc:postgresql://<host>:<port>/<sid>", //$NON-NLS-1$
            "5432")), //$NON-NLS-1$

    GREENPLUM(new DbConnStr(EDatabaseTypeName.GREENPLUM, //
            "jdbc:postgresql://<host>:<port>/<sid>", //$NON-NLS-1$
            "5432")), //$NON-NLS-1$

    ORACLEFORSID(new DbConnStr(EDatabaseTypeName.ORACLEFORSID, //
            "jdbc:oracle:thin:@<host>:<port>:<sid>", //$NON-NLS-1$
            "1521")), //$NON-NLS-1$

    ORACLESN(
             new DbConnStr(
                     EDatabaseTypeName.ORACLESN, //
                     "jdbc:oracle:thin:@(description=(address=(protocol=tcp)(host=<host>)(port=<port>))(connect_data=(service_name=<service_name>)))", //$NON-NLS-1$
                     "1521")), //$NON-NLS-1$

    ORACLE_CUSTOM(new DbConnStr(EDatabaseTypeName.ORACLE_CUSTOM, //
            "<host>")), //$NON-NLS-1$  

    ORACLE_OCI(new DbConnStr(EDatabaseTypeName.ORACLE_OCI, //
            "jdbc:oracle:oci8:@<service_name>")), //$NON-NLS-1$                 
    MSSQL(new DbConnStr(EDatabaseTypeName.MSSQL, //
            "jdbc:jtds:sqlserver://<host>:<port>/<sid>;<property>", //$NON-NLS-1$
            "1433")), //$NON-NLS-1$
    MSSQL05_08(new DbConnStr(EDatabaseTypeName.MSSQL05_08, //
            "jdbc:sqlserver://<host>:<port>;DatabaseName=<sid>", //$NON-NLS-1$
            "1433")), //$NON-NLS-1$         

    GODBC(new DbConnStr(EDatabaseTypeName.GODBC, //
            "jdbc:odbc:<datasource>")), //$NON-NLS-1$

    MSODBC(new DbConnStr(EDatabaseTypeName.MSODBC, //
            "jdbc:odbc:<datasource>")), //$NON-NLS-1$

    ACCESS(new DbConnStrForAccess(EDatabaseTypeName.ACCESS, //
            "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=<filename>", //$NON-NLS-1$
            new EDatabaseVersion4Drivers[] { EDatabaseVersion4Drivers.ACCESS_2003, EDatabaseVersion4Drivers.ACCESS_2007 })),

    SYBASEASE(new DbConnStr(EDatabaseTypeName.SYBASEASE, //
            "jdbc:sybase:Tds:<host>:<port>/<sid>?<property>", //$NON-NLS-1$ 
            "5001")), //$NON-NLS-1$

    IBMDB2(new DbConnStr(EDatabaseTypeName.IBMDB2, //
            "jdbc:db2://<host>:<port>/<sid>", //$NON-NLS-1$
            "50000")), //$NON-NLS-1$

    IBMDB2_ZOS(new DbConnStr(EDatabaseTypeName.IBMDB2ZOS, //
            "jdbc:db2://<host>:<port>/<sid>", //$NON-NLS-1$
            "557")), //$NON-NLS-1$

    SQLITE(new DbConnStr(EDatabaseTypeName.SQLITE, //
            "jdbc:sqlite:/<filename>")), //$NON-NLS-1$

    INGRES(new DbConnStr(EDatabaseTypeName.INGRES, //
            "jdbc:ingres://<host>:<port>/<sid>", //$NON-NLS-1$
            "II7")), //$NON-NLS-1$
    VECTORWISE(new DbConnStr(EDatabaseTypeName.VECTORWISE, //
            "jdbc:ingres://<host>:<port>/<sid>", //$NON-NLS-1$
            "II7")), //$NON-NLS-1$
    INTERBASE(new DbConnStr(EDatabaseTypeName.INTERBASE, //
            "jdbc:interbase://<host>/<sid>")), //$NON-NLS-1$

    FIREBIRD(new DbConnStr(EDatabaseTypeName.FIREBIRD, //
            "jdbc:firebirdsql:<host>/<port>:<filename>", //$NON-NLS-1$
            "3050")), //$NON-NLS-1$

    INFORMIX(new DbConnStr(EDatabaseTypeName.INFORMIX, //
            "jdbc:informix-sqli://<host>:<port>/<sid>:informixserver=<datasource>;<property>")), //$NON-NLS-1$

    TERADATA(new DbConnStr(EDatabaseTypeName.TERADATA, //
            "jdbc:teradata://<host>/<sid>,<property>")), //$NON-NLS-1$ //feature 0013719,hywang

    EXASOL(new DbConnStr(EDatabaseTypeName.EXASOL, //
            "jdbc:exa:<host>:<port>;schema=<sid>", "8563")), //$NON-NLS-1$ //$NON-NLS-2$

    AS400(new DbConnStr(EDatabaseTypeName.AS400, //
            "jdbc:as400://<host>/<sid>;<property>", //$NON-NLS-1$
            null, //
            "prompt=false")), //$NON-NLS-1$

    JAVADB_EMBEDED(new DbConnStr(EDatabaseTypeName.JAVADB_EMBEDED, //
            "jdbc:derby:<dbRootPath>")), //$NON-NLS-1$

    JAVADB_JCCJDBC(new DbConnStr(EDatabaseTypeName.JAVADB_JCCJDBC, //
            "jdbc:derby:net://<host>:<port>/<sid>", //$NON-NLS-1$
            "1527")), //$NON-NLS-1$

    JAVADB_DERBYCLIENT(new DbConnStr(EDatabaseTypeName.JAVADB_DERBYCLIENT, //
            "jdbc:derby://<host>:<port>/<sid>", //$NON-NLS-1$
            "1527")), //$NON-NLS-1$

    HSQLDB_SERVER(new DbConnStr(EDatabaseTypeName.HSQLDB_SERVER, //
            "jdbc:hsqldb:hsql://<host>:<port>/<sid>", //$NON-NLS-1$
            "9001")), //$NON-NLS-1$

    HSQLDB_WEBSERVER(new DbConnStr(EDatabaseTypeName.HSQLDB_WEBSERVER, //
            "jdbc:hsqldb:http://<host>:<port>/<sid>", //$NON-NLS-1$
            "9001")), //$NON-NLS-1$

    HSQLDB_IN_PROGRESS(new DbConnStr(EDatabaseTypeName.HSQLDB_IN_PROGRESS, //
            "jdbc:hsqldb:file:<dbRootPath>/<sid>;<property>", //$NON-NLS-1$
            null, "ifexists=true")), //$NON-NLS-1$

    MAXDB(new DbConnStr(EDatabaseTypeName.MAXDB, //
            "jdbc:sapdb://<host>:<port>/<sid>", //$NON-NLS-1$
            "7210")), //$NON-NLS-1$

    SAS(new DbConnStr(EDatabaseTypeName.SAS, //
            "jdbc:sasiom://<host>:<port>", //$NON-NLS-1$
            "8591")), //$NON-NLS-1$
    // "jdbc:sap://talendhana.cld.sr:30015";
    SAPHana(new DbConnStr(EDatabaseTypeName.SAPHana, //
            "jdbc:sap://<host>:<port>", //$NON-NLS-1$
            "30015")), //$NON-NLS-1$

    PARACCEL(new DbConnStr(EDatabaseTypeName.PARACCEL, //
            "jdbc:paraccel://<host>:<port>/<sid>", //$NON-NLS-1$
            "5439")), //$NON-NLS-1$

    REDSHIFT(new DbConnStr(EDatabaseTypeName.REDSHIFT, //
            "jdbc:paraccel://<host>:<port>/<sid>", //$NON-NLS-1$
            "5439")), //$NON-NLS-1$

    NETEZZA(new DbConnStr(EDatabaseTypeName.NETEZZA, //
            "jdbc:netezza://<host>:<port>/<sid>", //$NON-NLS-1$
            "5480")), //$NON-NLS-1$

    VERTICA(new DbConnStr(EDatabaseTypeName.VERTICA, //
            "jdbc:vertica://<host>:<port>/<sid>", //$NON-NLS-1$
            "5433")), //$NON-NLS-1$

    GENERAL_JDBC(new DbConnStrForGeneralJDBC(EDatabaseTypeName.GENERAL_JDBC, //
            "jdbc:xxx://<xxx>:<xxx>", //$NON-NLS-1$
            "xxxx")), //$NON-NLS-1$

    HIVE(new DbConnStrForHive(EDatabaseTypeName.HIVE, "jdbc:hive://<host>:<port>/<sid>",//$NON-NLS-1$
            new EDatabaseVersion4Drivers[] { EDatabaseVersion4Drivers.HIVE, EDatabaseVersion4Drivers.HIVE_EMBEDDED,
                    EDatabaseVersion4Drivers.HIVE_2_STANDALONE, EDatabaseVersion4Drivers.HIVE_2_EMBEDDED })),

    //    HIVE1_EMBEDDED(new DbConnStr(EDatabaseTypeName.HIVE, "jdbc:hive://")), //$NON-NLS-1$
    //
    //    HIVE1_STANDALONE(new DbConnStr(EDatabaseTypeName.HIVE, "jdbc:hive://<host>:<port>/<sid>")), //$NON-NLS-1$
    //
    //    HIVE2_EMBEDDED(new DbConnStr(EDatabaseTypeName.HIVE, "jdbc:hive2://")), //$NON-NLS-1$
    //
    //    HIVE2_STANDALONE(new DbConnStr(EDatabaseTypeName.HIVE, "jdbc:hive2://<host>:<port>/<sid>")), //$NON-NLS-1$

    IMPALA(new DbConnStr(EDatabaseTypeName.IMPALA, "jdbc:hive2://<host>:<port>/<sid>;auth=noSasl", //
            "21050")), //$NON-NLS-1$  

    HBASE(new DbConnStr(EDatabaseTypeName.HBASE, "127.0.0.1", //$NON-NLS-1$
            "2181")); //$NON-NLS-1$

    private DbConnStr connStr;

    EDatabaseConnTemplate(DbConnStr connStr) {
        this.connStr = connStr;
    }

    public EDatabaseTypeName getDbType() {
        return this.connStr.getDbType();
    }

    public String getDBTypeName() {
        if (getDbType() != null) {
            return getDbType().getXmlName();
        }
        return null;
    }

    public String getDBDisplayName() {
        if (getDbType() != null) {
            return getDbType().getDisplayName();
        }
        return null;
    }

    // public String getUrlTemplate() {
    // return getUrlTemplate(null);
    // }

    public String getUrlTemplate(EDatabaseVersion4Drivers version) {
        return this.connStr.getUrlTemplate(version);
    }

    // public String getUrlPattern() {
    // return getUrlPattern(null);
    // }

    public String getUrlPattern(EDatabaseVersion4Drivers version) {
        return this.connStr.getUrlPattern(version);
    }

    public String getDefaultPort() {
        return this.connStr.getDefaultPort();
    }

    public String getAdditionProperty() {
        return this.connStr.getAdditionProperty();
    }

    public boolean isMultiVersion() {
        return this.connStr.getDbVersions() != null && this.connStr.getDbVersions().length > 0;
    }

    public EDatabaseVersion4Drivers[] getDbVersions() {
        return this.connStr.getDbVersions();
    }

    public String processStr(EDatabaseVersion4Drivers version, String str) {
        return this.connStr.processStr(version, str);
    }

    public static List<String> getDBTypeDisplay() {
        return getDBTypes(true, false, true);
    }

    // public static List<String> getAllDBTypeDisplay() {
    // return getDBTypes(true, false, true);
    // }

    public static List<String> getDBTypes() {
        return getDBTypes(true, false, false);
    }

    // public static List<String> getAllDBTypes() {
    // return getDBTypes(true, true, false);
    // }

    @SuppressWarnings("unchecked")
    private static List<String> getDBTypes(boolean sort, boolean all, boolean display) {
        EDatabaseConnTemplate[] values = EDatabaseConnTemplate.values();
        List<String> databaseType = new ArrayList<String>(values.length);
        for (EDatabaseConnTemplate temp : values) {
            String typeName = getDBTypeName(temp, display);
            if (typeName != null) {
                databaseType.add(typeName);
            }
        }
        if (sort) {
            String[] sortedArray = databaseType.toArray(new String[0]);
            Arrays.sort(sortedArray, new Comparator<String>() {

                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });
            return new ArrayList<String>(Arrays.asList(sortedArray));
        }
        return databaseType;
    }

    private static String getDBTypeName(EDatabaseConnTemplate db, boolean display) {
        return display ? db.getDBDisplayName() : db.getDBTypeName();
    }

    public static EDatabaseConnTemplate indexOfTemplate(String dbType) {
        if (dbType != null) {
            for (EDatabaseConnTemplate temp : EDatabaseConnTemplate.values()) {
                if (temp.getDBTypeName().equals(dbType) || temp.getDBDisplayName().equals(dbType)) {
                    return temp;
                }
            }
        }
        return null;
    }

    public static EDatabaseConnTemplate indexOfTemplate(String dbType, String dbVersion) {
        if (dbType != null && dbVersion != null) {
            for (EDatabaseConnTemplate temp : EDatabaseConnTemplate.values()) {
                if ((temp.getDBTypeName().equals(dbType) || temp.getDBDisplayName().equals(dbType))
                        && dbVersion.equals(temp.name())) {
                    return temp;
                }
            }
        }
        return null;
    }

    public static boolean isSchemaNeeded(String dbType) {
        EDatabaseConnTemplate template = indexOfTemplate(dbType);
        if (template != null) {
            switch (template) {
            case ORACLEFORSID:
            case ORACLESN:
            case ORACLE_OCI:
            case ORACLE_CUSTOM:
            case PSQL:
            case PLUSPSQL:
            case GREENPLUM:
            case PARACCEL:
            case REDSHIFT:
            case IBMDB2:
            case IBMDB2_ZOS:
            case SYBASEASE:
            case SAS:
            case SAPHana:
            case HBASE:
                return true;
            default:
            }
        }
        return false;
    }

    public static boolean isAddtionParamsNeeded(String dbType) {
        EDatabaseConnTemplate template = indexOfTemplate(dbType);
        if (template != null) {
            switch (template) {
            case MSSQL:
            case INFORMIX:
            case MYSQL:
            case AS400:
                // for feature 10655
            case ORACLEFORSID:
            case ORACLESN:
            case ORACLE_OCI:
            case SYBASEASE:
            case HSQLDB_IN_PROGRESS: // for feature 11674
            case TERADATA: // for feature 0013719
            case VERTICA:
                return true;
            default:
            }
        }
        return false;
    }

    public static boolean isDatabaseNeeded(String dbType) {
        EDatabaseConnTemplate template = indexOfTemplate(dbType);
        if (template != null) {
            switch (template) {
            case MYSQL:
            case SYBASEASE:
            case IBMDB2:
            case IBMDB2_ZOS:
            case INGRES:
            case INTERBASE:
            case MSSQL:
            case INFORMIX:
            case TERADATA:
            case AS400:
            case JAVADB_DERBYCLIENT:
            case JAVADB_EMBEDED:
            case JAVADB_JCCJDBC:
            case HSQLDB_WEBSERVER:
            case HSQLDB_SERVER:
            case HSQLDB_IN_PROGRESS:
            case MAXDB:
            case PSQL:
            case PLUSPSQL:
                return true;
            default:
            }
        }
        return false;
    }

    public static String getAdditionProperty(String dbType) {
        if (isAddtionParamsNeeded(dbType)) {
            EDatabaseConnTemplate template = indexOfTemplate(dbType);
            if (template != null) {
                String additionProperty = template.getAdditionProperty();
                if (additionProperty != null) {
                    return additionProperty;
                }
            }
        }
        return ""; //$NON-NLS-1$
    }
}
