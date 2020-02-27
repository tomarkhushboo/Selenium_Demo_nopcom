package learnSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatingEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\khushboo.t\\Downloads\\Selenium\\MicrosoftWebDriver.exe");
        WebDriver driver = new EdgeDriver();
        String baseUrl = "https://stackoverflow.com/users/login";
        String tagName = "";
        driver.get(baseUrl);
        tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagName);
        driver.close();
        System.exit(0); 
        
        

	}

}
