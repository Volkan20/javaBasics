package com.syntax.class03;

public class HomeWorks {

	public static void main(String[] args) {

		int day = 4;
		if (day == 1) {

			System.out.println("Today is Monday");
		} else if (day == 2) {
			System.out.println("Toda is Tuesday");
		} else if (day == 3) {
			System.out.println("Today is Wednesday");
		} else if (day == 4) {
			System.out.println("Today is Thursday");
		} else if (day == 5) {
			System.out.println("Today is Friday");
		} else {
			System.out.println("Invalid week day");
		}
		int i = 10;
		i += 100;

		System.out.println(i);

		int num = 0;
		if (num < 0) {
			System.out.println("The number ” + num + ” is Negtive");
		} else if (num>0){
			System.out.println("The number ” + num + ” is Positive");
		}else {
		 System.out.println("This number is "+num);
		}

		
		
		int num2 = 103;
		if (num2 % 2 == 0) {
			System.out.println("The number "+num2+ " is an Even number");
		} else {
			System.out.println("The number "+num2+ " is an Odd number");
		}
	

        }
	}

