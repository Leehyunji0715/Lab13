package edu.handong.csee.java.lab13.prob3;
import java.util.Scanner;
public class Circle extends ShapeInfo{
	Scanner input = new Scanner(System.in);
	double mRadius;
	@Override
	double area() {
		return mRadius*mRadius*Math.PI;
	}
	@Override
	double perimeter() {
		return 2*Math.PI*mRadius;
	}

	void askInfoAndCalculate() {
		System.out.println("Enter radius : ");
		mRadius = input.nextDouble();
		super.mPerimeter = perimeter();
		super.mArea = area();
	}

}
