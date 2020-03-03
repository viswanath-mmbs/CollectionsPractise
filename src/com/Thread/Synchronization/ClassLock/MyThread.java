package com.Thread.Synchronization.ClassLock;

public class MyThread extends Thread {

	String name;
	
	public MyThread(String name) {
		this.name = name;
	}
	
	public void run() {
		DisplayMsg.sayHello(name);
	}
}
