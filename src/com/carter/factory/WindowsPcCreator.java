package com.carter.factory;

public class WindowsPcCreator implements MagicalComputerFactory {

	@Override
	public Computer produce() {
		return new WindowsPC();

	}

}
