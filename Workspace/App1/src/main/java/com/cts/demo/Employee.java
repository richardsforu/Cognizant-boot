package com.cts.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Autowired
	private Environment env;
	
	//${env.getProperty("name")}
	//@Value(value="${env.getProperty(name)}")
	private String empName;

	public String getEmpName() {
		System.out.println("---- Name is "+env.getProperty("name"));
		return empName;
	}

	public void setEmpName(String empName) {
		
		this.empName = empName;
	}

}
