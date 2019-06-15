package com.gs.ilp.corejava.inheriatnce;

public class HRExecutive extends Employee implements Interviewer {

	String[] speclization;

	public HRExecutive(int id, int age, String name) {
		super(id, age, name);
	}

	@Override
	public void conductInterview() {
		System.out.println("HR executive -- conducting interview");
	}

	public void processSalary() {
		System.out.println("Processing salary");
	}

}
