package com.carter.observer;

//this is an observer

public class HeadHunter implements Employer {

	@Override
	public void getNotification(String s) {
		System.out.println("Headhunter notified about the availablity of : "+s);

	}

}
