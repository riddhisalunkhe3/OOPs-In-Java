package com.encapsulationtask1;

public class Teacher {
	int teacherId;
	String deptName;
	String teacherName;
	String subName;
	public void setteacherId(int id)
	{
		teacherId = id;
	}
	public void setdeptName(String dept)
	{
		deptName = dept;
	}
	public void setteacherName(String name)
	{
		teacherName = name;
	}
	public void setSub(String sub)
	{
		subName = sub;
	}
	public int getteacherId()
	{
		return teacherId;
	}
	public String getdeptName()
	{
		return deptName;
	}
	public String getteacherName()
	{
		return teacherName;
	}
	public String getsub()
	{
		return  subName;
	}

	public void view()
	{
		System.out.println(teacherId);
		System.out.println(deptName);
		System.out.println(teacherName);
		System.out.println(subName);
	}
}
