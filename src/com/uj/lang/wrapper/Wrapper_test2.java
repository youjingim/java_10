package com.uj.lang.wrapper;

public class Wrapper_test2 {
	public static void main(String[] args) {
		int num=10;
		String s = "5";
		Integer n1 = new Integer(num);
		Integer n2 = new Integer(s);
		
		
		
		System.out.println(n1.intValue() * 10);
		System.out.println(n2.intValue() * 2);
		
		System.out.println(Integer.toBinaryString(-1));
		
		int n3 = Integer.parseInt(s);
		double d1 = Double.parseDouble(s);
		System.out.println(n3*5);
		System.out.println(d1*10);
		
	}

}
