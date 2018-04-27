package edu.handong.csee.java.lab13.prob1;

public class Controller {
	public static void main(String[] args) {
		InstanceOf inst = new InstanceOf();
		Friend friend1 = new ClassFriend();
		Friend friend2 = new SchoolFriend();
		Friend friend3 = new Friend();
		inst.WhatFriend(friend1);
		inst.WhatFriend(friend2);
		inst.WhatFriend(friend3);
		
	}

}
