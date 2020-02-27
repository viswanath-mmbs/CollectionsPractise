package com.Thread.Interrupt;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		try {
			for(int i =0; i < 10; i ++) {

				System.out.println("leazy");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("got interrupted");
		}
	}

}
