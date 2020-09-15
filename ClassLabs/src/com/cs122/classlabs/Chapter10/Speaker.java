package com.cs122.classlabs.Chapter10;

public interface Speaker {
	public abstract void speak();
//	is same as public void speak();

	public void announce(String str);
	default void print() {
		System.out.println("I am a default method");
	}
	public static void printMe() {
		System.out.println("I am a static method");
	}
	
}
