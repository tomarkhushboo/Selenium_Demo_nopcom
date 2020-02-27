package learnSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ElementLocators {
	
	static{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\khushboo.t\\Downloads\\Selenium\\MicrosoftWebDriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.myhcl.com/");
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
       String title = driver.getTitle();
       System.out.println(title);
       String Url = driver.getCurrentUrl();
       System.out.println(Url);
       String gui = driver.getWindowHandle();
       System.out.println("gui address is: " +gui);
       driver.navigate().to("https://www.google.com");
       String title1 = driver.getTitle();
       System.out.println(title1);
       driver.navigate().back();
       driver.navigate().forward();
       driver.navigate().refresh();
       driver.close();
       
       
       
       
       
       
        
        
        
	}

}
