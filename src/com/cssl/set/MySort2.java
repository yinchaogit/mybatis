package com.cssl.set;

import java.util.Comparator;

public class MySort2 implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getPid() - o2.getPid();
	}

}
