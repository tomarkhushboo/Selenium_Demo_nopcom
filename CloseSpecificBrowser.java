package learnSelenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CloseSpecificBrowser {
	static{
		System.setProperty("webdriver.edge.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\MicrosoftWebDriver.exe");
	}
  @Test
  
  public void f() {
	 
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.popuptest.com/popuptest12.html");
			String ti = driver.getTitle();
			System.out.println(ti);
			String pwh = driver.getWindowHandle();
			Set<String> whs = driver.getWindowHandles();
			System.out.println("browser which are not closed");
			for(String w:whs){
				driver.switchTo().window(w);
				String s = driver.getTitle();
				System.out.println(s);
				if(s.contains("Popup1")){
					driver.close();
				}
				System.out.println(s);
			}
			
	  
  }
}
