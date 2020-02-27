package com.Thread;

import java.util.Scanner;

public class JoinDemo extends Thread {

	static int n, sum = 0;
	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		System.out.println("sum of first n numbers ");
		System.out.println("Enter a val");
		Scanner scanner = new Scanner(System.in);
		JoinDemo.n = scanner.nextInt();
		
		JoinDemo jd = new JoinDemo();
		
		jd.start();
		System.out.println(jd.isAlive());
		try {
			jd.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(jd.isAlive());
		System.out.println("sum of first " + JoinDemo.n + " numbers ===== " + JoinDemo.sum);
		long end = System.currentTimeMillis();
		System.out.println("time" + (end - start)/1000);
	}

	public void run() {
		for(int i =0; i < JoinDemo.n; i ++) {
			JoinDemo.sum= JoinDemo.sum + i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
