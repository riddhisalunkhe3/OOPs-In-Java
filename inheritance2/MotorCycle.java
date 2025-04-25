package com.inheritance2;

import java.util.Scanner;

import com.inheritance1.Vehicle;

public class MotorCycle {
	String bikeNo;
	String bikeName;
	int mileage;
	public String getbikeNo() {
		return bikeNo;
	}
	public void setbikeNo(String bikeNo) {
		this.bikeNo = bikeNo;
	}
	public String getbikeName() {
		return bikeName;
	}
	public void setbikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public MotorCycle(String bikeNo, String bikeName, int mileage) {
		this.bikeNo = bikeNo;
		this.bikeName = bikeName;
		this.mileage = mileage;
	}
	public MotorCycle() {
		
	}
	public void acceptData()
	{
		Scanner in = new Scanner(System.in);
		MotorCycle m1 = new MotorCycle();
		m1.setbikeNo(in.next());
		m1.setbikeName(in.next());
		m1.setMileage(in.nextInt());
	}
	public void showMotorCycle()
	{
		System.out.println("Bike No. -> "+getbikeNo());
		System.out.println("Bike Name -> "+getbikeName());
		System.out.println("Bike mileage -> "+getMileage());
	}
}
