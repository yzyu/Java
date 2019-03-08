package com.xazd.April26;

/*
 * 类的声明：从对象中抽象
 */
public class Person {
	// 属性声明
	private String name;
	private int age;
	private char sex;

	public String getName() {
		return name;
	}

	public void setName(String _name) {
		name = _name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int _age) {
		if (_age > 120 || _age < 0) {
			System.out.println("invalid age");
		} else {
			age = _age;
		}
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char _sex) {
		sex = _sex;
	}

	// 方法的声明
	public void speak(String str) {
		System.out.println(name + "说:" + str);
	}

	public void walk() {
		System.out.println(name + "喜欢行走");
	}

	public void info() {
		System.out.println("名字是：" + name + ";性别：" + sex + ";年龄：" + age);
	}

	public static void main(String[] args) {
		Person my = new Person();
		my.age = 0;
	}
}
