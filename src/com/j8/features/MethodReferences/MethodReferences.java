package com.j8.features.MethodReferences;

import java.util.function.BiFunction;

import javax.swing.plaf.synth.SynthLabelUI;

/*
 * Method References
 * 
 * Java 8 Method reference is used to refer method of functional interface . 
 * It is compact and easy form of lambda expression. 
 * Each time when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference.
 * 
 * */

/*
 * Types
 * 
 * 1 Reference to a static method
 * 2 Reference to an instance method
 * 3 Reference to a constructor
 * 
 * */

interface Sayable {
	void say();
}

class Arithmetic {
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static float add(int a, float b) {
		return a+b;
	}
	
	public static float add(float a, float b) {
		return a+b;
	}
}

interface Messageable{  
    Message getMessage(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  

public class MethodReferences {
	private static void saySomething() {
		System.out.println("Hello this is static method");
	}
	
	private static void threadStatus() {
		System.out.println("thread is running");
	}
	
	private void saySomething1() {
		System.out.println("Hello this is instance method");
	}
	
	public void printnMsg(){  
        System.out.println("Hello, this is instance methodddddddddddddddd");  
    }  
	 
	public static void main(String[] args) {
		//  Reference to a Static Method Examples
		Sayable sayable = MethodReferences::saySomething;
		sayable.say();
		
		Thread t = new Thread(MethodReferences::threadStatus);
		t.start();
		
		BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
		int result = adder.apply(10, 20);
		System.out.println(result);
		
		BiFunction<Integer, Float, Float> adder1 = Arithmetic::add;
		float result1 = adder1.apply(10, 20.9f);
		System.out.println(result1);

		BiFunction<Float, Float, Float> adder2 = Arithmetic::add;
		float result2 = adder2.apply(10.9f, 20.9f);
		System.out.println(result2);
				
		
		// Reference to an Instance Method Examples
		
		MethodReferences methodReferences = new MethodReferences();
		Sayable say = methodReferences::saySomething1;
		say.say();
		
		Sayable say1 = new MethodReferences()::saySomething1;
		say1.say();
		
		
		Thread t2=new Thread(new MethodReferences()::printnMsg);  
        t2.start();       
		
        
        Messageable hello = Message::new;  
        hello.getMessage("Hello");  
		
	}
}
