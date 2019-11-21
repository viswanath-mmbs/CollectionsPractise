package com.j8.features.LamdaExpression;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LamdaExamples {

	public static void main(String[] args) {

		List<Developer> list = getDevelopers();
		/*Collections.sort(list, new Comparator<Developer>() {
			@Override
			public int compare(Developer d, Developer d1) {
				return d.getName().compareTo(d1.getName());
			}
		});*/
		/*list.sort(new Comparator<Developer>() {
			@Override
			public int compare(Developer d, Developer d1) {
				return d1.getSalary() - d.getSalary();
			}
		});*/
//		list.sort((Developer d, Developer d1) -> d1.getSalary() - d.getSalary());
//		list.sort((d, d1) -> d1.getSalary() - d.getSalary());
		Comparator<Developer> c = (d1, d2) -> d1.getName().compareTo(d2.getName());
		list.sort(c.reversed());
		list.forEach(l -> System.out.println(l));
	}
	
	private static List<Developer> getDevelopers() {
		List<Developer> list = new ArrayList<>();;
		list.add(new Developer("mvn", 31, 5000));
		list.add(new Developer("vasu", 33, 8000));
		list.add(new Developer("nag", 35, 9000));
		list.add(new Developer("sha", 38, 12000));
		list.add(new Developer("uma", 40, 15000));
		
		return list;
	}
}

class Developer {
	private String name;
	
	private int age;
	
	private int salary;
	
	public Developer(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
}
