package com.carter.facade;

public class MeatRes implements Hotel{

	@Override
	public Menus getMenu() {
		meatMenu mm = new meatMenu();
		
		return mm;
	}

}
