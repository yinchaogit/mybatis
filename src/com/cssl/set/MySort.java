package com.cssl.set;

import java.util.Comparator;

/**
 * 客户化排序
 * @author TYM
 *
 */
public class MySort implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		//id降序
		return o1.getSid() - o2.getSid();
	}

}
