package com.ust;

public class ContractualEmployee extends Employee{
	double payPerMonth;

	public ContractualEmployee(int id, String name, double payPerMonth, Address address) {
		super(id, name, address);
		this.payPerMonth = payPerMonth;
	}

	@Override
	public String toString() {
		return "ContractualEmployee [payPerMonth=" + payPerMonth + ", address=" + address + ", getName()=" + getName()
				+ ", getId()=" + getId() + "]";
	
	}
//	@Override
//	public String toString() {
//		return "ContractualEmployee [payPerMonth=" + payPerMonth + ", getName()=" + getName() + ", getId()=" + getId()
//				+ "]";
//	}
	
	@Override
	public void incrementSalary() {
		double incrementedConSal=this.payPerMonth+5000;
		System.out.println(incrementedConSal);
	}
	
}
	
