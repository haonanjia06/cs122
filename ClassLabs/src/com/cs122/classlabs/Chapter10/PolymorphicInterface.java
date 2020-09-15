package com.cs122.classlabs.Chapter10;

public class PolymorphicInterface {
	public static void main(String[] args) {
		Speaker guest = new Philosopher();
		guest.speak();// polymorphic
		((Philosopher) guest).pointificate();
		guest = new Dog();
		guest.speak();
		Philosopher guest2 = new Philosopher();
		guest2.pointificate();
		guest = guest2;
		guest2.pointificate();
		// guest2 = guest;
	}
}



