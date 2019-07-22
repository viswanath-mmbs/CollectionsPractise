package com.j8.features.LamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * Lamda Expressions
 * Lambda expression helps us to write our code in functional style. 
 * It provides a clear and concise way to implement SAM interface(Single Abstract Method) by using an expression. 
 * It is very useful in collection library in which it helps to iterate, filter and extract data.
*/

/*
 * 1 A lamda expression can have zero, one or more parameters
 * 2 The type of the parameter can be explicitly declared or it can be inferred from the context.
 * 3 Multiple parameters are enclosed in mandatory parenthesis and separated by commas. Empty parenthesis are used to represent an empty set of perantheses.
 * 4 When there is a single parameter, if its type is inferred, it is not mandatory to use parentheses. e.g. a -> return a*a.
 * 5 The body of the lambda expressions can contain zero, one or more statements.
 * 6 If body of lambda expression has single statement curly brackets are not mandatory and the return type of the anonymous function is the same as that of the body expression. When there is more than one statement in body than these must be enclosed in curly brackets.
 * */


/*
 * Lamda Expressions
 * 
 * Lamda expressions are the way through which we can visualize functional programming in java object oriented world.
 * Objects are the base of java programing language and we can never have function without object. thats why java language provide support for using lamda expressions only with functional interfaces.
 * Since there is only one abstract function in the functional interfaces, there is no confusion in applying the lambda expression to the method.
 * 
 * 
 * */

/*
 * Why do we need Lambda Expression
 * 
 * 1. Reduce line of code : One of the clear benefit of using lamda expression is that the amount if code is reduced.
 * 2. Sequestial and Parallel execution support: Stream API sequential and parallel support.
 * 3. Passing behaviors[predicate/lamda expression] to a method
 * 4. Higher Efficiency with Laziness : One more advantage of using lambda expression is the lazy evaluation.
 * 
 * */

@FunctionalInterface
interface Drawable {
	public void draw();
}

@FunctionalInterface
interface Sayable {
	public String say(int n);
}

@FunctionalInterface
interface Addable {
	public int add(int a, int b);
}

class Product {
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class LamdaExpressions {
	public static void main(String[] args) {
		int width = 9;
		Drawable d = () -> {
			System.out.println("with curly" + width);
		};
		d.draw();
		
		Drawable d1 = () -> System.out.println("without curly" + width);
		d1.draw();

		Sayable ss = n-> {
			return "saying good morning" + n;
		};
		System.out.println(ss.say(9));
		
		Sayable s1 = (n)-> {
			return "saying good morning" + n;
		};
		System.out.println(s1.say(9));
		
		Sayable s11 = (int n )-> {
			return "saying good morning" + n;
		};
		System.out.println(s11.say(9));
		
		Sayable s2 = (n)-> "saying good morning" +n;
		System.out.println(s2.say(19));

		Addable add = (a, b) -> {return (a+b);};
		System.out.println(add.add(5, 4));
		
		Addable add1 = (int a, int b) -> {return (a+b);};
		System.out.println(add1.add(5, 4));
		
		ArrayList<String> al = new ArrayList<>();
		al.add("U");
		al.add("S");
		al.add("N");
		al.add("V");
		al.add("V");
		al.forEach(s -> {System.out.println(s);});
		
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("t1 running");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		

		Runnable r2 = ()->{
			System.out.println("t2 running");
		};
		Thread t2 = new Thread(r2);
		t2.start();
		
		
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "U", 1));
		list.add(new Product(2, "S", 2));
		list.add(new Product(3, "N", 3));
		list.add(new Product(4, "M", 4));
		list.add(new Product(5, "V", 5));
		System.out.println("Sorting on basis of name");
		Collections.sort(list, (p1, p2) ->{
			return p1.name.compareTo(p2.name);
		});
		/*for(Product p : list) {
			System.out.println(p.name);;
		}*/
		
//		list.forEach(p -> System.out.println(p.name));
		
		
		/*
		 * Benefits:
		 * 1. Reduce line of code : One of the clear benefit of using lamda expression is that the amount if code is reduced.
		 * */
		
		/*
		 * 2. Sequestial and Parallel execution support: Stream API sequential and parallel support.
		 * Examples:
		 * */
		Stream<Product> filtered_data = list.stream().filter(p -> p.price > 4);
		filtered_data.forEach(p -> System.out.println(p.name));
		
		
		/*
		 * 3. Passing behaviors[predicate/lamda expression] to a method
		 * 
		 * */
		List<Integer> numbers = new ArrayList();
		for(int i = 0; i < 11; i++) numbers.add(i);
		
		//sum of all numbers
		sumWithCondition(numbers, n -> true);
		//sum of all even numbers
		sumWithCondition(numbers, i -> i%2==0);
		//sum of all numbers greater than 5
		sumWithCondition(numbers, i -> i>5);
		
		/*
		 * 4. Higher Efficiency with Laziness : One more advantage of using lambda expression is the lazy evaluation.
		 * 
		 * 
		*/
		
		System.out.println(findSquareOfMaxOdd(numbers));
		System.out.println(findSquareOfMaxOddLE(numbers));
	}
	
	
	/*
	 * 2. Sequestial and Parallel execution support: Stream API sequential and parallel support.
	 * Examples:
	 * */
	private static boolean isPrime(Integer number) {
		/*
		 * 
		 * return number > 1 &&
				IntStream.range(2, number).noneMatch(index -> number % index == 0 );
				
				*
				*Or
				*
				*/
		
		
		IntPredicate intPredicate = index -> number % index == 0;
		return number > 1 && IntStream.range(2, number).noneMatch(intPredicate);
		
	}
	
	/*
	 * 3. Passing behaviors[predicate/lamda expression] to a method
	 * 
	 * */
	
	public static int sumWithCondition(List<Integer> numbers, Predicate<Integer> predicate) {
	    return numbers.parallelStream()
	    		.filter(predicate)
	    		.mapToInt(i -> i)
	    		.sum();
	}
	
	
	// Treditional way
	private static int findSquareOfMaxOdd(List<Integer> numbers) {
		int max = 0;
		for (int i : numbers) {
			if (i % 2 != 0 && i > 3 && i < 11 && i > max) {
				max = i;
			}
		}
		return max * max;
	}
	
	/*using streams and lamda expressions*/
	public static int findSquareOfMaxOddLE(List<Integer> numbers) {
		return numbers.stream()
				.filter(LamdaExpressions::isOdd) 		//Predicate is functional interface and
				.filter(LamdaExpressions::isGreaterThan3)	// we are using lambdas to initialize it
				.filter(LamdaExpressions::isLessThan11)	// rather than anonymous inner classes
				.max(Comparator.naturalOrder())
				.map(i -> i * i)
				.get();
	}

	public static boolean isOdd(int i) {
		return i % 2 != 0;
	}
	
	public static boolean isGreaterThan3(int i){
		return i > 3;
	}
	
	public static boolean isLessThan11(int i){
		return i < 11;
	}
}
