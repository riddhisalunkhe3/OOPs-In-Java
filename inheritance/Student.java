package com.inheritance;

public class Student extends Person{
	int studAge;
	String studDept;
	String studCourse;
	public void accept(int studAge, String studDept, String studCourse)
	{
		this.studAge = studAge;
		this.studDept = studDept;
		this.studCourse = studCourse;
	}
	public void showStudent()
	{
		showPerson();
		System.out.println("Student Age -> "+studAge);
		System.out.println("Student department -> "+studDept);
		System.out.println("Student Course -> "+studCourse);
	}
}
