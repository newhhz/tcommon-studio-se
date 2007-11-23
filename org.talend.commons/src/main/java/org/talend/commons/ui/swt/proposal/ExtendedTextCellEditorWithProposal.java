// ============================================================================
//
// Copyright (C) 2006-2007 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.commons.ui.swt.proposal;

import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.talend.commons.ui.swt.tableviewer.TableViewerCreator;
import org.talend.commons.ui.swt.tableviewer.TableViewerCreatorColumn;
import org.talend.commons.ui.swt.tableviewer.celleditor.ExtendedTextCellEditor;
import org.talend.commons.utils.threading.AsynchronousThreading;

/**
 * This class extends the ExtendedTextCellEditor to add the Expression Builder to tMapper. Only tMapper can use this
 * class. <br/>
 * 
 * $Id: TextCellEditorWithProposal.java 3351 2007-05-04 12:14:00Z plegall $
 * 
 */
public class ExtendedTextCellEditorWithProposal extends ExtendedTextCellEditor {

    private ContentProposalAdapterExtended contentProposalAdapter;

    protected Point selectionBeforeFocusLost;

    private TableViewerCreator tableViewerCreator;

    protected Point selection;

    private int previousActivatedIndex;

    private boolean cellEditorLocationHasChanged;

    private TableViewerCreatorColumn tableViewerCreatorColumn;

    public ExtendedTextCellEditorWithProposal(Composite parent, int style,
            TableViewerCreatorColumn tableViewerCreatorColumn) {
        super(parent);
        setStyle(style);
        init(tableViewerCreatorColumn);
    }

    public ExtendedTextCellEditorWithProposal(Composite parent, TableViewerCreatorColumn tableViewerCreatorColumn) {
        super(parent);
        init(tableViewerCreatorColumn);
    }

    /**
     * DOC amaumont Comment method "init".
     * 
     * @param tableViewerCreatorColumn
     */
    private void init(TableViewerCreatorColumn tableViewerCreatorColumn) {
        this.tableViewerCreatorColumn = tableViewerCreatorColumn;
        this.tableViewerCreator = tableViewerCreatorColumn.getTableViewerCreator();
    }

    @Override
    public void activate() {
        super.activate();
        previousActivatedIndex = tableViewerCreator.getModifiedObjectInfo().getCurrentModifiedIndex();
    }

    @Override
    public void create(Composite parent) {
        super.create(parent);
        text.addFocusListener(new FocusAdapter() {

            public void focusLost(FocusEvent e) {
                selectionBeforeFocusLost = text.getSelection();
                if (contentProposalAdapter == null || contentProposalAdapter.isProposalOpened()) {
                    activateCellEditorAsynch(selectionBeforeFocusLost, false);
                }
            }

        });

        initProposal();
    }

    @Override
    protected void keyReleaseOccured(KeyEvent keyEvent) {
        boolean proposalOpened = contentProposalAdapter.isProposalOpened();
        if (!proposalOpened) {

            if (keyEvent.character == '\r') { // Return key
                if (text != null && !text.isDisposed() && (text.getStyle() & SWT.MULTI) != 0) {
                    if ((keyEvent.stateMask & SWT.CTRL) != 0) {
                        return;
                    }
                }
                keyEvent.doit = false;
            }
            cellEditorClassKeyReleasedOccured(keyEvent);
        }
    }

    private void cellEditorClassKeyReleasedOccured(KeyEvent keyEvent) {
        if (keyEvent.character == '\u001b') { // Escape character
            fireCancelEditor();
        } else if (keyEvent.character == '\r') { // Return key
            fireApplyEditorValue();
            deactivate();
        }
    }

    /**
     * DOC amaumont Comment method "initProposal".
     */
    private void initProposal() {
        if (contentProposalAdapter == null) {
            contentProposalAdapter = ProposalUtils.getCommonProposal(this);
            contentProposalAdapter.addContentProposalListener(new IContentProposalExtendedListener() {

                public void proposalBeforeModifyControl(IContentProposal proposal) {
                    if (!text.isFocusControl()) {
                        activateCellEditor();
                        text.setSelection(new Point(selectionBeforeFocusLost.x, selectionBeforeFocusLost.y));
                    }
                }

                public void proposalClosed() {
                }

                public void proposalOpened() {
                }

                public void proposalAccepted(IContentProposal proposal) {
                    selectionBeforeFocusLost = text.getSelection();
                    activateCellEditorAsynch(null, true);
                }

            });
        }

    }

    public IContentProposalProvider getProposalProvider() {
        if (contentProposalAdapter != null) {
            return contentProposalAdapter.getContentProposalProvider();
        }
        return null;
    }

    public void setContentProposalProvider(IContentProposalProvider proposalProvider) {
        if (contentProposalAdapter != null) {
            contentProposalAdapter.setContentProposalProvider(proposalProvider);
        }
    }

    private void activateCellEditor() {
        // System.out.println("activateCellEditor");
        cellEditorLocationHasChanged = false;
        int previousModifiedIndex = this.tableViewerCreator.getModifiedObjectInfo().getPreviousModifiedIndex();
        Object previousModifiedBean = this.tableViewerCreator.getTableViewer().getElementAt(previousModifiedIndex);
        int indexColumn = tableViewerCreatorColumn.getIndex();
        if (previousActivatedIndex != previousModifiedIndex) {
            cellEditorLocationHasChanged = true;
        }
        if (cellEditorLocationHasChanged) {
            contentProposalAdapter.close();
        } else {
            // System.out.println("indexColumn="+indexColumn);
            // System.out.println("previousModifiedBean="+previousModifiedBean);
            tableViewerCreator.getTableViewer().editElement(previousModifiedBean, indexColumn);
        }
    }

    private void activateCellEditorAsynch(final Point selection, final boolean testFocus) {

        new AsynchronousThreading(50, false, text.getDisplay(), new Runnable() {

            public void run() {

                // System.out.println("active async");

                if (!text.isDisposed()) {

                    Point newSelection = selection;
                    if (!text.isFocusControl() && testFocus || !testFocus) {
                        // System.out.println("activateCellEditorAsynch");
                        activateCellEditor();
                    }
                    if (selection == null) {
                        newSelection = selectionBeforeFocusLost;
                    }
                    if (!cellEditorLocationHasChanged) {
                        text.setSelection(new Point(newSelection.x, newSelection.y));
                    }
                }
            }

        }).start();
    }

    /**
     * Getter for contentProposalAdapter.
     * 
     * @return the contentProposalAdapter
     */
    public ContentProposalAdapterExtended getContentProposalAdapter() {
        return this.contentProposalAdapter;
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.CellEditor#fireApplyEditorValue()
     */
    @Override
    public void fireApplyEditorValue() {
        super.fireApplyEditorValue();
    }

    
    
}
