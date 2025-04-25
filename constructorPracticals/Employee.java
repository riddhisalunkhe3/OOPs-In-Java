package com.constructorPracticals;

import java.util.Scanner;

public class Employee {
	int empId;
	String empName;
	long empMoNo;
	String empAdd;
	public Employee()
	{
		
	}
	public Employee(int Id, String Name, long MoNo,String Add)
	{
		this.empId = Id;
		this.empName = Name;
		this.empMoNo = MoNo;
		this.empAdd = Add;
	}
	public void acceptData()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Id ->");
		empId = in.nextInt();
		System.out.println("Enter the Name -> ");
		empName = in.next();
		System.out.println("Enter Mo No. -> ");
		empMoNo = in.nextLong();
		System.out.println("Enter the Address -> ");
		empAdd = in.next();
	}
	public void showData()
	{
		System.out.println("Employee Id -> "+this.empId);
		System.out.println("Employee Name ->"+this.empName);
		System.out.println("Employee Mo No -> "+this.empMoNo);
		System.out.println("Employee Address -> "+this.empAdd);
	}
}
