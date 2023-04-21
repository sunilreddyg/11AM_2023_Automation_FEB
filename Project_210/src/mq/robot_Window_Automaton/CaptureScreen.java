package robot_Window_Automaton;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class CaptureScreen {

	public static void main(String[] args) throws Exception 
	{
		
		//Capture Image 
		Robot robot=new Robot();
		BufferedImage Image=robot.createScreenCapture(new Rectangle
					(new Dimension(800, 600)));
		
		//Write image into local folder
		ImageIO.write(Image, "PNG", new File("D:\\image.png"));
		
	}

}
