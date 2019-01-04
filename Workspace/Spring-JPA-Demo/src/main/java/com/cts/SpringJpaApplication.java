package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.employee.dao.EmployeeService;
import com.cts.employee.entities.Employee;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(SpringJpaApplication.class, args);
		EmployeeService es=ac.getBean(EmployeeService.class);
		
		Employee employee=new Employee();
		employee.setEmpName("James");
		employee.setSalary(3435);
		
		es.saveEmployee(employee);
		
		for(Employee emp:es.listAll()) {
			System.out.println("Id: "+emp.getEmpId());
			System.out.println("Name: "+emp.getEmpName());
			System.out.println("Salary: "+emp.getSalary());
			System.out.println("-----------------------------");
		}
		
		System.out.println("--- Done ---");
	}

}

