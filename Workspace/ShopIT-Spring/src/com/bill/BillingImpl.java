package com.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pricematrix.PriceMatrix;
import com.pricematrix.PriceMatrixImpl;

//Dependent
@Service
public class BillingImpl {
	
	/*
	 * Design Issues
	 * -----------------
	 * 1. Dependent class class creating too many dependency class objects.
	 * 		-> per of apply goes down
	 * 		-> memory issues
	 * 
	 * Why this issue happened?
	 * ----------------------------
	 * -> Dependent class is creating Dependency class Objects Directly
	 * 
	 *  What is the Solution?
	 *  ---------------------
	 *  -> Do not create Dependency obj in the dependent class
	 *  -> Insted Create an interface/ Reference of a Dependency to the Dependent
	 *  -> Use JNDI to look up for the dependency objects
	 *  
	 *  
	 *  -> JNDI location is tightly binded with Dependent class. 
	 *  
	 *  What is the Best Solution?
	 *  ----------------------------
	 *  Do not create/do not find using JNDI. Insted ask some one to inject -> IoC
	 *  -> Injecting Dependency to the Dependent is known as Dependency Injection (DI)
	 *  
	 *  DI
	 *  ----
	 *  1. By using setter
	 *  2. By using Constructor
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 * 
	 */
	
	
	@Autowired
	private PriceMatrix price;

	

	public double getCartTotal(String[] cart) {

		double total = 0.0;

		//PriceMatrix price = new PriceMatrixImpl();

		for (String itemCode : cart) {

			total = price.getItemPrice(itemCode) + total;

		}

		return total;

	}

}
