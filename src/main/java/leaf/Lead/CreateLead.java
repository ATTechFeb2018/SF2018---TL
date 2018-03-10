package leaf.Lead;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ReadExcel;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{

	@Test(dataProvider = "fetchData")
	public void createLead(String cName, String fName, String lName, String eMail, String ph) {		
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cName);
		type(locateElement("id", "createLeadForm_firstName"), fName);
		type(locateElement("id", "createLeadForm_lastName"), lName);
		type(locateElement("id", "createLeadForm_primaryEmail"), eMail);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), ph);
		click(locateElement("name", "submitButton"));		
	}
		
	@DataProvider(name="fetchData")
	public Object[][] getData() throws IOException {		
		ReadExcel excel = new ReadExcel();
		Object[][] data = excel.readExcel("createLead");
		return data;				
	}
	
	
	
	
	
	@DataProvider(name="fetchData1")
	public Object[][] getData1() {		
		//Should mention array size
		Object[][] data = new Object[2][4];		
		data[0][0] = "Testleaf";
		data[0][1] = "Babu";
		data[0][2] = "M";
		data[0][3] = "Babu@testleaf.com";
	//	data[0][4] = 950005678;		
		
		data[1][0] = "Testleaf";
		data[1][1] = "Sarath";
		data[1][2] = "M";
		data[1][3] = "sarath@testleaf.com";
	//	data[1][4] = 959770456;		
		return data;				
	}
}












