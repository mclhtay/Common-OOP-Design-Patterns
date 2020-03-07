package com.carter.singleton;


//context: there can only be 1 star in a solar system!

public class Star {

	private Star() {} 
	
	private static Star star = new Star();
	
	public static Star getStar() {
		if(star == null) {
			star = new Star();
		}
		
		return star;
	}
}
