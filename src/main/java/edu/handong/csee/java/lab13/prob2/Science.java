package edu.handong.csee.java.lab13.prob2;

public class Science extends Book {//public modifier class named Science and inherits Book class
	String publisher;//call String class type named publisher
	
	public Science(String name,String publisher) {//constructer get String class type name and publisher
		super(name);//call upper Class constructer and input name String value
		this.publisher = publisher;// input delivered publisher value into present instance 'publisher'
	}
	public void printStatus() {//public modifier named printStatus and returns nothing
		super.kind = "Science";//input super class' kind instance "Science"
		super.printStatus();//call printStatus method
		System.out.println("	Publisher : "+publisher);//print out "Publisher : ~~"
	}
}
