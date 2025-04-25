package com.constructorPracticals;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Employee e1 = new Employee();
		Employee e2 = new Employee(in.nextInt(),in.next(),in.nextLong(),in.next());
		e1.acceptData();
		e1.showData();
		e2.showData();
	}
}
