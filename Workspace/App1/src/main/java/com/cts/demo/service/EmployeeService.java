package com.cts.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cts.demo.dao.AdminDao;

@Service
public class EmployeeService {
	
	@Autowired
	@Qualifier(value="custDao")
	private AdminDao empDao;

	public void test() {
		System.out.println("--- Testing....");
		empDao.saveEmployee();
	}
}
