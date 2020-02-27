package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class XpathAxes2 {
WebDriver driver;
	
	@BeforeTest //predefined

	public void LaunchBrowser(){
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		}
	
	@Test
	public void Sign_on() throws InterruptedException{
		
		driver.navigate().to("https://www.guru99.com/");
		//ancestor
		driver.findElement(By.xpath("((//*[text()='Testing'])[2])//ancestor::div[1]")).click();
		//child
		driver.findElement(By.xpath("//*[@id='java_technologies']//child::li[3]")).click();
	   
		
	}

}
