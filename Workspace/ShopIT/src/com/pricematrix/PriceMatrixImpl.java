package com.pricematrix;

// Dependency
public class PriceMatrixImpl implements PriceMatrix {
	
	public PriceMatrixImpl() {
		
		System.out.println("-- PRICEMATRIX OBJECT CREATED...");
	}
	
	
	@Override
	public double getItemPrice(String itemCode) {
		
		// code to Connect to DB and fetch price for the given itemCode
		
		double total=100.00;
		
		return total;
		
	}

}
