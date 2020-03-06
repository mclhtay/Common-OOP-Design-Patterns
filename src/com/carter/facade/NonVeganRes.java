package com.carter.facade;

public class NonVeganRes implements Hotel{

	@Override
	public Menus getMenu() {
		NonVeganMenu nv = new NonVeganMenu();
		return nv.getMenu();
	}

}
