package edu.handong.csee.java.lab13.prob2;

public class Science extends Book {
	String publisher;
	
	public Science(String name,String publisher) {
		super(name);
		this.publisher = publisher;
	}
	public void printStatus() {
		super.kind = "Science";
		super.printStatus();
		System.out.println("	Publisher : "+publisher);
	}
}
