package com.xazd.April28;

public class Doorstep {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			if (i % 3 != 0) {

				System.out.println(i);
				sum += i;
			}

		}
		System.out.println("和为:" + sum);
	}

}
