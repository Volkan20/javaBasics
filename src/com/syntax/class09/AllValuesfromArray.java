package com.syntax.class09;

public class AllValuesfromArray {

	public static void main(String[] args) {

		// Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a
				// grade B (use 2 different ways of creating an array).
				char[] grade = { 'A', 'B', 'C', 'D','E', 'F' };
			
				
				int size = grade.length;
				System.out.println("Numbers of elements is ="+size);
				/*
				System.out.println(grade[1]);
				System.out.println(grade[2]);
				System.out.println(grade[3]);
				*/
				for(int i=0; i < grade.length; i++) {
					
					System.out.print(grade[i]+" ");
				}
				
				
		System.out.println("---------");
		
		/*
		 * for(int i=0; i<=grade.length; i++) {
		 * System.out.print(grade[i]+" "); 
		 * }
		 */
		
				
		String[] cities= {"Washington DC", "Boston", "Miami","Los Angeles","New York"};
	    
		for (int a = 0; a < cities.length; a++) {
			System.out.println(cities[a] + "  ");
			
			if(cities[a].equals("Miami")) {
				System.out.println("I want to leave in Miami");
			}
		}
		
		int[] numbers = {10 ,20 ,30, 40};
		
			for(int num : numbers) {
			
			System.out.print(num+" ");
		}
		System.out.println("------------");
		
		
		char[] grades = {'A', 'B' ,'C' ,'D'};
		
			for(char grad : grades) {
				
				System.out.print(grad+" ");
			}
		
		
		
	}

}
