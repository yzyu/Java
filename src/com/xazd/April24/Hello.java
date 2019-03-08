package com.xazd.April24;
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入班级的数量：");
		int cla = scan.nextInt();
		int school[][] = new int[cla][];
		int clen = school.length;
		for (int i = 1; i <= clen; i++) {
			System.out.println("请输入第" + i + "班级的人数：");
			int nums = scan.nextInt();
			int sum = 0;
			for (int j = 1; j <= nums; j++) {
				System.out.println("请输入第" + i + "班第" + j + "个同学的成绩：");
				int sco = scan.nextInt();
				sum += sco;
			}
			System.out.println(sum);
		}
	}
}
