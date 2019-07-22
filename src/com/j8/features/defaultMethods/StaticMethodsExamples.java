package com.j8.features.defaultMethods;


/*
 * 
 * Important points about interface static methods
 * 
 * Java 8 interface static methods are similar to default method except that we can not override them in the implementation classes
 * Java 8 interface static methods are visible to interface methods only
 * How ever like other static methods we can use Interface static methods using iterface name 
 * */

/*
 * Notes:
 * 
 * Java 8 interface static methods are part of interface, we can not use it for implementation class object.
 * Java 8 interface static methods are good for providing utility methods ex: null check and collection sorting
 * Java 8 interface static methods helps us in providing security by not allowing implementation class to override them.
 * We can not define interface static method for object class methods, we will get compile time error as "The static method can not hide the instance method of Object class.
 * -This is because it is not allowed in java, since object is the base class of all classes and we can not have one class level static method and another instance method with same signature.
 * We can use java interface static methods to remove utility classes such as Collections and move all of it’s static methods to the corresponding interface, that would be easy to find and use.
 * 
 * */

interface myData {
	default void print(String str) {
		if (!isNull(str))
			System.out.println("MyData Print::" + str);
	}
	
	static boolean isNull(String str) {
		System.out.println("Interface Null Check");
	
		return str == null ? true : "".equals(str) ? true : false;
	}
}

public class StaticMethodsExamples implements myData {

	public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}
	
	public static void main(String args[]){
		StaticMethodsExamples obj = new StaticMethodsExamples();
		obj.print("");
		obj.isNull("abc");
	}
}
