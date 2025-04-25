package com.runtimePolymorphism;

public class B extends A{
	public void m1()
	{
		System.out.println("m1 from B");
	}
	protected void m2()
	{
		System.out.println("m2 from B");
	}
	public void m3()
	{
		System.out.println("m3 from B");
	}
	public void m4()
	{
		System.out.println("m4 from B");
	}
	public String dd()//we can change the return type: applicable only for refernce datatype not for primitive datatype
	{
		return new String();
	}
	public static void main(String[] args) {
		new B().m4();//we can create object without storing it in reference variable, it is known as annonymous object.
		A a = new B();//known as dynamic dispatch or hybrid object: where parent class reference variable can hold the child class object.
		a.m1();
		a.m2();
		System.out.println("===========");
		B b = new B();
		b.m1();
		b.m2();
		b.m3();
	}
}
