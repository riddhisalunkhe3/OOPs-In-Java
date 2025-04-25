package com.interfacePractice3;

public class Triangle implements Shape{

	@Override
	public void getArea() {
		int base = in.nextInt();
		int height = in.nextInt();
		int area = base*height*1/2;
		System.out.println("Area of Triangle is -> "+ area); 
	}
}
