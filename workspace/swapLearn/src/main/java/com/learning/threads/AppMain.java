package com.learning.threads;

public class AppMain {
	public static void main(String arg[]) {
		Thread th1 = Thread.currentThread();
		System.out.println(th1.getName() + " thread  started here========>");
		ThreadDemo obj = new ThreadDemo();
		for (int i = 0; i < 10; i++) {
			System.out.println(" In " + th1.getName() + " i =" + i);
			try {
				th1.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(th1.getName() + " thread ends here===>");
	}
}
