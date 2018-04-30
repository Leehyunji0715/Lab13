package edu.handong.csee.java.lab13.prob3;

public abstract class ShapeInfo {//public modifier abstract class named ShapeInfo
	double mArea,mPerimeter;//call double type instance variable named mArea and mPerimeter
	abstract double area();//call abstract method named area and returns double value
	abstract double perimeter();//call abstract method named perimeter and returns double value
	abstract void askInfoAndCalculate();//call abstract method named askInfoAndCalculate and returns nothing
	public void display() {//public modifier method named display and returns nothing
		System.out.println("Area : "+mArea);//print out area
		System.out.println("Perimeter : "+mPerimeter);//print out perimeter
	}
}
