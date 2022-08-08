package com.cssl.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import com.cssl.set.Student;

public class MapDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student(1,"张三",18);
		Student s2 = new Student(2,"李四",16);
		Student s3 = new Student(3,"王五",19);
		Student s4 = new Student(4,"赵六",15);
		Student s5 = new Student(5,"罗总",20);

		//Map<Student, Integer> map = new TreeMap<>(new MySort());		
		
		/*map.put(s1, s1.getAge());
		map.put(s2, s2.getAge());
		map.put(s3, s3.getAge());
		map.put(s4, s4.getAge());
		map.put(s5, s5.getAge());*/
		
		Map<Student, Integer> map = Map.of(s1, s1.getAge(), s2, s2.getAge(),s3, s3.getAge(),s4, s4.getAge(),s5, s5.getAge());
		
		System.out.println(map.size());
		
		//jstl  <c:forEach items=${map} var=m> ${m.key} ${m.value}
		Set<Map.Entry<Student, Integer>> set = map.entrySet();
		set.forEach(m->{
			System.out.println(m.getKey()+"\t"+m.getValue());
		});
		
		System.out.println("====================");
		
		map.forEach((k,v)->{
			System.out.println(k+"\t"+v);
		});
		
		
		Map<Student, Integer> mm = new Hashtable<>();
		mm.put(null, null);
	}

}
