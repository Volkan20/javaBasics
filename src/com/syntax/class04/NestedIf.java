package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean vaccine=true;
		int dose=1;
		
		if(vaccine) {
			System.out.println("How many doses you have?");			
			if(dose==1) {
				System.out.println("You need another shot");
			}else {
				System.out.println("You are fully vaccinated");
			}
		
		}else {
			System.out.println("I dont have any questions");
		}
		
		
		boolean allergy=true;
		
		if(allergy) {//outer if
			System.out.println("Lets check what allergies you have");
			String allergyType="pollen";
			
			//Nested if -> always has a dependecy on outer if.
			//outer if MUST be true in order for nested if to be checked
			
			if(allergyType.equals("pollen")) {//nested if
				System.out.println("Please stay at home.");
			}else if (allergyType.equals("gluten")) {
				System.out.println("Please don't eat bread");
			}else {
				System.out.println("I dont know which succestion to give you");
			}
		}else {
			System.out.println("You are lucky boy!");
		}	
			
		}
	}


