package com.cs122.class2;

public class Vehicles {
	//	
	public String typeOfCar;
	public final int GEARS = 8;
	public int yearMake;
	public Vehicles(String typeOfCar,int yearMake) {
		this.typeOfCar = typeOfCar;
		this.yearMake = yearMake;
	}
	// name of variables
	//camelCasing
	// getDetails <--- this format
	
	//snake casing
	// get_details
//	public <return_type> getDetails() {
//		
//	}
	
	public static void getDetails(String randomThing) {
		System.out.println("Vehicle "+ randomThing );
	}
	
	public void printDetails() {
		System.out.println(this.typeOfCar);
	}
}
