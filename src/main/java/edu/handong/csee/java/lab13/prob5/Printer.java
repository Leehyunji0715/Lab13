package edu.handong.csee.java.lab13.prob5;

public class Printer{//public modifier class named Printer
	int mX, mY;//call instance integer variable named mX and mY
	public static void print(Object obj) {//call public modifier and static type method named print, returns nothing and gets Object class
		String str = obj.toString();//call String class type str and return String
		if(obj instanceof CapitalPrint)//if obj is instance of CapitalPrint
				str = str.toUpperCase();// change str into Capital letter
		System.out.println(str);//print out String str
	}

}
