package edu.handong.csee.java.lab13.prob3;
import java.util.Scanner;
public class Rectangle extends ShapeInfo {
	Scanner input = new Scanner(System.in);
	double mWidth, mHeight;
	@Override
	double area() {
		return mWidth*mHeight;
	}

	@Override
	double perimeter() {
		return mWidth/2;
	}
	
	void askInfoAndCalculate() {
		System.out.println("Enter width and height : ");
		mWidth = input.nextDouble();
		mHeight = input.nextDouble();
		super.mPerimeter = perimeter();
		super.mArea = area();
	}
}
