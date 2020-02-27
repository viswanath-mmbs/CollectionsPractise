package com.exceptionHandling;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int a, b, c;
		/*System.out.println("Enter two digits");
		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		b = obj.nextInt();
		c=a/b;
		System.out.println("Result:" + c);*/
		
	/*	try{
			System.out.println("Enter two digits");
			Scanner obj = new Scanner(System.in);
			a = obj.nextInt();
			b = obj.nextInt();
			c=a/b;
			System.out.println("Result:" + c);
		} catch (ArithmeticException e) {
			// TODO: handle exception
		} finally {
			System.out.println("finally");
		}*/
		int aa = a();
		System.out.println(aa);
		
	}
	
	private static int a() {
		int a, b, c;
		/*System.out.println("Enter two digits");
		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		b = obj.nextInt();
		c=a/b;
		System.out.println("Result:" + c);*/
		
		/*try{
			System.out.println("Enter two digits");
			Scanner obj = new Scanner(System.in);
			a = obj.nextInt();
			b = obj.nextInt();
			c=a/b;
			System.out.println("Result:" + c);
			return 1;
		} catch (ArithmeticException e) {
			// TODO: handle exception
		} finally {
			System.out.println("finally");
			return 2;
		}*/
		
		try{
			System.out.println("Enter two digits");
			Scanner obj = new Scanner(System.in);
			a = obj.nextInt();
			b = obj.nextInt();
			c=a/b;
			System.out.println("Result:" + c);
//			return 1;
		} finally {
			System.out.println("finally");
//			return 2;
		}
		
		return 1;
		
	}
}
