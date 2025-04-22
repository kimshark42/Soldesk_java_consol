package com.shark;

import java.util.Scanner;

import com.shark.util.Color;
import com.shark.util.Cw;

public class Board {
	// 저거 Display 같은곳에 따로 빼놓을것
	Scanner sc = new Scanner(System.in);

	// Todo
	// 뼈대만 짜놓을것
	void run() {
		// todo.
//		타이틀+버전 만들기
//		Display.title
		xx: while (true) {
			System.out.println("[1.2.3.4.5.x");
			String cmd = sc.next();
			switch (cmd) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				break;
			case "x":
				Color.sum(Color.BG_BLACK, "프로그램을 종료합니다.");
				break xx;
			}
			Cw.wn("");
		}
	}

}
