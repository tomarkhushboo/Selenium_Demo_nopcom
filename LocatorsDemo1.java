package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {
	static{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewAdminModule");
		
		//link text
		//driver.findElement(By.linkText("Forgot your password?")).click();
		
		//partial link text
		
		//driver.findElement(By.partialLinkText("Forgot your")).click();
		
		System.out.println(driver.findElements(By.tagName("img")).size());
		
		
		
		
		
		
		
		
		

	}

}
