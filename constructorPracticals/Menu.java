package com.constructorPracticals;

import java.util.Scanner;

public class Menu {
	static Scanner in = new Scanner(System.in);
	static void add()
	{
		System.out.println("Enter the num1 -> ");
		int a = in.nextInt();
		System.out.println("Enter the num2 -> ");
		int b = in.nextInt();
		int c = a + b;
		System.out.println("The Addition is -> "+c);
	}
	public static void sub()
	{
		System.out.println("Enter the num1 -> ");
		int x = in.nextInt();
		System.out.println("Enter the num2 -> ");
		int y = in.nextInt();
		int z = x - y;
		System.out.println("The Substraction is -> "+z);
	}
	public static void mul()
	{
		System.out.println("Enter the num1 -> ");
		int l = in.nextInt();
		System.out.println("Enter the num2 -> ");
		int m = in.nextInt();
		int n = l*m;
		System.out.println("The Multiplication is -> "+n);
	}
	public static void div()
	{
		System.out.println("Enter the num1 -> ");
		int p = in.nextInt();
		System.out.println("Enter the num2 -> ");
		int q = in.nextInt();
		int r = p/q;
		System.out.println("The division is -> "+r);
	}
	public static void mod()
	{
		System.out.println("Enter the num1 -> ");
		int u = in.nextInt();
		System.out.println("Enter the num2 -> ");
		int v = in.nextInt();
		int w = u%v;
		System.out.println("THe remainder is -> "+w);
	}
	public static void main(String[] args) {
		while(true)
		{
			System.out.println("Enter The Option -> ");
			int option = in.nextInt();
			System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Mod\n6.Exit");
			switch(option)
			{
			case 1:
				add();
				break;
			case 2:
				sub();
				break;
			case 3:
				mul();
				break;
			case 4:
				div();
				break;
			case 5:
				mod();
				break;
			case 6:
				System.exit(5);
			default :
				System.out.println("Enter valid option(1/2/3/4/5/6)");
			}
		}
	}
}
