package com.uj.util.date;

import java.util.Calendar;

import javax.sound.midi.Soundbank;

public class Date_test2 {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c1.set(Calendar.YEAR, 2000);
		System.out.println(c1.get(Calendar.YEAR));
		c1.set(Calendar.MONTH, 11);
		System.out.println(c1.get(Calendar.MONTH)+1);
		
		c1.set(1997, 10, 13);
		System.out.println(c1.getTime());
		
		
		
	}

}
