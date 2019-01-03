package com.cts.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.demo.service.EmployeeService;

@SpringBootApplication
//@ComponentScan(basePackages= {"com.cts.service"})
public class App1Application implements CommandLineRunner{

	public static void main(String[] args) {
		
		ApplicationContext ac= SpringApplication.run(App1Application.class, args);
		EmployeeService es=ac.getBean(EmployeeService.class);
		es.test();
		System.out.println(ac.getBean(Employee.class).getEmpName());
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("----- in run method..");
		
	}

}

