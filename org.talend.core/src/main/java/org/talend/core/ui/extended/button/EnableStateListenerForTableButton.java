// ============================================================================
//
// Talend Community Edition
//
// Copyright (C) 2006 Talend - www.talend.com
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
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
package org.talend.core.ui.extended.button;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Table;
import org.talend.commons.ui.swt.advanced.dataeditor.control.ExtendedPushButton;
import org.talend.commons.ui.swt.extended.table.AbstractExtendedTableViewer;
import org.talend.commons.ui.swt.tableviewer.TableViewerCreator;
import org.talend.commons.ui.swt.tableviewer.selection.ILineSelectionListener;
import org.talend.commons.ui.swt.tableviewer.selection.LineSelectionEvent;

/**
 * DOC amaumont class global comment. Detailled comment <br/>
 * 
 * $Id$
 * 
 */
public class EnableStateListenerForTableButton {

    private IExtendedTablePushButton pushButton;

    /**
     * DOC amaumont EnableStateHandlerForTableButton constructor comment.
     * 
     * @param extendedTableViewer
     * @param button
     */
    public EnableStateListenerForTableButton(final IExtendedTablePushButton button) {
        this.pushButton = button;

        final TableViewerCreator tableViewerCreator = button.getExtendedTableViewer().getTableViewerCreator();
        tableViewerCreator.getSelectionHelper().addAfterSelectionListener(new ILineSelectionListener() {

            public void handle(LineSelectionEvent e) {
                if (tableViewerCreator.getTable().getSelectionCount() > 0 && button.getEnabledState()) {
                    pushButton.getButton().setEnabled(true);
                } else {
                    pushButton.getButton().setEnabled(false);
                }
            }
            
        });

    }

    protected boolean getEnabledState() {
        TableViewerCreator tableViewerCreator = pushButton.getExtendedTableViewer().getTableViewerCreator();
        if (tableViewerCreator != null && tableViewerCreator.getTable() != null) {
            return tableViewerCreator.getTable().getSelectionCount() > 0;
        }
        return false;
    }

}
