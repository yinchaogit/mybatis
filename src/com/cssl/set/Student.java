package com.cssl.set;

import java.util.Objects;

/**
 * 自然排序
 * @author TYM
 *
 */
public class Student extends Person { //implements Comparable<Student> {
	
	private int sid;
	private String sname;
	private int age;

	public Student() {
		super();
	}
	public Student(int sid, String sname, int age) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashCode...");
		return Objects.hash(sid);
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals...");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return sid == other.sid;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age + "]";
	}
	
	/*@Override
	public int compareTo(Student o) {
		System.out.println("compareTo");
		//升序
		//return sid - o.sid;
		return (age < o.age) ? 1 : ((age == o.age) ? 0 : -1);
	}*/
	
	

}
