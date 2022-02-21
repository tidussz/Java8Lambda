package com.lambda.examples;

@FunctionalInterface
interface Cab4 {
	double bookCab(String source, String destination); // by default is public abstract void bookCab()
}

public class Example04 {
	
	int instanceVariable = 10;
	static int staticVariable = 100;

	public static void main(String[] args) {
		
		int localVariable = 1000;
		Example04 example04 = new Example04();

		//  Using Lambda Expression
		Cab4 cab3 = (source, destination) -> {
			System.out.println("UberX booked from "+source+" to "+destination+"! Arriving soon!");
			System.out.println("instanceVariable: " + example04.instanceVariable);
			System.out.println("staticVariable: " + Example04.staticVariable);
			System.out.println("localVariable: " + localVariable);
			return 850.12;
		};
		double fare = cab3.bookCab("Madrid", "Barcelona");
		System.out.println("Fare shall be: " + fare);
	}
}
