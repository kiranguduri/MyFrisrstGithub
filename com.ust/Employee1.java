package com.ust;

public class Employee1 implements Comparable<Employee1>{
	
	private int id;
	private String name;
	double address;
	String LastName;

	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id>0 && id < 9999){
			this.id = id;
		}
		
	}
	public Employee1(int id, String name, double d,String lastname) {
		this.id = id;
		this.name = name;
		this.address = d;
		this.LastName=lastname;
	}
	public Employee1() {

	}
	
	
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", address=" + address + ", LastName=" + LastName + "]";
	}
	public int getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int compareTo(Employee1 arg0) {
		
		return this.id - arg0.id;
	}
}