package edu.handong.csee.java.lab13.prob2;

public class Controller {

	public static void main(String[] args) {
		Book book1 = new Book("Simple book");
		Book book2 = new Science("Hello physics!","Science world");
		Book book3 = new History("What is history?", "E.H.Carr");
		Book book4 = new History("The South Korea", "Judis");
		book1.printStatus();
		book2.printStatus();
		book3.printStatus();
		book4.printStatus();
	}

}
