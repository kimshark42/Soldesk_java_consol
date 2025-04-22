package com.shark;

import java.util.ArrayList;

import com.shark.channel.*;
import com.shark.util.Color;
import com.shark.util.Cw;

public class MessageBoardFreeChannel {
	static int saveNo = 0;  // -> 글번호 기본값, static 을 넣은 이유는 saveNo 변수를 쓰는곳이 static이 없으면 접근할수 없는 함수 내에 있어서
	
	//2. 자유게시판 -> 글 자유롭게 쓰게끔, 수정 가능 삭제 가능
	// -> 글쓰기 기능 해결
	public static void run() {
		yy:while(true) {
			Color.rgb(162, 67, 246,"[🐟자유게시판]");
			Cw.wn();
			Color.rgb(162, 67, 246,"[1.글 쓰기🖍️/2.글 읽기📃/3.글 목록📑/4.글 수정📝/5.글 삭제🛠/x.이전 메뉴로❌]:");
			Post.cmd = Post.sc.next();
			switch(Post.cmd) {
			case"1":
				Color.rgb(162, 67, 246,"[1.글 쓰기🖍️]");
				Cw.wn();
				Cw.wn("제목: ");
				String title = Post.sc.next();
				Cw.wn("본문: ");
			    Post.sc.nextLine();  // sc.next -> 공백 전까지만 입력받음 sc.nextLine -> 줄 전체를 입력받음 
				String content = Post.sc.nextLine();
				Cw.wn("작성자: ");
				Post.sc.nextLine();  // sc.next -> 공백 전까지만 입력받음 sc.nextLine -> 줄 전체를 입력받음 
				String writer = Post.sc.nextLine(); // 아무것도 안치고 엔터치면 기본 작성자인 ㅇㅇ 이 출력되도록함
				if(writer.trim().isEmpty()) {  // trim 을 넣었을경우 공백만 입력했을때도 ㅇㅇ으로 바뀌지 않기 때문에 넣는것
					writer = "ㅇㅇ";
				}
				saveNo = saveNo +1;
				Post p = new Post(title,content,writer,saveNo);
				Post.ps.add(p);
				break;
			case"2":
				Cw.wn("2.글 읽기📃");
				Cw.wn();
				Cw.wn("몇 번 글을 읽을까요?");
				//몇번 글을 읽을지 물어보기
				Post.cmd = Post.sc.next();
				
				// 해당 글을 찾기
				for(int i=0;i<Post.ps.size();i++) {
					Post post = Post.ps.get(i);
					int postNo = post.no;
					String postStringNo = postNo+"";
					if(postStringNo.equals(Post.cmd)) {
						Color.sum(Color.BG_YELLOW, "No."+post.no+"제목: "+post.title+" 글 내용: "+post.content+" 작성자: "+post.writer);						
					}
				}
				break;
			case"3":
				System.out.println("[3.글 목록📑]");
				Cw.wn();
				for(int i=0;i<Post.ps.size();i++) {
					String t = Post.ps.get(i).title;
					String c = Post.ps.get(i).content;
					String w = Post.ps.get(i).writer;
					int no = Post.ps.get(i).no;
					Color.sum(Color.BG_YELLOW, "No."+no+"제목: "+t+" 작성자: "+w);
				}
				break;
			case"4":
				System.out.println("4번");
				break;
			case"5":
				System.out.println("5번");
				break;
			case"x":
				Cw.wn();
				Color.sum(Color.BRIGHT_BLACK, "[이전 메뉴로 돌아갑니다.]");
				break yy;
			}
		}
	}

}
