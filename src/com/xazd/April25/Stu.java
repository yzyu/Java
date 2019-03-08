package com.xazd.April25;

public class Stu {
	private String name;
	private int age;
	private char sex;
	private int classNum;
	private int sno;

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected char getSex() {
		return sex;
	}

	protected void setSex(char sex) {
		this.sex = sex;
	}

	protected int getClassNum() {
		return classNum;
	}

	protected void setClassNum(int classNum) {
		this.classNum = classNum;
	}

	protected int getSno() {
		return sno;
	}

	protected void setSno(int sno) {
		this.sno = sno;
	}

	public Stu(String sname, int sage, char sex1, int cNum, int no) {
		name = sname;
		age = sage;
		sex = sex1;
		classNum = cNum;
		sno = no;
	}

	public void displayinfo() {
		System.out.println("姓名: " + name);
		System.out.println("年龄：" + age + " 性别： " + sex);
		System.out.println("在" + classNum + "班，座位是" + sno + "号");
	}
}
