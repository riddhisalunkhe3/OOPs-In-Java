package com.compiletimepolymorphism;

public class C {
	public static void main(int a) {
		System.out.println("main method with int parameter");
	}
	public static void main(boolean a) {
		System.out.println("Main method with boolean parameter");
	}
	public static void main(String[] args) {
		System.out.println("Main method with String Array");
		C c1 = new C();
		c1.main(true);
		c1.main(23);
	}
}
