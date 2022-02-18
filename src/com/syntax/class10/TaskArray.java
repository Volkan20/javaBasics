package com.syntax.class10;

public class TaskArray {

	public static void main(String[] args) {
		//create an array and retrieve all elements in reverse order
		
		int[] num= {39, 27, 95, 20, 100};
		
		for(int i=0; i<num.length; i++) {
			
			System.out.println(num[i]);
		}
		
		System.out.println();
		
		for(int i=num.length-1; i>=0; i--) {
			System.out.println(num[i]);
		}
		
		System.out.println();
		System.out.println("Another Way");
	
		
		int[] arr= {10, 20 , 30};
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[arr.length - i - 1] + " ");
		}
		
	}

}
