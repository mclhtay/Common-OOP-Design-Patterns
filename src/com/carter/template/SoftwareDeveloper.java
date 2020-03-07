package com.carter.template;

public class SoftwareDeveloper {

	int employeeID;
	String jobTitle;
	int pay = 50000;
	public SoftwareDeveloper(int id, String jt) {
		this.employeeID = id;
		this.jobTitle = jt;
	}
	
	public void work() {
		System.out.println("Software Developer is coding....");
	}
	
	public void interview() {
		System.out.println(jobTitle+" is interviewing potential new hires");
	}
	
	public void getPaid() {
		System.out.println(jobTitle+" is getting paid "+pay);
	}
}
