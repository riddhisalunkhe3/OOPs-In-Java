package com.Methods;

import java.util.Scanner;

public class Employee {
	Scanner in = new Scanner(System.in);
	int empId;
	String empName;
	String companyName;
	String designation;
	float salary;
	public void accept()
	{
		System.out.println("Enter the Id -> ");
		empId = in.nextInt();
		System.out.println("Enter the name -> ");
		empName = in.next();
		System.out.println("Enter the company Name -> ");
		companyName = in.next();
		System.out.println("Enter the designation -> ");
		designation = in.next();
		System.out.println("Enter the salary -> ");
		salary = in.nextFloat();
	}
	public int getId()
	{
		return empId;
	}
	public String getName()
	{
		return empName;
	}
	public String getCompanyName()
	{
		return companyName;
	}
	public String getDesignation()
	{
		return designation;
	}
	public float getSalary()
	{
		return salary;
	}
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.accept();
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getCompanyName());
		System.out.println(e1.getDesignation());
		System.out.println(e1.getSalary());
	}
}
