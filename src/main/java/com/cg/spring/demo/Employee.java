package com.cg.spring.demo;

public class Employee {

	private int eid;
	private String ename;
	private double salary;
	private Department department;

	public Employee() {
		super();
	}

	public Employee(String ename) {
		super();
		this.ename = ename;
	}

	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public Employee(int eid, String ename, double salary, Department department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.department = department;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void work() {
		System.out.println("Employee works...");
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ",  ename=" + ename + ", salary=" + salary + ", department=" + department + "]";
	}

}
