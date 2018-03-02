package com.uj.util.date;

import java.util.*;


public class Date_test1 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		String day = null;
		System.out.println(ca.get(Calendar.YEAR));
		System.out.println(ca.get(Calendar.MONTH)+1);
		System.out.println(ca.get(Calendar.DATE));
		for(int i = 0 ; i < 7 ; i++) {
		int a = ca.get(Calendar.DAY_OF_WEEK);
		if(a == 0) {
			day = "토요일";
		} else if(a == 1) {
			day = "일요일";
		}else if (a == 2) {
			day = "월요일";
		}else if (a == 3) {
			day = "화요일";
		}else if (a == 4) {
			day = "수요일";
		}else if (a == 5) {
			day = "목요일";
		}else {
			day = "금요일";
		}
		
		
		}
		System.out.println(day);
		System.out.println(ca.get(Calendar.HOUR) + "시");
		System.out.println(ca.get(Calendar.MINUTE) + "분");
		System.out.println(ca.get(Calendar.SECOND) + "초");
		System.out.println(ca.get(Calendar.AM_PM));
		System.out.println(ca.get(Calendar.AM));
		System.out.println(ca.get(Calendar.PM));

	}

}
