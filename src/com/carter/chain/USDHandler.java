package com.carter.chain;

public class USDHandler implements Handler{

	private Handler h;
	@Override
	public void setSuccessor(Handler h) {
		this.h = h;
		
	}

	@Override
	public void handle(Currency money) {
		if(money.getType().contentEquals("USD")) {
			System.out.println("Handled");
			return;
		}
		h.handle(money);
		
	}

}
