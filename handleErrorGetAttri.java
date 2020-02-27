package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class handleErrorGetAttri {

	static{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
@Test
	public  void myTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://stackoverflow.com/users/login");
		driver.findElement(By.id("submit-button")).click();
		Thread.sleep(2000);
		String actual_err = driver.findElement(By.xpath("//p[text()='Email cannot be empty.']")).getAttribute("innerHTML");
		String expected_err = "Email cannot be empty.";
		
		//type1
		Assert.assertEquals(actual_err, expected_err);
		//type2
		Assert.assertTrue(actual_err.contains("Email cannot be empty."));
		
		
	}

}
