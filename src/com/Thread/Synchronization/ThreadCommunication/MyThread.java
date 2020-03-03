package com.Thread.Synchronization.ThreadCommunication;

public class MyThread extends Thread {

	int total;
	
	public void run() {
		System.out.println("child thread is calculating sum");
		
		synchronized (this) {
			for (int i=0; i < 10; i++) {
				total  = total + i;
			}
			this.notify();
		}
		
	}
}
