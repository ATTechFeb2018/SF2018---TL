package testCases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Login extends SeMethods{
	
	@Test
	public void login() {
		
		startApp("chrome", "http://leaftaps.com/opentaps");
		
		WebElement userName = locateElement("username");
		type(userName, "DemoSalesManager");
		
		WebElement password = locateElement("password");
		type(password, "crmsfa");
		
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
		
		// Click CRM SFA 
		WebElement CRM = locateElement("link","CRM/SFA");
		click(CRM);
		
		WebElement createLead = locateElement("link","Create Lead");
		click(createLead);
		
		// Select the dropdown
		WebElement source = locateElement("createLeadForm_dataSourceId");
		selectDropDownUsingText(source, "Conference");
	}

}













