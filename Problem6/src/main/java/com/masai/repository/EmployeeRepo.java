package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
