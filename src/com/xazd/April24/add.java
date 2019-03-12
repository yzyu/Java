package com.xazd.April24;

public class add {
	public static void jia(int a) {
		for (int i = 0; i <= a;) {
			for (int j = a; j >= 0; j--) {
				System.out.println(i + "+" + j + "=" + (i + j));
				i++;
			}
		}
	}

	public static void main(String[] args) {
		jia(3);
		System.out.println("修复紧急bug");
	}

}
