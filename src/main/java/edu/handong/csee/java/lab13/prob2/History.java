package edu.handong.csee.java.lab13.prob2;

public class History extends Book {//public modifier class named History and inherits Book class
	String author;//call String class type named author

	public History(String name, String author) {//constructer get String class type name and author
		super(name);//call upper Class constructer and input name String value
		super.kind = "History";//input "History" into super class' instance kind
		this.author = author;// input delivered publisher value into present instance 'author'
	}
	public void printStatus() {//public modifier method named printStatus returns nothing
		super.printStatus();//call super class' printStatus method
		System.out.println("	Author : "+author);//print out author
	}
}
