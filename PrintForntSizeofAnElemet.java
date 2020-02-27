package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintForntSizeofAnElemet {
	static{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://stackoverflow.com/users/login?ssrc=head");
		WebElement unTB = driver.findElement(By.id("email"));
		String fontSize = unTB.getCssValue("font-size");
		System.out.println(fontSize);
		String fontcolor = unTB.getCssValue("color");
		System.out.println(fontcolor);
		String fonstyle = unTB.getCssValue("font-style");
		System.out.println(fonstyle);
		

	}

}
