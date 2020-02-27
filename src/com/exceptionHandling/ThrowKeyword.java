package com.exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		
//		throw new RuntimeErrorException(null, "test"); // un checked  no need try catch
		
//		throw new FileNotFoundException("test");
		try {
			throw new Exception("test");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
