package com.Thread.Yield;

public class MyThreadYield extends Thread {

	public void run() {
		for(int i =0; i < 10; i ++) {
			System.out.println("cihildd"+Thread.currentThread().isAlive());
			Thread.yield();
		}
	}
}
