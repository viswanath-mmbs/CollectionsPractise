package com.j8.features.dateApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateApiExamples {

	public static void main(String[] args) {

		/*
		 * Java LocalDate class
		 * 
		 * Java LocalDate class is an immutable class that represents Date with a default format of yyyy-MM-dd. 
		 * It inherits Object class and implements the ChronoLocalDate interface
		 * 
		 * 
		 * */
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		System.out.println(localDate.minusDays(1));
		System.out.println(localDate.plusDays(2));
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getDayOfYear());
		System.out.println(localDate.getMonthValue());
		System.out.println(localDate.getYear());
		System.out.println(localDate.getChronology());
		System.out.println(localDate.getClass());
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getEra());
		System.out.println(localDate.getMonth());
		
		/*
		 * Java LocalTime 
		 * 
		 * Java LocalTime class is an immutable class that represents time with a default format of hour-minute-second. 
		 * It inherits Object class and implements the Comparable interface.
		 * 
		 * */
		 LocalTime time = LocalTime.now();  
		 System.out.println(time);  

		 
		 LocalDateTime now = LocalDateTime.now();  
	}

}
