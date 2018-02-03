class  RunnableDemo  implements Runnable
{
 Thread th;
 RunnableDemo()
 {
 th=new Thread(this,"Child");
 th.start();
 System.out.println(th.getName()+" thread started here---->");
 }
 public  void run()
 {
 for(int i=0;i<3;i++)
 {
  System.out.println(" In "+th.getName()+" i ="+i);
  try{
	 th.sleep(1000);
  }catch(Exception e)
  {
   e.printStackTrace();
  }
   }
   System.out.println(th.getName()+ "  thread ends here.....>");
 }
 public  static void main(String arg[])
 {
 Thread th1=Thread.currentThread();
 System.out.println(th1.getName()+" thread  started here========>");
   RunnableDemo obj=new RunnableDemo();
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



