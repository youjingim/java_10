package com.uj.lang.wrapper;

public class Wrapper_test4 {
	public static void main(String[] args) {
		int num = 10;
		Integer n1 = new Integer(num);

		num = n1.intValue();
		
		n1 = num; // auto 박싱
		num = n1; // auto 언박싱
		
		System.out.println(num);
		
		Double b = (double)n1.intValue(); // 자동 형변환
		System.out.println(b);
		n1 = (int)b.doubleValue();
	}

}
