package com.carter.facade;

public class VeganRes implements Hotel {

	@Override
	public Menus getMenu() {
		veganMenu vm = new veganMenu();
		
		return vm.getMenu();
	}

}
