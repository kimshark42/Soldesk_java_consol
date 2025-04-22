package com.shark;

import java.text.DecimalFormat;

import com.shark.util.Color;
import com.shark.util.Cw;

// 싹 갈아 엎었음
public class Board{
	public static final String VRESION = "0.0.3";   // 버전 표시용 <- 해결
	DecimalFormat df = new DecimalFormat("#,##");   //숫자 자릿수 콤마 처리 <- 근데 이걸 어디다가 옮겨야하는지 물어볼것
	//todo
	//뼈대 구축 -> 해결
	//case 2
	//-> [1.공지/2.자유게시판/3.아스키아트]:
	//1. 공지 -> 수정 xx 글 관리자만 쓸수 있게끔 -> 근데 이건 아직 못하니깐 수정만 못하게 막고 써있는 글은
	//sysput 으로 박아버리기
	//
	//case 3
	//-> [1.공지/2.자유게시판/3.아스키아트]:
	// 사실상 메인이 글 리스트 역할을 다 하긴 하는데...
	// 그냥 모든 탭의 글을 볼수 있게 할수 있나?
	//
	//csse 4
	//-> 이건 글 수정이 어짜피 자유 게시판 밖에 안되기때문에 -> 자유게시판 내의 글 리스트 선택, 수정 이것만 하게 끔
	//
	//case 5
	//[1. 자유게시판/2. 아스키 아트]
	//게시판 선택 -> 글 리스트 턴택 삭제
	void run() {
//		Post.messageLoad(); // 게시판 로드
		xx:while(true) {
			Color.sum(Color.BG_BLACK,"[1.공지/2.자유게시판/3.아스키아트 게시판/x.프로그램 종료]:");
			Post.cmd = Post.sc.next();
			switch(Post.cmd) {
			//case 1 -> [1.자유게시판/2.아스키아트]:
			case"1":
				MessageBoardAnnouncementChannel.run();
				break;
			case"2":
				MessageBoardFreeChannel.run();
				break;
			case"3":
				MessageBoardASCII_ArtChannel.run();
				break;
				//case x 프로그램 종료 -> 해결
			case"x":
				Cw.wn();
				Color.sum(Color.BG_BLACK,"❌ 프로그램을 종료합니다.");
				break xx;
			
			}
		}
	}
}
