package learnSelenium;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {
	
static{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\chromedriver.exe");
		}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get("http://newtours.demoaut.com/index.php");
		driver.get("https://online.actitime.com/khushboo/login.do");
		WebElement username = driver.findElement(By.name("username"));
		//username.sendKeys("tomar");
		username.sendKeys("khushboo.t@hcl.com");
		WebElement password = driver.findElement(By.name("pwd"));
		String title = driver.getTitle();
		System.out.println(title);
		//password.sendKeys("Tomar@123");
		password.sendKeys("Khushboo@12");
		//WebElement login = driver.findElement(By.name("login"));
		WebElement login = driver.findElement(By.xpath("//div[text() = 'Login ']"));
		login.click();
		//explicitly wait
		WebDriverWait wait =  new WebDriverWait(driver,10); //seconds
		//wait.until(ExpectedConditions.titleContains("http://newtours.demoaut.com/index.php"));
		wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
