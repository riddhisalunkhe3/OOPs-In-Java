package com.constructorPracticals;

public class Cat {
	String name;
	int age;
	Cat()
	{
		name = "Unknown";
		age = 0;
		System.out.println("Name of the cat -> "+name);
		System.out.println("Age -> "+age);
	}
	public static void main(String[] args) {
		Cat c1 = new Cat();
	}
}
