package com.shark.channel;

import com.shark.util.Color;

public class Channel {
	public String name;
	public int number;
	
	public Channel(String xx, int yy) {
		name = xx;
		number = yy;
	}
	void info() {
		Color.sum(Color.BRIGHT_BLUE,number+"."+name);
	}
}
