//Create a frame in AWT
import java.awt.*;
class FrameDemo
{
	public static void main(String args[])
	{
		//Create a frame
		Frame fr = new Frame("My AWT Program");
		//Set the size of frame
		fr.setSize(300,250);//300 px is the width and 250px for height
		//Display the frame
		fr.setVisible(true);
	}
}