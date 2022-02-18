package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {

		int num=1;
		
		// creating an array that holds 4 elements
		int[] numbers=new int[4];
		
		// storing values/element inside an array
		numbers[0]=90;
		numbers[1]=87;
		numbers[2]=89;
		numbers[3]=99;
		
		//print 99
		System.out.println(numbers[3]);
		System.out.println(numbers[3]+numbers[0]); //189
		
		// I want to create an array of countries
		
		String[] countries = new String[5];
		
		countries[0]="USA";
		countries[1]="Canada";
		countries[2]="Turkey";
		countries[3]="Morocco";
		countries[4]="France";
				
		System.out.println(countries[3]+countries[4]);
		
		String[] names=new String[5];
		
		names[1]="Volkan";
		names[2]="Medine";
		names[3]="Hakan";
		
		System.out.println(names[0]);
		
		System.out.println("TASK");
		
		//Create an array 4 different price and average how much spend
		double[] price=new double [4];
		
		price [0]=25.66;
		price [1]=9.90;
		price [2]=15.10;
		price [3]=12.59;
		
		double average=(price[0]+price[1]+price[2]+price[3])/4;
		System.out.println(average );
		  
		
	}

}
