package com.masai.service;

import java.util.List;

import com.masai.entity.Employee;

public interface EmployeeService {
	
	public Employee createEmployee(Employee emp);
	public List<Employee>getAllEmployee();
	

}
