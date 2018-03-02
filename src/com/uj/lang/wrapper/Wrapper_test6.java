package com.uj.lang.wrapper;

public class Wrapper_test6 {
	public static void main(String[] args) {
		// 991215 - 1234567  7번은 check
		// int t = 9*2 + 9*3 + 1*4 + 2*5 + 1*6 + 5*7 + 1*8 + 2*9 + 3*2 + 4*3 + 5*4 + 6*5 
		// t/11 몫 나머지 
		// 11 - 나머지 = 결과값
		// 결과값 == check
		// if 결과값이 두자리라면
		// 결과값 %10 - > 나머지값 == 체크값 
		
		String s = "930624-1025419";
		char [] c = s.toCharArray();
		int total=0;
		int [] array = new int [c.length];
		int e=2;
		for(int i=0;i<c.length-1;i++) {
			if(i==6) {
				continue;
			}
			array[i] = Integer.parseInt(String.valueOf(c[i]));
			total = total + array[i] * e;
			 e++;
			 if(e == 10) {
				 e=2;
			 }
		}
		
		System.out.println(total);
		int result = total%11;
		int r = 11 - result;
		if(r>9) {
			r= r%10;
		}
		int q=Integer.parseInt(s.substring(13));
		if(r == q) {
			System.out.println("정상적인 주민등록 번호입니다.");
		}
		else {
			System.out.println("정상적인 주민번호가 아닙니다.");
		}
		
		
		
		
		
	}

}
