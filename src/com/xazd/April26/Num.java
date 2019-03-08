package com.xazd.April26;
import java.util.Scanner;

public class Num {
	int[] a;

	public void sum() {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		System.out.println("数组中所有数的和是" + sum);
	}

	public void num() {
		int mix = a[0];
		int man = a[0];
		for (int i = 0; i < a.length; i++) {
			if (mix > a[i]) {
				mix = a[i];
			}
			if (man < a[i]) {
				man = a[i];
			}
		}
		System.out.println("最小值是" + mix);
		System.out.println("最大值是" + man);
	}

	public void bubble() {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	public void enter() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入元素个数：");
		int num = scan.nextInt();
		int[] a = new int[num];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第" + (i + 1) + "元素的值：");
			int j = scan.nextInt();
			a[i] = j;
			sum += j;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		new Num();
	}
}
