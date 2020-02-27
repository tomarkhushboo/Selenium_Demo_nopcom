package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.sun.javafx.geom.Edge;

public class ClickOnHcl {
	static{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\khushboo.t\\Downloads\\Selenium\\MicrosoftWebDriver.exe");
		
	}
  @Test
  public void f() {
	  WebDriver driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("C:\\Users\\khushboo.t\\Downloads\\Seleniumdata\\login.html");
	 String s =driver.getTitle();
	System.out.println(s);
	/*String tagName1 = "a";
	By by01 = By.tagName(tagName1); // By class has all attributes like id , name
	WebElement link = driver.findElement(by01);*/ 
	//or 
	driver.findElement(By.tagName("a")).click();
	
	
	
	
	
  }
}
