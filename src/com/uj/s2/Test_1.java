package com.uj.s2;

public class Test_1 {

	public static void main(String[] args) {
		//시간당 급여 7530
		//9~6
		//6시 이후 초과근무 시급 1.5배
		//주말근무 시급 1.5배
		//4대보험
		//국민연금 급여 0.015
		//의료보험 급여 0.02
		//산재보험 급여 0.005
		//고용보험 급여 0.025

		Salaray sal = new Salaray();
		Emp emp = new Emp();
		Insurance in = new Insurance();
		emp.setNormalTime(8);
		emp.setOverTime(4);
		emp.setWeekTime(10);
		sal.cal(emp);
		
		
		emp.setSal(in.ins1(emp.getSal()));
		emp.setSal(in.ins2(emp.getSal()));
		emp.setSal(in.ins3(emp.getSal()));
		emp.setSal(in.ins4(emp.getSal()));
		
		
		new View().view(emp);		
		
		
		
		
		
	}

}
