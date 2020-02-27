package com.Thread.Yield;

public class YieldDemo {

	public static void main(String[] args) {
		MyThreadYield mt = new MyThreadYield();
		mt.start();
		for(int i =0; i < 10; i ++) {
			System.out.println("main"+Thread.currentThread().isAlive());
		}
	}
}
