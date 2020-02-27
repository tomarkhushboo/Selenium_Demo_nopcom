package learnSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class UsingUtilityScreenShot {
	static{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\chromedriver.exe");
		}
	@Test
	

	public void captureScree() throws IOException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		ScreenShotMethod.MultipleScree(driver,"browser started");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		ScreenShotMethod.MultipleScree(driver,"orangehrm");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		
		//now capture the screenshot

		//predefined interface TakeScreenShot Interface > we can not creat object of interface
		//so typcaste driver to takescreenshot interface

		ScreenShotMethod.MultipleScree(driver,"login");
		driver.quit();

	}
}


