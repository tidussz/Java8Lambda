package com.lambda.examples;

@FunctionalInterface
interface Cab {
	void bookCab(); // by default is public abstract void bookCab()
}

class UberX implements Cab {

	@Override
	public void bookCab() {
		System.out.println("UberX booked! Arriving soon!");
	}
	
}

public class Example01 {

	public static void main(String[] args) {
		
		// 1. Class Implementation
		Cab cab1= new UberX();
		cab1.bookCab();
		
		// 2. Anonymous Class Implementation
		Cab cab2 = new Cab() {
			
			@Override
			public void bookCab() {
				System.out.println("UberX booked! Arriving soon!");
			}
		};
		cab2.bookCab(); 
		
		// 3. Using Lambda Expression
		Cab cab3 = () -> {
			System.out.println("UberX booked! Arriving soon!");
		};
		cab3.bookCab();
	}
}
