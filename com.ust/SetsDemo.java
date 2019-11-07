package com.ust;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ust.Employee1;

public class SetsDemo {

	public static void main(String[] args) {
		//HashSet : Unordered
		//LinkedHashSet: Ordered by Insertion order
		//TreeSet: Sorted
//		Set<Employee> employees = new LinkedHashSet<>();
		List<Employee1> employees = new ArrayList<>();
		
		Employee1 emp1 = new Employee1(12, "Ravi", 33333.33,"kumar");
		Employee1 emp2 = new Employee1(13, "Priya", 22222.22,"xyz");
		
		
		
		employees.add(emp1);
		employees.add(emp2);
		Employee1 emp3 = new Employee1(11, "Ravi", 44444.33,"abc");
		employees.add(emp3);
		
		
//		boolean result = employees.contains(emp3);
//		System.out.println(result);
		
		
		
		Collections.sort(employees, new );
				
		System.out.println(employees);
		
//		fruits.add("apple");
//		fruits.add("apple");
		
//		System.out.println(fruits);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
