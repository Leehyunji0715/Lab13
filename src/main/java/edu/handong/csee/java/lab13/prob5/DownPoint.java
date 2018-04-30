package edu.handong.csee.java.lab13.prob5;

public class DownPoint extends Printer{//public modifier class named DownPoint and inherits Printer class
	private int mX, mY;//call private modifier integer named mX and mY
	public DownPoint(int x, int y) {//call constructer which gets integer x and y
		this.mX = x;//input x to instance value mX
		this.mY = y;//input y to instance value mY
	}
	public String toString() {//public modifier method named toString which returns String
		return "x: "+mX+" y : " +mY;//return "x: ,y :"
	}
}
