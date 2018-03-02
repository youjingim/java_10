package com.uj.util.Random;

import java.util.Calendar;
import java.util.Random;

public class RandomTest_1 {
	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		
		//Random r = new Random(ca.getTimeInMillis());
		Random r = new Random();
		r.setSeed(ca.getTimeInMillis());
		int i = r.nextInt(10);
		System.out.println(i);
		
		
		
	}

}
