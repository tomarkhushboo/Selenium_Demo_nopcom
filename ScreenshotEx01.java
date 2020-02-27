package learnSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class ScreenshotEx01 {
	static{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\chromedriver.exe");
		}
	
	@Test
	public void TestJava(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Pass the url
		driver.get("http://www.google.com");
		TakesScreenshot ts = (TakesScreenshot)driver;
		// Take screenshot and store as a file format
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("./photo/Sel.png");
		try {
			 // now copy the  screenshot to desired location using copyFile //method
			FileUtils.copyFile(src, des);
			}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }
	}
}
