package com.Thread.Synchronization;

public class MyThread extends Thread {

	DisplayMsg dsp;
	String name;
	
	public MyThread(DisplayMsg msg, String name) {

		this.dsp = msg;
		this.name = name;
	}
	
	public void run() {
		dsp.sayHello(name);
	}
}
