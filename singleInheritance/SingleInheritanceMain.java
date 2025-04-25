package com.singleInheritance;

import java.util.Scanner;

public class SingleInheritanceMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		Punch punch = new Punch();
		punch.acceptVehical(in.next(),in.next());
		punch.acceptData(in.nextInt(),in.next());
		punch.showData();
	}
}
