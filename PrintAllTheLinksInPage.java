package learnSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllTheLinksInPage {
static{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
}
	public static void main(String[] args) {
		// print all the links in web page
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		
		//List<WebElement> links = driver.findElements(By.xpath("//a."));
		//no of link in the list is zero as its unable to fing any links
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		System.out.println(links);
		System.out.println(count);
		
		for(WebElement l : links){
			String s = l.getText();
			System.out.println(s);
		}
		
		 

	}

}
