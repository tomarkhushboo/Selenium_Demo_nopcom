package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopupsEx {
	static{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\chromedriver.exe");
		
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/upload");
		WebElement attach = driver.findElement(By.xpath("//input[@id = 'file-upload']"));
		String path = "C:\\Users\\khushboo.t\\Downloads\\selenium work\\123.txt";
		attach.sendKeys(path);
		WebElement attachFileUpload = driver.findElement(By.xpath("//input[@id = 'file-submit']"));
		attachFileUpload.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		

	}

}
