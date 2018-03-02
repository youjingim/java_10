package com.uj.util.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_Test4 {
	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		                                                                                                                                                                                                           
		System.out.println(ca.get(Calendar.YEAR) + " 년 " + (ca.get(Calendar.MONTH)+1) + " 월 " + ca.get(Calendar.DATE) + " 일 " + ca.get(Calendar.HOUR_OF_DAY) + " 시 " + ca.get(Calendar.MINUTE) + " 분 " + ca.get(Calendar.SECOND) + " 초 ");
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년MM월dd일hh시mm분ss초 E요일");
		String s =sd.format(ca.getTime());
		System.out.println(s);
		
		
	} 
	

}
