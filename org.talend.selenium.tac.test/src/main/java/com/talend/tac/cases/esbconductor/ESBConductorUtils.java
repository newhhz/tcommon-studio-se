package com.talend.tac.cases.esbconductor;

import com.talend.tac.cases.Login;

public class ESBConductorUtils extends Login {
    	
	/*go to ESBConductor page*/
	public void intoESBConductorPage() {
		
		this.clickWaitForElementPresent("!!!menu.esbconductor.element!!!");
		this.waitForElementPresent("//div[@class='header-title' and text()" +
				"='ESB Conductor']", WAIT_TIME);
		
	}
	
	/*add method for select feature*/
    public void selectDropDownListForESBConductor(String id, String itemName, String filedName) {
		
		if(selenium.isElementPresent("//span[text()='Select Feature" +
			" from Talend repository']//ancestor::div[@class='" +
			" x-window x-component']//input[@id='"+id+"']"
				+ "/following-sibling::div")) {
			
			selenium.click("//span[text()='Select Feature" +
			" from Talend repository']//ancestor::div[@class='" +
			" x-window x-component']//input[@id='"+id+"']"
					+ "/following-sibling::div");
			
		} else if (selenium.isElementPresent("//label[text()='"+filedName+"']//parent::div" +
						"//input[@id='"+id+"']"
						+ "/following-sibling::div")) {
				
				selenium.click("//label[text()='"+filedName+"']//parent::div" +
						"//input[@id='"+id+"']"
						+ "/following-sibling::div");
				
		} 
		                            
		this.waitForElementPresent("//div[text()='" + itemName + "' and @role='listitem']", WAIT_TIME);
		selenium.mouseDown("//div[text()='" + itemName + "' and @role='listitem']");
		selenium.fireEvent("//input[@id='"+id+"']", "blur");

	}
	
	
	/*add esbconductor*/
	public void addESBConductor(String label, String des, String repository,
			String group, String artifact, String version, String name, String type, 
			String context, String server) {
		
		this.intoESBConductorPage();
		
		this.clickWaitForElementPresent("idESBConductorTaskGridAddButton");
		this.waitForElementPresent("//img[@class='gwt-Image" +
				" x-component ']", WAIT_TIME);
		
		this.typeString("idESBConductorTasklabelInput", label);
		this.typeString("idESBConductorTaskdesInput", des);
		selenium.click("idESBConductorTaskSelectButton");
		this.waitForElementPresent("//span[text()='Select" +
				" Feature from Talend repository']", WAIT_TIME);
		this.selectDropDownListForESBConductor("idTaskProjectListBox", repository, "Repository:");
		this.selectDropDownListForESBConductor("idTaskBranchListBox", group, "Group:");
		this.selectDropDownListForESBConductor("idTaskApplicationListBox", artifact, "Artifact:");
		this.selectDropDownListForESBConductor("idTaskVersionListBox", version, "Version:");
		selenium.click("//span[text()='Select Feature from Talend repository']" +
				"//ancestor::div[@class=' x-window x-component']" +
				"//button[text()='OK']");//save select feature info after click OK 
		this.selectDropDownListForESBConductor("idTaskProjectListBox", name, "Name:");
		this.selectDropDownListForESBConductor("idJobConductorExecutionServerListBox", type, "Type:");
		this.selectDropDownListForESBConductor("idESBConductorTaskContextListBox", context, "Context:");
		this.selectDropDownListForESBConductor("idJobConductorExecutionServerListBox", server, "Server:");
		selenium.click("idFormSaveButton");
		
	}
	
}