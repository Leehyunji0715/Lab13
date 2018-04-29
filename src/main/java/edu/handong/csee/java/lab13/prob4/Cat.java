package edu.handong.csee.java.lab13.prob4;

public class Cat extends Animal implements Pet{//public modifier named Cat, inherits Animal and implements Pet interface
	
	public String food(){//public modifier method named food and returns String
		return "(Cat!) Fish";//return String "(Cat!) Fish"
	}
	
	@Override
	public void petStatus() {//public modifier method named petStatus and returns nothing(super : Animal)
		System.out.println("Name : "+super.mName);//print out name
	}


}
