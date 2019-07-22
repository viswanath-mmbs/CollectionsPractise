package com.j8.features.StringJoiner;

import java.util.StringJoiner;

/*
 * 
 * String Joiner
 * 
 * Java added a new final class StringJoiner in java.util package. 
 * It is used to construct a sequence of characters separated by a delimiter. 
 * Now, you can create string by passing delimiters like comma(,), hyphen(-) etc. 
 * You can also pass prefix and suffix to the char sequence.
 * 
 * */

public class StringJoinerExample {

	public static void main(String[] args) {

		/*StringJoiner joiner = new StringJoiner(",");
		
		joiner.add("nandhana");
		joiner.add("nayna");
		joiner.add("vandhana");
		joiner.add("viswanath");
		joiner.add("saraswathamma");
		
		System.out.println(joiner);
		
		
		StringJoiner joinNames = new StringJoiner(",", "[", "]");   
		
		joinNames.add("nandhana");
		joinNames.add("nayna");
		joinNames.add("vandhana");
		joinNames.add("viswanath");
		joinNames.add("saraswathamma");
		
		System.out.println(joinNames);
		
		
		StringJoiner sj1 = new StringJoiner(",", "[", "]");
		sj1.add("viswanath");
		sj1.add("muthyala");
		
		StringJoiner sj2 = new StringJoiner(",", "[", "]");
		sj2.add("vandhana");
		sj2.add("muthyala");
		System.out.println(sj1.merge(sj2));
		
		
		 StringJoiner joinNames1 = new StringJoiner(","); // passing comma(,) as delimiter   
         
	        // Prints nothing because it is empty  
	        System.out.println(joinNames1);  
	          
	        // We can set default empty value.  
	        joinNames1.setEmptyValue("It is empty");  
	        System.out.println(joinNames1);  
	        */
		int i = 9;
		String str = new Integer(i).toString();
		System.out.println(str);
		
		String str1 = Integer.toString(i);
		System.out.println(str);
		
		
		
	}

}
