package com.carter.state;
//concrete implementation of the state
public class AmberAlert implements GovAlertState{

	@Override
	public void alert() {
		System.out.println("Sending out Amber Alert on Child Abduction");
	}

}
