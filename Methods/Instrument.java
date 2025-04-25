package com.Methods;

import java.util.Scanner;

public class Instrument {
	Scanner in = new Scanner(System.in);
	String name;
	int strings;
	public void accept()
	{
		System.out.println("Enter the name -> ");
		name = in.next();
		System.out.println("Enter the no. of strings -> ");
		strings = in.nextInt();
	}
	public void display()
	{
		System.out.println("Name of the instrument is -> "+name);
		System.out.println("Number of strings are -> "+strings);
	}
	public static void main(String[] args) {
		Instrument i1 = new Instrument();
		Instrument i2 = new Instrument();
		i1.accept();
		i1.display();
	}
}
