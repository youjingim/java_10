package com.uj.lang.String;

public class String_test5 {
	public static void main(String[] args) {
		String str1 = "iu";
		String str2 = "suji";
		
		//두 값을 더할때 Heap 영역에 새로운 객체를 만들어서 새로운 객체의 주소 값을 str1에 넣음.
		StringBuffer sb = new StringBuffer();
		sb = sb.append(str1);
		sb = sb.append(str2);
		String s = sb.toString();

		System.out.println(sb);
		System.out.println(s);
		
		
	}

}
