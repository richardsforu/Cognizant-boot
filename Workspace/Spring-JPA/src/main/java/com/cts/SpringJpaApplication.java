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
		
		Employee emp=new Employee();
		emp.setEmpName("Ozvitha");
		emp.setSalary(48484);
		
		es.saveEmployee(emp);
		
		System.out.println("--- Done ---");
	}

}

