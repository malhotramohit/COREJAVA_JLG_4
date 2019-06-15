package com.gs.ilp.corejava.methods;

//1) no. of args
//2) type of args
//3) relative
class Calculator {

	int add(int a, int b) {
		System.out.println("2 args");
		return a + b;
	}
	

	int add(int a, char b) {
		System.out.println("2 args one int other char");
		return a + b;
	}

	int add(char a, int b) {
		System.out.println("2 args one char other int");
		return a + b;
	}

	int add(int a, int b, int c) {
		System.out.println("3 args");
		return a + b + c;
	}

	int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}

}

public class MethodOverLoadingExample {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		calculator.add(2, 3);
		calculator.add(2, 'a');
		calculator.add('a', 78);

	}
	
}
