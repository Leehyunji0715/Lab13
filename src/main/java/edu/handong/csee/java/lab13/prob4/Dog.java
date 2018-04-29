package edu.handong.csee.java.lab13.prob4;

public class Dog extends Animal implements Pet{//public modifier named Dog, inherits Animal and implements Pet interface
	

	@Override
	public void petStatus() {//public modifier method named petStatus and returns nothing(super : Animal)
		System.out.println("Name : "+super.mName);//print out name
	}

	@Override
	public String food() {//public modifier method named food and returns String
		return "(Dog!) Sausage!";//return String "(Dog!) Sausage!"
		
	}

}
