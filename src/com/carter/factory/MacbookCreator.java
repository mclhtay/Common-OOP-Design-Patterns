package com.carter.factory;

public class MacbookCreator implements MagicalComputerFactory {

	@Override
	public Computer produce() {
		return new Macbook();

	}

}
