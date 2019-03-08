package com.xazd.April28;

import java.util.Scanner;

public class Convent {
	public static int convent(int nums) {
		int i = nums;
		int j = 0;
		while (i > 0) {
			j = j * 10 + i % 10;
			i = i / 10;
		}
		System.out.println(j);
		if (j == nums) {
			System.out.println("是回文数字");
		} else {
			System.out.println("不是回文数字");
		}
		return j;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int n = scan.nextInt();
		convent(n);
	}
}
