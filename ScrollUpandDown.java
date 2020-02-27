package learnSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpandDown {
	
static{
System.setProperty("webdriver.chrome.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\chromedriver.exe");
}

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(6000);
        driver.get("https://selenium.dev/");
		WebElement parg = driver.findElement(By.xpath("//h3[text()='Selenium WebDriver']"));
		int yaxis = parg.getLocation().getY(); //get y axis and location to scroll 
		Thread.sleep(2000); // 1sec wait as it may take time to get y cordinates
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+yaxis+")"); 
		driver.close();
		
		

		
		
	}

}
