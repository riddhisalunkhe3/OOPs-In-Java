package com.Methods;

import java.util.Scanner;

public class Manager {
	static Scanner in = new Scanner(System.in);
	String managerName;
	double salary;
	String companyName;
	double bonus;
	public void accept()
	{
		System.out.println("Enter the name -> ");
		managerName= in.next();
		System.out.println("Enter the salary - > ");
		salary = in.nextDouble();
		System.out.println("Enter the companyName -> ");
		companyName = in.next();
	}
	public void display()
	{
		System.out.println("Manager Name -> "+managerName);
		System.out.println("Salary -> "+salary);
		System.out.println("Company Name -> "+companyName);
	}
	public double calculateSalary(double bonus)
	{
		bonus = bonus;
		salary = salary + bonus;
		return salary;
	}
	public static void main(String[] args) {
		Manager mg = new Manager();
		mg.accept();
		mg.display();
		System.out.println("Enter the Bonus -> ");
		System.out.println(mg.calculateSalary(in.nextDouble()));;
	}
}
