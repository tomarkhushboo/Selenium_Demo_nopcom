package learnSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\khushboo.t\\Downloads\\Selenium\\MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();
		String baseUrl  = "http://demo.guru99.com/test/newtours/";
		String expectedResult = "Welcome: Mercury Tours";
		String actualTitle = "";
		// launch edge browser
		driver.get(baseUrl);
		// get the actual value of the title
		 actualTitle = driver.getTitle();
		 
		 //compare the actual title with expected one
         if(actualTitle.contentEquals(expectedResult)){
        	 System.out.println("Test Passed!");

         } else {
        	 System.out.println("Test Failed!");

         }
         
         //close edge
         
         driver.close();
		
  }

}
