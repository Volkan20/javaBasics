package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {

		String day="Monday";
		
		if(day.equals("Saturday") || day.equals("Sunday")) {
			
			System.out.println("I have java class");
		}
		
		System.out.println("Code outside of if statement");
		
		/*let's ask user what is today day 
		 * 
		 * based on the day lets defice which class we have
		 * 
		 * if(monday or friday) -->there is no class today
		 * else if (tuesday or wednesday) --> manual 
		 * else if (thursaday) --> review class
		 * else if (saturday or sunday) --> java class		  
		 * 
		 */
		
		
		System.out.println("What is today day ?");
		Scanner user=new Scanner(System.in);
		
		String day1=user.next();
		
		if (day1.equals("monday") || day1.equals("friday")) {
			System.out.println("There is no class today");
			
		}else if (day1.equals("tuesday") || day1.equals("wednesday")) {
			System.out.println("Manual class");
			
		}else if (day1.equals("thursday")) {
			System.out.println("Review class");
			
		}else if (day1.equals("saturday") || day1.equals("sunday")) {
			System.out.println("Java Class");
		}
		else {
			System.out.println("Back to REAL LIFE !");
		}
		
		
		
	}
	/*
	 * True  || True  --> True
	 * True  || False --> True 
	 * False || True  --> True
	 * False || False --> False
	 */
}
