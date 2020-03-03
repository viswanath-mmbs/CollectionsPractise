package com.Thread.Synchronization.ClassLock;

public class DisplayMsg {

	public synchronized static void sayHello(String str) {
		for (int i=0; i < 100; i++) {
			System.out.println("How are u" + str);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
