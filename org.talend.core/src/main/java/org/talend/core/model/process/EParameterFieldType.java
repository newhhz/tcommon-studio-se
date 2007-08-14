// ============================================================================
//
// Talend Community Edition
//
// Copyright (C) 2006-2007 Talend - www.talend.com
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
//
// ============================================================================
package org.talend.core.model.process;

/**
 * DOC nrousseau class global comment. Detailled comment <br/>
 * 
 * $Id$
 * 
 */
public enum EParameterFieldType {
    TEXT,
    MEMO_SQL,
    MEMO_PERL,
    MEMO_JAVA,
    CLOSED_LIST,
    CHECK,
    MEMO,
    SCHEMA_TYPE,
    QUERYSTORE_TYPE,
    PROPERTY_TYPE,
    EXTERNAL,
    FILE,
    VERSION,
    TABLE,
    DIRECTORY,
    PROCESS_TYPE,
    IMAGE,
    COLUMN_LIST,
    CONNECTION_LIST,
    PREV_COLUMN_LIST,
    CONTEXT_PARAM_NAME_LIST,
    LOOKUP_COLUMN_LIST,
    TECHNICAL, // means field not displayed directly
    ENCODING_TYPE,
    COMPONENT_LIST,
    MAPPING_TYPE,
    COLOR,
    DBTABLE,
    DATE,
    DBTYPE_LIST,
    MODULE_LIST;

    public String getName() {
        return toString();
    }

    public static EParameterFieldType getFieldTypeByName(String name) {
        for (int i = 0; i < EParameterFieldType.values().length; i++) {
            if (EParameterFieldType.values()[i].getName().equals(name)) {
                return EParameterFieldType.values()[i];
            }
        }
        return TEXT; // Default Value
    }
}
