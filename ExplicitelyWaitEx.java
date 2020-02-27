package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitelyWaitEx {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		// Start browser 
		WebDriver driver = new ChromeDriver();
		//Start application 
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		//click on time button to start
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		 // Explicit Wait
		WebDriverWait explicitwait = new WebDriverWait(driver, 10);
		WebElement element = explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
		// if element found then we will use- In this example I just called isDisplayed method
		boolean status = element.isDisplayed();
		if(status){
			System.out.println("===Webdriver is visible====");
		} else {
			System.out.println("===webdriver is not visible ===");
		}
		
}

}
