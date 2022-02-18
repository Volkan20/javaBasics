package com.syntax.class02;

public class CreatingVariables {

	public static void main(String[] args) {
		
		/* create a variable and assign value
		 * 
		 * declare a variable and initialize
		 */
		//1 way
		int age=25;

		//2way
		int num; //declare variable 
		num=10; //initialize it 
		num=100; //reassing the value
		
		int n1, n2, n3; // all 3 variables are on the int type
		
		n1=10;
		n2=20;
		n3=30;
		
		//cmd+d will remove entire line 
		
		//Can I chance a value of the varaible? 
		age=26; //reassigning the value of variable age
		
		//age=26.5; ERROR: age variable can hold only int value 
		
		System.out.println(age);//26
		
	//  Java Rules for identifiers	
	//	boolean break=false; ERROR: 1. don't use keyword as identiifier
	//	boolean Break=false	
		
	//  char 1character='A'; ERROR: 2.	don't start identifer (name) with numbers
										//or special characters
		
	// double %value=12.99; ERROR: 2.	don't start identifer special characters
		
	//Java allows to use _ or $ as identifier 
		
		double $price=1.99;
		double _value=2.99; 
		
		char character1='a';
		
		boolean Break=true; 
		
		//not rules, but we prefer to follow
		/* variable and methods names should star with lowercase
		 * give variable a meaningful name
		 * 
		 * class name should start with upper case 
		 * 
		 * if name has 2 or more words--> follow camel casing
		 */
		
		int bigNumber =23423;
		
	}

}
