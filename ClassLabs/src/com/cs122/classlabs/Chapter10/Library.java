package com.cs122.classlabs.Chapter10;

public class Library {
	public static void main(String[] args) {
		//sorting
		Books[] bookList = new Books[8];
		
		for(int i=0;i<8;i++) {
			bookList[i] = new Books(8-i,"Hello World Part");
			System.out.println(bookList[i]);
		}
		System.out.println("++++++++++++++++++");
		Sorting<Books> sortedBooks = new Sorting<Books>();
		sortedBooks.selectionSort(bookList);
		
		for(Books book: bookList)
			System.out.println(book);
		
		System.out.println("++++++++++++++++++");
		Searching<Books> bookFound = new Searching<Books>();
		
		Books toFind = new Books(1,"");
		Books foundBook = (Books) bookFound.binarySearch(bookList, toFind);
		System.out.println(foundBook);
		
		
		
	}
}
