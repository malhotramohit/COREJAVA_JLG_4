package com.gs.ilp.corejava.inheriatnce;

public class TesDeptHasA {
	public static void main(String[] args) {
		Employee employee1 = new Employee(23, 45, "mohit");

		Department department = new Department(12, "CS", employee1);
		displayDeptDetails(department);
	}

	private static void displayDeptDetails(Department department) {
		// System.out.println(department.getDeptId());
		// System.out.println(department.getDeptName());
		// System.out.println(department.getEmp().getId());
		// System.out.println(department.getEmp().getName());
		// System.out.println(department.getEmp().getAge());
		// System.out.println(department.getEmp().toString());
		System.out.println(department);

	}

}
