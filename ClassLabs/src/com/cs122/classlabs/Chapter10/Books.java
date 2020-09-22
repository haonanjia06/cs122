package com.cs122.classlabs.Chapter10;

public class Books implements Comparable<Books>{
	public int id;
	public String name;
	
	public Books(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int compareTo(Books toCompare) {
		if(toCompare.id == this.id)
			return 0;
		if(toCompare.id < this.id)
			return 1;
		else
			return -1;			
	}
	
	public boolean equals(Object other) {
		return ((Books)other).id == this.id && ((Books)other).name==this.name;
	}
	
	public String toString() {
		return id + " Title:" + name;
	}
	
}
