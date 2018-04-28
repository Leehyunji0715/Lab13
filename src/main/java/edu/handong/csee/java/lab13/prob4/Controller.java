package edu.handong.csee.java.lab13.prob4;
import java.util.Scanner;
public class Controller {
	
	public static void main(String[] args) {
		Cat pet1 = new Cat();
		Dog pet2 = new Dog();
		Scanner input = new Scanner(System.in);
		Master master = new Master();
		System.out.print("Enter the cat name and dog name : ");
		pet1.mName = input.next();
		pet2.mName = input.next();
		pet1.petStatus();
		master.feed(pet1);
		pet2.petStatus();
		master.feed(pet2);

	}

}
