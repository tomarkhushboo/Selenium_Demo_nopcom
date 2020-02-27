package learnSelenium;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DiffBwGwhAndGwhs {

	static{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\khushboo.t\\Downloads\\Selenium\\MicrosoftWebDriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver = new EdgeDriver();
        driver.get("http://www.popuptest.com/popuptest1.html");
        driver.manage().window().maximize();
       
        
       String title = driver.getTitle();
       System.out.println(title);
       String Url = driver.getCurrentUrl();
       System.out.println(Url);
       String pwh = driver.getWindowHandle();
       System.out.println("gui address is: " +pwh);
       Set<String> cwh = driver.getWindowHandles();
       System.out.println(cwh);
       driver.quit();
       
       
       
       
//       driver.navigate().to("https://www.google.com");
//       String title1 = driver.getTitle();
//       System.out.println(title1);
//       driver.navigate().back();
//       driver.navigate().forward();
//       driver.navigate().refresh();
//       driver.close();
       

	}

}
