package com.gs.ilp.corejava.inheriatnce;

public class Department extends Object {
	private long deptId;
	private String deptName;
	
	//has a
	private Employee emp;
	
	
	
//	public String toString() {
//		return "[ deptId = "+deptId+" , deptname = "+deptName+ ", emp = "+ emp+" ]";
//	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", emp=" + emp + "]";
	}

	public Department(long deptId, String deptName, Employee emp) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.emp = emp;
	}

	public long getDeptId() {
		return deptId;
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	

}
