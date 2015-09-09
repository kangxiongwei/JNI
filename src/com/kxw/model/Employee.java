package com.kxw.model;

public class Employee {

	static {
		System.loadLibrary("Employee");
	}
	
	private String name;
	private double salary;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	/**
	 * JNI方法，按照指定的百分比涨工资
	 * @param byPercent
	 */
	public native void raiseSalary(double byPercent);
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}
