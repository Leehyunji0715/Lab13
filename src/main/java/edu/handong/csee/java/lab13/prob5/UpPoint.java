package edu.handong.csee.java.lab13.prob5;

public class UpPoint extends Printer {
	int mX, mY;
	public UpPoint(int x, int y) {
		this.mX = x;
		this.mY = y;
	}
	public String toString() {
		return "X: "+mX+" Y : " +mY;
	}
}