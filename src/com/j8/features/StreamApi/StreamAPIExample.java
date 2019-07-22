package com.j8.features.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamAPIExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i=0; i<100; i++) list.add(i);
		
		Stream<Integer> sequentialStream = list.stream();
		
		
		
		
		Stream<Integer> parallelStream = list.parallelStream();
		Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
		//using lambda in forEach
//		highNums.forEach(p -> System.out.println("High Nums parallel="+p));
		
		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
//		highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));
		
		Stream<Integer> ints = Stream.of(1,2,3,4,5);
		System.out.println(ints.collect(Collectors.toList()));
		
		Stream<Integer> integers = Stream.of(new Integer[] {1,2,3,4,5});
		System.out.println(integers.collect(Collectors.toList()));
		
		/*
		 * Stream<String> stream0 = Stream.generate(() -> "ABCDE");
		stream0.forEach(System.out::println);
		*/
		
		Stream<String> stream1 = Stream.of("aBc", "d", "ef");// Stream.generate(() -> "ABCDE");
		System.out.println("======"+stream1.map(s -> {return s.toUpperCase();}).collect(Collectors.toList()));
		Stream<String> stream2 = Stream.generate(() -> {return "ABCDE";});
		System.out.println("======"+stream2);
		Stream<String> stream3 = Stream.iterate("abc", (i) -> i);
		System.out.println("======"+stream3);
		
		Stream<String> name2 = Stream.of("Z", "A", "B", "M", "C", "N", "D", "E");
		System.out.println(name2.sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		
		
		Stream<String> names3 = Stream.of("aBc", "A", "d", "ef", "123456");
		List<String> naturalSorted = names3.sorted().collect(Collectors.toList());
		System.out.println(naturalSorted);
		
		
		Stream<List<String>> s1 = Stream.of(Arrays.asList("UM", "SS", "NR", "UV", "MVN"), Arrays.asList("MN"), Arrays.asList("MV"), Arrays.asList("MN2"), Arrays.asList("a", "b") );
		
		Stream<String> s2 = s1.flatMap(strList -> strList.stream());
		s2.forEach(System.out::println);
		
	}
	
}
