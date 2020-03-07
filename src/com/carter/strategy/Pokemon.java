package com.carter.strategy;

//using pokemon to demonstrate strategy design pattern

// every pokemon has default 2 moves and as they level up, they learn moves 3 and 4, which are interchangeable 
public class Pokemon {
	SuperMove supermove;
	SuperSupportMove supersupportmove;
	
	public Pokemon(SuperMove sm, SuperSupportMove ssm) {
		supermove = sm;
		supersupportmove = ssm;
	}
	
	public void defaultMove() {
		System.out.println("Used quick attack");
	}
	public void defaultSupportMove() {
		System.out.println("Used tail whip!");
	}
	public void superMove() {
		supermove.useMove();
	}
	public void superSupportMove() {
		supersupportmove.useMove();
	}
	
	public void setSuperMove(SuperMove sm) {
		this.supermove = sm;
	}
	public void setSuperSupportMove(SuperSupportMove ssm) {
		this.supersupportmove = ssm;
	}
}
