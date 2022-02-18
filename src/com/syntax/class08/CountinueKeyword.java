package com.syntax.class08;

public class CountinueKeyword {

	public static void main(String[] args) {

		for(int i=1; i<=5; i++) {
			
			if(i==3) {
				continue;
			}
			System.out.println("Hello"+i);
			System.out.println("We are Batch 12");
			
		}
		
		for(int i=1; i<=10; i++) {
			
			if(i==4 || i==7) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		
		
	}

}
