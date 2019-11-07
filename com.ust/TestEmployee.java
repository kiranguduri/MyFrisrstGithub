package com.ust;

public class TestEmployee {

	public static void main(String[] args) {
		Address address = new Address(34, "GK", "Delhi");
		Address anotherAddress = new Address(34, "Gacchibowli", "Hyderabad");
		
		Employee regularEmp = new RegularEmployee(12, "Ravi", 34333.33, address);
		Employee regularEmp1 = new RegularEmployee(13, "Priya", 34333.33, address);
		regularEmp.incrementSalary();
//		if(regularEmp instanceof RegularEmployee){
//			RegularEmployee regularEmp1 = (RegularEmployee)regularEmp;
//			System.out.println(regularEmp1);
//		}
		
		
		
//		emp.setId(343);
		System.out.println(regularEmp);
		
		
		Employee contractEmp = new ContractualEmployee(12, "Ravi", 5000.33, anotherAddress);
		contractEmp.incrementSalary();
//		emp.setId(343);
		System.out.println(contractEmp);
		
//		printEmployees(regularEmp);
//		printEmployees(contractEmp);
		
		Employee employees[] = {regularEmp, regularEmp1, contractEmp};
		
		double totalSalary = 0.0;
		
		for(Employee e: employees){
			printEmployees(e);
//			if(e instanceof RegularEmployee){
//				RegularEmployee e1 = (RegularEmployee)e;
//				totalSalary = totalSalary + e1.salary;
//			}
//			else if(e instanceof ContractualEmployee){
//				ContractualEmployee e2 = (ContractualEmployee)e;
//				totalSalary = totalSalary + e2.payPerMonth;
//			}
//			
////			printEmployees(e);
		}
		System.out.println(totalSalary);

	}
	
	public static void printEmployees(Employee e){
		System.out.println(e);
		
	}
	
}
