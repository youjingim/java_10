package com.uj.s2;

public class Salaray {
	private int perHoour;
	
	public Salaray() {
		perHoour = 7530;
		
	}
	
	public void cal(Emp emp) {
		
		double sal = perHoour * emp.getNormalTime();
		sal = sal + perHoour * 1.5 * emp.getOverTime();
		sal = sal + perHoour * 1.5 * emp.getWeekTime();
		
		emp.setSal(sal);
	}

}
