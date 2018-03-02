package com.uj.util.Random;

import java.util.Calendar;
import java.util.Random;

public class RandomTest_2 {
	Setting s;
	Randomput r;
	View v;
	public RandomTest_2() {
		s = new Setting();
		r = new Randomput();
		v = new View();
	}
	public void start() {
		int [] array = new int[6];
		
		r.put(array);
		s.set(array);
		v.view1(array);

		
		
	}

}
