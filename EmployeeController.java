package com.ust.demojavarest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	Employee e;
	
	ArrayList<Employee> employees=new ArrayList<Employee>();
	{
	Employee e1=new Employee(143539,"Kiran","Anthem");
	Employee e2=new Employee(143566,"Avinash","Anthem");
	employees.add(e1);
	employees.add(e2);
	
	}
	
	
	@RequestMapping(path="/employees",method=RequestMethod.GET)
	public  List<Employee> findEmployees()
	{
		return employees;
		
	}
	@RequestMapping(path="/employees",method=RequestMethod.POST)
	public void addEmployees(@RequestBody Employee emp)
	{
		System.out.println(emp);
		employees.add(emp);
		
	}
	
	@RequestMapping(path="/employees/{empName}",method=RequestMethod.DELETE)
	public void deleteEmployees(@PathVariable("empName") String empname)
	{
		System.out.println(empname);
		System.out.println(employees);
		for(int i=0;i<employees.size();i++) {
			Employee e=employees.get(i);
			if(e.empName.equals(empname))
			{
				employees.remove(i);
			}
			
		}
		
		
	}
	@RequestMapping(path="/employees/{empName}",method=RequestMethod.GET)
	public  Employee findEmployeesbyname(@PathVariable("empName") String eName)
	{
		
		
		System.out.println(eName);
		ResponseEntity<Employee> re;
		
		
		for(int i=0;i<employees.size();i++)
		{
			Employee e=employees.get(i);
			if(e.empName.equals(eName)) {
				//return new ResponseEntity<Employee>(employees.get(i), HttpStatus.OK);
					return employees.get(i);
			}
		}
		///re = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		//return re;

	
		
	}
	

}
