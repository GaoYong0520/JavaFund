package applet;

import java.applet.*;
import java.awt.*;

public class AppletDemo extends Applet
{
    public void paint (Graphics g)
    {
        g.drawString ("Hello World", 25, 50);
    }
}