package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hdfcBankSwitchFrame {
	
	WebDriver driver; //global variable
	
	@BeforeTest
	
	public void LaunchBrowser(){
		String absolutePath = System.getProperty("user.dir");
		String filePath = absolutePath+"\\drivers"+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", filePath);
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
	}
	
	@Test
	 public void hdfc_login(){
		driver.switchTo().frame("login_page");
		WebElement username = driver.findElement(By.cssSelector("input[name='fldLoginUserId']"));
		username.sendKeys("1000");
		driver.findElement(By.cssSelector("img[src='/gif/continue_new1.gif?v=1']")).click();
	}

}
