package AutoC;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Delete {
	
	private Robot robot;
	
	public Delete() {
		
	}
	public void deleteOrders(ArrayList<String> orders) throws InterruptedException {
		try {
			Toolkit tool = Toolkit.getDefaultToolkit();
	        Clipboard clip = tool.getSystemClipboard();
	        
	        robot = new Robot();

			robot.setAutoDelay(1000);
	        
	        robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_ALT);
	        
	        for(String o : orders){
		        clip.setContents(new StringSelection(o), null);
	
		        Thread.sleep(1000);
				
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
				
				robot.keyPress(KeyEvent.VK_DELETE);
				robot.keyRelease(KeyEvent.VK_DELETE);
				
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(1000);
				
		}
		} catch (AWTException ex) {
			ex.printStackTrace();
		}	
	}
}
