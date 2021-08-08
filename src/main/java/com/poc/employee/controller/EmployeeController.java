package com.poc.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.employee.model.Employee;
import com.poc.employee.service.EmployeeService;



@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService emploeeService;
	
	@RequestMapping("/employee")
    public List<Employee> getEmployees() 
    {
				
		return emploeeService.getEmployeesDetails();
    }
	
	
	@RequestMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable String id) 
    {
		List<Employee> employeesList = emploeeService.getEmployeesDetails();
		
		for(Employee employee:employeesList) {
			if(employee.getId().equals(Integer.valueOf(id)))
				return employee;
			
		}
		
		return null;
    }
	
	@PostMapping("/employee/add")
    public String addEmployees(@RequestBody Employee employee)     
     {
		System.out.println(employee);		
		return "Successfully saved data into the Database";
    }
	
	
	
}
