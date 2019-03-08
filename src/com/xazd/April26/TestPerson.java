package com.xazd.April26;
public class TestPerson {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("张三");
		p.setAge(10);
		p.setSex('男');
		System.out.println("姓名：" + p.getName() + " 年龄：" + p.getAge() + " 性别:" + p.getSex());
		Person my = new Person();
		my.setName("李四");
		System.out.println(my.getName());
	}

}
