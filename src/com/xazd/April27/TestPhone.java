package com.xazd.April27;
public class TestPhone {

	public static void main(String[] args) {
		Phone x = new Phone("小米", "android 6");
		Cell f = new Cell("飞毛腿", 4000);
		x.present();
		x.download();
		x.play();
		x.fill(f);

	}

}
