package edu.handong.csee.java.lab13.prob5;

public class UpPoint extends Printer {//public modifier class named UpPoint and inherits Printer class
	int mX, mY;//call instance integer variable named mX and mY
	public UpPoint(int x, int y) {//call public modifier constructer which gets integer x and y 
		this.mX = x;//input value x to instance variable mX
		this.mY = y;//input value y to instance variable mY
	}
	public String toString() {//public modifier method named toString and returns String
		return "X: "+mX+" Y : " +mY;// return "X: / Y : "
	}
}
