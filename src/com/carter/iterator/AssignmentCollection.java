package com.carter.iterator;

import java.util.ArrayList;

//concrete collection / aggregate
public class AssignmentCollection implements Collection {

	ArrayList<Assignment> asn = new ArrayList<Assignment>();
	
	public AssignmentCollection() {
		asn.add(new Assignment("CS 2212", 1));
		asn.add(new Assignment("Stats 2244", 9));
		asn.add(new Assignment("CS 2212", 2));
	}
	
	@Override
	public Iterator createIterator() {
		
		return new AssignmentIterator(asn);
	}

}
