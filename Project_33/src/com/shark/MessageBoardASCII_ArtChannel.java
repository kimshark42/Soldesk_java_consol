package com.shark;

import java.util.ArrayList;

import com.shark.util.Color;
import com.shark.util.Cw;

public class MessageBoardASCII_ArtChannel {
	static int saveNo = 0;  // -> 글번호 기본값, static 을 넣은 이유는 saveNo 변수를 쓰는곳이 static이 없으면 접근할수 없는 함수 내에 있어서
	public static ArrayList<Post> ps = new ArrayList<>();
	
	//3. 아스키아트 -> 글 자유롭게 쓰기 가능, 수정 불가능, 삭제는 가능
	// -> 글쓰기 문제 해결
	public static void run() {
		yy:while(true) {
			Color.printWithBgAndTextColor(Color.BRIGHT_BLACK, Color.WHITE, "[🎨ASCII_Art]");
			Cw.wn();
			Color.printWithBgAndTextColor(Color.BRIGHT_BLACK, Color.WHITE, "[[1.글 쓰기🖍️/2.글 읽기📃/3.글 목록📑/4.글 삭제🛠/x.이전 메뉴로❌]:]");
			Post.cmd = Post.sc.next();
			switch(Post.cmd) {
			case"1":
				Color.printWithBgAndTextColor(Color.BRIGHT_BLACK, Color.WHITE, "[1.글 쓰기🖍️]");
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
				ps.add(p);
				break;
			case"2":
				System.out.println("2번");
				break;
			case"3":
				System.out.println("3번");
				break;
			case"4":
				System.out.println("4번");
				break;
			case"x":
				Color.sum(Color.BRIGHT_BLACK, "❌ 이전메뉴로 돌아갑니다");
				Cw.wn();
				break yy;
			}
			
		}
	}
}
