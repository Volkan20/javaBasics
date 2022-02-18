package com.syntax.class04;

public class Task2 {

	public static void main(String[] args) {

		double rate=3.5;
		int price=70000;
		
		if(rate>4.5) {
			System.out.println("You can not buy a house");
		
		}else {
			System.out.println("You can buy a house");
			
			if (price >50000) {
				System.out.println("You should take a loan");
			}else {
				System.out.println("You can pay cash");
			}
		}
	}
}
