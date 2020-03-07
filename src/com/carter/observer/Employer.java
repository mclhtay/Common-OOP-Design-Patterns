package com.carter.observer;

//an entirely new interface to promote low coupling between subject and observer

public interface Employer {
	abstract public void getNotification(String grad);
}
