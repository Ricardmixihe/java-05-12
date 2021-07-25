package com.jizhong.test;

/**
 * 测试类
 * @author BaiHongyu
 *
 */
public class TestArmy {
	public static void main(String[] args) {
		Navy navy = new Navy();
		navy.Beat();//海军打击
		navy.Defend();//海军保卫
		
		LandArmy landArmy = new LandArmy();
		landArmy.Beat();//陆军打击
		landArmy.Defend();//陆军保卫
		
		Airforce airforce = new Airforce();
		airforce.Beat();//空军打击
		airforce.Defend();//空军保卫
		
	}
}
