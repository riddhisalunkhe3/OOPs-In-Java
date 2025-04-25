package com.inheritance1;

import java.util.Scanner;

public class Vehicle {
	String vehicleNo;
	String vehicleName;
	int mileage;
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public Vehicle(String vehicleNo, String vehicleName, int mileage) {
		this.vehicleNo = vehicleNo;
		this.vehicleName = vehicleName;
		this.mileage = mileage;
	}
	public Vehicle() {
		
	}
	public void acceptData()
	{
		Scanner in = new Scanner(System.in);
		Vehicle v1 = new Vehicle();
		v1.setVehicleNo(in.next());
		v1.setVehicleName(in.next());
		v1.setMileage(in.nextInt());
	}
	public void showVehicle()
	{
		System.out.println("Vehicle No. -> "+getVehicleNo());
		System.out.println("Vehicle Name -> "+getVehicleName());
		System.out.println("Vehicle mileage -> "+getMileage());
	}
}
