package com.gs.ilp.corejava.methods;

public class MethodWithTwoArgsTest3 {

	public static void main(String[] args) {

		System.out.println("10 + 20 = " + calculateSum(10, 20));
		System.out.println("20 x 40 = " + calculateProduct(20, 40));
		System.out.println("400 / 40 = " + calculateDivision(400, 40));

	}

	public static int calculateSum(int a, int b) {
		return a + b;
	}

	public static int calculateProduct(int x, int y) {
		return x * y;
	}

	public static int calculateDivision(int x, int y) {
		return x / y;
	}

}