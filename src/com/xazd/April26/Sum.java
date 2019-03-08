package com.xazd.April26;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入元素个数:");
		int num = scan.nextInt();
		int[] a = new int[num];
		int len = a.length;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			System.out.println("请输入第" + (i + 1) + "个的值：");
			int no = scan.nextInt();
			a[i] = no;
			sum += no;
		}
		System.out.println("数列中所有数值的和：" + sum);
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < len; i++) {
			if (max < a[i]) {
				max = a[i];
			}
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("最大值max:" + max);
		System.out.println("最小值min:" + min);

	}
}
