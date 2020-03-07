package com.carter.singleton;

public class Client {

	public static void main(String [] args) {
		Star star = Star.getStar();
		if(star != null) {
			System.out.println("A star appeared in the solar system!");
		}
	}
}
