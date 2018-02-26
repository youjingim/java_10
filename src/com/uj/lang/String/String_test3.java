package com.uj.lang.String;

public class String_test3 {
	public static void main(String[] args) {
		String s = "iu,suji,choa,hani";
		String [] names = s.split(","); // ","를 기준으로 잘라서 저장
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		//향상된 for문
		for(String str : names) {
			System.out.println(str);
			
		}
		
	}

}
