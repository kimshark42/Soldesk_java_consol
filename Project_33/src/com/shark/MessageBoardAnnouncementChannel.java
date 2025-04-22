package com.shark;

import com.shark.util.Color;
import com.shark.util.Cw;

public class MessageBoardAnnouncementChannel {
	public static void run() {
		yy: while (true) {
			Color.sum(Color.BG_RED, "[📢공지]");
			Cw.wn();
			Color.sum(Color.BG_BLUE, "[1.글 목록📑/2.글 읽기📃/x.이전 메뉴❌]:");
			Post.cmd = Post.sc.next();
			switch (Post.cmd) {
			case "1":
				System.out.println("1번");
				break;
			case "2":
				System.out.println("2번");
				break;
			case "x":
				Cw.wn();
				Color.sum(Color.BRIGHT_BLACK, "❌ 이전메뉴로 돌아갑니다");
				break yy;
			}
		}
	}
}
