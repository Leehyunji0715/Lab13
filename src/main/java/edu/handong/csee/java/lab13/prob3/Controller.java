package edu.handong.csee.java.lab13.prob3;

public class Controller {
	public static void main(String[] args) {
		ShapeInfo shape1 = new Circle();
		ShapeInfo shape2 = new Rectangle();
		shape1.askInfoAndCalculate();
		shape1.display();
		shape2.askInfoAndCalculate();
		shape2.display();
	}
}
