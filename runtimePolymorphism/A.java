package com.runtimePolymorphism;

public class A {
	 void m1()
	{
		System.out.println("m1 from A");
	}
	protected void m2()
	{
		System.out.println("m2 from A");
	}
	protected void m3()
	{
		System.out.println("m3 from A");
	}
	public Object dd()
	{
		return new Object();
	}
}
