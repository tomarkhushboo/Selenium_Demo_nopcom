package learnSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RoboAction {

	public static void main(String[] args) throws AWTException , IOException
	{
		Runtime.getRuntime().exec("notepad");
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_J);
		r.keyPress(KeyEvent.VK_SHIFT);
	}
}