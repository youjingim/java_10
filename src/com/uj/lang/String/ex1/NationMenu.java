package com.uj.lang.String.ex1;

import java.util.Scanner;

public class NationMenu {
	
	public void start() {
		//1. 나라정보 출력
		//2. 나라정보 검색
		// 검색할 나라 이름 입력
		//3. 프로그램 종료
		NationData d = new NationData();
		NationOut o = new NationOut();
		NationSearch search1 = new NationSearch();
		int i=0;
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		Nation [] nation=null;
		while(check) {
			System.out.println("1. 나라 출력");
			System.out.println("2. 나라 찾기");
			System.out.println("3. 프로그램 종료");
			int sel = sc.nextInt();
		
		switch(sel) {
		case 1:
			nation =d.makeNation();
			o.Out1(nation);
			break;
		case 2:
			
			i=search1.search();
			 nation =d.makeNation();
			 if(i < nation.length/4) {
				 o.out2(nation, i);
			 }
			 else if(i>nation.length/4){
				 System.out.println("찾으시는 나라가 없습니다.");

				 }
			break;
		case 3: 
			System.out.println("프로그램 종료");
			check = false;
			break;
			default:
			
			
		
		
		
		}
		
		}
	}

}
