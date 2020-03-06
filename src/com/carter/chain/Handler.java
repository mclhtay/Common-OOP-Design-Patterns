package com.carter.chain;

public interface Handler {
	
	public abstract void setSuccessor(Handler h);
	abstract public void handle(Currency money);
	
}
