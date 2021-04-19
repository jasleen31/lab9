package com.r094.str.q3;
import java.util.Scanner;

public class UpperCase {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			StringBuffer str = new StringBuffer();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string: ");
			str.append(sc.nextLine());
			sc.close();
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


