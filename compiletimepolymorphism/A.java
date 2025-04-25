package com.compiletimepolymorphism;

public class A {
	int id;
	String name;
	int age;
	String add;
	private void acceptData(int id, String name)
	{
		this.id = id;
		this.name = name;
		System.out.println(id);
		System.out.println(name);
		System.out.println("===============");
	}
	final void acceptData(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println("===============");
	}
	static void acceptData(int id, String name, int age, String add)
	{
		id = id;
		name = name;
		age = age;
		add = add;
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(add);
		System.out.println("===============");
	}
	public static void main(String[] args) {
		A a1 = new A();
		a1.acceptData(3, "Riddhi");
		a1.acceptData(3, "Riddhi Salunkhe", 22);
		a1.acceptData(3, "Riddhi Salunkhe", 22, "Karad");
	}
}
