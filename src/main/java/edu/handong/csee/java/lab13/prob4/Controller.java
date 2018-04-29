package edu.handong.csee.java.lab13.prob4;
import java.util.Scanner;//import this to use Scanner class
public class Controller {
	
	public static void main(String[] args) {//call main method
		Cat pet1 = new Cat();// instantiate Cat class named pet1
		Dog pet2 = new Dog();//instantiate Dog class named pet2
		Scanner input = new Scanner(System.in);//instantiate Scanner class named input
		Master master = new Master();//instantiate Master class named master 
		System.out.print("Enter the cat name and dog name : ");//print out to enter cat and dog names
		pet1.mName = input.next();//input pet1's name
		pet2.mName = input.next();//input pet2's name
		pet1.petStatus();//call pet1's petStatus method
		master.feed(pet1);//call feed method delivering pet1 class
		pet2.petStatus();;//call pet2's petStatus method
		master.feed(pet2);//call feed method delivering pet2 class

	}

}
