package com.hirarchicalInheritance;

import java.util.Scanner;

public class HirarchicalInheritanceMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PetAnimal pet = new PetAnimal();
		pet.animalName = in.next();
		pet.eat();
		pet.run();
		pet.sleep();
		WildAnimal wild = new WildAnimal();
		wild.animalName = in.next();
		wild.eat();
		wild.run();
		wild.sleep();
	}
}
