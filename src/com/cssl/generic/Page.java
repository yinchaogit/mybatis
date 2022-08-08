package com.cssl.generic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import com.cssl.set.Student;

public class Page<T,E> {

	private int pageIndex;
	private int pageSize;
	
	public List<T> list;
	
	public T getT(T t) {
		return t;
	}
	
	
	public E method(E e) {
		return e;
	}
	
	
	public E method(E e,T t) {
		return e;
	}
	
	public <R> R methodR(R r) {
		return r;
	}
		
	
	public static void main(String[] args) {
		Page<Student,String> page = new Page<>();		
		page.list = new ArrayList<Student>();
		page.getT(new Student());
		
		Page<String,Date> ps = new Page<>();
		ps.list = new Vector<String>();
		ps.getT("");
		
		String s = "";
		String ss = page.method(s);
		
		Date date = new Date();
		Date datee = ps.method(date);
		
		
	}
	
}
