package com.carter.visitor;

//a concrete implementation of visitor
public class GirlFriend implements Visitor {


	@Override
	public int visit(LV lv) {
		System.out.println("Purchased: "+lv.getItem()+" and it costed $"+lv.getPrice());
		return lv.getPrice();
	}

	@Override
	public int visit(Chanel chanel) {
		System.out.println("Purchased: "+chanel.getBag()+" and it costed $"+chanel.getPrice());
		return chanel.getPrice();
	}
}
