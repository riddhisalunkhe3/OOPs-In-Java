package com.multilevelInheritance;

public class MultilevelInheritanceMain {
	public static void main(String[] args) {
		A a1 = new A();
		a1.m3();
		a1.m2();
		B b1 = new B();
		b1.m1();
		b1.m2();
		b1.m3();
		C c1 = new C();
		c1.m1();
		c1.m2();
	}
}
