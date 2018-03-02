package com.uj.util.Random;

public class Setting {
	
	public void set(int [] array) {
		
		for(int i=0; i<6;i++) {
			for(int j=0;j<6;j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				
			}
		}
		
		
	}

}
