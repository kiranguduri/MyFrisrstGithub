package com.ust;

abstract public class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	Address address;
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
	public Employee(int id, String name, Address address,String lastname) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.LastName=lastname;
	}
	public Employee() {

	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	abstract public void incrementSalary();
	
	

	
	
	
	

}