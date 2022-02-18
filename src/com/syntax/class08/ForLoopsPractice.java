package com.syntax.class08;

public class ForLoopsPractice {

	public static void main(String[] args) {

		for(int i=1; i<=3; i++) {
			
			System.out.println("Hello "+i);
		}
		
		System.out.println("  MULTIPLICATION TABLE   ");
		
	/* 3 x 1 = 3
	 * 3 x 2 = 6
	 * 3 x 3 = 9
	 * 3 x 10 = 30
	 */
		
		int num= 3;
		int result;
		
		for(int i=1; i<=10; i++) {
			
			result= num*i;
			
			System.out.println(num+" x "+i+" = "+result);
		}
		
		System.out.println(" -WHAT IS THE OUTPUT-");
		
		for(int i=0; i<=10; i+=3) {
		
		System.out.print(i+" ");
		}
		
		System.out.println(" -WHAT IS THE OUTPUT-");
		
		int sum=0;
		
		for(int i=1; i<=5; i++) {
			sum+=i;
			
		}
		
		System.out.println(sum);
		
		
 }
}
