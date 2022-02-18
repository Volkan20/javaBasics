package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		
		String name= "Volkan"; 
		String lastName= "Dereli";
		String city="Pleasantville";
		String state="New York";
		String student="Syntax";
		char grade='A';
		String phoneNumber="8454808311";
		
		System.out.print("My name is"+" "+name);
		System.out.println(" and my last name is"+" "+ lastName+".");
		
		System.out.println("I am "+student+" student.");
		
		System.out.println("I live in "+city+" in "+state+".");
		
		System.out.println("And my phone number is "+phoneNumber+".");
		
		
		city="Miami"; 
		state="Florida";
		phoneNumber="2035240927";
		
		System.out.print("My name is "+name+" "+lastName+" and I moved to "+city);
		System.out.println(" in "+state+".");
		System.out.println("My new phone number is "+phoneNumber+".");
		
		System.out.println("Suzanna loves Hockey!");
		
	}

}
