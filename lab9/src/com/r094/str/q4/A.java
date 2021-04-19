package com.r094.str.q4;
class Data{
	String name;
	Data(String n){
		name=n;
	}
	void display() {
		System.out.println("#-------------#");
		System.out.println("Name: "+ name);
		int c=0;
		int len =name.length();
		for(int i=0;i<len;i++) {
			if(name.charAt(i)=='A'|| name.charAt(i)=='a') {
				c++;
				System.out.println("Count = "+c);
				System.out.println("Position = "+(i+1));
			}
		}
		System.out.println("A/a occurred "+c+" times in the given string.");
		if(c==0) {
			System.out.println("there is no 'A/a' in the given string!!");
		}
	}
}
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d1 = new Data("Jasleen");
		d1.display();
		Data d2 = new Data("Java");
		d2.display();
		Data d3 = new Data("Hello");
		d3.display();
	}

}
