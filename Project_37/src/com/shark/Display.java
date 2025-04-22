package com.shark;

import com.shark.util.Color;
import com.shark.util.Cw;

public class Display {
	String x = "x";
	
	final static String DOT = "🐟🦐";  // static 은 멤버변수(void~() 에 못씀) 쉽게말해서 지역변수에는 static 을 쓰지 못함
	final static int DOT_COUNT = 10;
	public static void line() {
		for(int i=0;i<DOT_COUNT;i++) {
			Color.sum(Color.BG_BRTGHT_BLUE, DOT);
		}
		Cw.wn();
	}
	public static void dot(int n) {
		for(int i=0;i<n;i++) {		
		}
	}
	public static void title() {
		line();
		dot(10);
		Color.sum(Color.BG_BLUE,"따이한 수족관 계시판 (v."+Board.VRESION+" by kim.shark)");
		dot(10);
		Cw.wn();
		line();
	}	
}
