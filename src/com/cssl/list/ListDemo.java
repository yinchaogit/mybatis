package com.cssl.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.cssl.set.MySort;
import com.cssl.set.Student;

public class ListDemo {

	public static void main(String[] args) {
		
		List<String> sts = Arrays.asList("","","");
		//sts.add("");
		
		Student s1 = new Student(1,"张三",18);
		Student s2 = new Student(2,"李四",16);
		Student s3 = new Student(3,"王五",19);
		Student s4 = new Student(4,"赵六",15);
		Student s5 = new Student(5,"罗总",20);
	
		/*List<Student> stus = new ArrayList<Student>();
		stus.add(s4);
		stus.add(s2);
		stus.add(s1);
		stus.add(s3);
		stus.add(s5);*/
		
		List<Student> stus = List.of(s1,s2,s3,s4,s5);
		//stus.add(new Student());
		System.out.println(stus.size());
		
		//Set<Student> set = new TreeSet<Student>(stus);
		//集合算法类
		//Collections.sort(stus,new MySort());
		
		System.out.println(Collections.max(stus, new MySort()));
	
		System.out.println("================");
		stus.forEach(System.out::println);
		
		//线程不安全
		List<Student> stuss = new LinkedList<Student>();
		//线程安全
		Collections.synchronizedList(stuss);
		
	}

}
