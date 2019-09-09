package com.designpattern.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	public List<Employee> getEmployeeList() {
		List<Employee> employees = new ArrayList<Employee>();
		Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "jwick@chapter3.com");
		employees.add(employeeFromDB);
		
		//Will not work
		
		EmployeeLdap employeeLdap = new EmployeeLdap("bharude", "Solo", "Han", "sham" );
		employees.add(new EmployeeAdapterLdap(employeeLdap));
		
		EmployeeCSV employeefromCSV = new EmployeeCSV("21, pratimes, bharude, tets");
		employees.add(new EmployeeAdapterCSV(employeefromCSV));
		
		return employees;
	}
	
}
