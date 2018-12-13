package keystroke;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;

import AutoC.Order;

public class Keystroke {
	
	private Robot robot;
	
	public Keystroke() {
		
	}
	
	public void sendKeystrokes(ArrayList<String> orders) throws InterruptedException {
		try {
			Toolkit tool = Toolkit.getDefaultToolkit();
	        Clipboard clip = tool.getSystemClipboard();

			robot = new Robot();
			robot.setAutoDelay(1000);
			
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_ALT);
			
			
			for(String o : orders)
			{
				clip.setContents(new StringSelection(o), null);
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_F);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_F);
				
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_V);
				
	
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				
				robot.keyPress(KeyEvent.VK_SPACE);
				robot.keyRelease(KeyEvent.VK_SPACE);
				
				robot.keyPress(KeyEvent.VK_UP);
				robot.keyRelease(KeyEvent.VK_UP);
				
				robot.keyPress(KeyEvent.VK_SPACE);
				robot.keyRelease(KeyEvent.VK_SPACE);
				
				robot.keyPress(KeyEvent.VK_ALT);
				robot.keyRelease(KeyEvent.VK_ALT);
				
				robot.keyPress(KeyEvent.VK_F);
				robot.keyRelease(KeyEvent.VK_F);
				
				robot.keyPress(KeyEvent.VK_D);
				robot.keyRelease(KeyEvent.VK_D);
				
				
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(4000);
				
				robot.keyPress(KeyEvent.VK_ALT);
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_ALT);
				
				robot.keyPress(KeyEvent.VK_ALT);
				robot.keyRelease(KeyEvent.VK_ALT);
				
				robot.keyPress(KeyEvent.VK_F);
				robot.keyRelease(KeyEvent.VK_F);
				
				robot.keyPress(KeyEvent.VK_B);
				robot.keyRelease(KeyEvent.VK_B);
				
				Thread.sleep(3000);
				
				robot.keyPress(KeyEvent.VK_ESCAPE);
				robot.keyRelease(KeyEvent.VK_ESCAPE);
				
				robot.keyPress(KeyEvent.VK_ALT);
				robot.keyRelease(KeyEvent.VK_ALT);
				
				robot.keyPress(KeyEvent.VK_F);
				robot.keyRelease(KeyEvent.VK_F);
				
				robot.keyPress(KeyEvent.VK_E);
				robot.keyRelease(KeyEvent.VK_E);
				
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(2000);
				
				robot.keyPress(KeyEvent.VK_ESCAPE);
				robot.keyRelease(KeyEvent.VK_ESCAPE);
				
				robot.keyPress(KeyEvent.VK_ESCAPE);
				robot.keyRelease(KeyEvent.VK_ESCAPE);
			
				Thread.sleep(2000);
		}
		} catch (AWTException ex) {
			ex.printStackTrace();
		}	
	}
}
