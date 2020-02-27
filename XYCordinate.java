package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XYCordinate {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		WebElement unTb = driver.findElement(By.id("Email"));
		Thread.sleep(2000); //sleep for 2 sec
		int xc = unTb.getLocation().getX();
		System.out.println("x cordinate:- "+ xc);
		int yc = unTb.getLocation().getY();
		System.out.println("y cordinate:- " +yc);
		
		
		
		
		
	}

}
