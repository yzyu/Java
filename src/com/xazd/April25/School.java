package com.xazd.April25;

public class School {
	String name;
	String type;
	int history;

	public void study() {
		System.out.println("学习时间是8：00——17：00");
	}

	public void into() {
		System.out.println(name + "是一所" + history + "年历史的" + type);
	}
}
