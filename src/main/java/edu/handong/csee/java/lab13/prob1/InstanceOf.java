package edu.handong.csee.java.lab13.prob1;

public class InstanceOf{
		public void WhatFriend(Friend f) {
			if(f instanceof SchoolFriend) {
				SchoolFriend schoolFriend = (SchoolFriend)f;
				schoolFriend.WhatFriend();
			}
			else if(f instanceof ClassFriend) {
				ClassFriend classFriend = (ClassFriend)f;
				classFriend.WhatFriend();
			}
			else {
				f.WhatFriend();
			}
		}
}
