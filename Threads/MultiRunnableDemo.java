class  MultiRunnableDemo implements Runnable
{
 Thread th;
 MultiRunnableDemo(String  nm,int p)
 {
 th=new Thread(this,nm);

 th.start();
 System.out.println(th.getName()+" started here---->");
th.setPriority(p);
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
   System.out.println(th.getName()+ "  ends here.....>");
 }
 public  static void main(String arg[])
 {
 Thread th1=Thread.currentThread();
 System.out.println(th1.getName()+"  started here========>");
   MultiRunnableDemo obj1=new MultiRunnableDemo("Child1",1);
   MultiRunnableDemo obj2=new MultiRunnableDemo("Child2",5);
   MultiRunnableDemo obj3=new MultiRunnableDemo("Child3",10);

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
   System.out.println(th1.getName()+ "  ends here===>");
 }
 }

