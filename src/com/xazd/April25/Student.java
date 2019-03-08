package com.xazd.April25;

public class Student {
	String name;
	String cname;
	int no;

	public void study() {
		System.out.println(name + "很喜欢学习");
	}

	public void examine() {
		System.out.println(name + "今天会考试");
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "张三";
		s.cname = "三班";
		s.no = 2;
		s.study();
		s.examine();

	}
}
