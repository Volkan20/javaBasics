package com.syntax.class03;

public class IfStatment {

	public static void main(String[] args) {

		/*
		 * Scenario: I need to compare 2 number and I have to find which is bigger
		 */
		
		int num1=100;
		int num2= 50;
		
		if (num1<num2) {  //if it's not true, it's not gonna printout
		System.out.println(num1+" is larger than "+num2);
		}
		
		double money=5;
		double coffee=4.99;
		
		//if I have more money than price of the coffee --> Im buying coffee
		//'if' always working with 'boolean'
		if (money>coffee) {
			System.out.println("I am buying the coffee");
			
		}
		//if(money=coffee) {Error because if condition always must be boolean
			//we use double --> because of the wrong operator
		
		double money1=5;
		double coffee1=5;
		
		if (money1>=coffee1) {
			System.out.println("I am buying the coffee");
			
		}
	
	}

}
