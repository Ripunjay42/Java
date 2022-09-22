import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.applet.*;
import java.awt.Graphics;
public class Mouse extends Applet implements ActionListener
{
	Button a,b,c;
	int x,y,z;
	public void init()
	{
		a=new Button("ARC");
		b=new Button("OVAL");
		c=new Button("RECTANGLE");
		x=0;
		y=0;
		z=0;
		add(a);
		a.addActionListener(this);
		a.setBackground(Color.green);
		add(b);
		b.addActionListener(this);
		b.setBackground(Color.red);
		add(c);
		c.addActionListener(this);
		c.setBackground(Color.magenta);
        }
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==a)
		{
			x=1;
		}
		if(e.getSource()==b)
		 {
			y=1;
		 }
		if(e.getSource()==c)
		 {
			z=1;
		 }
		repaint();
		
	}
	public void paint(Graphics g)
	{

		if(x==1)
		{
			g.setColor(Color.green);
			g.fillArc(20,100,50,100,100,200);
			
			
		}
		if(y==1)
		{
			g.setColor(Color.red);
			g.fillOval(85,45,75,75);
		
					
		}
		if(z==1)
		{
			g.setColor(Color.magenta);
			g.fillRect(230,80,150,100);
		}
		repaint();
	
	}
	
	
}
		
		
		
