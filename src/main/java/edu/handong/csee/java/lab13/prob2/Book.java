package edu.handong.csee.java.lab13.prob2;

public class Book {//public modifier class named Book
	static int id=1;//call static integer named id
	String bookName;//call String class type named bookName
	String kind = "Book";//call String class type and input "Book"
	
	public Book(String name) {//call constructer and get name 
		this.bookName = name;//input delivered name value into present instance 'bookName'
	}
	public void printStatus() {//call public modifier method named printStatus
		System.out.println("<<"+kind+">>");//print out kind of book
		System.out.println("	Id : "+id++);//print out id
		System.out.println("	Name : " + bookName);//print out bookName
	}
	
}
