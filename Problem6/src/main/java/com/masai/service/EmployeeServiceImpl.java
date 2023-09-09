package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entity.Employee;
import com.masai.repository.EmployeeRepo;

import io.swagger.v3.oas.annotations.servers.Server;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	@Override
	public Employee createEmployee(Employee emp) {
		
		
		return employeeRepo.save(emp);
	}

	@Override
	public List<Employee> getAllEmployee() {
	
		return employeeRepo.findAll();
	}

}
