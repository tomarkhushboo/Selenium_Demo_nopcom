package learnSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_Alert {

	static{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	@Test

	public void alertSample() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();
		Thread.sleep(2000);
		String actual =	driver.switchTo().alert().getText();
		System.out.println("alert message is " +actual);
		driver.switchTo().alert().accept();
		String expected = "Please select start place.";
		Assert.assertEquals(actual, expected);
		
	}
}
