package edu.handong.csee.java.lab13.prob5;

public class DownPoint extends Printer{
	private int mX, mY;
	public DownPoint(int x, int y) {
		this.mX = x;
		this.mY = y;
	}
	public String toString() {
		return "x: "+mX+" y : " +mY;
	}
}
