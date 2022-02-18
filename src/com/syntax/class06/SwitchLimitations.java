package com.syntax.class06;

import java.util.Scanner;

public class SwitchLimitations {

	public static void main(String[] args) {

		//String, byte, short, int, char
		/*
		 * Cannot switch on a value of type boolean, float,double or long
		 * 
		 * boolean happy=true;
		 * switch(happy) {}
		 * 
		 * double number=1.99;
		 * switch(number) {}
		 * 
		 * long number=10000l;
		 * switch(number) {}
		 */
		/*	switch case cannot be used with Relational or Logical Operators
		 * int num1=10;
		
		 * switch(num1 ) {
		 	case num1>=10:
			case num>=10 && num<=100
			}
		*/
		
		
		Scanner input = new Scanner(System.in);

		System.out.println("Is it weekend?");
		String answer=input.nextLine();
		
		String classes = null;
		switch (answer) {

		  case "yes":
			  classes="Manuel testing";
			  break;
		  case "no":
			  classes="Java";
			  break;
		}
		System.out.println("Today you will be learning "+classes);
		
		
		
	}

}
