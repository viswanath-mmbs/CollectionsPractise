package com.j8.features.defaultMethods;

/*
 * Default Methods / Static Methods
 * 
 * Java 8, Interfaces are enhanced to have method with implementation.
 * We can use default and static keyword to create interface with method implementation.
 * 
 * Java does not support multiple inheritance in class because it leads to diamond problem.
 * so how it will be handled with interfaces now, since interfaces are similar to abstract class, 
 * the solution is that the compiler will throw exception in this scenario and 
 * we will have to provide implementation logic in the classes implementing the interface.
 * 
 * If any class in the hierarchy has a method with same signature, the default method become irrelevant.
 * Since any class implementing interface already has Object class as super class, if we have equals/hasCode..... defaultmethods declared in interface, it will become irrelevant.
 * Interfaces are not allowed to have Object class default methods.   
 * */


/*
 * Multiple Inheritance in Java
 *
 * It is the capability of creating a class with multiple super classes, that java does not support 
 * Java does not support multiple inheritance in class because it leads to diamond problem.
 * 
 * */

/*
 * Interface changes in java 8
 * 
 * Designing interface is always a tough job because if we want to extend interface with two additional methods, it will require change in all implementing calsses 
 * As interface grow, the implementation class might grow to an extent that it's not possible to extend interface, 
 * thats why when designing an application, most of the frameworks will provide base implementation classes and 
 * then we extend those and override methods that are applicable for our application
 *
 *   
 *   
 * */

/*
 * 
 * Important points about java interface default methods:
 * 
 * Java 8 interface default methods will help us in extending interfaces without having the fear of breaking implementation classes.
 * Java 8 interface default methods has bridge down the difference between interface and abstract classes.
 * Java 8 interface default will help us in avoiding utility classes, such as all the Collections method can be provided in interfaces itself.
 * Java 8 interface default will help us in removing the base class implementation classes, we can provide default implementation and the impl class can chose which one to override.
 * Java 8 interface default major use is to enhance collection api to support lamda expressions.
 * If any class in the hierarchy has a method with same signature, the default method become irrelevant. Since any class implementing interface already has Object class as super class, if we have equals/hasCode..... defaultmethods declared in interface, it will become irrelevant. Interfaces are not allowed to have Object class default methods.   
 * Java interface default methods are also referred to as Defender Methods or Virtual extension methods.
 *  
 * */

interface interface1 {
	void method1(String str);
	
	default void log(String str) {
		System.out.println("interface 1 print log " + str );
	}
}

interface interface2 {
	void method2(String str);
	
	default void log(String str) {
		System.out.println("interface 2 print log " + str );
	}
}

public class DefaultMethodsExamples implements interface1, interface2{
	
	public void method1(String str) {
		System.out.println("method 1");
	}
	
	public void method2(String str) {
		System.out.println("method 2");
	}
	
	public void log(String str) {
		System.err.println("Overridded log method");
	}

	public static void main(String[] args) {
		DefaultMethodsExamples defaultMethodsExamples = new DefaultMethodsExamples();
		defaultMethodsExamples.method1("test");
		defaultMethodsExamples.method2("test");
		defaultMethodsExamples.log("test");
	}
	
}
