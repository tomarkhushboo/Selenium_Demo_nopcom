package learnSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;




public class ScreenShotMethod {


	public static void MultipleScree(WebDriver ldriver, String ScreenName){
		// Take screenshot and store as a file format  
		File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
		File des = new File("./photo/"+ScreenName+"_"+System.currentTimeMillis()+".png");
		try{
			//now copy the screenshot to desried location using copyFile Method

			FileUtils.copyFile(src, des);

		}

		catch (IOException e)
		{
			System.out.println(e.getMessage());

		}
	}
}


