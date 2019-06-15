package com.gs.ilp.corejava.inheriatnce;

public class Manager extends Employee implements Interviewer{
	private int teamSize;
	String compName = "HDFC";

	public Manager() {
		super(12, 445, "mohit");
	}

	public void letsDoParty() {
		super.letsDoParty();
		System.out.println("Lets do party with manager");
	}

	public String parentCompanyName() {
		return super.compName;
	}

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.letsDoParty();
		System.out.println("Company name " + manager.parentCompanyName());
		manager.letsDoParty();

	}

	@Override
	public void conductInterview() {
		System.out.println("Manager is conducting interview");
	}

}
