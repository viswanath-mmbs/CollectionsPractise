package com.Thread;

public class MultiThreaded extends Thread {

	public static void main(String[] args) throws InterruptedException {
		MultiThreaded mt = new MultiThreaded();
		mt.setPriority(MAX_PRIORITY);
		mt.setName("mt");
		mt.start();
		
		MultiThreaded mt1 = new MultiThreaded();
		mt1.setPriority(MIN_PRIORITY);
		mt1.setName("mt1");
		mt1.start();
		
		
		 System.out.println("1111"+Thread.currentThread().getName());
		/*for (int j=0; j<= 100; j++) {
			System.out.print("j="+j+"\t");
			Thread.sleep(1000);
		}*/
	}
	
	public void run() {
		System.out.println("Name " + Thread.currentThread().getName());
		/*Thread.currentThread().setName("9");
		System.out.println("2222"+Thread.currentThread().getName());
		*/
		/*for (int i=0; i<= 100; i++) {
			System.out.print("i="+i+"\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("child t exit");
			}
		}*/
	}
}
