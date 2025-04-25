package com.Methods;

import java.util.Scanner;

public class Account {
	static Scanner in = new Scanner(System.in);
	int accNo;
	String username;
	double balance;
	String bankName;
	public void accept()
	{
		System.out.println("Enter the Account No. -> ");
		accNo = in.nextInt();
		System.out.println("Enter the Username - > ");
		username = in.next();
		System.out.println("Enter the balance -> ");
		balance = in.nextDouble();
		String bankName = in.next();
	}
	public void display()
	{
		System.out.println(accNo);
		System.out.println(username);
		System.out.println(balance);
		System.out.println(bankName);
	}
	public double deposite(double amount)
	{
		return balance + amount;
	}
	public double withdraw(double amount)
	{
		if(balance>= amount)
		{
			balance = balance - amount;
		}
		else
		{
			System.out.println("Insufficient Balance...");
		}
		return balance;
	}
	public static void main(String[] args) {
		Account acc = new Account();
		acc.accept();
		acc.display();
		System.out.println(acc.deposite(in.nextDouble()));
		System.out.println(acc.withdraw(in.nextDouble()));
	}
}
