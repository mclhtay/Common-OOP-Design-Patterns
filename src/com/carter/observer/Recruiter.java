package com.carter.observer;


//this is another concrete observer
public class Recruiter implements Employer {

	@Override
	public void getNotification(String grad) {
		System.out.println("Recruiter notified about the availability of "+grad);

	}

}
