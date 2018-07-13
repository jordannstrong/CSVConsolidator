package keystroke;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Keystroke {
	
	private Robot robot;
	
	public Keystroke() {
		
	}
	
	public void sendKeystrokes(String num) throws InterruptedException {
		try {
			Toolkit tool = Toolkit.getDefaultToolkit();
	        Clipboard clip = tool.getSystemClipboard();
	        clip.setContents(new StringSelection(num), null);

			robot = new Robot();
			robot.setAutoDelay(1000);
			
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_ALT);
			
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
			
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_ALT);
		} catch (AWTException ex) {
			ex.printStackTrace();
		}	
	}
}
