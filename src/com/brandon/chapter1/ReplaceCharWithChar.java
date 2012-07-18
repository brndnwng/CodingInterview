package com.brandon.chapter1;

public class ReplaceCharWithChar {
	public static void main(String[] args) {
		String s = "This string is blah";
		
		char c[];
		
		c= s.toCharArray();
		
		for(int i=0; i < c.length;i++){
			if (c[i] ==' '){ 
				c[i] = 'Z';
			}
		}
	}
}
