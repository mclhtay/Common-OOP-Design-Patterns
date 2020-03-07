package com.carter.template;

public class SeniorDeveloper extends SoftwareDeveloper{

	public SeniorDeveloper(int id, String jt) {
		super(id, jt);
	}

	public void getPaid() {
		System.out.println("Senior Developers get paid: $"+120000);
	}
}
