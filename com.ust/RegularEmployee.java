package com.ust;

public class RegularEmployee extends Employee{
	double salary;

	public RegularEmployee(int id, String name, double salary, Address address) {
		super(id, name, address);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", getName()=" + getName() + ", getId()=" + getId() + "]";
	}

	@Override
	public void incrementSalary() {
		double incrementedRegSal=this.salary*1.1;
		System.out.println(incrementedRegSal);
		
	}


	
	
}
