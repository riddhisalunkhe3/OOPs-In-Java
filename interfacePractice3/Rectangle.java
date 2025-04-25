package com.interfacePractice3;

public class Rectangle implements Shape{

	@Override
	public void getArea() {
		int length = in.nextInt();
		int breadth = in.nextInt();
		int area = length*breadth;
		System.out.println("Area of Rectangle -> "+area);
	}
	
}
