package com.r094.wrap.q1;
public class Convert {
	@SuppressWarnings("deprecation")
	public static void intToInteger(int i) {
		Integer intObj = new Integer(i);
		System.out.println("int to Integer: "+ intObj);
	}
	public static void IntegerToString(Integer i) {
		String str =  Integer.toString(i);
		System.out.println("Integer to String: "+str);
	}
	public static void StringToint(String str) {
		int i=Integer.parseInt(str);
		System.out.println("String to int: "+i);
	}
	public static void intToString(int i) {
		String str = Integer.toString(i);
		System.out.println("int to String: "+str);
	}
	public static void StringToInteger(String str) {
		@SuppressWarnings("deprecation")
		Integer intObj = new Integer(str);
		System.out.println("String to Integer: "+intObj);
	}
	public static void IntegerToint(Integer intobject) {
		int i = intobject.intValue();
		System.out.println("Integer to int: "+i);
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer intObj = new Integer(10);
		intToInteger(52);
		IntegerToString(intObj);
		StringToint("10");
		intToString(20);
		StringToInteger("50");
		IntegerToint(intObj);
	}
}
