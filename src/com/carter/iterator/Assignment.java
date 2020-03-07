package com.carter.iterator;

// an element of the iterator 
public class Assignment {

	private String course;
	private int asnNum;
	
	public Assignment(String c, int i) {
		this.course = c;
		this.asnNum = i;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getAsnNum() {
		return asnNum;
	}
	public void setAsnNum(int asnNum) {
		this.asnNum = asnNum;
	}
	
}
