package com.syntax.class10;

public class AllValuesFromTwoDArray {

	public static void main(String[] args) {

		int[][] numbers= {
				
				{10, 20, 30 }, //0
				
				{100, 200, 300, 400}, //1
				
				{1000, 2000} //2
			};
		
		//numbers.lengrh -> gives # of rows
		int size = numbers.length; //when used wit 2D array gives # od 1d Arrays that we stored
		
		System.out.println(size);
		
		int sizeof1Array= numbers[0].length;
		System.out.println("Size of first array ="+sizeof1Array);
		
		int sizeof2Array= numbers[1].length;
		System.out.println("Size of first array ="+sizeof2Array);
		
		int sizeof3Array= numbers[2].length;
		System.out.println("Size of first array ="+sizeof3Array);
	
	
	//Retrieving all elements from 2D Array

		for(int i=0; i < numbers.length; i++) {
			
			for(int j=0; j < numbers[i].length; j++) {
				
				System.out.println(numbers[i][j]);
			}
		}
	
 }
}
