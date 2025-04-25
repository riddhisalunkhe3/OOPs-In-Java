package com.singleInheritance;

public class Punch extends Vehical{
	int mileage;
	String maintenancePeriod;
	public void acceptData(int mileage,String maintenancePeriod)
	{
		this.mileage = mileage;
		this.maintenancePeriod = maintenancePeriod;
	}
	public void showData()
	{
		showVehical();
		System.out.println("Mileage ->"+mileage);
		System.out.println("Maintenance period -> "+maintenancePeriod);
	}
}
