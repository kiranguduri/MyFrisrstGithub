package com.ust.demojavarest;

public class Employee {
	
	int empid;
	String empName;
	String account;

	
	public Employee(int empid, String empName, String account) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.account = account;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getAccount() {
		return account;
	}


	public void setAccount(String account) {
		this.account = account;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", account=" + account + "]";
	}
	
	

}
