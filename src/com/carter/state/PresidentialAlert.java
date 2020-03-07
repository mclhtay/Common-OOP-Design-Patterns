package com.carter.state;
//concrete implementation of the state
public class PresidentialAlert implements GovAlertState {

	@Override
	public void alert() {
		
		System.out.println("Sending out Presidential Alert");
	}

}
