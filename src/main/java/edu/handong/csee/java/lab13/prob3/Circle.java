package edu.handong.csee.java.lab13.prob3;
import java.util.Scanner;//import Scanner package
public class Circle extends ShapeInfo{//public modifier class named Circle and inherits ShapeInfo
	Scanner input = new Scanner(System.in);//instantiate Scanner class named input and get value from Standard input device
	double mRadius;//call double type instance variable named mRadius
	@Override
	double area() {//method which returns double value named area
		return mRadius*mRadius*Math.PI;//return circle's area
	}
	@Override
	double perimeter() {//method which returns double value named perimeter
		return 2*Math.PI*mRadius;//return circle's perimeter
	}

	void askInfoAndCalculate() {//method which returns nothing and named as askInfoAndCalculate
		System.out.println("Enter radius : ");//print out to enter radius
		mRadius = input.nextDouble();//input double value as radius
		super.mPerimeter = perimeter();//call perimeter method and input value to super class' instance 'mPerimeter'
		super.mArea = area();//call area method and input value to super class' instance 'mArea'
	}

}
