package com.masai;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.masai.entity.Employee;

public class EmployeeMain {

	public static void main(String[] args) throws SQLException {
		Employee employee=new Employee();
		EmployeService emp=new EmployeService();
		int i=0;
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			String s="1. for insert data into database "+
					" 2. for get data from database "+
					" 0. for exit"+
					"Enter Your chouce";
			System.out.println(s);
			i=sc.nextInt();
			
		 if(i==1) {
				System.out.println("Enter the name ");
				String name=sc.next();
				System.out.println("Enter the age");
				int age=sc.nextInt();
				employee.setName(name);
				employee.setAge(age);
				emp.addEmployee(employee);
				
			}
			else if(i==2) {
				List<Employee>employees=emp.getEmployess();
				for(Employee em:employees) {
					System.out.println("************************");
					System.out.println("Name: "+ em.getName());
					System.out.println("Age: "+em.getAge());
					System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");
					
				}
			
			}
			
		}

	}

}
