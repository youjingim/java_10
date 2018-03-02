package com.uj.lang.wrapper;

import java.util.Scanner;

public class Wrapper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호를 입력하세요");
		String pw = sc.next();
		int b = 0;
		int s = 0;
		int n = 0;
		boolean check = true;
		//비밀번호 체크
		//최소한 두개 이상의 소문자
		//최소한 두개 이상의 대문자
		//최소한 두개 이상의 숫자
		//공백이 포함되면 안됨
		//최소 8글자 이상이어야 함
		
		for(int i=0;i<pw.length();i++) {
			if(Character.isUpperCase(pw.charAt(i))){
				b++;
		}
			else if(Character.isLowerCase(pw.charAt(i))) {
				s++;
			}
			else if(Character.isDigit(pw.charAt(i))) {
				n++;
			}
			else if(Character.isWhitespace(pw.charAt(i))) {
				check = !check;
				break;
			}
			
			
			
			
		}
		if(b>=2 && s>=2 && n>=2 && check && pw.length() >= 8) {
			System.out.println("사용 가능한 비밀번호입니다.");
		}
		else {
			System.out.println("사용하지못하는 비밀번호 입니다.");
		}
		
		
		
		
	}

}
