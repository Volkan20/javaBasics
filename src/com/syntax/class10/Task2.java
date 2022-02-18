package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {

	/*
	 * Create an array of countries. 
	 * While retrieving all values from an array print capital for each country.	
	 */

		String[] countries= {"Turkey", "USA", "Germany", "Italy", "UK"};
		String capital = null;
		
			for(int i=0; i < countries.length; i++) {
				
				switch (countries[i]) {
				
				case "Turkey":
					capital="Ankara";
					break;
					
				case "Usa":
					capital="Washington";
					break;
					
				case "Germany":
					capital="Berlin";
					break;
					
				case "Italy":
					capital="Rome";
					break;
					
				case "UK":	
					capital="London";
					break;
				}
				System.out.println("The capital of the country "+countries[i]+" is "+capital);
			}
		
System.out.println("====== Another Way ======");
			
			for(String country:countries) {
				
				if(country.equals ("Turkey")) {
						capital="Ankara";
						
			}else if (country.equals("USA")) {
						capital="Washington";
						
			}else if (country.equals("Germany")) {
						capital="Berlin";
						
			}else if (country.equals("Italy")) {
						capital="Rome";
			
			}else if (country.equals("UK")) {
						capital="Londan";
			}
				System.out.println("The capital of the country "+country + " is "+capital);
			}

	}
}

