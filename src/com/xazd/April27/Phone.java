package com.xazd.April27;
public class Phone {
	private String brand;
	private String system;

	public Phone(String brand, String system) {
		this.brand = brand;
		this.system = system;
	}

	public void present() {
		System.out.println("手机品牌：" + brand + " 手机型号" + system);
	}

	public void play() {
		System.out.println("开始播放音乐");
		System.out.println("音乐播放完毕");
	}

	public void download() {
		System.out.println("开始下载音乐");
		System.out.println("下载完毕");
	}

	public void fill(Cell cell) {
		System.out.println("充电开始");
		cell.charge();
		System.out.println("充电完毕");
	}

}
