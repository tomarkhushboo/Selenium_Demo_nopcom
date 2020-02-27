package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FollowingEx {
	static{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\chromedriver.exe");
	}
	@Test

	
	public void following() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		//following
		driver.findElement(By.xpath("(//*[text()='Dashboard'])[2]/following::img[1]")).click();
		Thread.sleep(2000);
		//preceeding
		driver.findElement(By.xpath("//*[text()='Maintenance']//preceding::b[3]")).click();
		Thread.sleep(2000);
		
		
	}
}
