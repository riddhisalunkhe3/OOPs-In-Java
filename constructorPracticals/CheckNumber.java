package com.constructorPracticals;

import java.util.Scanner;

public class CheckNumber {
	static Scanner in = new Scanner(System.in);
	int num;
	public int powerOfNum(int base, int power)
	{
		int p = (int)Math.pow(base, power);
		return p;
	}
	public int countDigit(int num)
	{
		num = num;
		int count = 0;
		while(num>0)
		{
			num = num/10;
			count++;
		}
		System.out.println(count);
		return count;
	}
	public static void main(String[] args) {
		CheckNumber ch = new CheckNumber();
		System.out.println(ch.powerOfNum(in.nextInt(),in.nextInt()));
		ch.countDigit(in.nextInt());
	}
}
