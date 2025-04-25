package com.compiletimepolymorphism;

public class B {
	int id;
	String name;
	public B()
	{
		System.out.println("No parameters");
		System.out.println("=============");
	}
	public B(int id, String name)
	{
		this.id = id;
		this.name = name;
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) {
		B b = new B();
		B b1 = new B(3,"Riddhi Salunkhe");
	}
}
