package learnSelenium;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class CloseAllBrowser {
	
	static{
		System.setProperty("webdriver.edge.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\MicrosoftWebDriver.exe");
	}

	public static void main(String[] args) {
		// TO launch browser
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.popuptest.com/popuptest12.html");
		//to close all the browser without using quit
		Set<String> whs = driver.getWindowHandles();
		for (String w:whs){
			driver.switchTo().window(w);
			String s = driver.getTitle();
			System.out.println(s);
			driver.close();
		}

	}

}
