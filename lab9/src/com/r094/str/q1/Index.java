package com.r094.str.q1;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "mississippi";
		int firstindex = str.indexOf("i");
		System.out.println("First 'i' occurred at index: "+ firstindex);
		int lastindex = str.lastIndexOf("i");
		System.out.println("Last 'i' occurred at index: "+ lastindex);
	}

}