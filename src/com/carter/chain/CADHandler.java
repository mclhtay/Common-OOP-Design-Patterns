package com.carter.chain;

public class CADHandler implements Handler{
	private Handler h;
	@Override
	public void setSuccessor(Handler h) {
		// TODO Auto-generated method stub
		this.h = h;
	}

	@Override
	public void handle(Currency money) {
		// TODO Auto-generated method stub
		if(money.getType().contentEquals("CAD")) {
			System.out.println("Handled");
			return;
		}
		h.handle(money);
	}

}
