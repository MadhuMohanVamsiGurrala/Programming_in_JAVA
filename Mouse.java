//Write a Java Program for handling mouse events
import java.awt.event.*;
import java.applet.*;
import java.awt.*;
/*<applet code="Mouse.class" height=800 width=800>
</applet>*/
public class Mouse extends Applet implements MouseListener,MouseMotionListener
{
String msg;
int mousex=0,mousey=0;
public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
}
public void mouseClicked(MouseEvent m)
{
mousex=0;
mousey=0;
msg="mouse clicked";
repaint();
}
public void mouseReleased(MouseEvent m)
{
mousex=m.getX();
mousey=m.getY();
msg="up";
repaint();
}
public void mouseEntered(MouseEvent m)
{
mousex=m.getX();
mousey=m.getY();
msg="mouse entered";
repaint();
}
public void mouseExited(MouseEvent m)
{
mousex=m.getX();
mousey=m.getY();
msg="mouse exited";
repaint();
}
public void mousePressed(MouseEvent m)
{
mousex=m.getX();
mousey=m.getY();
msg="mouse pressed";
repaint();
}
public void mouseDragged(MouseEvent m)
{
mousex=m.getX();
mousey=m.getY();
msg="mouse dragged";
repaint();
}
public void mouseMoved(MouseEvent m)
{
mousex=m.getX();
mousey=m.getY();
showStatus("moving at:"+mousex+","+mousey);
}
public void paint(Graphics g)
{
g.drawString(msg,mousex,mousey);
}
}
