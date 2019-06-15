package com.gs.ilp.corejava.methods;

public class Doctor {

	// p1: method name is same as class name
	// p2: no return type
	int did;
	String dname;

	static {

		System.out.println("I will always run 1");

	}

	Doctor() {
		System.out.println("I am constructor");
	}
	
	static {

		System.out.println("I will always run 2");

	}

	/**
	 * @param didParam
	 * @param dnameParam
	 */
	Doctor(int didParam, String dnameParam) {
		did = didParam;
		dname = dnameParam;
	}

	void Doctor() {
		System.out.println("I am not a constructor");
	}

	public static void main(String[] args) {
		Doctor doctor = new Doctor(1, "mohit");
		Doctor doctor1 = new Doctor();

		if (Utility.isEven(doctor.did)) {
			System.out.println("Even age");
		} else {
			System.out.println("Odd age");
		}

	}

}
