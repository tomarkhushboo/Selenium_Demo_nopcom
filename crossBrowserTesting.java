package learnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserTesting {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void verifyPageTtile(String browserName){
		if (browserName.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver", "./drivers/MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("http://newtours.demoaut.com/index.php");
			System.out.println(driver.getTitle());
			driver.quit();
		}
		else if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://newtours.demoaut.com/index.php");
			System.out.println(driver.getTitle());
			driver.quit();
		}
	}

}
