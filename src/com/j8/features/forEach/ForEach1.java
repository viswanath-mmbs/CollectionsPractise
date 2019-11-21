package com.j8.features.forEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach1 {

	public static void main(String[] args) {
		Map<String, Integer> items = new HashMap<>();
		
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		// Traditional Method
		/*for(Map.Entry<String, Integer> item : items.entrySet()) {
			System.out.println("Key:" + item.getKey() + " ===== Value:" + item.getValue());
		}*/
		
		// ForEach
		// items.forEach((k,v) -> System.out.println("Key:" + k + " ===== Value:" + v));
		
		items.forEach((k, v) -> {
			System.out.println("Key:" + k + " ===== Value:" + v);
			if(k.equals("E")) {
				System.out.println("Hello E");
			}
		});
		
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		list.forEach(item -> System.out.println(item));

		list.forEach(System.out::println);
		
		list.stream().filter(s->s.contains("E")).forEach(System.out::println);

	}
}
