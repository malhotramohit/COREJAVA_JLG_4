package com.gs.ilp.corejava.methods;

public class MethodTest1 {

	public static void main(String[] args) {

		System.out.println("About to call");
		printSomething();
		System.out.println("Called");
		System.out.println("Square of 12 is");
		int res = getSquare();
		System.out.println("Res is " + res);

	}

	private static void printSomething() {
		System.out.println("Inside print something");
	}

	/**
	 * This method will return square of 12
	 * 
	 * @return
	 */
	private static int getSquare() {
		int num = 12;
		int res = num * num;
		return res;

	}

}
