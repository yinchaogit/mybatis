package com.cssl.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		//唯一，无序
		Set<String> set = new HashSet<>(0);
		System.out.println(new String("aaa") == new String("aaa"));
		set.add(new String("aaa"));
		set.add("ddd");
		set.add("abc");
		set.add("bbb");
		set.add(new String("aaa"));
		
		System.out.println(set.size());
		for (String s : set) {
			System.out.println(s);
		}
		
		System.out.println("===============");
		
		set.forEach(s->{
			//System.out.println(s);
		});
		
		System.out.println("===============");
		//方法调用
		//set.forEach(System.out::println);
		
		System.out.println("===============");
		
		Set<Student> stus = new HashSet<Student>();
		Student s1 = new Student(1,"张三",18);
		Student s2 = new Student(2,"李四",16);
		Student s3 = new Student(3,"王五",19);
		Student s4 = new Student(4,"赵六",15);
		Student s5 = new Student(1,"罗总",18);
		System.out.println(s1.hashCode() + "\t" + s5.hashCode());
		System.out.println(s1.equals(s5));		
		
		stus.add(s1);
		stus.add(s2);
		stus.add(s3);
		stus.add(s4);
		stus.add(s5);
		System.out.println(stus.size());
		System.out.println(stus.contains(s5));
		
		for (Student s : stus) {
			System.out.println(s);
		}
		
		stus.forEach(t -> System.out.println(t));
		
		System.out.println("===============");
		
		stus.forEach(System.out::println);
	}

}
