package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nop_com_getAttribute {
	static{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	@Test
	
	public void getAttEx(){
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		//get title
		String gtit = driver.getTitle();
		System.out.println(gtit);
		WebElement unTB = driver.findElement(By.name("q"));
		unTB.clear();
		unTB.sendKeys("Custom T-Shirt");
		//getattribute
		String value = unTB.getAttribute("value");
		System.out.println(value);
		//getCssvalue
		System.out.println(unTB.getCssValue("font-size"));
		System.out.println(unTB.getCssValue("color"));
		//get Tagname
		System.out.println(unTB.getTagName());
		
		
	}
	

}
