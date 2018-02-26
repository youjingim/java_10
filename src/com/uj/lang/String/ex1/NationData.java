package com.uj.lang.String.ex1;

public class NationData {
	
	public Nation [] makeNation() {
		String nation = "Norway 14 14 11 German 14 10 7 Canada 11 8 10 USA 9 8 6 KOR 5 8 4 afreeca 10 15 20";
		String [] n1 = nation.split(" "); 
		Nation [] national = new Nation [n1.length/4];
		int i=0,j=0;

		while(j<national.length) {
			Nation n = new Nation();
			n.setName(n1[i]);
			i++;
			n.setGold(n1[i]);
			i++;
			n.setSilver(n1[i]);
			i++;
			n.setBronze(n1[i]);
			national[j] = n;
			j++;
			i++;
			
	}
		return national;
	}

}
