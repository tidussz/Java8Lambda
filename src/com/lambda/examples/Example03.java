package com.lambda.examples;

@FunctionalInterface
interface Cab3 {
	double bookCab(String source, String destination); // by default is public abstract void bookCab()
}

public class Example03 {

	public static void main(String[] args) {

		//  Using Lambda Expression
		Cab3 cab3 = (source, destination) -> {
			System.out.println("UberX booked from "+source+" to "+destination+"! Arriving soon!");
			return 850.12;
		};
		double fare = cab3.bookCab("Madrid", "Barcelona");
		System.out.println("Fare shall be: " + fare);
	}
}
