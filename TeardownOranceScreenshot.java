package learnSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



public class TeardownOranceScreenshot {
	static{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\chromedriver.exe");
		}
	WebDriver driver = new ChromeDriver();
	@Test
	

	public void captureScree() throws IOException{
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername1']")).sendKeys("Admin");
		
		//now capture the screenshot

		//predefined interface TakeScreenShot Interface > we can not creat object of interface
		//so typcaste driver to takescreenshot interface

		//ScreenShotMethod.MultipleScree(driver,"login");
		driver.quit();

	}
	
	//capture screenshot on failure
	@AfterMethod
	
	public void teardown(ITestResult result){
		if(ITestResult.FAILURE == result.getStatus()){
			
			ScreenShotMethod.MultipleScree(driver,result.getName());
		}
		
		driver.quit();
		
	}
	
}


