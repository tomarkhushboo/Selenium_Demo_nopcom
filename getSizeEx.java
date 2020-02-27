package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getSizeEx {

	static{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\chromedriver.exe");
	}
    @Test

	public void getSixeEx(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2Fregister%3FreturnUrl%3D%252F");
		WebElement unTB = driver.findElement(By.id("Email"));
		int x = unTB.getSize().getHeight();
		System.out.println("size of the textbox is: " +x);
		int y = unTB.getSize().getWidth();
		System.out.println("size of the textbox is: " +y);
	}

}
