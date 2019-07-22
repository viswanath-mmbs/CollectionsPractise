package com.j8.features.forEach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/*
 * 
 * forEach
 * 
 * Java provides a new method forEach() to iterate the elements. 
 * It is defined in Iterable and Stream interfaces.
 * It is a default method defined in the Iterable interface. 
 * Collection classes which extends Iterable interface can use forEach() method to iterate elements.
 * This method takes a single parameter which is a functional interface. So, you can pass lambda expression as an argument.
 * 
 * 
 * */

/*
 * forEach
 * 
 * java 8 has introduced forEach in Iterable interface so that while writing code we concentrate only on business logic.
 * forEach() method will accept Consumer object as argument, it helps in having business logic at a separate logic that we can reuse.
 * forEach() method helps in having logic for iteration and business at separate place resulting the higher separation of concern and cleaner code.
 * 
 * */

public class ForEachExamples {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(); // Type references
		for(int i = 0; i < 10; i++) list.add(i);
		
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("========================");
		
		list.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println("forEach anonymous class Value::"+t);
			}
		});

		System.out.println("========================");
		
		MyConsumer action = new MyConsumer();
		list.forEach(action);
	}
}
class MyConsumer implements Consumer<Integer> {
	public void accept(Integer i) {
		System.out.println(i);
	} 
}

