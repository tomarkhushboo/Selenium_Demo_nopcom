package learnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNG {
	WebDriver driver; //global variable
@BeforeTest
	
	public void LaunchBrowser(){
		String absolutePath = System.getProperty("user.dir");
		String filePath = absolutePath+"\\drivers"+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", filePath);
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
		//driver.get("https://netbanking.hdfcbank.com/netbanking/");
	    // public String baseUrl = "http://newtours.demoaut.com/";
	}
@Test
	
	public void LoginApp(){
	//driver.get(baseUrl);
		
		
		
	}
}
