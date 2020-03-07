package com.carter.decorator;

//concrete implementation of macbook
public class MacbookAir extends Macbook{

	//extend relationships: child has access to parent's classes and variables
	public MacbookAir() {
		name = "Macbook Air";
	}
	
	@Override
	public int getTotalCost() {
		
		return 1100;
	}

}
