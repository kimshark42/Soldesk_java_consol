package com.shark;

import com.shark.channel.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Post {
	
	public static Scanner sc = new Scanner(System.in);
	public static String cmd;
	public static ArrayList<Post> ps = new ArrayList<>();
	public static ArrayList<Post> askii = new ArrayList<>();
	
	String title;  // -> 글 제목
	String content;  // ->글 내용
	String writer = "ㅇㅇ";  // -> 글쓴이 (기본값으로 o o 이 출력되도록함)
	int no;  // 글 번호
	
	// 기본 글쓴이를 "ㅇㅇ" 으로 하는 생성자 -> 글쓴이에 무언가를 넣는다면 작동하지 않음
	public Post(String title, String content, int saveNo) {
		this.title = title;
		this.content = content;
		no = saveNo;
	}
	
	// 글쓴이를 명시할수 있는 생성자 -> 글쓴이를 적으면 이걸로 생성됨
	public Post(String title, String content, String writer, int saveNo) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		no = saveNo;
	}
}
