package com.collections.list.arraylist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class ArraylistExample {

	public static void main(String[] args) {
		/*ArrayList alist = new ArrayList<>();
		alist.add("mvn");
		alist.add("van");
		alist.add("mmb");
		alist.add("sar");
		alist.add("nan");

		System.out.println(alist);
		alist.add(3, "siva Karthik");
		System.out.println(alist);*/
		
		 /*ArrayList<String> alist=new ArrayList<String>(); 
	      alist.add("Steve");
	      alist.add("Tim");
	      alist.add("Lucy");
	      alist.add("Pat");
	      alist.add("Angela");
	      alist.add("Tom");
	      


	      System.out.println(alist);
	      
	      alist.remove("Steve");
	      alist.remove("Angela");
	      System.out.println(alist);
	      
	      alist.remove("Tom");
	      System.out.println(alist);
	      
	      alist.add(0, "Rahul");
	      alist.add(1, "Justin");

	      
	      for(String str:alist)  
	          System.out.println(str);  
	      
	      
	      
	      ArrayList<String> cities = new ArrayList<String>(){{
			   add("Delhi");
			   add("Agra");
			   add("Chennai");
			   }};
		  System.out.println("Content of Array list cities:"+cities);
		  
		  ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 5));
		  System.out.println("ArrayList items: "+intlist);


		  
		  ArrayList<Integer> arrlist = new ArrayList<Integer>();
	      arrlist.add(14);
	      arrlist.add(7);
	      arrlist.add(39);
	      arrlist.add(40);

	       For Loop for iterating ArrayList 
	      System.out.println("For Loop");
	      for (int counter = 0; counter < arrlist.size(); counter++) { 		      
	          System.out.println(arrlist.get(counter)); 		
	      }   		

	       Advanced For Loop 		
	      System.out.println("Advanced For Loop"); 		
	      for (Integer num : arrlist) { 		      
	           System.out.println(num); 		
	      }

	       While Loop for iterating ArrayList 		
	      System.out.println("While Loop"); 		
	      int count = 0; 		
	      while (arrlist.size() > count) {
		 System.out.println(arrlist.get(count));
	         count++;
	      }

	      Looping Array List using Iterator
	      System.out.println("Iterator");
	      Iterator iter = arrlist.iterator();
	      while (iter.hasNext()) {
	         System.out.println(iter.next());
	      }
	      
	      
	      
	      List<String> arraylist = new ArrayList<String>();
		   arraylist.add("AA");
		   arraylist.add("ZZ");
		   arraylist.add("CC");
		   arraylist.add("FF");

		   Unsorted List: ArrayList content before sorting
		   System.out.println("Before Sorting:");
		   for(String str: arraylist){
				System.out.println(str);
			}

		    Sorting in decreasing order
		   Collections.sort(arraylist, Collections.reverseOrder());

		    Sorted List in reverse order
		   System.out.println("ArrayList in descending order:");
		   for(String str: arraylist){
				System.out.println(str);
			}*/
/*		
		ArrayList<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		//lambda
		//Output : A,B,C,D,E
	items.forEach(item->System.out.println(item));*/
			
	/*		//Output : C
		items.forEach(item->{
			if("C".equals(item)){
				System.out.println(item);
			}
		});
			
		//method reference
		//Output : A,B,C,D,E
	//	items.forEach(System.out::println);
		
		//Stream and filter
		//Output : B
		items.stream()
			.filter(s->s.contains("B"))
			.forEach(System.out::println);
*/
		
		
		//creating sample Collection
//				List<Integer> myList = new ArrayList<Integer>();
//				for(int i=0; i<10; i++) myList.add(i);
				
			/*	//traversing using Iterator
				Iterator<Integer> it = myList.iterator();
				while(it.hasNext()){
					Integer i = it.next();
					System.out.println("Iterator Value::"+i);
				}
				
				//traversing through forEach method of Iterable with anonymous class
				myList.forEach(new Consumer<Integer>() {

					public void accept(Integer t) {
						System.out.println("forEach anonymous class Value::"+t);
					}

				});*/
				
				//traversing with Consumer interface implementation
			/*	MyConsumer action = new MyConsumer();
				myList.forEach(action);

				
				Runnable r = new Runnable(){
					@Override
					public void run() {
						System.out.println("My Runnable");
					}};
					
					Runnable r1 = () -> {
						System.out.println("My Runnable");
					};

					*/
				System.out.println(12345);	

	/*	try {
		  // Creating script engine  
		ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
		// Reading Nashorn file  
		ee.eval(new FileReader("D:/J8/hello.js"));
		 Invocable invocable = (Invocable)ee;  
		 // calling a function  
		 invocable.invokeFunction("functionDemo1");  
		 // calling a function and passing variable as well.  
		 invocable.invokeFunction("functionDemo2","Nashorn");       

		} catch (Exception e) {
			
		}*/
				
				/*
				  StringJoiner joinNames = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter   
          
				  // Adding values to StringJoiner  
				  joinNames.add("Rahul");  
				  joinNames.add("Raju");  
				  joinNames.add("Peter");  
				  joinNames.add("Raheem");  
				  
				  System.out.println(joinNames);  
*/

			/*	
			    StringJoiner joinNames = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter   
			    
			    // Adding values to StringJoiner  
			    joinNames.add("Rahul");  
			    joinNames.add("Raju");  

			    System.out.println(joinNames);
			    // Creating StringJoiner with :(colon) delimiter  
			    StringJoiner joinNames2 = new StringJoiner(":", "[", "]");  // passing colon(:) and square-brackets as delimiter   
			    
			    // Adding values to StringJoiner  
			    joinNames2.add("Peter");  
			    joinNames2.add("Raheem");  
			    
			    System.out.println(joinNames2);
			    
			    
			    // Merging two StringJoiner  
			    StringJoiner merge = joinNames.merge(joinNames2);   
			    System.out.println(merge);  
*/
				
			/*	StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter   
				
				
				System.out.println(joinNames);  
				
				// We can set default empty value.  
				joinNames.setEmptyValue("It is empty");  
				System.out.println(joinNames);  
				
				
				// Adding values to StringJoiner  
				joinNames.add("Rahul");  
				System.out.println(joinNames);  
				
				
				// Returns length of StringJoiner  
				int length = joinNames.length();  
				System.out.println("Length: "+length);  
				
				// Returns StringJoiner as String type   
				String str = joinNames.toString();  
				
				
				// Now, we can apply String methods on it  
		        char ch = str.charAt(3);  
				System.out.println("Character at index 3: "+ch);  
				
				// Adding one more element   
				joinNames.add("Sorabh");  
				System.out.println(joinNames);  
				
				// Returns length  
				int newLength = joinNames.length();  
				System.out.println("New Length: "+newLength);  
*/
				
				
			/*	  // Creating an integer array   
				int[] arr = {5,8,1,0,6,9};  
				// Iterating array elements  
				for (int i : arr) {  
					System.out.print(i+" ");  
				}  
				// Sorting array elements parallel  
//				Arrays.parallelSort(arr);  
				 Arrays.parallelSort(arr,0,4);  
				System.out.println("\nArray elements after sorting");  
				// Iterating array elements  
				for (int i : arr) {  
					System.out.print(i+" ");  
				} */ 
				
				 // Creating an integer array   
				int[] arr = {5,8,1,0,61,9,50,-3};  
				// Iterating array elements  
				for (int i : arr) {  
//					System.out.println(i+" ");  
				}  
				// Sorting array elements parallel and passing start, end index  
				Arrays.parallelSort(arr,0,4);  
				
				// Iterating array elements  
				for (int i : arr) {  
					System.out.println(i+" ");  
				}  

				

		
	}
	
	void testARM_Before_Java9() throws IOException{
		 BufferedReader reader1 = new BufferedReader(new FileReader("journaldev.txt"));
		 try (BufferedReader r1 = reader1) {
		   System.out.println(reader1.readLine());
		 }
		}

	

	//Declarative approach
	private static boolean isPrime(int number) {		
		return number > 1
				&& IntStream.range(2, number).noneMatch(
						index -> number % index == 0);
	}
	
	private static boolean isPrime1(int number) {
		IntPredicate isDivisible = index -> number % index == 0;
		
		return number > 1
				&& IntStream.range(2, number).noneMatch(
						isDivisible);
	}

	public static int sumWithCondition(List<Integer> numbers, Predicate<Integer> predicate) {
	    return numbers.parallelStream()
	    		.filter(predicate)
	    		.mapToInt(i -> i)
	    		.sum();
	}
	
	public static int findSquareOfMaxOdd(List<Integer> numbers) {
		return numbers.stream()
				.filter(ArraylistExample::isOdd) 		//Predicate is functional interface and
				.filter(ArraylistExample::isGreaterThan3)	// we are using lambdas to initialize it
				.filter(ArraylistExample::isLessThan11)	// rather than anonymous inner classes
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


//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer>{

	public void accept(Integer t) {
		System.out.println("Consumer impl Value::"+t);
	}


}