package com.xazd.April26;

import java.util.Scanner;

/*
*石头 剪刀 布
*  约定：石头1 剪刀2 布3
*  每次可以玩10局，统计赢的比例。 
*/
public class Game {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		// 成功次数
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("第" + i + "局。请选择数字：1 石头 2 剪刀 3 布");
			// 玩家出
			int num = input.nextInt();
			// 电脑出
			int com = (int) (Math.random() * 3 + 1);
			if (num >= 1 && num <= 3) {
				int res = com - num;
				if (res == 0) {
					System.out.println("平局");
				} else if (res == -1 || res == 2) {
					System.out.println("电脑赢");
				} else if (res == 1 || res == -2) {
					System.out.println("你赢");
					sum++;
				}
			} else {
				System.out.println("非法操作");
			}
			System.out.println("电脑出：" + com);
		}
		System.out.println("成功率：" + sum * 1.0 / 10 * 100 + "%");
	}
}
