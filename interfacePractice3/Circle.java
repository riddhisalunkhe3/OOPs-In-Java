package com.interfacePractice3;

public class Circle implements Shape{

	@Override
	public void getArea() {
		double  pie = 3.14;
		double rad = in.nextDouble();
		double area = pie*rad*rad;
		System.out.println("Area of Circle -> "+area);
	}

}
