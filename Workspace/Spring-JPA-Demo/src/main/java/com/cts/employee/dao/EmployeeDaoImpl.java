package com.cts.employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cts.employee.entities.Employee;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Employee> listAll() {
		Query qry = em.createNamedQuery("fa");

		// TODO Auto-generated method stub
		return qry.getResultList();
	}

	@Override
	public void saveEmployee(Employee emp) {

		em.persist(emp);
		System.out.println("Dao: Employee Saved...");

	}

}
