package com.gs.ilp.corejava.methods;

public class Teacher {

	int id;
	int age;
	int salary = 88;

	void processSalary(Teacher teacher) {
		int salary = 8;
		System.out.println("Local salary is " + teacher.salary);
	}

	void processSalary1() {
		int salary = 8;
		System.out.println("Local salary from this is " + this.salary);
	}

	Teacher(int id) {
		this.id = id;
	}

	public static void main(String[] args) {
		Teacher teacher = new Teacher(23);
		teacher.processSalary(teacher);
		teacher.processSalary1();
		System.out.println("Id is " + teacher.id);
	}

}
