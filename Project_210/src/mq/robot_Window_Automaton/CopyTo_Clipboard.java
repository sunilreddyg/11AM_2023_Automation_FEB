package robot_Window_Automaton;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CopyTo_Clipboard {

	public static void main(String[] args) throws Exception {
		
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		Robot robot=new Robot();
		robot.setAutoDelay(200);
		
		String text="Welcome to selenium automation demo [21/4/2023]";

		//Copy String and Save into Clipboard memory
		StringSelection stext=new StringSelection(text);
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stext, stext);
		
		
		//Press Ctrl+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release Control Key
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}

}
