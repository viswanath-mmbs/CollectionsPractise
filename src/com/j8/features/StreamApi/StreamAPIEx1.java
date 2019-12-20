package com.j8.features.StreamApi;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIEx1 {

	public static void main(String[] args) {
		 String[] array = {"a", "b", "c", "d", "e"};
		 
		 Stream<String> stream = Arrays.stream(array);
		 stream.forEach(x-> System.out.println(x));
		 
		 Stream<String> stream1 = Stream.of(array);
		 stream1.forEach(x-> System.out.println(x));
		 
		 int[] intArray = {1, 2, 3, 4, 5};
		 
		 IntStream is = Arrays.stream(intArray);
		 is.forEach(x->System.out.println(x));
		 
		 Stream<int[]> intS = Stream.of(intArray);
		 IntStream ints2 = intS.flatMapToInt(x->Arrays.stream(x));
		 ints2.forEach(x->System.out.println(x));
		 
		 
		 String[] array1 = {"a", "b", "c", "d", "b"};
		 Stream<String> stream2 = Arrays.stream(array1);

		 // loop a stream
//		 stream2.forEach(x -> System.out.println(x));

		 // reuse it to filter again! throws IllegalStateException
		 long count = stream2.filter(x -> "b".equals(x)).count();
		 System.out.println("===="+count);
		 
		 
		 String[] arrays = {"a", "b", "c", "d", "e"};

	     Supplier<Stream<String>> streamSupplier = () -> Stream.of(arrays);

	     //get new stream
	     streamSupplier.get().forEach(x -> System.out.println(x));

	     //get another new stream
	     long counts = streamSupplier.get().filter(x -> "b".equals(x)).count();
	     System.out.println(counts);
	}
}
