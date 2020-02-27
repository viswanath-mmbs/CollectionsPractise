package com.Thread;

public class SingleThreaded {

	public static void main(String[] args) {

		SingleThreaded st = new SingleThreaded();
		st.printNumbers();
		for (int j=0; j<= 100; j++) {
			System.out.print("j="+j+"\t");
		}
		
	}
	
	private void printNumbers() {
		for (int i=0; i<= 100; i++) {
			System.out.print("i="+i+"\t");
		}
	}

}
