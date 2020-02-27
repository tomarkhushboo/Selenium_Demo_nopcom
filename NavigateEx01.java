package learnSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\khushboo.t\\Downloads\\Selenium\\MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();
		// Storing the Application Url in the String variable  
		String url = ("https://www.google.co.in/");  
		driver.get(url);

		// Storing Title name in the String variable 
		String title = driver.getTitle();
		// Storing Title length in the Int variable  
		int x = driver.getTitle().length();
        System.out.println("title is: " +title);
        System.out.println("title length is: " +x);
     // Storing URL in String variable  
        String UrlStore = driver.getCurrentUrl();
        
        if(UrlStore.equals("https://www.google.co.in/")){
        	System.out.println("url is correct");
        }
        else {
        	System.out.println("Verification Failed - An incorrect Url is opened");
        }
        
     // Storing Page Source in String variable  
        String PageSource = driver.getPageSource();
       int PageSourceLength = PageSource.length();
       //System.out.println(PageSource);
       System.out.println(PageSourceLength);
      //Closing browser  
      driver.close();
        
	}

}
