package com.ust;

import java.util.Comparator;

import com.ust.Employee1;

public class SalaryComparator implements Comparator<Employee1>{

	

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getSalary() - o2.getSalary());
	}

}
