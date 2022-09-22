import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.Color;
import java.awt.Button;
public class Sur extends Applet implements ActionListener
{
	Label l1;
	TextField t1,t2;
	Button b;
	String x;
	public void init()
	{
		l1 = new Label("ENTER YOUR NAME CLICK SURPRIZE :");
		t1 = new TextField(15);
		t1.setForeground(Color.red); 
		t2 = new TextField(30);
		
		b=new Button("SURPRIZE");
		b.addActionListener(this);
		b.setBackground(Color.green);
	
		add(l1);
		add(t1);
		add(b);
		add(t2);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			{
				x=t1.getText();
				t2.setText(x+" killer boy");
				t2.setForeground(Color.RED);
				
			}
	}

}
