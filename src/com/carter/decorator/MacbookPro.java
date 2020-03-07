package com.carter.decorator;
//concrete implementation of macbook
public class MacbookPro extends Macbook{

	public MacbookPro() {
		name = "Macbook Pro";
	}
	
	@Override
	public int getTotalCost() {

		return 2300;
	}

}
