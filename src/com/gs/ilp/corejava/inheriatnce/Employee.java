package com.gs.ilp.corejava.inheriatnce;

public class Employee {

	private int id;
	private int age;
	private String name;
	String compName = "TCS";
	
	public String toString() {
		return "[ id = "+id+" , age = "+age+" , name= "+name +" , company Name = "+ compName+"]";
	}

	 public void letsDoParty() {
		System.out.println("Lets do party with emp");
	}

	public Employee(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
