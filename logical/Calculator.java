package com.logical;

import java.util.Scanner;

public class Calculator {
	static Scanner in = new Scanner(System.in);
	static void add()
	{
		System.out.println("Enter two numbers -> ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = a + b;
		System.out.println("The Addition is -> "+c);
	}
	static void sub()
	{
		System.out.println("Enter two numbers -> ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = a - b;
		System.out.println("The Substraction is -> "+c);
	}
	static void mul()
	{
		System.out.println("Enter two numbers -> ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = a * b;
		System.out.println("The Multiplication is -> "+c);
	}
	static void div()
	{
		System.out.println("Enter two numbers -> ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = a / b;
		System.out.println("The Division is -> "+c);
	}
	static void mod()
	{
		System.out.println("Enter two numbers -> ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = a % b;
		System.out.println("The Mod is -> "+c);
	}
	public static void main(String[] args) {
		while(true)
		{
			System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Mod\n6.Exit");
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the Option -> ");
			int option = in.nextInt();
			switch(option)
			{
			  case 1 :
				add();
				break;
			  case 2 :
				sub();
				break;
			  case 3 :
			    mul();
			    break;
			  case 4 :
				div();
				break;
			  case 5:
				mod();
				break;
			  case 6:
				System.exit(7);
			  default :
				System.out.println("Enter valid option(1/2/3/4/5/6)");
			}
		}
	}
}
