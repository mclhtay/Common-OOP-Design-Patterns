package com.carter.composite;

//this is a leaf
public class ADC implements Champion{
	public String name;
	public ADC(String n) {
		this.name = n;
	}
	@Override
	public void showChamp() {
		System.out.println(name);
	}

}
