//Create a frame in AWT
import java.awt.*;
class FrameDemo1 extends Frame
{
	FrameDemo1(String str)
	{
		super(str);
	}
	public static void main(String args[])
	{
		//Create a frame
		FrameDemo1 fr = new FrameDemo1("My AWT Program");
		//Set the size of frame
		fr.setSize(300,250);//300 px is the width and 250px for height
		//Display the frame
		fr.setVisible(true);
	}
}