package com.functional.programming.examples;

import java.util.List;

public class Ex01Exercises {
	
	public static void main(String[] args) {
		
		System.out.println("--- Exercise 1: ");
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		printOddNumbersInListFunctional(numbers);
		
		System.out.println("--- Exercise 2: ");
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		courses.stream().forEach(System.out::println);
		
		System.out.println("--- Exercise 3: ");
		courses.stream()
			.filter(course -> course.contains("Spring"))
			.forEach(System.out::println);
		
		System.out.println("--- Exercise 4: ");
		courses.stream()
			.filter(course -> course.length() > 3)
			.forEach(System.out::println);
	}

	private static void printOddNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream()
			.filter(number -> number%2 == 1)
			.forEach(System.out::println);
	}
}
