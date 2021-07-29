import java.awt.*;
import javax.swing.JFrame;

public class m extends Canvas {
    int w, h;
    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();
        int x1[]={40,200,40};
        int y1[]={40,40,200};
        w=getWidth();
        h=getHeight();
        g.drawImage(i, 0, 0,w, h, this);

    }

    public static void main(String[] args) {
        m m = new m();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(300, 300);
        f.setVisible(true);
    }

}