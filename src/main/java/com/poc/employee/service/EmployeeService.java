package com.poc.employee.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.poc.employee.model.Employee;

@Service
public class EmployeeService {
	
	
	 public List<Employee> getEmployeesDetails() 
	    {
			List<Employee> employeesList = new ArrayList<Employee>();
			employeesList.add(new Employee(1,"Ajay","gupta","test1@gmail.com"));
			employeesList.add(new Employee(2,"Ranjan","gupta","test2@gmail.com"));
			employeesList.add(new Employee(3,"Ajay","gupta","test3@gmail.com"));
			employeesList.add(new Employee(4,"Ajay","gupta","test4@gmail.com"));
			employeesList.add(new Employee(5,"Ajay","gupta","test5@gmail.com"));
			return employeesList;
	    }
	

}
