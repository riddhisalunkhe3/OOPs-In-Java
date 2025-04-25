package com.constructorPracticals;

import java.util.Scanner;

public class Dog {
	String name;
	String colour;
	Dog(String name, String colour)
	{
		name = name;
		colour = colour;
		System.out.println("Name of the Dog ->"+name);
		System.out.println("Colour of the dog -> "+colour);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Dog d1 = new Dog(in.next(), in.next());
	}
}
