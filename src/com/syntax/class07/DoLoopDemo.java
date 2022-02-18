package com.syntax.class07;

public class DoLoopDemo {

	public static void main(String[] args) {
		
		System.out.println("  --  WHILE CHECK CONDITION AFTER EXECUTION --");
		
		int num=1;
		
		while (num<=3) { // is more used than do while
			System.out.println("Hello!!"); // 5 times
			num++;
		}
		
		System.out.println("  -- DO WHILE CHECK CONDITION AFTER EXECUTION --");
		
		int num1 = 10;
		
		do { //is less used than while
			System.out.println("Hello");
			num1++;
			
		} while (num1 <= 13);
		
	
		System.out.println("I want to print numbers from 1 to 30 using do while loop");
		
		int a=1;
		
		do {
			System.out.println(a);
			a++;
			
		}while(a<=30);
		
	}

}
