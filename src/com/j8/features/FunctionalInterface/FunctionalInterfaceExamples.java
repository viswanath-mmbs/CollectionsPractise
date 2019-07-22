package com.j8.features.FunctionalInterface;

import java.util.function.Predicate;

/*
 * Functional Interface
 * 
 * 1 An Interface that contains only one abstract method is known as functional interface. 
 * 2 It can have any number of default and static methods but can contain only one abstract method. 
 * 3 It can also declare methods of Object class.
 * 4 Functional interfaces are also known as Single Abstract Method Interfaces (SAM Interfaces).
 * 5 A functional interface can extends another interface only when it does not have any abstract method.
 * 
 * */

/*
 * 
 * Predicate Interface
 * 
 * It is a functional interface which represents a predicate (boolean-valued function) of one argument. 
 * It is defined in the java.util.function package and contains test() a functional method.
 * 
 * */

/*
 * Benefits:
 * 
 * One of the major benefits of functional interface is the possibility to use lamda expressions to instantiate them.
 * Since functional interfaces have only one method, lamda expressions can easily provide the implementation. we just need to provide the arguments and business logic
 * Ex: 1. Runnable r1 = () -> {
			  System.out.println("My Runnable");
		  };
  	   2. Interface1 i1 = (s) -> System.out.println(s);
		  i1.method1("abc");
		 
 * */

interface sayable{  
    default void say(String msg) {};   // abstract method  
}

@FunctionalInterface  
interface Doable extends sayable{  
    // Invalid '@FunctionalInterface' annotation; Doable is not a functional interface  
    void doIt();  
}  

@FunctionalInterface
interface functionalInterface{  
    void say(String msg);  
}

public class FunctionalInterfaceExamples implements functionalInterface{

	@Override
	public void say(String msg) {
		System.out.println("hi srikar");
	}
	
	public static void main(String[] args) {
		FunctionalInterfaceExamples fie = new FunctionalInterfaceExamples();  
	    fie.say("Hello there");  
	     
	  /*  Predicate<Integer> pr = a -> (a > 2);
	    System.out.println(pr.test(1));*/
	}

}

@FunctionalInterface
interface Foo { boolean equals1(Object obj); }


@FunctionalInterface
interface Comparator<T> {
	 boolean equals(Object obj);
	 int compare(T o1, T o2);
	}


@FunctionalInterface
interface X { int m(Iterable<String> arg); }
@FunctionalInterface
interface Y { int m(Iterable<String> arg); }
@FunctionalInterface
interface Z extends X, Y {}


@FunctionalInterface
interface XX { Iterable m(Iterable<String> arg); }
@FunctionalInterface
interface YY { Iterable<String> m(Iterable arg); }
@FunctionalInterface
interface ZZ extends XX, YY {}


@FunctionalInterface
interface X1 { int m(Iterable<String> arg); }
@FunctionalInterface
interface Y1 { int m(Iterable<Integer> arg); }
@FunctionalInterface
interface Z1 extends X1, Y1 {}
// Not functional: No method has a subsignature of all abstract methods


@FunctionalInterface
interface X2 { int m(Iterable<String> arg, Class c); }
@FunctionalInterface
interface Y2 { int m(Iterable arg, Class<?> c); }
@FunctionalInterface
interface Z2 extends X2, Y2 {}
// Not functional: No method has a subsignature of all abstract methods


@FunctionalInterface
interface X3 { long m(); }
@FunctionalInterface
interface Y3 { int m(); }
@FunctionalInterface
interface Z3 extends X3, Y3 {}
// Compiler error: no method is return type substitutable


interface Foo1<T> { void m(T arg); }
interface Bar<T> { void m(T arg); }
interface FooBar<X, Y> extends Foo1<X>, Bar<Y> {}
// Compiler error: different signatures, same erasure