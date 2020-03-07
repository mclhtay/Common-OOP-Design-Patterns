package com.carter.template;

public class JuniorDeveloper extends SoftwareDeveloper{

	public JuniorDeveloper(int id, String jt) {
		super(id, jt);
	}

	public void interview() {
		System.out.println("Junior Developer is not allowed to interview other people");
	}
}
