//take screenshot programm


package learnSelenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TakeScreenShot {
	static{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\chromedriver.exe");
		
	}

	public static void main(String[] args)  throws InterruptedException, IOException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://www.google.com");
		driver.get("https://selenium.dev/");
		Thread.sleep(1000);
		TakesScreenshot ts = (TakesScreenshot)driver; //downcast from web driver to takeScreenshot interface 
		File src = ts.getScreenshotAs(OutputType.FILE); //use getScreentshot method
		//to capture the screenshot output will be in .file extension
		//File des = new File("./photo/google.png");//get screenshot in photo folder
		File des = new File("./photo/Sel.png");
		FileUtils.copyFile(src,des);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
