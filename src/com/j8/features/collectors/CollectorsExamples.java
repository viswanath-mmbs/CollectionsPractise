package com.j8.features.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
}
public class CollectorsExamples {

	public static void main(String[] args) {

		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1, "u", 10.9));
		productList.add(new Product(2, "s", 19.9));
		productList.add(new Product(3, "n", 29.9));
		productList.add(new Product(4, "u", 39.9));
		productList.add(new Product(5, "u", 49.9));
		
		List<Double> productPriceList = productList.stream().map(p -> p.price).collect(Collectors.toList());
		System.out.println(productPriceList);
	
		Set<Double> productPriceSet = productList.stream().map(p -> p.price).collect(Collectors.toSet());
		System.out.println(productPriceSet);

	 	Double sumPrices = productList.stream().collect(Collectors.summingDouble(x->x.price));  // collecting as list  
	 	System.out.println("Sum of prices: "+sumPrices); 
	 	
	 	Integer sumId = productList.stream().collect(Collectors.summingInt(x->x.id));  
	 	System.out.println("Sum of id's: "+sumId);
	 	
	}
	
}
