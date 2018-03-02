package com.uj.util.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_Test5 {
	public static void main(String[] args) throws ParseException {
		String s = "2017-10-9";
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sd.parse(s);
		Calendar ca = Calendar.getInstance();
		ca.setTime(d);
		System.out.println(ca.getTime());
		
		System.out.println(sd.format(d));
	}

}
