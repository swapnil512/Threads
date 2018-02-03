class  ThreadDemo  extends Thread
{

 ThreadDemo()
 {
 super("Child");
start();
 System.out.println(getName()+" thread started here---->");
 }
 public  void run()
 {
 for(int i=0;i<3;i++)
 {
  System.out.println(" In "+getName()+" i ="+i);
  try{
	sleep(1000);
  }catch(Exception e)
  {
   e.printStackTrace();
  }
   }
   System.out.println(getName()+ "  thread ends here.....>");
 }
 public  static void main(String arg[])
 {
 Thread th1=Thread.currentThread();
 System.out.println(th1.getName()+" thread  started here========>");
   ThreadDemo obj=new ThreadDemo();
   for(int i=0;i<3;i++)
    {
     System.out.println(" In "+th1.getName()+" i ="+i);
     try{
		th1.sleep(1000);
     }catch(Exception e)
     {
      e.printStackTrace();
  }
   }
   System.out.println(th1.getName()+ " thread ends here===>");
 }
 }

