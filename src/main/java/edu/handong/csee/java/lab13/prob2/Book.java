package edu.handong.csee.java.lab13.prob2;

public class Book {
	static int id=1;
	String bookName;
	String kind = "Book";
	
	public Book(String name) {
		this.bookName = name;
	}
	public void printStatus() {
		System.out.println("<<"+kind+">>");
		System.out.println("	Id : "+id++);
		System.out.println("	Name : " + bookName);
	}
	
}
