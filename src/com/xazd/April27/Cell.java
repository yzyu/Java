package com.xazd.April27;
public class Cell {
	private String brand;
	private int volume;

	public Cell(String brand, int volume) {
		this.brand = brand;
		this.volume = volume;
	}


	public void charge() {
		System.out.println(brand + "牌" + volume + "电池");
		System.out.println("充电中...");
	}
}
