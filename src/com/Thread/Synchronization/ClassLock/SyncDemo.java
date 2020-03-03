package com.Thread.Synchronization.ClassLock;

public class SyncDemo {

	public static void main(String[] args) {

		DisplayMsg dm = new DisplayMsg();
		
		MyThread m = new MyThread("mvn");
		MyThread m1 = new MyThread("n");
		m.start();
		m1.start();
	}

}
