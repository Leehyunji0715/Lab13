package edu.handong.csee.java.lab13.prob1;

public class InstanceOf{//public modifier class named InstanceOf
		public void whatFriend(Friend f) {// public modifier method named whatFriend, returns nothing and get Friend class(f)
			if(f instanceof SchoolFriend) {//if f is instance of SchoolFriend
				SchoolFriend SchoolFriend = (SchoolFriend)f;//input f changed SchoolFriend class shape into SchoolFriend 
				SchoolFriend.whatFriend();//call SchoolFriend's whatFriend method
			}
			else if(f instanceof ClassFriend) {// if f is instance of ClassFriend
				ClassFriend ClassFriend = (ClassFriend)f;//input f changed ClassFriend class shape into ClassFriend 
				ClassFriend.whatFriend();//call ClassFriend's whatFriend method
			}
			else {//rest condition
				f.whatFriend();//call Friend's class method, whatFriend()
			}
		}
}
