package com.uj.lang.String.ex1;

public class NationOut {
	
	public void Out1(Nation [] nations) {
		for(Nation nation : nations) {
			
			
			System.out.println("나라이름 : " + nation.getName());
			System.out.println("금메달 : " + nation.getGold());
			System.out.println("은메달 : " + nation.getSilver());
			System.out.println("동메달 : " + nation.getBronze());
			}
		
		
	}
	public void out2(Nation [] nation, int i) {
		System.out.println("나라이름 : " + nation[i].getName());
		System.out.println("금메달 : " + nation[i].getGold());
		System.out.println("은메달 : " + nation[i].getSilver());
		System.out.println("동메달 : " + nation[i].getBronze());
		
	}

}
