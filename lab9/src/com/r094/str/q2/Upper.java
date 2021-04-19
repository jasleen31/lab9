package com.r094.str.q2;
public class Upper {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("hello everyone");
		int l = str.length();
		for (int i =0;i<l;i++) {
			Character c = str.charAt(i);
			if(c>='a' && c<='z') {
				c=(char)(c - 32);
			}
			str.replace(i, i+1, c + "");
		}
		System.out.println(str);	
	}
}
