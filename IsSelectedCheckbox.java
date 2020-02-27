package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedCheckbox  {
	static{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://skillrary.com/user/login");
		Thread.sleep(2000);
	    WebElement checkbox = driver.findElement(By.xpath("//label[@for='remmember']"));
        checkbox.click();
        WebElement tcb = driver.findElement(By.xpath("//input[@type = 'checkbox']"));
        System.out.println(tcb.isSelected());
		
		
		
		
	}

}
