package edu.handong.csee.java.lab13.prob2;

public class History extends Book {
	String author;

	public History(String name, String author) {
		super(name);
		super.kind = "History";
		this.author = author;
	}
	public void printStatus() {
		super.printStatus();
		System.out.println("	Author : "+author);
	}
}
