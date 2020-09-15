package com.cs122.classlabs.Chapter10;

public class OverAndOut extends Over{
	public void printMe() {
		System.out.println("Overriding");
	}
//	overloading addMe method
//	different types or number of parameter
	public void addMe(int a,int b) {
		System.out.println(a+b);
	}
	public void addMe(String a,String b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		OverAndOut oneObject = new OverAndOut();
		oneObject.addMe(3,3);
		oneObject.addMe("Hello", "World");
		
	}
}
