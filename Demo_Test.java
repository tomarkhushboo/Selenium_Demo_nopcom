package learnSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\khushboo.t\\Downloads\\Selenium\\MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		driver.findElement(By.linkText("This is a link")).click();
		driver.navigate().forward();  
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html"); 
		driver.navigate().refresh();  
		driver.close();   

	}

}
