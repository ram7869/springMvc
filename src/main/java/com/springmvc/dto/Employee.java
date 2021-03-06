package com.springmvc.dto;

public class Employee {

	private int eno;
	private String name;
	private double salary;
	
	public Employee() {
		super();
	}

	public Employee(int eno, String name, double salary) {
		super();
		this.eno = eno;
		this.name = name;
		this.salary = salary;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
