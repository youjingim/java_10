package com.uj.util.st.ex1;

import java.util.Scanner;

public class WeatherControllor {
	private WeatherInfo info;
	private WeatherView view;
	public WeatherControllor() {
		info = new WeatherInfo();
		view = new WeatherView();
		
	}
	
	//1. 전체날씨정보
	//2. 지역명 검색하면 해당지역 날씨 출력
	//3. 날씨정보 초기화
	//4. 종료
	
	public void controllor() {
		Scanner sc = new Scanner(System.in);
		int sel;
		Weather [] weathers = info.getweather();
		boolean check=true;
		while(check) {
			System.out.println("1. 전체날씨 정보");
			System.out.println("2. 날씨정보 검색");
			System.out.println("3. 날씨정보 초기화");
			System.out.println("4. 종료");
			sel = sc.nextInt();
			
			switch(sel) {
			case 1:
				view.view(weathers);
				break;
			case 2:
				Weather w = new WeatherSearch().search(weathers);
				if(w != null) {
					view.view(w);
					}
				else {
					System.out.println("찾으시는 지역이 없습니다");
				}
				break;
			case 3: 
				weathers = info.getweather();
				break;
			case 4: 
				System.out.println("프로그램 종료");
				break;
				default:
				
				
				
				
			}
			
			
			
			
		}
		
		
		
	}

}
