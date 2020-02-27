package learnSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchingBtwFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.edge.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\MicrosoftWebDriver.exe");
     WebDriver driver = new EdgeDriver();
     driver.get("http://demo.guru99.com/selenium/deprecated.html");
     driver.switchTo().frame("classFrame");
     driver.findElement(By.linkText("Deprecated")).click();
    // driver.close();
     
     
     
     
	}

}
