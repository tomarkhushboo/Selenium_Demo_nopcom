package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class LocatorsEx {
	
	static {
		//System.setProperty("webdriver.edge.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\MicrosoftWebDriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\chromedriver.exe");
	}

	public static void main(String[] args) {
	// WebDriver driver = new EdgeDriver();
	/*// driver.get("C:\\Users\\khushboo.t\\Downloads\\Seleniumdata\\Locators.html");
	 //identify element by tagname
	   //driver.findElement(By.tagName("input")).sendKeys("Khushboo");
	
	 //identify element by id and name
	// driver.findElement(By.id("A")).sendKeys("Qspider");
	 //identify by name
	  //driver.findElement(By.name("B1")).sendKeys("QSP");
	 
	 //identify by class name
	 driver.get("http://www.google.com");
	 driver.findElement(By.className("gLFyf gsfi")).sendKeys("Hello");*/
		
	//identify using link text 
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\khushboo.t\\Downloads\\Seleniumdata\\Locators.html");
	    //driver.findElement(By.linkText("Qspiders< /a>")).click();
	    
	  //identify using partial link text 
	    //driver.findElement(By.partialLinkText("Qsp")).click();
	    
	    //identify using CSS selectors
	    
	    driver.findElement(By.cssSelector("input[role = 'Testing']")).sendKeys("Khushboo");
	    //driver.close();
	    
	    
	 
	 
	 
	 
	}

}
