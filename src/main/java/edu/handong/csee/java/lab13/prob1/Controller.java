package edu.handong.csee.java.lab13.prob1;

public class Controller {//public modifier class named Controller
	public static void main(String[] args) {//public modifier main method
		InstanceOf inst = new InstanceOf();//instantiate InstanceOf class named inst
		Friend friend1 = new ClassFriend();//instantiate ClassFriend class named friend1 and inherits Friend class
		Friend friend2 = new SchoolFriend();//instantiate SchoolFriend class named friend2 and inherits Friend class
		Friend friend3 = new Friend();//instantiate Friend class named friend3
		inst.whatFriend(friend1);//call 'whatFriend'method delivering friend1
		inst.whatFriend(friend2);//call 'whatFriend'method delivering friend2
		inst.whatFriend(friend3);//call 'whatFriend'method delivering friend3
		
	}

}
