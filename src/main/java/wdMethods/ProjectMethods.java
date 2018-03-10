package wdMethods;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectMethods extends SeMethods {
	
	
	@BeforeGroups
	public void beforeGroups() {
		
	}
	
	@AfterGroups
	public void afterGroups() {
		
	}
	
	
	@Parameters({"url","uName","pwd"})
	@BeforeMethod
	public void login(String url, String uName, String pwd) {
		startApp("chrome", url);
		type(locateElement("id", "username"), uName);
		type(locateElement("id", "password"), pwd);
		click(locateElement("className", "decorativeSubmit"));
		click(locateElement("linkText", "CRM/SFA"));
	}
	@AfterMethod
	public void closeApp() {
		closeBrowser();
	}
	

}
