package com.constructorPracticals;

import java.util.Scanner;

public class Student {
	//Student s1 = new Student();
	int studId;
	String studName;
	long studMoNo;
	String studAdd;
	public Student()
	{
		
	}
	public Student(int id, String name, long MoNo, String add)
	{
		this.studId = id;
		this.studName = name;
		this.studMoNo = MoNo;
		this.studAdd = add;
	}
	public void setstudId(int id)
	{
		this.studId = id;
	}
	public void setStudName(String name)
	{
		this.studName = name;
	}
	public void setstudMoNo(long MoNo)
	{
		this.studMoNo = MoNo;
	}
	public void setstudAdd(String Add)
	{
		this.studAdd = Add;
	}
	public int getId()
	{
		return studId;
	}
	public String getstudName()
	{
		return studName;
	}
	public long getstudMoNo()
	{
		return studMoNo;
	}
	public String getStudAdd()
	{
		return studAdd;
	}
	public void acceptData()
	{
		Scanner in = new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("Enter the Id -> ");
		s1.setstudId(in.nextInt());
		System.out.println("Enter the Name -> ");
		s1.setStudName(in.next());
		System.out.println("Enter the MoNo -> ");
		s1.setstudMoNo(in.nextLong());
		System.out.println("Enter the add -> ");
		s1.setstudAdd(in.next());
	}
	public void showData()
	{
		Student s1 = new Student();
		System.out.println(s1.getId());
		System.out.println(s1.getstudName());
		System.out.println(s1.getstudMoNo());
		System.out.println(s1.getStudAdd());
	}
}
