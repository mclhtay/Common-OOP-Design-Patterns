package com.carter.facade;

public class HotelManager {

	public veganMenu vegM() {
		VeganRes vr = new VeganRes();
		veganMenu vm =(veganMenu) vr.getMenu();
		return vm;
	}
	
	public NonVeganMenu nonVegM() {
		NonVeganRes nvr = new NonVeganRes();
		NonVeganMenu nvm = (NonVeganMenu)nvr.getMenu();
		return nvm;
	}
	
	public meatMenu meatM() {
		MeatRes mr = new MeatRes();
		meatMenu mm = (meatMenu) mr.getMenu();
		return mm;
	}

}
