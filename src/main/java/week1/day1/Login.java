package week1.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		//load driver path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		//launch browser
		ChromeDriver driver = new ChromeDriver();

		//maximize the browser
		driver.manage().window().maximize();

		//load url
		driver.get("http://leaftaps.com/opentaps");
		//enter UserName
		driver.findElementById("username").sendKeys("DemoSalesManager",Keys.TAB);          
		Thread.sleep(5000);
		//enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		//click login
		driver.findElementByClassName("decorativeSubmit").click();
		//click logout
		//driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_dataSourceId").sendKeys("Conference");

		// Take a snapshot
		// Specific WebElement or Web Page ?? 
		// When you take screen shot using print screen
			// Where is it stored? 
		// And then what you do?
			// Copy from there to your desired path
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
