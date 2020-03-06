package com.carter.chain;

public class EURHandler implements Handler {
	private Handler h;
	@Override
	public void setSuccessor(Handler h) {
		// TODO Auto-generated method stub
		this.h = h;
	}

	@Override
	public void handle(Currency money) {
		// TODO Auto-generated method stub
		if(money.getType().contentEquals("EUR")) {
			System.out.println("Handled");
			return;
		}
		System.out.println("Enable to handle request");
	}

}
