package com.functional.programming.examples;

import java.util.List;

public class Ex01Functional {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		printAllNumbersInListFunctional(numbers);
		printEvenNumbersInListFunctional(numbers);
		printSquaresOfEvenNumbersInListFunctional(numbers);
	}
	
	private static void print(int number) {
		System.out.println(number);
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		
		// What to do?
		numbers.stream()
			.forEach(Ex01Functional::print); // Method reference
		
		System.out.println("------------ Better approach");
		
		// More simple approach
		numbers.stream().forEach(System.out::println);
	}
	
	private static boolean isEven(int num) {
		return num%2 == 0;
	}

	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		
		System.out.println("------------ Only even");
		
		// Filter: only allow even numbers
		numbers.stream()
			.filter(Ex01Functional::isEven)
			.forEach(System.out::println);
		
		// Better with lambda expression
		System.out.println("------------ Only even with lambda expression");
		numbers.stream()
			.filter(number -> number%2 == 0)
			.forEach(System.out::println);
	}
	
	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
		
		System.out.println("------------ Squares of even numbers");
				
		// Mapping the result to square
		System.out.println("------------ Only even with lambda expression");
		numbers.stream()
			.filter(number -> number%2 == 0)
			.map(number -> number + ": " + number*number)
			.forEach(System.out::println);
	}
}
