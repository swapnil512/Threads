class DataDemo
{
	synchronized void  display(String msg)
		{
		System.out.print("["+msg);
		try{
		Thread.sleep(1000);
		}catch(Exception e)
		 {
		 e.printStackTrace();
		 }
		 System.out.println("]");
		}
}
class ThreadDemo implements Runnable
{
	Thread th;
	String s;
	DataDemo d1;
	ThreadDemo(DataDemo  d,String msg)
	{
		th=new Thread(this);
		th.start();
		s=msg;
		d1=d;
	}
	public void run()
	{
	//synchronized(d1)
//{
		d1.display(s);

//}
		 try{
			 th.sleep(1000);
		  }catch(Exception e)
		  {
		   e.printStackTrace();
  }

	}
}


class SynchDemo
{
 public static void main(String arg[])
 {
   DataDemo d=new DataDemo();
   ThreadDemo  th1=new  ThreadDemo(d,"Hello");
   ThreadDemo  th2=new  ThreadDemo(d,"friends");
   ThreadDemo  th3=new  ThreadDemo(d,"Welcome");
 }
}