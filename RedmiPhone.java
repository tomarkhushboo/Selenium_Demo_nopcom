package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RedmiPhone {
	static{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\chromedriver.exe");
	}
	@Test
	public void orderRedmiNote() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		WebElement SrchBox = driver.findElement(By.name("q"));
		SrchBox.sendKeys("Redmi Note",Keys.ENTER);
		Thread.sleep(2000);
		WebElement phone = driver.findElement(By.xpath("(//div[contains(text(),'Redmi Note')])[2]/../../../div[2]/div[2]"));
		String Emi = phone.getText();
		System.out.println("phone EMi is" + Emi);
		driver.close();		
		
		
		
	}
}
