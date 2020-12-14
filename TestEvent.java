//AWT program to design frame for addition with event handling

import java.awt.*;
import java.awt.event.*;

class TestEvent implements ActionListener
{
	Button b1;
	TextField t1,t2;
	Label lb1,lb2,lb3;
	Frame f;
	TestEvent()
	{
		f = new Frame("Addition of two numbers");
		lb1 = new Label("Enter First Number");
		lb1.setBounds(5,50,150,30);
		f.add(lb1);
		
		t1 = new TextField();
		t1.setBounds(200,50,150,30);
		f.add(t1);
		
		lb2 = new Label("Enter Second Number");
		lb2.setBounds(5,80,150,30);
		f.add(lb2);
		
		t2 = new TextField();
		t2.setBounds(200,80,150,30);
		f.add(t2);
		
		lb3 = new Label("Result");
		lb3.setBounds(90,140,150,30);
		f.add(lb3);
		
		b1 = new Button("+");
		b1.setBounds(90,200,100,30);
		f.add(b1);
		b1.addActionListener(this);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int no1 = Integer.parseInt(t1.getText());
		int no2 = Integer.parseInt(t2.getText());
		int res;
		if(ae.getSource().equals(b1))
		{
			res = no1 + no2;
			lb3.setText(String.valueOf(res));
		}		
	}
	public static void main(String args[])
	{
		TestEvent ob = new TestEvent();
	}
}