package com.inheritance;

import java.util.Scanner;

public class Person {
    int id;
	String name;
	String add;
	String moNo;
	public void acceptPerson(int id, String name, String add, String moNo)
	{
		this.id = id;
		this.name = name;
		this.add = add;
		this.moNo = moNo;
	}
	public void showPerson()
	{
		System.out.println("Id -> "+id);
		System.out.println("Name -> "+name);
		System.out.println("Address -> "+add);
		System.out.println("Mobile No. -> "+moNo);
	}
}
