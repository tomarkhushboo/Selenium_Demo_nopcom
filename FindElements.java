package learnSelenium;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

static{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		WebElement srchBox = driver.findElement(By.name("q"));
		srchBox.sendKeys("java");
		
		List<WebElement> autoSuggest = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = autoSuggest.size();
		System.out.println(count);
		for(WebElement s : autoSuggest){
			System.out.println(s.getText());
		}
		autoSuggest.get(2).click();
		
		
		
		
		

	}

}
