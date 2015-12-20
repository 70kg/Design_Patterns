package com.company.adapter;

/**
 * Created by Mr_Wrong on 15/11/11.
 * 类的适配器模式
 */
public class Adapter extends Source implements Targetable {

	public void method2() {
		super.method1();
	}
}
