package com.carter.factory;

//factory method hides the type of object and the process that is used to create the object
public interface MagicalComputerFactory {
	abstract public Computer produce();
}
