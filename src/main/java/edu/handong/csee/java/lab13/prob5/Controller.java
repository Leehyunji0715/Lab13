package edu.handong.csee.java.lab13.prob5;

public class Controller {//public modifier class named Controller

	public static void main(String[] args) {//main method
		UpPoint p1 = new UpPoint(3, 3);//instantiate UpPoint class named p1 and gets 3, 3
		DownPoint p2 = new DownPoint(2, 5);//instantiate DownPoint class named p2 and gets 2, 5
		DownPoint p3 = new DownPoint(4, 7);//instantiate DownPoint class named p3 and gets 4, 7
		UpPoint p4 = new UpPoint(9, 12);//instantiate UpPoint class named p4 and gets 9, 12
		Printer.print(p1);//call Printer's method delivering p1 class
		Printer.print(p2);;//call Printer's method delivering p2 class
		Printer.print(p3);;//call Printer's method delivering p3 class
		Printer.print(p4);;//call Printer's method delivering p4 class
		
	}

}
