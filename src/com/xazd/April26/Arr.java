package com.xazd.April26;
import java.util.Scanner;

public class Arr {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入元素个数:");
		int num = scan.nextInt();
		int[] nums = new int[num];
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			System.out.println("请输入第" + (i + 1) + "个的值：");
			int no = scan.nextInt();
			nums[i] = no;
		}
		// maopao
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		for (int i : nums) {
			System.out.print(i + "  ");
		}
		System.out.println("请输入一个数：");
		int c = scan.nextInt();
		int len1 = len + 1;
		int[] arr = new int[len1];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = nums[i];
		}
		int n = 0;
		for (int i = 0; i < len1 - 2; i++) {
			if (c < arr[i]) {
				n = i;
				break;
			}
		}
		for (int j = len1 - 2; j >= n; j--) {
			arr[j + 1] = arr[j];
		}
		arr[n] = c;

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
