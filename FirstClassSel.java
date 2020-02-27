package learnSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class FirstClassSel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\MicrosoftWebDriver.exe");
		WebDriver driver= new EdgeDriver();  
		//driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");
		driver.findElement(By.name("btnK")).submit();
	
		
	}

}
