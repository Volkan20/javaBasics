package com.syntax.class02;

public class Practicing {

	public static void main(String[] args) {

		/*
		 * shortcut to format cod cmd+shft+f
		 */
//Task1
		int a = 20;
		int b = 10;

		int sum = a + b;
		int sub = a - b;
		int div = a / b;
		int mul = a * b;

		System.out.println("The sum of 2 numbers " + a + " and " + b + " is equal to " + sum);
		System.out.println("The sub of 2 numbers " + a + " and " + b + " is equal to " + sub);
		System.out.println("The div of 2 numbers " + a + " and " + b + " is equal to " + div);
		System.out.println("The mul of 2 numbers " + a + " and " + b + " is equal to " + mul);

//Task2
		System.out.println("      TASK2      ");
		double c = 3.9;

		double square = c * c;

		System.out.println(square);

		System.out.println("      TASK3      ");

		/*
		 * Write a program to print the area and perimeter of a rectangle 
		 * with width = 5
		 * and height = 8. 
		 * Your program should say. 
		 * “The perimeter of a rectangle with
		 * width ___ and height ____ is equal to _____ and the area is __”
		 */

		int width = 5;
		int height = 8;
		
		int perimeter = 2 * (width + height);
		int area = width * height;
		
		
		
	}

}
