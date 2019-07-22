package com.j8.features.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 
 * Stream Api
 * 
 * Java provides a new additional package in Java 8 called java.util.stream. 
 * This package consists of classes, interfaces and enum to allows functional-style operations on the elements. 
 * You can use stream by importing java.util.stream package.
 * 
 * 
 * ***********Stream provides following features*************
 *
 * 
 * Stream does not store elements. It simply conveys elements from a source such as a data structure, an array, or an I/O channel, through a pipeline of computational operations.
 * Stream is functional in nature. Operations performed on a stream does not modify it's source. For example, filtering a Stream obtained from a collection produces a new Stream without the filtered elements, rather than removing elements from the source collection.
 * Stream is lazy and evaluates code only when required.
 * The elements of a stream are only visited once during the life of a stream. Like an Iterator, a new stream must be generated to revisit the same elements of the source.
 * 
 * 
 * 
 * You can use stream to filter, collect, print, and convert from one data structure to other etc. 
 * 
 * 
 * 
 * Stream API will allow sequential as well as parallel execution. This is one of the best feature for me because I work a lot with Collections and usually with Big Data, we need to filter out them based on some conditions.
 * Collection interface has been extended with stream() and parallelStream() default methods to get the Stream for sequential and parallel execution. Let’s see their usage with simple example.
 * 
 * */

class Product {
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
}

public class StreamApiExamples {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "U", 100.9));
		list.add(new Product(2, "S", 99.9));
		list.add(new Product(3, "N", 89.9));
		list.add(new Product(4, "M", 79.9));
		list.add(new Product(5, "V", 69.9));
		
		List<Product> listPrice = list.stream().filter(p -> p.price > 90).map(p -> p).collect(Collectors.toList());
		
		System.out.println("=======");
		listPrice.forEach(p -> System.out.println(p.name));
		System.out.println("========="+listPrice);
		
		 Stream.iterate(1, element->element+1)  
	        .filter(element->element%5==0)  
	        .limit(10)  
	        .forEach(System.out::println);  
		 
		 list.stream().filter(p -> p.price == 100.9).forEach(p -> System.out.println("====="+p.name));
	
		 // This is more compact approach for filtering data  
	        Double totalPrice = list.stream()  
	                    .map(product->product.price)  
	                    .reduce(0.0,(sum, price)->sum+price);   // accumulating price  
	        System.out.println(totalPrice);  
	        // More precise code   
	        Double totalPrice2 = list.stream()  
	                .map(product->product.price)  
	                .reduce(0.0, Double::sum);   // accumulating price, by referring method of Float class  
	        System.out.println(totalPrice2);  

	        Double price = list.stream().collect(Collectors.summingDouble(p -> p.price));
	        System.out.println(price);
	        
	        Product pp = list.stream().min((p1,p2) -> p1.price > p2.price ? 1 : -1).get();
	        System.out.println(pp.name+"=======" +pp.price);
	        
	        long count = list.stream().filter(p -> pp.price < 100).count();
	        System.out.println(count);
	        
	        Set<Double> priceSet = list.stream().filter(p -> p.price > 89).map(p -> p.price).collect(Collectors.toSet());
	        System.out.println(priceSet);
	        
	        Map<Integer, String> map = list.stream().collect(Collectors.toMap(p -> p.id, p -> p.name));
	        System.out.println(map.toString());
	        
	        List<Double> methodRefs = list.stream().filter(p -> p.price > 50).map(Product::getPrice).collect(Collectors.toList());
	        System.out.println(methodRefs);
	}

}
