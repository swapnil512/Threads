import java.applet.*;
import java.awt.*;

public class  ColorChange extends Applet  implements  Runnable
{

Thread th;
Color c;
boolean f;


public void start()
{
th=new Thread(this);
th.start();
f=true;
}

public void stop()
{
	th=null;
	f=false;
}
public void paint(Graphics g)
{
setBackground(c);

try{
 th.sleep(1000);
 }catch(Exception e)
  {
  e.printStackTrace();
 }

}
public void run()
{
	for(;;)
	{
	c=new Color((float)Math.random(),(float)Math.random(),(float)Math.random());
	repaint();
 try{
 th.sleep(1000);
 }catch(Exception e)
  {
  e.printStackTrace();
 }
 if(f==false)
 break;
}
}
}