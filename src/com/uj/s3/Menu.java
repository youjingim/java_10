package com.uj.s3;

import java.util.Scanner;

public class Menu {
	private SteakChef steakChef;
	private PsataChef psataChef;
	Customer customer;
	public Menu() {
		steakChef = new SteakChef();
		psataChef = new PsataChef();
		customer = new Customer();
	}
	
	
	public void start() {
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		
		while(check) {
			System.out.println("1. 스테이크");
			System.out.println("2. 파스타");
			System.out.println("3. End");
			
			int sel = sc.nextInt();
			
			switch(sel) {
			case 1 : 
				Steak steak = steakChef.maekSteak();
				customer.eat(steak);
				break;
			case 2 : 
				Pasta pasta = psataChef.makePasta();
				customer.eat(pasta);
				break;
			case 3 : 
				check = false;
				break;
				default :
					
			}
			
			
			
			
			
			
		}
	}

}
