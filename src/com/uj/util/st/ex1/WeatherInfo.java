package com.uj.util.st.ex1;

import java.util.StringTokenizer;

public class WeatherInfo {
	
	
	private String weatherInfo;
	
	public Weather [] getweather() {
		//지역,온도,습도,풍향
		//파싱
		weatherInfo = "seoul,10,50,남서,busan,32,80,남동,daegu,-22,10,북서,jeju,-32,75,북동";
		StringTokenizer st = new StringTokenizer(weatherInfo, ",");
		Weather [] weather = new Weather[st.countTokens()/4];
		int i=0;
		
		while(st.hasMoreTokens()) {

			Weather weather1 = new Weather();
			weather1.setLocation(st.nextToken());
			weather1.setGion(Integer.parseInt(st.nextToken()));
			weather1.setHum(Integer.parseInt(st.nextToken()));
			weather1.setWind(st.nextToken());
			weather[i] = weather1;
			i++;

			
		}
		return weather;
		
		
	}

}
