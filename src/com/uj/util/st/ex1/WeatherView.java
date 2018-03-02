package com.uj.util.st.ex1;

public class WeatherView {
	
	public void view(Weather [] weathers) {
		for(Weather w : weathers) {
			this.view(w);
			
			
		}
		
		
	}
	
	public void view(Weather weathers) {

		System.out.println("지역 : " + weathers.getLocation());
		System.out.println("기온 : " + weathers.getGion());
		System.out.println("습도 : " + weathers.getHum());
		System.out.println("풍향 : " + weathers.getWind());
		
	}

}
