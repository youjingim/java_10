package com.uj.lang.String.ex1;

import java.util.Scanner;

public class NationSearch {
	
	public int search(Nation [] nation) {

		System.out.println("검색할 나라의 이름을 입력하시오");
		Scanner sc = new Scanner(System.in);
		int i=0;
		boolean check = true;
		String names = sc.next();
		while(check) {
			if(nation[i].getName().equals(names)) {
				check = false;
				break;
			}
			if(i>=nation.length/4){
				check = false;
				break;
				
			}
			i++;
			
		}
		return i;
		
		
	}

}
