package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	static{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khushboo.t\\Downloads\\Selenium\\chromedriver.exe");
	}
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("C:\\Users\\khushboo.t\\Downloads\\Seleniumdata\\AbsoluteXpath.html");
	//ABCD
	  driver.findElement(By.xpath("./html/body/div/input")).sendKeys("Hi");
	//A  
	  driver.findElement(By.xpath("./html/body/div[1]/input[1]")).sendKeys("Khushboo");
	//B
	  driver.findElement(By.xpath("./html/body/div[1]/input[2]")).sendKeys("Tomar");
	//C
	  driver.findElement(By.xpath("./html/body/div[2]/input[1]")).sendKeys("Vijay");
	//D
	  driver.findElement(By.xpath("./html/body/div[2]/input[2]")).sendKeys("Singh");
	//AB
	  driver.findElement(By.xpath("./html/body/div[1]/input")).sendKeys("QSP");
	//cd
	  driver.findElement(By.xpath("./html/body/div[2]/input")).sendKeys("QSP01");
	//AC  
	  driver.findElement(By.xpath("./html/body/div[1]/input[1]|./html/body/div[2]/input[1]")).sendKeys("QSP03");
	//BD
	  driver.findElement(By.xpath("./html/body/div[1]/input[2]|./html/body/div[2]/input[2]")).sendKeys("QSP04");
	 
	  //Relative X path
	  
	  driver.findElement(By.xpath("//div[1]/input[2]|//div[2]/input[2]")).sendKeys("Result");
		
	  
 
  
  
  }
}
