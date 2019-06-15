package com.gs.ilp.corejava.methods;

public class School {

	int noOfClasses; // instance variables
	String schoolName;
	static String countryName = "India";

	School(int noOc, String sName) {
		noOfClasses = noOc;
		schoolName = sName;
	}

	public static void main(String[] args) {
		School dps = new School(12, "DPS Dwarka");
		School jps = new School(10, "JPS Gurgaon");

		System.out.println("School name of 1 " + dps.schoolName);
		System.out.println("School name of 2" + jps.schoolName);

		System.out.println("Country name of 1" + dps.countryName);
		System.out.println("Country name of 2" + jps.countryName);

		System.out.println("Country name of all schools is " + School.countryName);

		jps.countryName = "USA";
		
		System.out.println("Country name of 1" + dps.countryName);
		System.out.println("Country name of all schools is " + School.countryName);


	}

}
