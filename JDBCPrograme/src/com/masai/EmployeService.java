package com.masai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.masai.entity.Employee;
import com.masai.util.ConnectionProvider;


public class EmployeService {
	
	public List<Employee> getEmployess() throws SQLException{
		
		List<Employee> employess=new ArrayList<>();
		String query="select * from Employee";
		try(Connection conn=ConnectionProvider.connectToDb()){
			Statement statement=conn.createStatement();
			ResultSet res=statement.executeQuery(query);
			
			while(res.next()) {
				int id= res.getInt("id");
				String name=res.getString("Emp_Name");
				int age =res.getInt("Emp_age");
				
				employess.add(new Employee(id,name, age));
			}
		}
		return employess;
	}
	public String addEmployee(Employee emp) throws SQLException {
		
		int rowInserted=0;
		String query="insert into employee(Emp_Name,Emp_age)values(?,?,?)";
		try(Connection conn=ConnectionProvider.connectToDb()){
			PreparedStatement prepareStatement=conn.prepareStatement(query);
			prepareStatement.setInt(1, emp.getId());
			prepareStatement.setString(2, emp.getName());
			prepareStatement.setInt(3, emp.getAge());
			
			rowInserted=prepareStatement.executeUpdate();
			if(rowInserted>0) return "1 Row Affected";
			else return "some Thing went worng";
		}
	}

}
