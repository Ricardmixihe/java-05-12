package com.jizhong.pojo;

public class Rich {
	protected String name;
	protected String sex;
	protected int age;
	
	public Rich() {
		super();
	}
	
	public Rich(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void shuaka(){
		System.out.println("父类中的刷卡！！！！");
	}
	
	
	
}
