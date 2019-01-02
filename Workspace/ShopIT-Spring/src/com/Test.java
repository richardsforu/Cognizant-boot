package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bill.BillingImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "Item01", "Item02", "Item03" };
		String[] cart2 = { "Item01", "Item02" };
		
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		BillingImpl bill=ac.getBean(BillingImpl.class);
		
		//PriceMatrix price=new PriceMatrixImpl();
		
		
		//-----------------------------------

		//BillingImpl bill = new BillingImpl();
		
		//------------------------------------
		
		//bill.setPrice(price); // DI
		
		double total = bill.getCartTotal(cart1);

		System.out.println("Cart1 Total-v2: " + total);
		
		
		 total = bill.getCartTotal(cart2);

		System.out.println("Cart2 Total-v2: " + total);
		
		ac.registerShutdownHook();
		

	}

}
