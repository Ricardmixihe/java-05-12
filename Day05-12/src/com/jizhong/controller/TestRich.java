package com.jizhong.controller;

import com.jizhong.pojo.Rich1;
import com.jizhong.pojo.Rich2;

public class TestRich {
	public static void main(String[] args) {
		Rich1 rich1 = new Rich1();
		rich1.shuaka();
		rich1.setName("富一代");
		rich1.setAge(90);
		rich1.setSex("男");
		
		Rich2 rich2 = new Rich2();
		rich2.shuaka();
		rich2.setName("富二代");
		rich2.setAge(18);
		rich2.setSex("男");
	}
}
