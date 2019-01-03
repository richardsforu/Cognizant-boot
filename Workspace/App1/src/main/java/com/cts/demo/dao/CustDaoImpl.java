package com.cts.demo.dao;

import org.springframework.stereotype.Repository;

@Repository("custDao")
public class CustDaoImpl implements AdminDao {

	@Override
	public void saveEmployee() {
		System.out.println("Dao: Saving Customer");

	}

	@Override
	public void findEmp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void listAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEmp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmp() {
		// TODO Auto-generated method stub

	}

}
