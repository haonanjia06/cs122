package com.cs122.class2;

//

public class HelloWorld {

	public String one = "abc";
	public static String two;

	// static variables
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomInt = (int) Math.random();
		int integerOne = 12;
		String name = "Dhruv";
		System.out.println("Hello WOrld");
		System.out.println("Hello " + name + " your lucky number is " + randomInt);

		if (integerOne > 15) {
//			if the expression is true
			System.out.println("I am true");
		} else {
//			if the expression is false
			System.out.println("I am false");
		}

//		for(initialize;condition to run loop until;increment of loop var)
		for (int i = 0; i < 11; i++) {
			if (i > 15) {
//				if the expression is true
//				System.out.println("I am true");
			} else {
//				if the expression is false
//				System.out.println("I am false");
			}
		}
		/*
		 * while(condition) { // statement would be executed }
		 * 
		 * do{ // statement }while(expression);
		 */
		Vehicles v = new Vehicles("GMC",2020);
		v.printDetails();
	}

}
