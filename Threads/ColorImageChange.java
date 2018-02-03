import java.applet.*;
import java.awt.*;

public class  ColorImageChange extends Applet  implements  Runnable
{

Thread th;
Color c;
boolean f;
String nm[]={"Blue hills.jpg","DSC_0005 (1).jpg","Winter.jpg","Sunset.jpg","Water lilies.jpg"};
Image img[]=new  Image[5];
public void init()
{
	for(int i=0;i<nm.length;i++)
	{
		img[i]=getImage(getCodeBase(),nm[i]);
	}
}
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
for(int i=0;i<nm.length;i++)
	{
		g.drawImage(img[i],50,50,300,300,this);

try{
 th.sleep(1000);
 }catch(Exception e)
  {
  e.printStackTrace();
 }
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