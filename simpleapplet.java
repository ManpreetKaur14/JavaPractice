import java.awt.*;
import java.applet.*;
public class simpleapplet extends Applet
{
    public void paint(Graphics G)
    {
        G.drawString("A Simple Applet",50,50);
    }
}
// <applet code ="simpleapplet.class"  width=200 height=200>
//  </applet> 