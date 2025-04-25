package com.logical;

public class PrimeNUm {
	public static void main(String[] args) {
		//123 to 421
		int count = 0;
		for(int k = 123;k<=421;k++)
		{
			int num = k;
			for(int i = 1;i<=k;i++)
			{
				if(num%i == 0)
				{
					count++;
				}
			}
		}
		if(count == 2)
		{
			System.out.println(count);
		}
	}
}
