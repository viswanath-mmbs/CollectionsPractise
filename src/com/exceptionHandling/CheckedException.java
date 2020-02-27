package com.exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	void readFile() throws FileNotFoundException {
//		try {
			FileInputStream fis = new FileInputStream("text.txt");
//		} catch (FileNotFoundException e) {
//			System.out.println("file not found");
//		}
	}
	
	public static void main(String[] args)  throws FileNotFoundException{
		/*try {
			FileInputStream fis = new FileInputStream("text.txt");
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}*/
		
		CheckedException cd = new CheckedException();
		cd.readFile();
		
	}
}
