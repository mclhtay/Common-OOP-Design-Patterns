package com.carter.iterator;

import java.util.ArrayList;

public class AssignmentIterator implements Iterator {

	ArrayList<Assignment> asnList;
	private int counter = 0;
	public AssignmentIterator(ArrayList<Assignment> list) {
		asnList = list;
	}
	
	@Override
	public Assignment first() {
		return asnList.get(0);
	}

	@Override
	public boolean hasNext() {
		return (asnList.size() > counter);
	}


	public Assignment next() {
		if(hasNext()) {
			return asnList.get(counter++);
		}
		return null;
	}

	
}
