package com.xazd.April25;

public class Students {
	public static void main(String[] args) {
		Stu s = new Stu("张三", 15, '男', 1, 27);
		Stu s2 = new Stu("李四", 16, '女', 2, 36);
		s.displayinfo();
		s2.displayinfo();
	}
}
