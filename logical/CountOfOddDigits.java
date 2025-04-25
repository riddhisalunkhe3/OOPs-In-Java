package com.logical;

public class CountOfOddDigits {
	public static void main(String[] args) {
		int num = 129835;
		int n = num;
		int count = 0;
		while(num>0)
		{
			int rem = num%10;
			num = num/10;
			if(rem%2 != 0)
			{
				count++;
			}
		}
		System.out.println("The count of Odd digits in a number -> "+count);
	}
}
