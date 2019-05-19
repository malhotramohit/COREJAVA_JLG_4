package com.gs.ilp.corejava.methods;

public class MethodWithArgTest2 {
	public static void main(String[] args) {

		int num = 10;
		int res = square(10);
		System.out.println("Square of " + num + " is " + res);

		// code re-usability now I want to find square of 20
		num = 20;
		res = square(20);
		System.out.println("Square of " + num + " is " + res);

	}

	private static int square(int num) {
		int res = num * num;
		return res;
	}

}
