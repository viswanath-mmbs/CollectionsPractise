package com.j8.features.StreamApi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		
		List<String> lines = Arrays.asList("spring", "node", "mykong");
		// Traditional way
		List<String> result = getFilterOutput(lines, "mykong");
		for(String r : result) {
			System.out.println(r);
		}

		// Using Streams
		List<String> result1 = lines.stream().filter(line -> !line.equals("mykong")).collect(Collectors.toList());
		result.forEach(System.out::println);
		
		List<Person> persons = Arrays.asList(
				new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40),
                new Person("ahmook", 40)
        );
		
		Person person = persons.stream().filter(p-> p.getName().equals("jack")).findAny().orElse(null);
		System.out.println(person);
		
		Person result2 = persons.stream()
                .filter(x -> "mvn".equals(x.getName()))
                .findAny()
                .orElse(null);

        System.out.println(result2);
        
        String name = persons.stream().filter(p->p.getName().equals("jack")).map(Person::getName).findAny().orElse(null);
        System.out.println(name);
        
        List<String> names = persons.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println(names);
        
        
        List<String> strs = Arrays.asList("a", "b", "c", "d", "e");
        List<String> uprs = strs.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(uprs);

        

        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        List<Integer> collect = nums.stream().map(n->n*2).collect(Collectors.toList());
        System.out.println(collect);
		
		
        List<Staff> staff = Arrays.asList(
                new Staff("mkyong", 30, new BigDecimal(10000)),
                new Staff("jack", 27, new BigDecimal(20000)),
                new Staff("lawrence", 33, new BigDecimal(30000))
        );
        
        List<String> staffNames = staff.stream().map(s->s.getName()).collect(Collectors.toList());
        System.out.println(staffNames);
        
        List<Integer> staffAges = staff.stream().map(s->s.getAge()).collect(Collectors.toList());
        System.out.println(staffAges);
        
        List<StaffPublic> staffPublic = staff.stream().map(temp -> {
        	StaffPublic sp = new StaffPublic(temp.getName(), temp.getAge(), null);
        	if ("mkyong".equals(temp.getName())) {
                sp.setExtra("this field is for mkyong only!");
            }
        	return sp;
        }).collect(Collectors.toList());
        
        System.out.println(staffPublic);
       
        
    	Map<Integer, String> map = new HashMap<>();
        map.put(1, "linode.com");
        map.put(2, "heroku.com");
        map.put(3, "mvn.co");
    	
        System.out.println(map);
    	//Map -> Stream -> Filter -> String
    	String resultMap = map.entrySet().stream()
    		.filter(x -> x.getValue().contains("com"))
    		.map(x->x.getValue())
    		.collect(Collectors.joining());
    	System.out.println(resultMap);
    	
    	Map<Integer, String> coll = map.entrySet().stream().filter(x->x.getValue().contains("com")).collect(Collectors.toMap(x ->x.getKey(), x->x.getValue()));
    	System.out.println(coll);
    	
    	Map<Integer, String> HOSTING = new HashMap<>();
        HOSTING.put(1, "linode.com");
        HOSTING.put(2, "heroku.com");
        HOSTING.put(3, "digitalocean.com");
        HOSTING.put(4, "aws.amazon.com");
        
      //Map -> Stream -> Filter -> String
       String results = HOSTING.entrySet().stream()
                .filter(m -> "aws.amazon.com".equals(m.getValue()))
                .map(m -> m.getValue())
                .collect(Collectors.joining());

        System.out.println("With Java 8 : " + results);
        
	}

	private static List<String> getFilterOutput(List<String> lines, String string) {
		
		List<String> result = new ArrayList<>();
		for(String line : lines) {
			if (!line.equals("mykong")) {
				result.add(line);
			}
		}
		return result;
	}

}

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

class Staff {

    private String name;
    private int age;
    private BigDecimal salary;
	public Staff(String name, int age, BigDecimal salary) {
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
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
    
}

class StaffPublic {

    private String name;
    private int age;
    private String extra;
	public StaffPublic(String name, int age, String extra) {
		super();
		this.name = name;
		this.age = age;
		this.extra = extra;
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
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", extra=" + extra;
	}
    
}
