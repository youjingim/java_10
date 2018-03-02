package com.uj.util.date;

import java.util.Calendar;
import java.util.Date;

public class Date_Test3 {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();

		long l = c1.getTimeInMillis(); // 1초를 1000이라고 표현
		
	
		
		long ca1 = c1.getTimeInMillis();
		long ca2 = c2.getTimeInMillis();
		System.out.println(ca1);
		System.out.println(ca2);
		System.out.println(((ca1 - ca2)/1000)/60);
		//생일
		Calendar c3 = Calendar.getInstance();
		c3.set(1993, 5, 24);
		long c = c1.getTimeInMillis();
		long b = c3.getTimeInMillis();
		
		long a = c-b;
		System.out.println(a/(1000*60*60*24));



		
		
		
	}

}
