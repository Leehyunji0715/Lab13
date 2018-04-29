package edu.handong.csee.java.lab13.prob2;

public class Controller {//public modifier class named Controller

	public static void main(String[] args) {//main method
		Book book1 = new Book("Simple book");// instantiate Book class delivering "Simple book"
		Book book2 = new Science("Hello physics!","Science world");// instantiate Science class delivering "Simple book" which inherits Book class
		Book book3 = new History("What is history?", "E.H.Carr");// instantiate History class delivering "What is history?", "E.H.Carr" which inherits Book class
		Book book4 = new History("The South Korea", "Judis");// instantiate History class delivering "The South Korea", "Judis" which inherits Book class
		book1.printStatus();//call book1's printStatus method
		book2.printStatus();//call book2's printStatus method
		book3.printStatus();//call book3's printStatus method
		book4.printStatus();//call book4's printStatus method
	}

}
