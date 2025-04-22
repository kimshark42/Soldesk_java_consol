package com.shark.channel;

import java.util.ArrayList;

import com.shark.Post;

public class Announcement extends Channel {	
	public Announcement(String xx, int yy) {
		super(xx, yy);
	}
	public static ArrayList<Post> messageboards = new ArrayList<>();
	
	public static void messageLoad() {
		messageboards.add(new Post("<공지>","따이","김상어",1));
		messageboards.add(new Post("<마따>","DDAI","Kim_shark",2));
	}
}
