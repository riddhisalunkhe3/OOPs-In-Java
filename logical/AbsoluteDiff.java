package com.logical;

import java.util.Scanner;

public class AbsoluteDiff {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the num -> ");
		int num = in.nextInt();
		int n = num;
		int rev = 0;
		int rem = 0;
		while(num > 0)
		{
			rem = num%10;
			rev = (rev*10)+rem;
			num = num/10;
		}
		int absDiff = rev - n;
		System.out.println("The Absolute diff is -> "+absDiff);
	}
}
