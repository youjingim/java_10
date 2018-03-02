package com.uj.util.Random;

import java.util.Random;

public class Randomput {
	
	public void put(int [] array) {
		Random r = new Random();

		
		for(int j=0;j<6;j++) {
			array[j] = r.nextInt(45)+1;
			for(int i=0;i<j;i++) {
				if(array[i] == array[j]) {
					j--;
					break;
					
				}
			}
			
		}
		
		
		
		
	}

}
