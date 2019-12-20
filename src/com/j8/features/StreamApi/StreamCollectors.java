package com.j8.features.StreamApi;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectors {

	public static void main(String[] args) {

		List<String> items= Arrays.asList("apple", "apple", "banana","banana","banana", "apple", "orange", "banana", "papaya");
		Map<String, Long> map = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		
	    Map<String, Long> finalMap = new LinkedHashMap<>();

	    Map<String, Long> map1 = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	        //Sort a map and add to finalMap
	     map1.entrySet().stream()
	                .sorted(Map.Entry.<String, Long>comparingByValue()
	                        .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

	        System.out.println(finalMap);
		
		
		Stream<String> langs = Stream.of("java", "python", "node", null, "ruby", null, "php");
//		List<String> result = langs.collect(Collectors.toList());
//		result.forEach(System.out::println);
		
//		List<String> results = langs.filter(x->x!= null).collect(Collectors.toList());
//		results.forEach(System.out::println);

		List<String> results = langs.filter(Objects::nonNull).collect(Collectors.toList());
		results.forEach(System.out::println);
		
		
		
		//3 apple, 2 banana, others 1
        List<Item> fruits = Arrays.asList(
	        new Item("apple", 10, new BigDecimal("9.99")),
	        new Item("banana", 20, new BigDecimal("19.99")),
	        new Item("orang", 10, new BigDecimal("29.99")),
	        new Item("watermelon", 10, new BigDecimal("29.99")),
	        new Item("papaya", 20, new BigDecimal("9.99")),
	        new Item("apple", 10, new BigDecimal("9.99")),
	        new Item("banana", 10, new BigDecimal("19.99")),
            new Item("apple", 20, new BigDecimal("9.99"))
        );
        
        Map<String, Long> counting = fruits.stream().collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
        
        System.out.println(counting);
        
        Map<String, Integer> sum = fruits.stream().collect(
                Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));

        System.out.println(sum);
	}

}

class Item {
    private String name;
    private int qty;
    private BigDecimal price;
    public Item(String name, int qty, BigDecimal price) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
