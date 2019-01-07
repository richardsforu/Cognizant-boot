package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Employee;
import com.cts.service.EmployeeService;

@RestController
@RequestMapping("myapp")
public class MyController {

	@Autowired
	EmployeeService es;

	// End Point URL
	@GetMapping("s1")
	public String f1() {

		return es.test();

	}

	@PostMapping("s1")
	public String f3() {

		return "My First Rest App- POST";

	}

	@PutMapping("s1")
	public String f4() {

		return "My First Rest App - PUT";

	}

	@DeleteMapping("s1")
	public String f5() {

		return "My First Rest App - DELETE";

	}

	@GetMapping("s2")
	public Employee f2() {

		Employee emp = new Employee();
		emp.setEmpId(1024);
		emp.setEmpName("Ozvitha");
		emp.setSalary(48684);

		return emp;

	}

}
