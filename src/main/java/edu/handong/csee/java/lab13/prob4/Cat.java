package edu.handong.csee.java.lab13.prob4;

public class Cat extends Animal implements Pet{
	
	public String food(){
		return "(Cat!) Fish";
	}
	
	@Override
	public void petStatus() {
		System.out.println("Name : "+super.mName);
	}


}
