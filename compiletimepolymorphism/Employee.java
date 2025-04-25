package com.compiletimepolymorphism;

public class Employee {
	String empName;
	int empId;
	int empAge;
	String empAdd;
	public void acceptData(String empName, int empId)
	{
		this.empName = empName;
		this.empId = empId;
		System.out.println(empName);
		System.out.println(empId);
	}
	public void acceptData(String empName, int empId, int empAge, String empAdd)
	{
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empAdd = empAdd;
		System.out.println(empName);
		System.out.println(empId);
		System.out.println(empAge);
		System.out.println(empAdd);
	}
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.acceptData("Riddhi",23 );
	}
}
