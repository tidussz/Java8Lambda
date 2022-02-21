package com.lambda.examples;

@FunctionalInterface
interface Cab2 {
	void bookCab(String source, String destination); // by default is public abstract void bookCab()
}

public class Example02 {

	public static void main(String[] args) {

		//  Using Lambda Expression
		Cab2 cab3 = (source, destination) -> {
			System.out.println("UberX booked from "+source+" to "+destination+"! Arriving soon!");
		};
		cab3.bookCab("Madrid", "Barcelona");
	}
}
