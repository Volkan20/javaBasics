package com.syntax.class07;

public class Task1 {

	public static void main(String[] args) {

		System.out.println("  Print Only Even Numbers From 1 to 30  ");
		
		int a=2;
		
		while (a <= 30) {
			
			System.out.println(a);
			a+=2; // same as a=a+2;
		}
		
		
		System.out.println("Another way");
		
		int b = 1;
		
		while (b <= 30) {
			
			if(b % 2 == 0) {
			System.out.println(b);
			
			}
			b++;
			
		}
		
		
		
		
	}

}
