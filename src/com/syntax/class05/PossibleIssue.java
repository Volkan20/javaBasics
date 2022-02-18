package com.syntax.class05;

import java.util.Scanner;

public class PossibleIssue {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		String value=scan.next();
		System.out.println(value);
		
		scan.nextLine();
		
		System.out.println("Using nextLine");
		String anotherValue=scan.nextLine();
		System.out.println(anotherValue);
		
		System.out.println("End of the program");
		
		
		
	}

}
