package com.poc.employee.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Assert;

import com.poc.employee.model.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {
	
	@Autowired
	private EmployeeService emploeeService;

	@Test
	public void getEmployeesDetailsTest() {
		List<Employee> employeesList =emploeeService.getEmployeesDetails();
		  Assert.assertEquals("Mock Product Name", employeesList.size(),5);
	}
	
}
