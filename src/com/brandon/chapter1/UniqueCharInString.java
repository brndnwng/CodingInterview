package com.brandon.chapter1;

import java.util.HashMap;

public class UniqueCharInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Character,Character> sortMap = new HashMap<Character,Character>();
		
		String input="ABCA";
		char[] inputArray = input.toCharArray();
		
		for (char a : inputArray){
			if(sortMap.containsKey(a)){
				System.out.println("NOT UNIQUE");
				System.exit(0);
			}
			else sortMap.put(a,a);
		}
		
		System.out.println("UNIQUE");
	}

}
