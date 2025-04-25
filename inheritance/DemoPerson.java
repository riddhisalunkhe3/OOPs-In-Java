package com.inheritance;

import java.util.Scanner;

public class DemoPerson {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Person per = new Person();
		per.acceptPerson(in.nextInt(),in.next(),in.next(),in.next());
		per.showPerson();
	}
}
