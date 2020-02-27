package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	static{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewAdminModule");
		//id
		WebElement uname = driver.findElement(By.id("txtUsername"));
		uname.sendKeys("Admin");
		//name
		By pass = By.name("txtPassword");
		driver.findElement(pass).sendKeys("admin123");
		
		//className not recoomeneded as not unique
		WebElement login = driver.findElement(By.className("button"));
		uname.sendKeys("Admin");
		
		
		
		
		
		
		
		
		
		
		

	}

}
