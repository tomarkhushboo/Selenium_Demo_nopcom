package learnSelenium;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CloseChildWindiwBrowser {

	static{
		System.setProperty("webdriver.edge.driver","C:\\Users\\khushboo.t\\Downloads\\Selenium\\MicrosoftWebDriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.popuptest.com/popuptest12.html");
		//to close all the browser without using quit
		String pwh = driver.getWindowHandle();
		Set<String> whs = driver.getWindowHandles();
		//removing current window object reference from whs
		whs.remove(pwh);
		int count = whs.size();
		System.out.println(whs);
		System.out.println(count);
		System.out.println("==============================");
		// to close all the window browser
		//for(String w:whs){
		//	driver.switchTo().window(w);
		//	driver.close();
			
			
			//alternate method
			
			for(String w : whs){
				driver.switchTo().window(w);
				if(w.equals(pwh)){
					System.out.println("current browser");
					String s = driver.getTitle();
					System.out.println(s);
				}
				else{
					System.out.println("closed browser");
					String s = driver.getTitle();
					System.out.println(s);
					driver.close();
				}
			}
			
			
			
		}
		
		
	}



