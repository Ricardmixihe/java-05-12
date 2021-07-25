package com.jizhong.pojo;

public class Rich2 extends Rich{
	public void eat(){
		//super：表示父类对象
		super.shuaka();
		super.age = 10;
	}
	public void shuaka(){
		super.shuaka();//调用父类的刷卡方法
	}
}
