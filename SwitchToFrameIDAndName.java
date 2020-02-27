package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchToFrameIDAndName {

	static{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\chromedriver.exe");
	}
	@Test

	public void switchFrameEx(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//total frame html has
		driver.get("file:///C:/Users/khushboo.t/Downloads/Seleniumdata/frame.html");
		//total number of frames
		int total_frames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("total frames in application is : " +total_frames);
		
		driver.switchTo().frame("guru");
		driver.findElement(By.id("gsc-i-id2")).sendKeys("java");
		driver.findElement(By.xpath("(//button[@class ='gsc-search-button gsc-search-button-v2'])[2]")).click();
		
		//to switch to other frame first switch to parenet frame
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("Skill");
		System.out.println(driver.getTitle());
		
	
		
	
		
		
		
		
		
	
				
	}
}
