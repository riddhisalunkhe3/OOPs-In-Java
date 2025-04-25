package com.constructorPracticals;

public class DoOperation {
	public static void sumOfDigits(int num)
	{
		int sum = 0;
		int rem = 0;
		while(num>0)
		{
			rem = num%10;
			sum = sum+rem;
			num = num/10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		sumOfDigits(239);
	}
}
