package com;

import com.bill.BillingImpl;
import com.pricematrix.PriceMatrix;
import com.pricematrix.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "Item01", "Item02", "Item03" };
		String[] cart2 = { "Item01", "Item02" };
		
		PriceMatrix price=new PriceMatrixImpl();
		
		
		//-----------------------------------

		BillingImpl bill = new BillingImpl();
		
		//------------------------------------
		
		bill.setPrice(price); // DI
		
		double total = bill.getCartTotal(cart1);

		System.out.println("Cart1 Total: " + total);
		
		
		 total = bill.getCartTotal(cart2);

		System.out.println("Cart2 Total: " + total);
		
		

	}

}
