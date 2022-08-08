package com.cssl.generic;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Generic {
	
	public static void method(List<? extends Number> list) {
		
	}
	
	public static void method2(List<? super Number> list) {
		
	}

	public static void main(String[] args) throws Exception {
		//伪泛型
		List list = new ArrayList<Integer>();
		List<String> lo = list;
		lo.add("11");
		System.out.println(lo.get(0));
		
		//反射绕过编译器
		List<Integer> ll = new ArrayList<Integer>();
		Method add = ll.getClass().getMethod("add", Object.class);
		add.invoke(ll, "12");
		System.out.println(ll.get(0));
		
		List<Object> llo = new ArrayList<>();
		
		method2(llo);
		method(ll);
	}

}
