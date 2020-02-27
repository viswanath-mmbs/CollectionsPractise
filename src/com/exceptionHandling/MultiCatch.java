package com.exceptionHandling;

public class MultiCatch {

	public static void main(String[] args) {
		try {
		String input = args[0];
		System.out.println("input="+input);
		
		int output = Integer.parseInt(input);
		System.out.println("onput="+output);

//		} catch(RuntimeException ae) { throws error in below catchs because it is already handled
			
		} catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("input required");
		} catch (NumberFormatException ne) {
			 System.out.println("input should be int");
		}
		
		System.out.println("more code");
		
	}
}
