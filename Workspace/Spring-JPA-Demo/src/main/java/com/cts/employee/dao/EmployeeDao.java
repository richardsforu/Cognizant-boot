package com.cts.employee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.employee.entities.Employee;

public interface EmployeeDao {

	public List<Employee> listAll();

	public void saveEmployee(Employee emp);

}
