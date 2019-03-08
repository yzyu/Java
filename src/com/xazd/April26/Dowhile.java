package com.xazd.April26;
import java.util.Scanner;

/*
 * 计算学生平均成绩
 */
public class Dowhile {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("输入学生姓名：");
		String nam = scan.next();
		String ans;
		int sum = 0;
		do {
			for (int i = 1; i < 6; i++) {
				System.out.println("请输入第5门课中第" + i + "门的成绩");
				int sco = scan.nextInt();
				sum += sco;
			}
			System.out.println(nam + "的平均分是:" + sum / 5);
			System.out.println("继续输入吗y/n");
			String ans1 = scan.next();
			ans = ans1;
		} while (ans.equals("y"));
		System.out.println("成绩录入结束");
	}
}
