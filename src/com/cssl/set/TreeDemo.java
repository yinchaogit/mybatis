package com.cssl.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeDemo {

	public static void main(String[] args) {

		//唯一，存储无序
		Set<String> set = new TreeSet<>();
		
		set.add("yyy");
		set.add("ddd");
		set.add("abc");
		set.add("bbb");
		set.add("eee");
		
		System.out.println("abc".compareTo("aaa"));
		System.out.println(set.size());
	
		//方法调用
		set.forEach(System.out::println);
		
		System.out.println("===============");
		
		//Set<Student> stus = new TreeSet<Student>((o1, o2) -> {return o2.getSid() - o1.getSid();});
		Set<Student> stus = new TreeSet<Student>(new MySort2());
		
		Student s1 = new Student(1,"张三",18);
		Student s2 = new Student(2,"李四",16);
		Student s3 = new Student(3,"王五",19);
		Student s4 = new Student(4,"赵六",15);
		Student s5 = new Student(5,"罗总",20);
	
		
		stus.add(s4);
		stus.add(s2);
		stus.add(s1);
		stus.add(s3);
		stus.add(s5);
		System.out.println(stus.size());
			
		stus.forEach(t -> System.out.println(t));
		
		System.out.println("===============");
		
		stus.forEach(System.out::println);
	}

}
