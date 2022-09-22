import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.applet.*;
public class Mousemotion extends Applet implements MouseListener
{
	Label l;
	TextField t;
	public void init()
	{
		l=new Label("STATUS");
		t=new TextField(20);
		l.setForeground(Color.blue);
		t.setForeground(Color.red);
		add(l);
		add(t);
		addMouseListener(this);
		
	}
	public void mouseClicked(MouseEvent e)
	{
		t.setText("MOUSE CLICKED!");
	}
	public void mouseEntered(MouseEvent e)
	{
		t.setText("MOUSE ENTERED");
	}
	public void mouseExited(MouseEvent e)
	{
		t.setText("MOUSE EXITED!");
	}
	public void mousePressed(MouseEvent e)
	{
		t.setText("MOUSE PRESSED!");
	}
	public void mouseReleased(MouseEvent e)
	{
		t.setText("MOUSE RELEASED!");
	}
}		
