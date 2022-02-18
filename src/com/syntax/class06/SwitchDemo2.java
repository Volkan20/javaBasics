package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {

		char choise='y';
		String answer;
		
		switch (choise) {
		
		case 'y':
			answer="Yes";
			break;
		case 'n':
			answer="No";
			break;
		case 'm':
			answer="Maybe";
			break;
		default:
			answer="Unknown";
			break;
		}
		
		System.out.println(answer);
		System.out.println("=========");
		
		/*
		 * declare a variable to store a car 
		 * based on the value of car define the country of origin
		 */
		
		String car="Lada";
		String country;
		
//For Lower Case--> (car.toLowerCase()) if use this, should be lower everthing.
		switch(car) {
		
		case "bmwBMW":
			country="Germany";
			break;
		case "Ford":
			country="USA";
			break;
		case "Lada":
			country="Russian";
			break;
		case "Toyota":
			country="Japan";
			break;
			default:
				country="Unknown";
		}
		System.out.println(car+" is from "+country);
		// for country 1)add default or 2)add 'null' to 'country'
		
		
		
		
		
		
	}

}
