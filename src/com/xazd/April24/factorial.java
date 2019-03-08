package com.xazd.April24;

public class factorial {

	public static void main(String[] args) {
		System.out.println(fact(4));
	}
	public static int fact(int n) {
		if(n>1) {
			return fact(n-1)*n;
		}else {
			return 1;
		}
	}

}
