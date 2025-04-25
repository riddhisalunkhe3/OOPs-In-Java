package com.logical;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number -> ");
		int num = in.nextInt();//4137
		int n = num;
		int rem = 0;
		int fact = 1;
		while(num > 0)
		{
			rem = num%10;
			for(int i = rem;i>1;i--)
			{
				fact = fact *i;
			}
			System.out.println("the factorial of "+rem+" is "+fact);
			num = num/10;
			fact = 1;
		}
	}
}
