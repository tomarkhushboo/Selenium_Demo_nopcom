package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextContentFromTextBox {
	static{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\chromedriver.exe");
	}

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.javatpoint.com");
	String title = driver.findElement(By.tagName("title")).getAttribute("textcontent");
	System.out.println(title);
	driver.close();
	//unTB.clear();
	//unTB.sendKeys("tomarkhushboo11@gmail.com");
	//String value1 = unTB.getAttribute("	");

	}

}
