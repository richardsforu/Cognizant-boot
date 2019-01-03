package com.cts.employee.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cts.employee.beans.Employee;

@Repository
public class EmployeeDaoImpl {

	/*
	 * create table employee( emp_id int primary key, emp_name varchar(20), salary
	 * double )
	 */

	@Autowired
	private JdbcTemplate jt;

	public void saveEmployee(Employee emp) {
		String qry = "insert into employee values(?,?,?)";
		jt.update(qry, emp.getEmpId(), emp.getEmpName(), emp.getSalary());
		System.out.println("Employee Dao: Record Saved");

	}

}
