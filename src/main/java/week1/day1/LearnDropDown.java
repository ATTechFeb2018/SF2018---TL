package week1.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
	//load driver path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		//launch browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//load url
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		//WebElement securityQ = driver.findElementById("userRegistrationForm:securityQ");
		Select dd = new Select(
		driver.findElementById("userRegistrationForm:securityQ"));
		/*dd.selectByIndex(2);
		Thread.sleep(3000);
		dd.selectByValue("4");
		Thread.sleep(3000);
		dd.selectByVisibleText("What is your fathers middle name?");
		*/
		List<WebElement> allOptions = dd.getOptions();
		/*int count = allOptions.size();
		System.out.println(count);
		dd.selectByIndex(count-1);*/
		for (WebElement eachOption : allOptions) {
			String text = eachOption.getText();
			System.out.println(text);
		}
		
		
		
		
		
		
	}

}
