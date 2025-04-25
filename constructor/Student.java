package com.constructor;

public class Student {
	//constructor is used to initialize instance(Object) and instance variables
	//constructor does not have return type
	//constructor has same name as class name
	//all the access modifiers are applicable to constructor 
	//constructor is automatically gets called when instance of class is created
	//We cannot declare constructor as static, final, abstract.
	//we can call another method inside constructor.
	//we can overload constructor but cannot override the constructor
	//if we don't write constructor in class , compiler will generate default constructor and it will generate it in byte code.
	//only two access modifiers are applicable to default constructor(default,public).
	//only one object can call one constructor
	//Types of constructor ->
	//1.default constructor.
	//2.parametrized constructor.
	//3.Non-Parametrized constructor.
	//private constructor is used to create singleton class
	//singleton class means you can create only one object of that class is called singleton class.
	int a;
	double b;
	Student()
	{
		a = 4;
		b = 7.90;
		System.out.println(a);
		System.out.println(b);
	}
	public Student(int a, double b)
	{
		this.a = a;
		this.b = b;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(45, 89.00);
	}
}
