package com.syntax.class04;

import java.util.Scanner;

/* to auto import: cmnd+shift+o
 */
public class MoreInput {

	public static void main(String[] args) {

	//1)create a Scanner and assign to a variable
		Scanner scan=new Scanner(System.in);
		
	//2)specify instructions
		System.out.println("Please enter country where are you from ");
		
	//3) we need to capture String value--> use next();
		//if you need to capture more than 1 word-> use nextLine();
		String country=scan.next();
		System.out.println("You are from "+country);
		
		//if you are fron USA--> you speak english
		//if you are from Turkey--> you speak Turkish
		
		//		vvvvv vvvvv vvvv (ignore case)
	if (country.equalsIgnoreCase("USA")) {
		System.out.println("You speak english");
		
	}else if(country.equals("France")) {
		System.out.println("You speak french");
		
	}else if(country.equals("Turkey")) {
		System.out.println("You speak Turkish");
		
	}else {
		System.out.println("I dont know which language");
	}
		
	}

}
