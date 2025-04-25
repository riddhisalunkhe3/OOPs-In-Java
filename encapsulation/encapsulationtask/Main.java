package com.encapsulationtask;

public class Main {
	public static void main(String[] args) {
		Bottle b1 = new Bottle();
		b1.setHeight(24);
		b1.setWidth(12);
		b1.setShape("Cylindrical");
		b1.setColour("Colourless");
		b1.view();
		System.out.println("---------------");
		b1.setWidth(4);
		b1.view();
		System.out.println("----------");
		Bottle b2 = new Bottle();
		b2.setHeight(34);
		b2.setWidth(18);
		b2.setShape("Square");
		b2.setColour("Transparent");
		b2.getColour();
		b2.view();
		b2.toString();	}
}
