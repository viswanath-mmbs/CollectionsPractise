package com.Thread.Synchronization.Blocks;

public class DisplayMsg {

	public void sayHello(String str) {
		System.out.println("before sync block");
//		synchronized (DisplayMsg.class) {
		synchronized (this) {
			for (int i=0; i < 10; i++) {
				System.out.println("How are u" + str);
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("after sync block");
	}
}
