package com.interfacePractice;

interface A {
	//Empty interface is known as marker interface.Ex - Serializable interface and Cloneable interface.
	// interface is contract between customer and service provider.
	// In interface by default all the methods are public and abstract
	// If we dont write public and abstract in front of method then it is by default public and abstract in interface.
	// If we declare any variable in interface by default they will be public, final, static.
	// since java 1.8 we can write default and static methods in interface.
	//since java 1.9 we can write private methods in interface.
	//by using interface we can achieve multiple inheritance.
	//class extends class
	//class implements interface
	//interface extends interface
	//one interface can inherit another interface.
	//one class can implement more than one interface.
	//one interface can extend more than one interface.
	public void m1();
}
