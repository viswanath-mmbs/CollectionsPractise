package com.Thread.Interrupt;

public class InterruptDemo {

	public static void main(String[] args) {

		Thread t = new MyThread();
		t.start();
//		t.interrupt();
		System.out.println("end main");

	}

}
