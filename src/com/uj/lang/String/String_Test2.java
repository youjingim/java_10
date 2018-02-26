package com.uj.lang.String;

import java.util.Scanner;

public class String_Test2 {
	public static void main(String[] args) {
		
	/*	String s = "iu";
		String str1 = "iu";
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String str = sc.next();
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(s == str);
		
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		System.out.println(s == str1);
		System.out.println(s.equals(str));
		
		System.out.println(s.toString());*/
		
		
		
		/*String s = "seoulhello";
		int count=0;
		int a=0;
		for(int i=0;i<s.length();i++) {
		a = s.indexOf('l',i);
		if(a != -1) {
		count++;
		i=a;
		}
		}
		System.out.println("총 갯수는? : " + count);*/
		
/*		String s = "seoulhello";
		
		int count = 0;
		int index = 0;
		
		while(true) {
			index = s.indexOf('l',index);
			if(index != -1) {
				count++;
				index++; 
			}
			else {
				break;
			}
		}
		System.out.println("총 갯수는? : " + count);*/
		
		String s1 = "lgnotebook";
		int index = s1.indexOf("note");
		System.out.println(index);
		
		String [] files = {"jpg","png","gif"};
		
		s1 = "suji.iu.gif";
		s1=s1.replace('.', '_');
		// 9.47 8.98
		// 9_58 3_87 // 전처리과정
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
		
		
		
				
	}

}
