package com.syntax.class06;

import java.util.Scanner;

public class TaskSwitch {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your country");
		
		String country=input.nextLine();
		String lang;
		
		switch(country.toLowerCase()) {
		
		case "turkey":
			lang="Turkish";
			break;
			
		case "usa":
			lang="English";
			break;
			
		case "italy":
			lang="Italy";
			break;
			default:
				lang= "unknown";
	}
		
		input.close();
		System.out.println(country+" you are speaking "+lang);
			
		
		
		
	}

}
