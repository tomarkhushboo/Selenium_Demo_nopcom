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




public class orangeHrmScreenShot {
	static{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\chromedriver.exe");
	}
	@Test

	public void captureScree() throws IOException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		//now capture the screenshot

		//predefined interface TakeScreenShot Interface > we can not creat object of interface
		//so typcaste driver to takescreenshot interface

		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("./photo/"+System.currentTimeMillis()+".png");
		try{
			FileUtils.copyFile(src, des);
			}

		catch (IOException e)
		{
			System.out.println(e.getMessage());

		}
		System.out.println("screenshot taken");
		


	}

}
