package com.syntax.class10;

public class TwoDArrayTaskes {

	public static void main(String[] args) {

		String[][] names= {
				{"Mr" ,"Mrs", "Ms", "Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"}
		};
		
		System.out.println(names[0][0]+" "+names[1][0]);
		System.out.println(names[0][1]+" "+names[1][1]);
		System.out.println(names[0][2]+" "+names[1][2]);
		System.out.println(names[0][3]+" "+names[1][3]);
		
		
System.out.println("===ANOTHER TASK====");
		
		String[] name= {"Volkan", "Hakan", "Medine", "Ozkan"};
				
		int[] grade={25, 65, 86,100};
		
		System.out.println(name[1]+" "+grade[3]);
		System.out.println(name[0]+" "+grade[2]);
		System.out.println(name[2]+" "+grade[1]);
		System.out.println(name[3]+" "+grade[0]);
		
	}

}
