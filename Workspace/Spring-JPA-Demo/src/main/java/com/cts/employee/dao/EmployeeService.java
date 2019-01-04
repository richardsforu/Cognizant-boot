package com.cts.employee.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.employee.entities.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao empDao;
	
	
	

	public void saveEmployee(Employee emp) {

		empDao.saveEmployee(emp);
		System.out.println("Dao: Employee is Saved");

	}

	public List<Employee> listAll() {
		return empDao.listAll();
	}

}
