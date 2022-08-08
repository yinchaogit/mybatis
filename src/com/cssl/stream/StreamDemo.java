package com.cssl.stream;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.cssl.set.MySort;
import com.cssl.set.Student;


public class StreamDemo {

	public static void main(String[] args) {

		List<String> list = Stream.of("aaa","abc","cd","cde").toList();
		//List长度不变
		//list.add("");
		
		//中间操作
		Stream<String> str = list.stream().filter(s->s.length()>2);
		//终端操作
		str.forEach(System.out::println);
		//终端操作不能执行两次(流不能消费两次)
		//str.forEach(System.out::println);
		System.out.println("=====================");
		
		List<String> ls = list.stream().filter(s->s.length()>2).skip(1).limit(1).toList();
		ls.forEach(System.out::println);
		ls.forEach(System.out::println);
		
		System.out.println("=====================");
		
		
		Student s1 = new Student(1,"张三",10);
		Student s2 = new Student(2,"张三",12);
		Student s3 = new Student(3,"王五",10);
		Student s4 = new Student(4,"王五",14);
		Student s5 = new Student(5,"罗总",20);
		
		//可变集合
		List<Student> stus = Stream.of(s1,s2,s3,s4,s5).collect(Collectors.toList());
		stus.add(s5);
		System.out.println(stus.size());
		
		Set<String> names = stus.stream().map(Student::getSname).collect(Collectors.toSet());
		names.forEach(System.out::println);
		
		String s = stus.stream().map(Student::getSname).collect(Collectors.joining(","));
		System.out.println(s);
		
		System.out.println("=====================");
		
		int age = stus.stream().mapToInt(Student::getAge).sum();
		System.out.println(age);
		age = stus.stream().collect(Collectors.summingInt(Student::getAge));
		System.out.println(age);
		
		System.out.println("=====================");
		
		Map<String, List<Student>> map = stus.stream().collect(Collectors.groupingBy(Student::getSname));
		map.forEach((k,v)->System.out.println(k+"\t"+v));
		
		System.out.println("=====================");
		
		Map<String, Integer> mage = stus.stream().collect(Collectors.groupingBy(Student::getSname, Collectors.summingInt(Student::getAge)));
		mage.forEach((k,v)->System.out.println(k+"\t"+v));
		
		System.out.println("=====================");
		
		Map<String, Double> mavg = stus.stream().collect(Collectors.groupingBy(Student::getSname, Collectors.averagingInt(Student::getAge)));
		mavg.forEach((k,v)->System.out.println(k+"\t"+v));
		
		System.out.println("=====================");
		
		Optional<Student> stu = stus.stream().max(new MySort());
		System.out.println(stu.get());
		
	}

}
