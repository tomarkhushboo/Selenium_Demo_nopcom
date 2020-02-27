package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindHeightWidth {
	
	static{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://stackoverflow.com/users/login");
		WebElement unTb = driver.findElement(By.id("email"));
		int unH = unTb.getSize().getHeight();
		System.out.println(unH);
		int unW = unTb.getSize().getWidth();
		System.out.println(unW);

	}

}
