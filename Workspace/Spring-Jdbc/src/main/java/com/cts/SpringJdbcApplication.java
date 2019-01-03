package com.cts;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.employee.beans.Employee;
import com.cts.employee.dao.EmployeeServiceImpl;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringJdbcApplication.class, args);
		EmployeeServiceImpl es = ac.getBean(EmployeeServiceImpl.class);

		Scanner sc=new Scanner(System.in);
		System.out.println("Employee Id: ");
		int empId=sc.nextInt();
		System.out.println("Name: ");
		String empName=sc.nextLine();
		System.out.println("Salary: ");
		double salary=sc.nextDouble();
		
		Employee emp = new Employee();
		emp.setEmpId(empId);
		emp.setEmpName(empName);
		emp.setSalary(salary);

		es.saveEmployee(emp);

		System.out.println("--- Done ---");

	}

}
