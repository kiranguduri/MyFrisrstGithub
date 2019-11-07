package com.ust;

import java.util.HashMap;
import java.util.Map;

import com.ust.Employee1;

public class MapDemo {
	
	public static void main(String[] args) {
		Map<Integer, Employee1> employeeMap = new HashMap<>();
		Employee1 emp1 = new Employee1(12, "Ravi"  , 33333.33,"wer");
		Employee1 emp2 = new Employee1(13, "Priya" ,  22222.22,"Negi");
		Employee1 emp3 = new Employee1(11, "Ravi" , 44444.33, "Devgan" );
		
		employeeMap.put(12, emp1);
		employeeMap.put(11, emp3);
		employeeMap.put(13, emp2);
		
		System.out.println(employeeMap);
		
		
	}

}
