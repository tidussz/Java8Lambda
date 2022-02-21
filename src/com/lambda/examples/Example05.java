package com.lambda.examples;

@FunctionalInterface
interface Calculator {
	void add(int num1, int num2);
}

class Calc {
	public static void addSomething(int num1, int num2) {
		System.out.println(num1 + " and " + num2 + " addition is: " + (num1+num2));
	}
	
	public void letsAdd(int num1, int num2) {
		System.out.println(num1 + " and " + num2 + " adds to: " + (num1+num2));
	}
}

interface Messenger {
	Message getMessage(String msg) ;
}

class Message {
	Message(String msg) {
		System.out.println("Message is: " + msg);
	}
}

public class Example05 {
	
	int instanceVariable = 10;
	static int staticVariable = 100;

	public static void main(String[] args) {
		
		// 1. Structured
		Calc.addSomething(10, 20);
		
		// 2. Reference to a static method
		Calculator cRef = Calc::addSomething;
		cRef.add(11, 14);
		
		// 3. Reference to a non static method or instance method
		Calc calc = new Calc();
		Calculator cRef2 = calc::letsAdd;
		cRef2.add(12, 23);
		
		// 4. Reference to a constructor
		Messenger mRef3 = Message::new;
		mRef3.getMessage("Search the candle");
	}
}
