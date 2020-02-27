package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxIsDisplayed {
	
	static{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		//WebElement checkBox = driver.findElement(By.xpath("//input[contains(@id,'ohrmList_chkSelectRecord_5')]"));
		WebElement unTB = driver.findElement(By.id("Email"));
		Thread.sleep(1000);
		System.out.println(unTB.isDisplayed());
		System.out.println("---------------");
		System.out.println(unTB.isEnabled());
        
	}

}
