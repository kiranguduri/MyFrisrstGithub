package com.ust;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 e1, Employee1 o2) {
		
		return e1.getLastName().compareTo(o2.getLastName());
	}

}
