package com.syntax.class08;

public class NestedLoop {

	public static void main(String[] args) {

		for(int i=1; i<=3; i++) {
			
			System.out.println("I am i loop "+i);
			
				for(int j=1; j<=2; j++) {
					
					System.out.println("I am nested j loop "+j);
				}
		}
		
		System.out.println("------ ANOTHER EXAMPLE-----");
		
		System.out.println("------CAR MILES --------");
		
		for (int a=0; a<=4; a++) {
			
			for(int b=0; b<=6; b++) {
				
				for(int c=0; c<=5; c++) {
					
					System.out.println(a+" "+b+" "+c+" ");
				}
			}
		}
		
		
		
	}

}
