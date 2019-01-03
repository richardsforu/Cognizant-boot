package com.cts.employee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.employee.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	
	//@Query("")
	public List<String> findByEmpName(String name);
	public List<String> findSalaryIsGraterThan(double criteria);

}
