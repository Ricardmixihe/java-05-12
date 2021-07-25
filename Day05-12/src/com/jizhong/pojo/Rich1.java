package com.jizhong.pojo;
/**
 * 子类继承父类：
 * 	extends ： 继承
 *  子类继承父类之后，子类中会有父类的属性和方法
 *  子类也可以有自己特有的一些方法
 * @author BaiHongyu
 *
 */
public class Rich1 extends Rich{
	public Rich1(){
		super();
		super.age = 16;
	}
	
	@Override//标识作用
	public void shuaka(){
		System.out.println("富一代刷自己的卡");
	}
	
	public void eat(){
		System.out.println("吃东西！！吃肉");
	}
}
