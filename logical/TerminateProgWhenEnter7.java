package com.logical;

import java.util.Scanner;

public class TerminateProgWhenEnter7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the num -> ");
			int num = in.nextInt();
			if(num == 7)
			{
				System.exit(0);
			}
		}
	}
}
