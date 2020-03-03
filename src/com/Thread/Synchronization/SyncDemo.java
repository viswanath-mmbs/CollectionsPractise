package com.Thread.Synchronization;

public class SyncDemo {

	public static void main(String[] args) {

		DisplayMsg dm = new DisplayMsg();
		
		MyThread m = new MyThread(dm, "=====mvn");
		MyThread m1 = new MyThread(dm, "n");
		m.start();
		m1.start();
	}

}
