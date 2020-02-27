package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOutEx {

	static{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		// set the time of 30 seconds for page to complete the loading
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//WebElement frame = driver.findElement(By.xpath("//div[text() = 'MIDDLE']"));
		
		
		
		//switch to frame using id
	//	driver.switchTo().frame(frame);
		

	}

}
