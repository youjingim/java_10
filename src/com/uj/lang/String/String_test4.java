package com.uj.lang.String;

public class String_test4 {

	public static void main(String[] args) {
		String s = "oracla";
		
		s = s.substring(2);
		
		System.out.println(s);
		
		s="bugerking";
		
		s = s.substring(1, 3);
		System.out.println(s);
		
		s=" buger king ";
		System.out.println(s.equals("buger king"));
		System.out.println("Test" + s + "price");
		s=" buger king ";
		s=s.trim();
		System.out.println(s.equals("buger king"));
		System.out.println("Test" + s + "price");
		
		
		String str = String.valueOf(20000);
		
		System.out.println(str);
		
	}

}
