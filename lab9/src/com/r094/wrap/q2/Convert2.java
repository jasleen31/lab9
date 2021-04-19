package com.r094.wrap.q2;

public class Convert2 {
	public static void floatToFloat(float i) {
		@SuppressWarnings("deprecation")
		Float floatObj = new Float(i);
		System.out.println("float to Float: "+floatObj);
	}
	public static void FloatToString(Float floatObj) {
		String str = Float.toString(floatObj);
		System.out.println("Float to String: "+str);
	}
	public static void StringTofloat(String str) {
		float f =  Float.parseFloat(str);
		System.out.println("String to float: "+f);
	}
	public static void floatToString(float f) {
		String str = String.valueOf(f);
		System.out.println("float to String: "+str);
	}
	public static void StringToFloat(String str) {
		@SuppressWarnings("deprecation")
		Float floatobj = new Float(str);
		System.out.println("String to Float: "+ floatobj);
	}
	public static void FloatTofloat(Float floatobj) {
		float f = floatobj.floatValue();
		System.out.println("Float to float: "+f);
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float floatobj = new Float(12.36);
		floatToFloat(12.36f);
		FloatToString(floatobj);
		StringTofloat("15.2");
		floatToString(20.48f);
		StringToFloat("65.25");
		FloatTofloat(floatobj);

	}
}
