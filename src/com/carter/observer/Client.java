package com.carter.observer;

public class Client {

	public static void main(String [] args) {
		UnemployedCSGraduates csg = new UnemployedCSGraduates();
		
		HeadHunter joe = new HeadHunter();
		Recruiter facebook = new Recruiter();
		Recruiter google = new Recruiter();
		
		csg.registerObserver(joe);
		csg.registerObserver(facebook);
		csg.registerObserver(google);
		csg.notifyObserver();
		csg.unregisterObserver(google);
		csg.notifyObserver();
	}
}
