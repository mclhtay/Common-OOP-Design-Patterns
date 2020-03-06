package com.carter.composite;

//this is another leaf
public class Support implements Champion{
	public String name;
	public Support(String n) {
		this.name = n;
	}
	@Override
	public void showChamp() {
		System.out.println(name);
		
	}

}
