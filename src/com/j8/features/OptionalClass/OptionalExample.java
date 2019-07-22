package com.j8.features.OptionalClass;

import java.util.Optional;

/*
 * Optional Class
 * https://www.javatpoint.com/java-8-features
 * 
 * It is a public final class and used to deal with NullPointerException in Java application. 
 * You must import java.util package to use this class. 
 * It provides methods which are used to check the presence of value for particular variable.
 * 
 * */

public class OptionalExample {

	public static void main(String[] args) {
//		String[] str = new String[10];  
//        String lowercaseString = str[5].toLowerCase();  
//        System.out.print(lowercaseString);  
		
		String[] str = new String[10];
		str[5] = "JAVA OPTIONAL CLASS EXAMPLE";// Setting value for 5th index  
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if (checkNull.isPresent()) {
			System.out.println(str[5].toLowerCase());
		} else {
			System.out.println("String value is not present at specified index");
		}
		
		checkNull.ifPresent(System.out::println);
		System.out.println(checkNull.get());
		
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		
		Optional<String> value = Optional.of(str[5]);
		System.out.println(value.filter((s) -> s.equals("ABC")));
		System.out.println(value.filter((s) -> s.equals("JAVA OPTIONAL CLASS EXAMPLE")));
		System.out.println(value.get());
		System.out.println(value.hashCode());
		System.out.println(value.isPresent());
		System.out.println(Optional.ofNullable(str[5]));
		System.out.println("orElse: "+value.orElse("Value is not present"));  
	    System.out.println("orElse: "+empty.orElse("Value is not present"));  
	    value.ifPresent(System.out::println);   // printing value by using method reference   
		
		
	}
	
}
