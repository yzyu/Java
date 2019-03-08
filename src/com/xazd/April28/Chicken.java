package com.xazd.April28;

public class Chicken {

	public static void main(String[] args) {
		for (int x = 1; x <= 32; x++) {
			for (int y = 1; y <= 48; y++) {
				if (8 * x + 5 * y == 200) {
					System.out.println("公鸡：" + x + "母鸡:" + y + "小鸡：" + (100 - x - y));
				}
			}
		}

	}

}
