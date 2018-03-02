package com.uj.lang.String.ex1;

public class Nation_Main {

	public static void main(String[] args) {
		
		NationData data = new NationData();
		NationOut out = new NationOut();
		Nation [] nation = data.makeNation();
		/*out.Out1(nation);*/
		new NationMenu().start();

	}

}
