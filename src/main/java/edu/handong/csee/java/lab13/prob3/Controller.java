package edu.handong.csee.java.lab13.prob3;

public class Controller {//public modifier class named Controller
	public static void main(String[] args) {//main method
		ShapeInfo shape1 = new Circle();//instantiate Circle class inherited ShapeInfo class named shape1
		ShapeInfo shape2 = new Rectangle();//instantiate Rectangle class inherited ShapeInfo class named shape2
		shape1.askInfoAndCalculate();//call shape1's askInfoAndCalculate method
		shape1.display();//call shape1's display method
		shape2.askInfoAndCalculate();//call shape2's askInfoAndCalculate method
		shape2.display();//call shape2's display method
	}
}
