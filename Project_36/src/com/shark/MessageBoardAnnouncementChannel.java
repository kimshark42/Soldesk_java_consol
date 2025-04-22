package com.shark;

import com.shark.channel.Announcement;
import com.shark.util.Color;
import com.shark.util.Cw;


public class MessageBoardAnnouncementChannel {
	public static void run() {
		Announcement.messageLoad(); // 게시판 로드
		yy: while (true) {
			Color.sum(Color.BG_RED, "[📢공지]");
			Cw.wn();
			Color.sum(Color.BG_BLUE, "[1.글 목록📑/2.글 읽기📃/x.이전 메뉴❌]:");
			Post.cmd = Post.sc.next();
			switch (Post.cmd) {
			case "1":
				Color.sum(Color.BG_BLUE, "[1.글 목록📑]");
				Cw.wn();
				for (int i = 0; i < Announcement.messageboards.size(); i++) {
					String t = Announcement.messageboards.get(i).title;
					String c = Announcement.messageboards.get(i).content;
					String w = Announcement.messageboards.get(i).writer;
					int no = Announcement.messageboards.get(i).no;
					Color.sum(Color.BG_RED, "No." + no + " 제목: " + t + " 작성자: " + w);
					Cw.wn();
				}
				break;
			case "2":
				Color.sum(Color.BG_BLUE, "[2.글 읽기📃]");
				Cw.wn();
				Cw.wn("몇 번 공지를 읽을까요?");
				Post.cmd = Post.sc.next();
				// if 문 넣어서 넣은거 찾기
				for (int i = 0; i < Announcement.messageboards.size(); i++) {
					Post post = Announcement.messageboards.get(i);
					int postNo = post.no;
					String postStringNo = postNo + "";
					if (postStringNo.equals(Post.cmd)) {
						Cw.wn("No." + post.no + " 제목: " + post.content + " 글 내용: " + post.content + " 작성자: "
								+ post.writer);
					}
				}
				break;
			case "x":
				Cw.wn();
				Color.sum(Color.BRIGHT_BLACK, "❌ 이전메뉴로 돌아갑니다.");
				break yy;
			}
		}
	}
}
