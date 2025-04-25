package com.logical;

import java.util.Scanner;

public class SpyNum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number -> ");
		int num = in.nextInt();
		int n = num;
		int sum = 0;
		int product = 1;
		int rem = 0;
		while(num > 0)
		{
			rem = num % 10;
			sum = sum + rem;
			product = product * rem;
			num = num / 10;
		}
		if(sum == product )
		{
			System.out.println("The "+n+" is spy number.");
		}
		else
		{
			System.out.println("The "+n+" is not spy number.");
		}
	}
}
