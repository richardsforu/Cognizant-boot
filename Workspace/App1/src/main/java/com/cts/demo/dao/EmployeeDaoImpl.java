package com.cts.demo.dao;

import org.springframework.stereotype.Repository;

@Repository("empDao")
public class EmployeeDaoImpl implements AdminDao, PMDao, ProgramerDao {

	@Override
	public void saveEmployee() {
		System.out.println("---- Dao:  Saving Employee");
	}

	@Override
	public void findEmp() {
		System.out.println("---- Dao:  Finding Employee");
	}

	@Override
	public void listAll() {

		System.out.println("---- Dao:  Listing all Employees");
	}

	@Override
	public void updateEmp() {
		System.out.println("---- Dao:  Update Employee");
	}

	@Override
	public void deleteEmp() {
		System.out.println("---- Dao:  Delete Employee");
	}

}
