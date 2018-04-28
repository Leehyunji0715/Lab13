package edu.handong.csee.java.lab13.prob3;

public abstract class ShapeInfo {
	double mArea,mPerimeter;
	abstract double area();
	abstract double perimeter();
	public void display() {
		System.out.println("Area : "+mArea);
		System.out.println("Perimeter : "+mPerimeter);
	}
}
