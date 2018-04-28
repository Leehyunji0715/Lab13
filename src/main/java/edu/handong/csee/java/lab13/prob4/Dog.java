package edu.handong.csee.java.lab13.prob4;

public class Dog extends Animal implements Pet{
	

	@Override
	public void petStatus() {
		System.out.println("Name : "+super.mName);
	}

	@Override
	public String food() {
		return "(Dog!) Sausage!";
		
	}

}
