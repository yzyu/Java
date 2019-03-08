package com.xazd.April25;

public class Calcaulator {
	public void add(int i, int j) {
		System.out.println(i + j);
	}

	public void add(float i, float j) {
		System.out.println(i + j);
	}

	public void add(double i, double j) {
		System.out.println(i + j);
	}

	public static void main(String[] args) {
		Calcaulator s = new Calcaulator();
		s.add(5, 1.2f);
	}
}
