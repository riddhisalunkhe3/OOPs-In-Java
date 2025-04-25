package com.singleInheritance;

public class Vehical {
	String vehicalNo;
	String vehicalName;
	public void acceptVehical(String vehicalNo,String vehicalName)
	{
		this.vehicalNo = vehicalNo;
		this.vehicalName = vehicalName;
	}
	public void showVehical()
	{
		System.out.println("Vehical no. -> "+vehicalNo);
		System.out.println("Vehical Name -> "+vehicalName);
	}
}
