package com.syntax.class03;

public class IfElseBlock {

	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 50;

//which number is largest

		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		} else {
			System.out.println(num2 + " is larger than " + num1);
		}

		int temp = 45;
		// if temp is more than 45--> Im going for a walk
		// otherwise --> I'm staying at home

		if (temp >= 45) {
			System.out.println("I'm going for a walk");
		} else {
			System.out.println("I'm staying at home");
		}

		/*
		 * I need a variable that stora a gender,
		 * if gender f --> please use front of the train 
		 * otherwise --> please use back if the train
		 */
		char gender = 'f';

		if (gender == 'f') {
			System.out.println("please use front of the train");
		} else {
			System.out.println("please use back of the train");
		}

		System.out.println("  ****    ");

		// TASK -1-
		double qqq = 4.5;
		double www = 5.5;

		if (qqq > www) {
			System.out.println("Double value " + qqq + " is larger than " + www);
		} else {
			System.out.println("Double value " + www + " is larger than " + qqq);
		}

		// TASK -2-
		int temperature = 15;

		if (temperature < 32) {
			System.out.println("Water will be freeze with temperature " + temperature);
		} else {
			System.out.println("Water will NOT freeze with temperature " + temperature);
		}

		// TASK -3-
		int exhour = 5;
		double achour = 5.5;

		if (exhour > achour) {
			System.out.println("you will love the course and you will succeed.");
		} else {
			System.out.println("Course will be very hard for you!.");
		}

		boolean traffic = true;

		if (traffic) {
			System.out.println("I am coming late");
		}
		
	}
}
		
		
		
		
	
		

	

