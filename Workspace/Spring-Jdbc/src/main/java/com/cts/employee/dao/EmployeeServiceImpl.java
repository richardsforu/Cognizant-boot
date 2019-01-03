package com.cts.employee.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.employee.beans.Employee;

@Service
public class EmployeeServiceImpl {

	@Autowired
	private EmployeeDaoImpl empDao;

	public void saveEmployee(Employee emp) {
		empDao.saveEmployee(emp);
	}

}
