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
package org.talend.core.model.general;

import org.talend.core.language.ECodeLanguage;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.User;

/**
 * DOC smallet class global comment. Detailled comment <br/>
 * 
 * $Id$
 * 
 */
public class Project {

	private org.talend.core.model.properties.Project project;

	/**
	 * DOC smallet Project constructor comment.
	 * 
	 * @param label
	 * @param project
	 */
	public Project(org.talend.core.model.properties.Project project) {
		this.project = project;
	}

	public Project(String label) {
		this.project = PropertiesFactory.eINSTANCE.createProject();
		project.setLabel(label);
	}

	public Project() {
		this.project = PropertiesFactory.eINSTANCE.createProject();
	}

	/**
	 * Getter for label.
	 * 
	 * @return the label
	 */
	public String getLabel() {
		return project.getLabel();
	}

	/**
	 * Sets the label.
	 * 
	 * @param label
	 *            the label to set
	 */
	public void setLabel(String label) {
		project.setLabel(label);
	}

	/**
	 * Getter for technicalLabel.
	 * 
	 * @return the technicalLabel
	 */
	public String getTechnicalLabel() {
		return project.getTechnicalLabel();
	}

	/**
	 * Sets the technicalLabel.
	 * 
	 * @param technicalLabel
	 *            the technicalLabel to set
	 */
	public void setTechnicalLabel(String technicalLabel) {
		project.setTechnicalLabel(technicalLabel);
	}

	public String toString() {
		return getLabel();
	}

	/**
	 * Getter for author.
	 * 
	 * @return the author
	 */
	public User getAuthor() {
		return project.getAuthor();
	}

	/**
	 * Sets the author.
	 * 
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(User author) {
		project.setAuthor(author);
	}

	/**
	 * Getter for description.
	 * 
	 * @return the description
	 */
	public String getDescription() {
		return project.getDescription();
	}

	/**
	 * Sets the description.
	 * 
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		project.setDescription(description);
	}

	/**
	 * Getter for language.
	 * 
	 * @return the language
	 */
	public ECodeLanguage getLanguage() {
		return ECodeLanguage.getCodeLanguage(project.getLanguage());
	}

	/**
	 * Sets the language.
	 * 
	 * @param language
	 *            the language to set
	 */
	public void setLanguage(ECodeLanguage language) {
		project.setLanguage(language.getName());
	}

	/**
	 * Getter for local.
	 * 
	 * @return the local
	 */
	public boolean isLocal() {
		return project.isLocal();
	}

	/**
	 * Sets the local.
	 * 
	 * @param local
	 *            the local to set
	 */
	public void setLocal(boolean local) {
		project.setLocal(local);
	}

	/**
	 * create technical name.
	 * 
	 * @param name
	 * @return
	 */
	public static String createTechnicalName(String name) {
		if (name != null) {
			name = name.toUpperCase();
			name = name.replace(" ", "_"); //$NON-NLS-1$ //$NON-NLS-2$
			name = name.replace("-", "_"); //$NON-NLS-1$ //$NON-NLS-2$
		}
		return name;
	}

	public org.talend.core.model.properties.Project getEmfProject() {
		return project;
	}

	public String getMasterJobId() {
		return project.getMasterJobId();
	}

	public void setMasterJobId(String masterJobId) {
		if (masterJobId != null) {
			project.setMasterJobId(masterJobId);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((this.project == null) ? 0 : this.project.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Project other = (Project) obj;
		if (this.project == null) {
			if (other.project != null) {
				return false;
			}
		} else if (!this.project.equals(other.project)) {
			return false;
		}
		return true;
	}

}
