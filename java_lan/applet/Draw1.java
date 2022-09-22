import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.Graphics;
public class Draw1 extends Applet
{
	public void paint(Graphics g)
	{	
		setForeground(Color.red);
		g.drawOval(10,10,50,100);
		g.fillOval(100,20,50,100);
	}
}
