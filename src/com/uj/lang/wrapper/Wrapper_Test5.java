package com.uj.lang.wrapper;

public class Wrapper_Test5 {
	public static void main(String[] args) {
		//주민번호
		//991222 - 1234567
		//3월 5월 출생은 봄
		//6월 8월 출생은 여름
		//9월 11월 출생은 가을
		//12월 2월 출생은 겨울

		String num = "931224 - 1234567";
		num = num.substring(2, 4);
		int i = Integer.parseInt(num);
		System.out.println(i);
		switch(i) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println("봄");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("여름");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println("가을");
			break;
		case 12 :
		case 1 :
		case 2 :
			System.out.println("겨울");
			break;

		}	
	}
}
