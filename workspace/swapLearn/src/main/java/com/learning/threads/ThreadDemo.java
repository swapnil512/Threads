package com.learning.threads;

class ThreadDemo extends Thread {

	ThreadDemo() {
		super("Child");
		start();
		System.out.println(getName() + " thread started here---->");
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(" In " + getName() + " i =" + i);
			try {
				sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName() + "  thread ends here.....>");
	}
}
