package com.carter.template;

import java.util.Random;

public class Client {

	public static void main(String [] args) {
		Random r = new Random();
		SoftwareDeveloper John = new JuniorDeveloper(r.nextInt()*500, "Junior Front End Dev");
		SoftwareDeveloper Joe = new SeniorDeveloper(r.nextInt()*500, "Senior Front End Dev");
		
		John.work();
		John.interview();
		John.getPaid();
		Joe.work();
		Joe.interview();
		Joe.getPaid();
	}
}
