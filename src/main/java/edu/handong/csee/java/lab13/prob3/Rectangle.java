package edu.handong.csee.java.lab13.prob3;
import java.util.Scanner;//import Scanner package 
public class Rectangle extends ShapeInfo {//public modifier class named Rectangle and it inherits ShapeInfo
	Scanner input = new Scanner(System.in);//instantiate Scanner class named input and get value from Standard input device
	double mWidth, mHeight;//call instance variable named mWidth and mHeight
	@Override
	double area() {//call method named area and returns double value
		return mWidth*mHeight;//return rectangle's area
	}

	@Override
	double perimeter() {//call method named perimeter and returns double value
		return 2*(mHeight+mWidth);//return rectangle's perimeter
	}
	
	void askInfoAndCalculate() {//method which returns nothing and named as askInfoAndCalculate
		System.out.println("Enter width and height : ");//print out to input width and height of rectangle
		mWidth = input.nextDouble();//input double value to mWidth 
		mHeight = input.nextDouble();//input double value to mHeight
		super.mPerimeter = perimeter();//call perimeter method and input value to super class' instance 'mPerimeter'
		super.mArea = area();//call area method and input value to super class' instance 'mArea'
	}
}
