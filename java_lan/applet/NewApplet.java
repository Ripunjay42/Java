import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class NewApplet extends Applet implements ActionListener
{
	TextField t1,t2,t3;
	Button b;
	Label l1,l2,l3;
	int x,y,z;
	public void init()
	{
		l1 = new Label("first no=:");
		t1 = new TextField(10);
		
		l2 = new Label("second no=:");
		t2 = new TextField(10);
		
		l3 = new Label("sum:");
		t3 = new TextField(10);
		
		b=new Button("ADD");
		b.addActionListener(this);
	
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
			{
				x=Integer.parseInt(t1.getText());
				y=Integer.parseInt(t2.getText());
				z=x+y;
				t3.setText(" "+z);
			}
	}

}
