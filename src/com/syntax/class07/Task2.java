package com.syntax.class07;

public class Task2 {

	public static void main(String[] args) {
/*      Print numbers from 1 to 100 in 1 line with space

		Print numbers from 100 to 1

		Print only even numbers from 20 to 100 

		Print only  odd numbers from 100 to 1
*/
//TASK1
		int num1 = 1;
		
		while (num1 <= 100) {
			System.out.print(num1+" ");
			num1++;
		}
		System.out.println();
		System.out.println("End of the TASK1");
// TASK 2
		int num2 = 100;
		
		while (num2 >= 1) {
			System.out.print(num2+" ");
			num2--;
		}
		System.out.println();
		System.out.println("End of the TASK2");
		
// TASK 3
		int num3=20;
		
		while (num3<=100) {
			System.out.print(num3+" ");
			num3+=2;
		}
		
		System.out.println();
		System.out.println("End of the TASK3");
		
// TASK4
		int num4=99;
		
		while (num4>=1) {
			System.out.print(num4+" ");
			num4-=2;
		}
		System.out.println();
		System.out.println("End of the TASK4");
		
		
		
		
	}

}
