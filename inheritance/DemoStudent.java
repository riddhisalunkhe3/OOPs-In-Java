package com.inheritance;

import java.util.Scanner;

public class DemoStudent {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Student s1 = new Student();
		s1.acceptPerson(in.nextInt(), in.next(), in.next(), in.next());
		s1.accept(in.nextInt(), in.next(), in.next());
		s1.showStudent();
	}
}
