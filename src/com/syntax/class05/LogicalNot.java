package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {

		// Logical not is used to revert the condition
		
		boolean value=!false;
		
		System.out.println(value);
		
		boolean traffic=false;
		
		if(!traffic) {
			System.out.println("I will come on the time");
		}
		
		System.out.println(" ------****  ****------");
		
		String day="Saturday";
		
		if (!day.equals("Saturday")) {
			System.out.println("Today is not Saturday");
		}
		
		boolean checkboxChecked=true;
		if(!checkboxChecked) {
			System.out.println("I will click on that checkbox");
		}
		System.out.println(" ------****  ****------");
		
		String java="hard";
		
		if(!java.equals("hard")) {
			System.out.println("You are genious");
		}
		
		
		
		System.out.println(" ------**** THE END ****------");
		
		
		
		
		
	}

}
