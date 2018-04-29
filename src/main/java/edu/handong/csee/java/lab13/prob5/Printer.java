package edu.handong.csee.java.lab13.prob5;

public class Printer{
	int mX, mY;
	public static void print(Object obj) {
		String str = obj.toString();
		if(obj instanceof CapitalPrint)
				str = str.toUpperCase();
		System.out.println(str);
	}

}
