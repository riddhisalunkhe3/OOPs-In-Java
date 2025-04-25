package com.encapsulation;

import java.util.Scanner;

public class Employee {
	private String name;
	private String post;
	private double salary;
	public void setName(String name )
	{
		this.name = name;
	}
	public void setPost(String post)
	{
		this.post = post;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public String getName()
	{
		return name;
	}
	public String getPost()
	{
		return post;
	}
	public double getSalary()
	{
		return salary;
	}
	public void acceptData()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name -> ");
		setName(in.next());
		System.out.println("Enter the Post -> ");
		setPost(in.next());
		System.out.println("Enter the Salary -> ");
		setSalary(in.nextDouble());
	}
	public void displayData()
	{
		System.out.println("name -> "+getName());
		System.out.println("post-> "+getPost());
		System.out.println("salary -> "+getSalary());
	}
}
