package com.uj.util.st.ex1;

import java.util.Scanner;

public class WeatherSearch {
	//지역명을 입력받아
	//해당 지역의 날씨 출력
	
	public Weather search(Weather [] weathers) {
		Scanner sc = new Scanner(System.in);
		String name;
		Weather n=null;
		System.out.println("지역명을 입력하시오 : ");
		name = sc.next();
		for(Weather w : weathers) {
			if(name.equals(w.getLocation())) {
				n=w;
				break;
			}
			
		}
	
		return n;
		
		
		
		
	}

}
