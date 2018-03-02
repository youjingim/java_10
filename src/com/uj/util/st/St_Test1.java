package com.uj.util.st;

import java.util.StringTokenizer;

public class St_Test1 {
	public static void main(String[] args) {
		String nation = "Norway 14 14 11 German 14 10 7 Canada 11 8 10 USA 9 8 6 KOR 5 8 4 afreeca 10 15 20";
		StringTokenizer st = new StringTokenizer(nation, " ");
		Nation nation2;
		while(st.hasMoreTokens()) {
			nation2 = new Nation();
			nation2.setName(st.nextToken());
			nation2.setGold(st.nextToken());
			nation2.setSilver(st.nextToken());
			nation2.setBronze(st.nextToken());
		}
	}

}
